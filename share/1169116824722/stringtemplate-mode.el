;;;;; stringtemplate-mode.el --- provides mode for ANTLR stringtemplate files

;; Copyright (C) 2005 AMIQ Consulting
;; This program is free software; you can redistribute it and/or
;; modify it under the terms of the GNU General Public License as
;; published by the Free Software Foundation; either version 2 of
;; the License, or (at your option) any later version.

;; This program is distributed in the hope that it will be
;; useful, but WITHOUT ANY WARRANTY; without even the implied
;; warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
;; PURPOSE.  See the GNU General Public License for more details.

;; You should have received a copy of the GNU General Public
;; License along with this program; if not, write to the Free
;; Software Foundation, Inc., 59 Temple Place, Suite 330, Boston,
;; MA 02111-1307 USA

;;; Authors    : by Stefan Birman <stefan@amiq.ro>
;;; Maintainer : Stefan Birman <stefan@amiq.ro>
;;; Created    : 27May2005
;;; Version    : 0.1
;;; Comentary  : This is only a beta version.
;;;
;;;  ==================== INSTALL ===================
;;; Add following into your emacs startup file (MANDATORY):
;;; 
;;; (load-file "/path_to/stringtemplate-mode.el") 
;;; (require 'stringtemplate-mode)
;;;
;;;                       OR 
;;;
;;; Save it in the load path and add following into your emacs startup file:
;;; (require 'stringtemplate-mode)
;;; (autoload 'stringtemplate-mode "stringtemplate-mode" "StringTemplate editing mode" t)
;;; 
;;; ====================== TBD =====================
;;; * improve highlighting : mark spaces, change string highlighting etc
;;; * add `go-to-definition` utility
;;; * add `list-definitions` utility
;;; * eliminate Emacs/XEmacs-compatibility stuff

;; General Emacs/XEmacs-compatibility compile-time macros
(eval-when-compile
  (require 'cl)
  (defmacro cond-emacs-xemacs (&rest args)
    (cond-emacs-xemacs-macfn
     args "`cond-emacs-xemacs' must return exactly one element"))
  (defun cond-emacs-xemacs-macfn (args &optional msg)
    (if (atom args) args
      (and (eq (car args) :@) (null msg) ; (:@ ...spliced...)
	   (setq args (cdr args)
		 msg "(:@ ....) must return exactly one element"))
      (let ((ignore (if (string-match "XEmacs" emacs-version) :EMACS :XEMACS))
	    (mode :BOTH) code)
	(while (consp args)
	  (if (memq (car args) '(:EMACS :XEMACS :BOTH)) (setq mode (pop args)))
	  (if (atom args)
	      (or args (error "Used selector %s without elements" mode))
	    (or (eq ignore mode)
		(push (cond-emacs-xemacs-macfn (car args)) code))
	    (pop args)))
	(cond (msg (if (or args (cdr code)) (error msg) (car code)))
	      ((or (null args) (eq ignore mode)) (nreverse code))
	      (t (nconc (nreverse code) args))))))
  ;; Emacs/XEmacs-compatibility `defun': remove interactive "_" for Emacs, use
  ;; existing functions when they are `fboundp', provide shortcuts if they are
  ;; known to be defined in a specific Emacs branch (for short .elc)
  (defmacro defunx (name arglist &rest definition)
    (let ((xemacsp (string-match "XEmacs" emacs-version)) reuses)
      (while (memq (car definition)
		   '(:try :emacs-and-try :xemacs-and-try))
	(if (eq (pop definition) (if xemacsp :xemacs-and-try :emacs-and-try))
	    (setq reuses (car definition)
		  definition nil)
	  (push (pop definition) reuses)))
      (if (and reuses (symbolp reuses))
	  `(defalias ',name ',reuses)
	(let* ((docstring (if (stringp (car definition)) (pop definition)))
	       (spec (and (not xemacsp)
			  (eq (car-safe (car definition)) 'interactive)
			  (null (cddar definition))
			  (cadar definition))))
	  (if (and (stringp spec)
		   (not (string-equal spec ""))
		   (eq (aref spec 0) ?_))
	      (setq definition
		    (cons (if (string-equal spec "_")
			      '(interactive)
			    `(interactive ,(substring spec 1)))
			  (cdr definition))))
	  (if (null reuses)
	      `(defun ,name ,arglist ,docstring
		 ,@(cond-emacs-xemacs-macfn definition))
	    ;; no dynamic docstring in this case
	    `(eval-and-compile		; no warnings in Emacs
	       (defalias ',name
		 (cond ,@(mapcar (lambda (func) `((fboundp ',func) ',func))
				 (nreverse reuses))
		       (t ,(if definition
			       `(lambda ,arglist ,docstring
				  ,@(cond-emacs-xemacs-macfn definition))
			     'ignore))))))))))
  (defmacro ignore-errors-x (&rest body)
    (let ((specials '((scan-sexps . 4) (scan-lists . 5)))
	  spec nils)
      (if (and (string-match "XEmacs" emacs-version)
	       (null (cdr body)) (consp (car body))
	       (setq spec (assq (caar body) specials))
	       (>= (setq nils (- (cdr spec) (length (car body)))) 0))
	  `(,@(car body) ,@(make-list nils nil) t)
	`(ignore-errors ,@body)))))

;; define a group
(defgroup stringtemplate nil
  "Major mode for StringTemplate files."
  :group 'languages
  :link '(emacs-commentary-link "stringtemplate-mode.el")
  :link '(url-link "http://stringtemplate-mode.sourceforge.net/")
  :prefix "stringtemplate-")

;; allow user to run it's own code
(defvar stringtemplate-mode-hook nil)

;; allows both you and users to define their own keymaps.
;; using define-key, we insert an example keybinding into the keymap
(defvar stringtemplate-mode-map
  (let ((stringtemplate-mode-map (make-sparse-keymap)))
    (define-key stringtemplate-mode-map "\C-j" 'newline-and-indent)
    stringtemplate-mode-map)
  "Keymap for stringtemplate major mode")

;; tells emacs that when a buffer with a name ending with 'st' 
;; is opened, then stringtemplate-mode should be started in that buffer
(add-to-list 'auto-mode-alist '("\\.st\\'" . stringtemplate-mode))

(defvar stringtemplate-font-lock-template-face 'stringtemplate-font-lock-template-face)
(defface stringtemplate-font-lock-template-face
  (cond-emacs-xemacs
   '((((class color) (background light))
      (:foreground "blue" :EMACS :weight bold :XEMACS :bold t))))
  "StringTemplate template references (definition)."
  :group 'stringtemplate)

(defvar stringtemplate-font-lock-conditional-face 'stringtemplate-font-lock-conditional-face)
(defface stringtemplate-font-lock-conditional-face
  (cond-emacs-xemacs
   '((((class color) (background light))
      (:foreground "orange"))))
  "StringTemplate branching related."
  :group 'stringtemplate)

(defvar stringtemplate-font-lock-marker-face 'stringtemplate-font-lock-marker-face)
(defface stringtemplate-font-lock-marker-face
  (cond-emacs-xemacs
   '((((class color) (background light))
      (:foreground "black" :EMACS :weight bold :XEMACS :bold t))))
  "StringTemplate markers."
  :group 'stringtemplate)

;; define minimal set of keywords to highlight
(defconst stringtemplate-font-lock-keywords-1
  (list
	'("\\(<<\\|>>\\|::=\\)" . stringtemplate-font-lock-marker-face)
	'("\\s-*\\(\\w+\\)([a-zA-Z0-9,_ ]*)\\s-*::="  1  stringtemplate-font-lock-template-face)
	'("\\(group\\)" . stringtemplate-font-lock-template-face)
	'("\\(\\$\\(?:e\\(?:lse\\$\\|ndif\\$\\)\\|if(!?\\w+)\\$\\)\\)" . stringtemplate-font-lock-conditional-face)
	'("\\(\\$\\w+\\((.*)\\)?\\$\\)"  . font-lock-type-face)
	'("\\(\\$\\w+\\(\\(:\\|.\\)\\w+\\((.*)\\)?\\)*\\$\\)"  . font-lock-type-face)
	'("\\(\\$\\w+;\\s-*\\w+=.*\\$\\)" 0 font-lock-type-face t))
  "Minimal highlighting expressions for stringtemplate mode")

;;  defined the default level of highlighting to be 1.
(defvar stringtemplate-font-lock-keywords stringtemplate-font-lock-keywords-1
  "Default highlighting expressions for stringtemplate mode")

;; create an empty syntax mode and initializes it
(defvar stringtemplate-mode-syntax-table
  (let ((stringtemplate-mode-syntax-table (make-syntax-table)))
	 (modify-syntax-entry ?_ "w" stringtemplate-mode-syntax-table)
	 (modify-syntax-entry ?$ ". 14b" stringtemplate-mode-syntax-table)
	 (modify-syntax-entry ?< ". 1b" stringtemplate-mode-syntax-table)
	 (modify-syntax-entry ?> ". 4b" stringtemplate-mode-syntax-table)
	 (modify-syntax-entry ?! ". 23" stringtemplate-mode-syntax-table)
    (modify-syntax-entry ?<  "(>"  stringtemplate-mode-syntax-table)
    (modify-syntax-entry ?>  ")<"  stringtemplate-mode-syntax-table)
	 stringtemplate-mode-syntax-table)
  "Syntax table for stringtemplate-mode")

;; Here we define our entry function, give it a documentation string, 
;; make it interactive, and call our syntax table creation function. 
;; We also set our keymap for the mode.
(defun stringtemplate-mode ()
  "Major mode for editing StringTemplate files"
  (interactive)
  (kill-all-local-variables)
  (set-syntax-table stringtemplate-mode-syntax-table)
  (use-local-map stringtemplate-mode-map)
  (set (make-local-variable 'font-lock-defaults) 
		 '(stringtemplate-font-lock-keywords))
  (setq major-mode 'stringtemplate-mode)
  (setq mode-name "StringTemplate")
  (run-hooks 'stringtemplate-mode-hook))

;; finally, we use provide to expose our mode to the Emacs environment. 
(provide 'stringtemplate-mode)

;;;;; stringtemplate-mode.el ends here
