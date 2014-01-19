/*
 * Ada95 Recognizer for ANTLR
 *
 * Oliver M. Kellogg  <okellogg@users.sourceforge.net>
 *
 * Adapted from lexer9x.l/grammar9x.y,
 *
 ******* A YACC grammar for Ada 9X *********************************
 * Copyright (C) Intermetrics, Inc. 1994 Cambridge, MA  USA        *
 * Copying permitted if accompanied by this statement.             *
 * Derivative works are permitted if accompanied by this statement.*
 * This grammar is thought to be correct as of May 1, 1994         *
 * but as usual there is *no warranty* to that effect.             *
 *******************************************************************
 *
 */


header "pre_include_hpp" {
#include "../../../lib/cpp/antlr/SemanticException.hpp"  // antlr wants this
}

options {
  language="Cpp";
}


//-----------------------------------------------------------------------------
// Define a Parser, calling it AdaParser
//-----------------------------------------------------------------------------
class AdaParser extends Parser;
options {
  k = 2;                           // token lookahead
  exportVocab=Ada;                 // Call its vocabulary "Ada"
  // codeGenMakeSwitchThreshold = 2;  // Some optimizations
  // codeGenBitsetTestThreshold = 3;
  defaultErrorHandler = true;     // Generate parser error handlers
  // buildAST = true;
  // ASTLabelType = "RefAdaAST";
}


pragma  : PRAGMA IDENTIFIER ( LPAREN pragma_arg_s RPAREN )? SEMI
	;

pragma_arg_s : pragma_arg ( COMMA pragma_arg )*
	;

pragma_arg : ( simple_name RIGHT_SHAFT )? expression
	;

pragma_s : ( pragma )*
	;

decl_item :
	PACKAGE ( BODY compound_name IS ( SEPARATE semi | pkg_body_part )
		| compound_name
			( IS ( generic_inst semi | pkg_spec_part )
			| renames semi
			)
		)
	| TASK  ( TYPE simple_name discrim_part_opt task_decl_opt
		| BODY simple_name IS
			( SEPARATE
			| decl_part block_body END id_opt
			)
		| simple_name task_decl_opt
		)
		semi
	| PROTECTED
		( BODY simple_name IS
			( SEPARATE
	       		| ( prot_op_body )* END id_opt
			)
                | ( TYPE simple_name discrim_part_opt | IDENTIFIER )
		  IS prot_op_decl_s
		  ( PRIVATE prot_elem_decl_s )?
		  END id_opt
		)
		semi
	| subprog_decl_or_body
	| decl_common
	;

task_decl_opt:  ( IS pragma_s entry_decl_s rep_spec_s
		  ( PRIVATE entry_decl_s rep_spec_s )?
		  END id_opt
		)?
	;

procedure_head : PROCEDURE compound_name
	;

function_head : FUNCTION designator
	;

// decl_common is shared between decl_item and basic_decl_item.
decl_common : type_decl
	| subtype_decl
	| generic_formal_part
		( PACKAGE compound_name
			( renames semi
			| IS pkg_spec_part
			)
		| procedure_head formal_part_opt subprog_decl_part
		| function_head function_tail subprog_decl_part
		)
	| use_clause
	| rep_spec
	| object_decl
	;

object_decl : def_ids_colon
		( EXCEPTION ( renames )?
		| CONSTANT ( ASSIGN expression | object_subtype_def )?
		| ( ALIASED ( CONSTANT )? )? object_subtype_def
		)
	semi
	;

object_subtype_def : array_type init_opt
	| subtype_ind ( renames | ASSIGN expression )?
	;

def_ids_colon : def_id_s COLON
	;

def_id_s : def_id ( COMMA def_id )*
	;

def_id  : IDENTIFIER
	;

object_qualifier_opt : ( ALIASED )? ( CONSTANT )?
	;

init_opt : ( ASSIGN expression )?
	;

type_decl : TYPE IDENTIFIER discrim_part_opt ( IS pragma_s type_def )? semi
	;

discrim_part_opt : ( LPAREN ( BOX | discrim_spec_s ) RPAREN )?
	;

type_def : enumeration_type
	| integer_type
	| real_type
	| array_type
	| access_type
	| (derived_type) => derived_type
	| abstract_tagged_limited_opt ( PRIVATE | record_def )
	;

subtype_decl : SUBTYPE IDENTIFIER IS subtype_ind semi
	;

subtype_ind : name ( constraint )?
	;

constraint : range_constraint
	| decimal_digits_constraint
	;

decimal_digits_constraint : DIGITS expression range_constr_opt
	;

derived_type : ( NEW subtype_ind ( WITH ( PRIVATE | record_def ) )?
	| ABSTRACT NEW subtype_ind WITH ( PRIVATE | record_def )
	)
	;

range_constraint : RANGE range
	;

range : (range_attrib_ref) => range_attrib_ref
	| simple_expression DOT_DOT simple_expression
	;

range_attrib_ref : //ambig: name TIC RANGE
		// instead:
	indexed_compound_name TIC RANGE
		( LPAREN expression RPAREN )?
	;

enumeration_type : LPAREN enum_id_s RPAREN
	;

enum_id_s : enum_id ( COMMA enum_id )*
	;

enum_id : IDENTIFIER
	| CHAR_LIT
	;

integer_type : range_constraint
	| MOD expression
	;


real_type : float_type
	| fixed_type
	;

float_type : DIGITS expression range_constr_opt
	;

fixed_type : DELTA expression
		( range_constraint
		| DIGITS expression range_constr_opt )
	;

array_type : ARRAY LPAREN
		( ( index_s ) => index_s  // unconstrained
		| iter_discrete_range_s   // constrained
		)
	     RPAREN OF component_subtype_def
	;

component_subtype_def : ( ALIASED )? subtype_ind
	;

index_s : index ( COMMA index )*
	;

index : compound_name RANGE BOX
	;

iter_discrete_range_s : discrete_range ( COMMA discrete_range )*
	;

discrete_range : (range) => range
	| name range_constr_opt
	;

range_constr_opt : ( range_constraint )?
	;

record_def : RECORD pragma_s comp_list END RECORD
	| NuLL RECORD
	;

abstract_tagged_limited_opt : ( ( ABSTRACT )? TAGGED )? ( LIMITED )?
	;

comp_list : comp_decl_s ( variant_part )?
	| variant_part
	| NuLL semi
	;

comp_decl_s : ( comp_decl )+
	;

comp_decl : def_ids_colon component_subtype_def init_opt semi
	;

discrim_part : LPAREN discrim_spec_s RPAREN
	;

discrim_spec_s : discrim_spec ( semi discrim_spec )*
	;

discrim_spec : def_ids_colon ( ACCESS )? subtype_mark init_opt
	;

variant_part : CASE simple_name IS pragma_s variant_s END CASE semi
	;

variant_s : ( variant )+
	;

variant : WHEN choice_s RIGHT_SHAFT pragma_s comp_list
	;

choice_s : choice ( PIPE choice )*
	;

choice : OTHERS
	| (discrete_with_range) => discrete_with_range
	| expression ( DOT_DOT simple_expression )?
	;

discrete_with_range : (mark_with_constraint) => mark_with_constraint
	| range
	;

mark_with_constraint : subtype_mark range_constraint
	;

access_type : ACCESS
		( ( CONSTANT | ALL )? subtype_ind
		| ( PROTECTED )?
			( PROCEDURE formal_part_opt
			| FUNCTION func_formal_part_opt RETURN subtype_mark
			)
		)
	;

decl_part : pragma_s ( decl_item )*
	;

name : simple_name
		( DOT ( ALL | CHAR_LIT | operator_symbol | simple_name )
		| LPAREN value_s RPAREN
		| TIC attribute_id   // must be in here because of e.g.
				     // Character'Pos (x)
		)*
	;

/* not possible, e.g. "Character'Pos (x)" doesn't work
name : indexed_compound_name ( TIC attribute_id )?
	;
 */

// Special name for range_attrib_ref (to be verified)
indexed_compound_name : simple_name
		( DOT ( ALL | simple_name )
		| LPAREN value_s RPAREN
		)*
	;

/* TO BE CLARIFIED
name_including_qualified_char_or_operator :
	(qualified_char_or_operator) => qualified_char_or_operator
	| name
	;

qualified_char_or_operator : compound_name DOT ( CHAR_LIT | operator_symbol )
	;
 */

operator_symbol : CHAR_STRING
	;

subtype_mark : compound_name ( TIC attribute_id )?
	;

simple_name : IDENTIFIER
	;

compound_name : simple_name ( DOT simple_name )*
	;

c_name_list : compound_name ( COMMA compound_name )*
	;

value_s : value ( COMMA value )*
	;
/*
ada.g: warning:nondeterminism upon
ada.g:     k==1:COMMA
ada.g:     k==2:IDENTIFIER,LPAREN,"new",CHAR_LIT,"null","others",CHAR_STRING,NUMERIC_LIT,"not",PLUS,MINUS,"abs"
ada.g:     between alt 1 and exit branch of block
 */

value : choice_s
		( RIGHT_SHAFT expression
		| WITH ( NuLL RECORD | value_s )
		)?
	;
/*
value : (comp_assoc) => comp_assoc  // is never left (on guessing.)
	| (discrete_with_range) => discrete_with_range
	| expression
	;
 */

attribute_id : RANGE
	| DIGITS
	| DELTA
	| ACCESS
	| CLASS
	| IDENTIFIER
	;

literal : NUMERIC_LIT
	| CHAR_LIT
	| CHAR_STRING
	| NuLL
	;

value_s_2 : value ( COMMA value )+
	;

comp_assoc : choice_s RIGHT_SHAFT expression
	;

expression : relation
		( AND ( THEN )? relation
		| OR ( ELSE )? relation
		| XOR relation
		)*
	;

relation : simple_expression
		( membership
		  	( (range) => range
			| name  //subtype_mark
			)
		| relational simple_expression
		)?
	;

relational : EQ
	| NE
	| LT_
	| LE
	| GT
	| GE
	;

membership : IN
	| NOT IN
	;

simple_expression : ( unary )? term ( adding term )*
	;

unary   : PLUS
	| MINUS
	;

adding  : PLUS
	| MINUS
	| CONCAT
	;

term    : factor ( multiplying factor )*
	;

multiplying : STAR
	| DIV
	| MOD
	| REM
	;

factor : NOT primary
	| ABS primary
	| primary ( EXPON primary )?
	;

primary : literal
	| allocator
	| parenthesized_primary
	| qualified  // now contains `name'
	;

parenthesized_primary : LPAREN
		( NuLL RECORD
		| value_s  // (value_s) => value_s
		/* replaces:
		  | (value_s_2) => value_s_2
		  | (comp_assoc) => comp_assoc
		 */
		// | expression ( WITH ( NuLL RECORD | value_s ) )?
		)
	RPAREN
	;

qualified :  //ambig:  subtype_mark TIC parenthesized_primary
	// Instead: merge with `name'
	simple_name
		( DOT ( ALL | CHAR_LIT | operator_symbol | simple_name )
		| LPAREN value_s RPAREN
		| TIC ( parenthesized_primary | attribute_id )
		)*
	;

allocator : NEW qualified
	;

statement_s : ( statement )+
	;

statement : ( label )?
	( null_stmt
	| exit_stmt
	| return_stmt
	| goto_stmt
	| delay_stmt
	| abort_stmt
	| raise_stmt
	| requeue_stmt
	| accept_stmt
	| select_stmt
	| if_stmt
	| case_stmt
	| loop_stmt
	| block
	| IDENTIFIER COLON
		( loop_stmt
		| block
		)
	| name ( ASSIGN expression )? semi  // procedure_call is in here.
	// | code_stmt  // TBD: resolve ambiguity
	)
	;

label : LT_LT label_name GT_GT pragma_s
	;

label_name : simple_name
	;

null_stmt : NuLL semi
	;

if_stmt : IF cond_clause
	  ( ELSIF cond_clause )*
	  ( ELSE pragma_s statement_s )?
	  END IF semi
	;

cond_clause : condition THEN pragma_s statement_s
	;

condition : expression
	;

else_opt : ( ELSE pragma_s statement_s )?
	;

case_stmt : CASE expression IS pragma_s alternative_s END CASE semi
	;

alternative_s : ( alternative )*
	;

alternative : WHEN choice_s RIGHT_SHAFT pragma_s statement_s
	;

loop_stmt : iteration basic_loop id_opt semi
	;

iteration : ( WHILE condition | iter_part ( REVERSE )? discrete_range )?
	;

iter_part : FOR IDENTIFIER IN
	;

basic_loop : LOOP pragma_s statement_s END LOOP
	;

id_opt : ( designator )?
	;

block : ( DECLARE pragma_s decl_part )? block_body END id_opt semi
	;

block_body : BEGIN pragma_s handled_stmt_s
	;

handled_stmt_s : statement_s ( except_handler_part )?
	;

exit_stmt : EXIT ( label_name )? ( WHEN condition )? semi
	;

return_stmt : RETURN ( expression )? semi
	;

goto_stmt : GOTO label_name semi
	;

subprog_decl :
	procedure_head
		( generic_subp_inst
		| formal_part_opt subprog_decl_part
		)
	| function_head
		( generic_subp_inst
		| function_tail subprog_decl_part
		)
	;

generic_subp_inst : IS generic_inst semi
	;

generic_inst : NEW compound_name ( LPAREN value_s RPAREN )?
	;

subprog_decl_part : ( ( renames )? semi
		| IS ( ABSTRACT | SEPARATE) semi
		)
	;

subprog_decl_or_body :
	procedure_head
		( generic_subp_inst
		| formal_part_opt subprog_decl_item
		)
	| function_head
		( generic_subp_inst
		| function_tail subprog_decl_item
		)
	;

subprog_decl_item : ( ( renames )? semi
		| IS    ( ABSTRACT semi
			| SEPARATE semi
			| subprog_body_part
			)
		)
	;

subprog_spec : procedure_head formal_part_opt
	| function_head function_tail
	;

designator : compound_name
	| CHAR_STRING
	;

formal_part_opt : ( formal_part )?
	;

formal_part : LPAREN param_s RPAREN
	;

param_s : param ( semi param )*
	;

param : def_ids_colon mode subtype_mark init_opt
	;

mode : ( IN ( OUT )? | OUT | ACCESS )?
	;

function_tail : func_formal_part_opt RETURN subtype_mark
	;

func_formal_part_opt : ( LPAREN func_param_s RPAREN )?
	;

func_param_s : func_param ( semi func_param )*
	;

func_param : def_ids_colon ( IN | ACCESS )? subtype_mark init_opt
	;

subprog_body_part : decl_part block_body END id_opt semi
	;

subprog_body : subprog_spec IS subprog_body_part
	;

pkg_spec_part : pragma_s basic_decl_item_s private_part END c_id_opt semi
	;

basic_decl_item : PACKAGE pkg_decl
	| task_decl
	| prot_decl
	| subprog_decl
	| decl_common
	;

basic_decl_item_s : ( basic_decl_item )*
	;

pkg_spec : PACKAGE compound_name IS pkg_spec_part
	;

pkg_decl : compound_name
		( IS	( generic_inst semi
			| pkg_spec_part
			)
		| renames semi
		)
	;

private_part : ( PRIVATE pragma_s basic_decl_item_s )?
	;

c_id_opt : ( compound_name )?
	;

pkg_body_part : decl_part body_opt END c_id_opt semi
	;

pkg_body : PACKAGE BODY compound_name IS pkg_body_part
	;

body_opt : ( block_body )?
	;

private_type : abstract_tagged_limited_opt PRIVATE
	;

use_clause : USE ( TYPE )? c_name_list semi
	;

name_s : name ( COMMA name )*
	;

renames : RENAMES name
	;

task_decl : TASK
		( TYPE simple_name discrim_part_opt
		| simple_name
		)
		( IS pragma_s entry_decl_s rep_spec_s
		  ( PRIVATE pragma_s entry_decl_s rep_spec_s )?
		  END id_opt
		)?
		semi
	;

task_body : TASK BODY simple_name IS decl_part block_body END id_opt semi
	;

prot_decl : PROTECTED
		( TYPE simple_name discrim_part_opt
		| IDENTIFIER
		)
		IS pragma_s prot_op_decl_s
		( PRIVATE pragma_s prot_elem_decl_s )?
		END id_opt semi
	;

prot_op_decl_s : ( prot_op_decl )*
	;

prot_op_decl : entry_decl
	| subprog_spec semi
	| rep_spec
	| pragma
	;

prot_elem_decl_s : ( prot_elem_decl )*
	;

prot_elem_decl : prot_op_decl | comp_decl
	;

prot_body : PROTECTED BODY simple_name IS pragma_s
	       ( prot_op_body )* END id_opt semi
	;

prot_op_body : entry_body
	| subprog_spec
		( IS subprog_body_part
		| semi
		)
	;

entry_decl_s : ( entry_decl )*
	;

entry_decl : ENTRY IDENTIFIER
		( (formal_part_opt) => formal_part_opt
		| LPAREN discrete_range RPAREN formal_part_opt
		)
	semi
	;

entry_body : ENTRY IDENTIFIER
		( LPAREN
		  ( FOR IDENTIFIER IN discrete_range RPAREN ( LPAREN param_s )?
		  | param_s
		  )
		  RPAREN
		)?
		WHEN condition entry_body_part
	;

entry_body_part : ( IS decl_part block_body END id_opt )? semi
	;

rep_spec_s : ( rep_spec )*
	;

entry_call : name semi  // A lot of semantics hidden here.
	;

accept_stmt : ACCEPT simple_name
		( LPAREN
			( param_s RPAREN
			| expression RPAREN formal_part_opt
			)
		)?
		( DO handled_stmt_s END id_opt )? semi
	;

delay_stmt : DELAY ( UNTIL )? expression semi
	;

select_stmt : SELECT
	( (select_wait) => select_wait
	| delay_stmt stmts_opt THEN ABORT statement_s     // async_select
	| entry_call stmts_opt                        //
		( THEN ABORT statement_s          // (with delay_or_entry_alt)
		| OR delay_stmt stmts_opt  // timed_entry_call
		| ELSE statement_s         // cond_entry_call
		)
	)
	END SELECT semi
	;

select_wait : guarded_select_alt or_select else_opt
	;

guarded_select_alt : ( WHEN condition RIGHT_SHAFT pragma_s )? select_alt
	;

or_select : ( OR guarded_select_alt )*
	;

select_alt : accept_stmt stmts_opt
	| delay_stmt stmts_opt
	| TERMINATE semi
	;

stmts_opt : ( statement_s )?
	;

abort_stmt : ABORT name_s semi
	;

// Compilation Unit:  This is the start rule for this parser
comp_unit : pragma_s context_spec
	( PRIVATE
		( subprog_decl
		| PACKAGE pkg_decl
		| generic_decl_part
		)
	| procedure_head
		( generic_subp_inst
		| formal_part_opt lib_subprog_part
		)
	| function_head
		( generic_subp_inst
		| function_tail lib_subprog_part
		)
	| PACKAGE
		( BODY compound_name IS pkg_body_part
		| pkg_decl
		)
	| generic_decl_part
	| subunit
	)
	;

lib_subprog_part : ( renames )? semi
		| IS subprog_body_part
	;

context_spec : ( with_clause ( use_clause)* )*
	;

with_clause : WITH c_name_list semi
	;

generic_decl_part: generic_formal_part
		( PACKAGE compound_name
			( renames semi
			| IS pkg_spec_part
			)
		| subprog_spec ( renames )? semi
		)
	;

subunit : SEPARATE LPAREN compound_name RPAREN
		( subprog_body
		| pkg_body
		| task_body
		| prot_body
		)
	;

body_stub : ( ( TASK | PROTECTED ) BODY simple_name
	    | PACKAGE BODY compound_name
	    | subprog_spec
	    )
	IS SEPARATE semi
	;

except_handler_part : EXCEPTION ( exception_handler )+
	;

exception_handler : WHEN ( IDENTIFIER COLON )? except_choice_s RIGHT_SHAFT
		pragma_s statement_s
	;

except_choice_s : except_choice ( PIPE except_choice )*
	;

except_choice : compound_name
	| OTHERS
	;

raise_stmt : RAISE ( compound_name )? semi
	;

requeue_stmt : REQUEUE name ( WITH ABORT )? semi
	;

generic_decl : generic_formal_part ( subprog_spec | pkg_spec ) semi
	;

generic_formal_part : GENERIC ( generic_formal )*
	;

generic_formal : param semi
	| TYPE simple_name ( discrim_part | LPAREN BOX RPAREN )? IS
	    generic_type_def semi
	| WITH ( subprog_spec ( IS ( BOX | name ) )?
	       | PACKAGE simple_name IS NEW compound_name
			( LPAREN ( BOX | def_id_s ) RPAREN )?
	       ) semi
	| use_clause
	;

generic_type_def : LPAREN BOX RPAREN
	| RANGE BOX
	| MOD BOX
	| DELTA BOX ( DIGITS BOX )?
	| DIGITS BOX
	| array_type
	| access_type
	| private_type
	| generic_derived_type
	;

generic_derived_type : ( ABSTRACT )? NEW subtype_ind ( WITH PRIVATE )?
	;

rep_spec : FOR subtype_mark USE
		( RECORD align_opt comp_loc_s END RECORD // record_type_spec
		| AT expression                        // address_spec (Ada83)
		| expression  // attrib_def. Semantic check must ensure that
		    // the above subtype_mark contains an attribute reference.
		)
	semi
	;

align_opt : ( AT MOD expression semi )?
	;

comp_loc_s : ( subtype_mark AT expression RANGE range semi )*
	;

code_stmt : qualified semi
	;

semi : SEMI pragma_s
	;


//----------------------------------------------------------------------------
// The Ada scanner
//----------------------------------------------------------------------------
class AdaLexer extends Lexer;

options {
  charVocabulary = '\3'..'\377';
  exportVocab = Ada;      // call the vocabulary "Ada"
  testLiterals = false;   // don't automatically test for literals
  k = 3;                  // number of characters of lookahead
  caseSensitive = false;
  caseSensitiveLiterals = false;
  defaultErrorHandler = true;
}

tokens {
  ABORT            = "abort"      ;
  ABS              = "abs"        ;
  ABSTRACT         = "abstract"   ;
  ACCEPT           = "accept"     ;
  ACCESS           = "access"     ;
  ALIASED          = "aliased"    ;
  ALL              = "all"        ;
  AND              = "and"        ;
  ARRAY            = "array"      ;
  AT               = "at"         ;
  BEGIN            = "begin"      ;
  BODY             = "body"       ;
  CASE             = "case"       ;
  CLASS            = "class"      ;
  CONSTANT         = "constant"   ;
  DECLARE          = "declare"    ;
  DELAY            = "delay"      ;
  DELTA            = "delta"      ;
  DIGITS           = "digits"     ;
  DO               = "do"         ;
  ELSE             = "else"       ;
  ELSIF            = "elsif"      ;
  END              = "end"        ;
  ENTRY            = "entry"      ;
  EXCEPTION        = "exception"  ;
  EXIT             = "exit"       ;
  FOR              = "for"        ;
  FUNCTION         = "function"   ;
  GENERIC          = "generic"    ;
  GOTO             = "goto"       ;
  IF               = "if"         ;
  IN               = "in"         ;
  IS               = "is"         ;
  LIMITED          = "limited"    ;
  LOOP             = "loop"       ;
  MOD              = "mod"        ;
  NEW              = "new"        ;
  NOT              = "not"        ;
  NuLL             = "null"       ;
  OF               = "of"         ;
  OR               = "or"         ;
  OTHERS           = "others"     ;
  OUT              = "out"        ;
  PACKAGE          = "package"    ;
  PRAGMA           = "pragma"     ;
  PRIVATE          = "private"    ;
  PROCEDURE        = "procedure"  ;
  PROTECTED        = "protected"  ;
  RAISE            = "raise"      ;
  RANGE            = "range"      ;
  RECORD           = "record"     ;
  REM              = "rem"        ;
  RENAMES          = "renames"    ;
  REQUEUE          = "requeue"    ;
  RETURN           = "return"     ;
  REVERSE          = "reverse"    ;
  SELECT           = "select"     ;
  SEPARATE         = "separate"   ;
  SUBTYPE          = "subtype"    ;
  TAGGED           = "tagged"     ;
  TASK             = "task"       ;
  TERMINATE        = "terminate"  ;
  THEN             = "then"       ;
  TYPE             = "type"       ;
  UNTIL            = "until"      ;
  USE              = "use"        ;
  WHEN             = "when"       ;
  WHILE            = "while"      ;
  WITH             = "with"       ;
  XOR              = "xor"        ;
}

//----------------------------------------------------------------------------
// OPERATORS
//----------------------------------------------------------------------------
COMMENT            :       "--"    ;
DOT_DOT            :       ".."    ;
LT_LT              :       "<<"    ;
BOX                :       "<>"    ;
GT_GT              :       ">>"    ;
ASSIGN             :       ":="    ;
RIGHT_SHAFT        :       "=>"    ;
NE                 :       "/="    ;
LE                 :       "<="    ;
GE                 :       ">="    ;
EXPON              :       "**"    ;
PIPE               :       '|'     ;
CONCAT             :       '&'     ;
DOT                :       '.'     ;
EQ                 :       '='     ;
LT_                :       '<'     ;
GT                 :       '>'     ;
PLUS               :       '+'     ;
MINUS              :       '-'     ;
STAR               :       '*'     ;
DIV                :       '/'     ;
LPAREN             :       '('     ;
RPAREN             :       ')'     ;
COLON              :       ':'     ;
COMMA              :       ','     ;
SEMI               :       ';'     ;
TIC    : { LA(3)!='\'' }?  '\''    ;
	 // condition needed to disambiguate from CHAR_LIT
/*
MINUS   : { LA(2)!='-' }?
	// condition needed to disambiguate from COMMENT
			   '-'     ;
 */


// Literals.

// Rule for IDENTIFIER: testLiterals is set to true.  This means that
// after we match the rule, we look in the literals table to see if
// it's a keyword or really an identifier.
IDENTIFIER
	options {testLiterals=true;}
            : ( 'a'..'z' ) ( ('_')? ( 'a'..'z'|'0'..'9' ) )*
	;

CHAR_LIT    : { LA(3)=='\'' }?
	// condition needed to disambiguate from TIC
	"'" . "'"
	;

CHAR_STRING : '"' ("\"\"" | ~('"'))* '"'
	;

NUMERIC_LIT : ( DIGIT )+
		( '#' BASED_INTEGER ( '.' BASED_INTEGER )? '#'
		| ( '_' ( DIGIT )+ )+  // INTEGER
		)?
		( { LA(2)!='.' && LA(3)!='.' }?
			( '.' ( DIGIT )+ ( EXPONENT )?
			| EXPONENT
			)
		)?
	;

// a couple protected methods to assist in matching the various numbers

protected
DIGIT   :  ( '0'..'9' ) ;

protected
EXPONENT           :  ('e') ('+'|'-')? ( DIGIT )+ ;

protected
EXTENDED_DIGIT     :  ( DIGIT | 'a'..'f' ) ;

protected
BASED_INTEGER      :  ( EXTENDED_DIGIT ) ( ('_')? EXTENDED_DIGIT )* ;


// Whitespace -- ignored
WS_	:	(	' '
		|	'\t'
		|	'\f'
		// handle newlines
		|	(	"\r\n"  // Evil DOS
			|	'\r'    // Macintosh
			|	'\n'    // Unix (the right way)
			)
			{ newline(); }
		)
		{ _ttype = ANTLR_USE_NAMESPACE(antlr)Token::SKIP; }
	;

// Single-line comments
CMNT_	:	COMMENT
		(~('\n'|'\r'))* ('\n'|'\r'('\n')?)
		{$setType(ANTLR_USE_NAMESPACE(antlr)Token::SKIP); newline();}
	;


