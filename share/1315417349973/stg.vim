" vim: ts=8
" Vim syntax file
" Language:     ANTLRv3 Standard Template Language V4
" Maintainer:   Kenney Westerhof
" Last Change:  2011-09-06

" For version 5.x: Clear all syntax items
" For version 6.x: Quit when a syntax file was already loaded
if version < 600
  syntax clear
elseif exists("b:current_syntax")
  finish
endif

syn keyword Keyword default first group if implements interface last length optional rest strip super trunc else endif elseif

syn region Comment start="/\*" end="\*/"

"syn match stgRule start="\<[a-zA-Z_0-9]\+\>(" end=")" contains=stgRuleArgs
"nextgroup=stgRuleArgs,Operator,stgTemplate

syn region stgRule matchgroup=stgRule start="\<[a-zA-Z_0-9$_]\+\>(" end=")" contains=@stgRuleArgs

syn cluster stgRuleArgs contains=stgVariable,stgLiteral,stgOperator
syn region stgRuleArgConstant matchgroup=String start=+'+ end=+'+ contains=stgCharacter  contained
syn region stgRuleArgConstant matchgroup=String start=+"+ end=+"+ contains=stgCharacter  contained

syn match stgVariable contained containedin=stgRuleArgs,stgAction "[a-zA-Z][a-zA-Z_0-9]*"

syn match stgOperator "::="

syn cluster stgTemplateContents contains=stgComment,stgAction3,stgAction,stgCharacter 
syn region stgTemplate start=+'+ end=+'+ contains=@stgTemplateContents
syn region stgTemplate start=+"+ end=+"+ contains=@stgTemplateContents
syn region stgTemplate matchgroup=Special start='\[' end='\]' contains=stgMap,stgLiteral,Special,Keyword

syn region stgTemplate matchgroup=Statement start="<<" end=">>" contains=@stgTemplateContents
syn region stgTemplate matchgroup=Statement start="<%" end="%>" contains=@stgTemplateContents


syn region stgAction3 matchgroup=Special start="<@" end=">" contains=stgPlace

syn match stgPlace "([a-zA-Z0-9$_])\+"

syn region stgComment start="<!" end="!>" containedin=stgTemplate
syn region stgComment start="$!" end="!$" containedin=stgTemplate

syn region stgAction start="<[^!<%@]" end=">" contained contains=Keyword,stgExpression,stgAttr,stgLiteral,stgVariable,stgOperator,stgAction2,stgCharacter

syn match stgAttr "\w\+\s*=\s*" contained contains=stgExpression
syn match stgExpression "[:=]" contained
syn region stgExpression matchgroup=stgRule start="\<[a-zA-Z_0-9]\+\>(" end=")" contains=@stgRuleArgs

syn region stgAction2 matchgroup=Include start="{" end="}" contained contains=stgLoop,stgOperator,stgComment,stgAction,stgCharacter nextgroup=stgLoop,stgTemplate matchgroup=Normal

syn match stgLoop "[a-zA-Z0-9$_]\+\s*|" contained contains=stgVariable

" syn match stgScopeVariable '$\k\+::\k\+'

syn match stgOperator "," contained
syn match stgOperator "!" containedin=stgExpression
"syn match stgOperator "[@().]" contained
"syn match stgOperator "[{}]" containedin=stgAction
"syn match stgOperator "|" containedin=stgAction

syn match  stgCharacter '\\\(r\|n\|t\|f\|b\|"\|\'\|\\\|<\|>\|$\|u\x\{4}\)' contained display
syn region stgLiteral start=+'+ end=+'+ contains=stgCharacter contained
syn region stgLiteral start=+"+ end=+"+ contains=stgCharacter contained


" Define the default highlighting.
" For version 5.7 and earlier: only when not done already
" For version 5.8 and later: only when an item doesn't have highlighting yet
if version >= 508
  if version < 508
    let did_stg_syntax_inits = 1
    command -nargs=+ HiLink hi link <args>
  else
    command -nargs=+ HiLink hi def link <args>
  endif

  hi def stgDebug cterm=reverse term=reverse gui=reverse
"  hi def keyword 	term=bold cterm=bold gui=bold
  hi def stgVariable		term=bold cterm=bold gui=bold
  HiLink stgVariable		Variable
  HiLink stgBrace		Operator
  HiLink stgCharacter         Special
  HiLink stgOperator          Operator
  HiLink stgToken             PreProc
  HiLink stgScopeVariable     Identifier
  HiLink stgRule		Type
  HiLink stgComment		Comment

"  HiLink stgRule         Special
 HiLink stgTemplate         Normal
" HiLink stgTemplateContents         Special
  HiLink stgAction         Function
  HiLink stgAction2         Normal
  HiLink stgLoop          Include
  HiLink stgExpression         Special
  HiLink stgLiteral	String
  HiLink stgPlace	PreProc
  HiLink stgAction3	PreProc
  HiLink stgAttr	PreProc
  delcommand HiLink
endif

let b:current_syntax = "stg"
syn sync fromstart
