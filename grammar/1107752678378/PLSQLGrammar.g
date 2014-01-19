/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

PROJECT:        PL/SQL Grammer
FILE:           PLSQLGrammar.g

AUTHOR: Qazi Firdous Ahmed (qazif_ahmed@infosys.com) 
		Krupa Benhur (krupa_bg@infosys.com)
		Manojaba Banerjee (manojaba_banerjee@infosys.com)
		Infosys Technologies Ltd., Bangalore, India

DATED:		Sept 18, 2002

DESCRIPTION:    This grammar is for PL/SQL.

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/


header
{
package MyParser;
}

class PLSqlParser extends Parser;

options {
    exportVocab = PLSql;
    k = 4;
    buildAST = true;
}


tokens {
    START_RULE;
    CREATE_PACKAGE;
    PACKAGE_SPEC;
    PACKAGE_BODY;
    SELECT_EXPRESSION<AST=SELECT_EXPRESSIONNode>;
    PLSQL_BLOCK;
    CURSOR_DECLARATION;
    PARAMETER_SPEC;
    SQL_STATEMENT;
    SELECT_COMMAND;
    SELECT_LIST;
    TABLE_REFERENCE_LIST;
    WHERE_CONDITION;
    SUBQUERY;
    SQL_IDENTIFIER;
    SQL_LITERAL;
    FUNCTION;
    GROUP_FUNCTION;
    USER_FUNCTION;
    MULTIPLY;
    ARGUMENT;
}

start_rule: (create_package)* EOF
	    { #start_rule = #([START_RULE, "start_rule"], #start_rule); }
	  ;

create_package: 
	"create" ( "or" "replace" )?
	(package_spec | package_body)?
	{ #create_package = #([CREATE_PACKAGE, "create_package"], #create_package); }
	;
	
package_spec:
	"package" package_name ("is" | "as") 
	package_obj_spec ( package_obj_spec )*
	"end" (package_name)? SEMI!
	{ #package_spec = #([PACKAGE_SPEC, "package_spec"], #package_spec); }
	;
	
package_body: 
	"package" ("body")? package_name ("is" | "as")
	package_obj_body ( package_obj_body )*
	("begin")? (seq_of_statements)?  
	"end" (package_name )? SEMI!
	{ #package_body = #([PACKAGE_BODY, "package_body"], #package_body); }
	;
		
	
package_name:
	(schema_name DOT)? identifier 
	;
		

package_obj_spec:
	variable_declaration 
	| subtype_declaration 
	| cursor_declaration 
	| cursor_spec 
	| exception_declaration 
	| record_declaration 
	| plsql_table_declaration 
	| procedure_spec 
	| function_spec 
	;
	
variable_declaration: 
	variable_name ("constant")?
	type_spec ("not" "null")? 
	((ASSIGNMENT_EQ|"default") plsql_expression)? SEMI!
      	;	
      	
subtype_declaration 
      	:
      	"subtype" type_name "is" type_spec SEMI!
      	;      	
      	
cursor_declaration:
	"cursor" cursor_name
      	(OPEN_PAREN! parameter_spec! (COMMA! parameter_spec!)* CLOSE_PAREN! )?
      	"is"! select_command SEMI! 
      	{ #cursor_declaration = #([CURSOR_DECLARATION, "cursor_declaration"], #cursor_declaration); }
      	;

package_obj_body: 
	variable_declaration 
	| subtype_declaration 
	| cursor_declaration 
	| exception_declaration 
	| record_declaration 
	| plsql_table_declaration 
	| procedure_body 
	| function_body 
	;

seq_of_statements: 
	statement SEMI!
	(statement SEMI!)*
	;  
	
statement:
	 assignment_statement
	| exit_statement
	| goto_statement
	| if_statement 
	| loop_statement 
	| null_statement
	| raise_statement
	| return_statement
	| sql_statement
//	| plsql_block
	| begin_block
	| function_call
	;
		
plsql_block:
	( START_LABEL label_name END_LABEL )?
	(("declare")? (declare_spec)+)? 
	("begin")?
     	seq_of_statements
     	("exception" exception_handler (exception_handler)*)? 
     	("end" (label_name)? SEMI!)?
     	{ #plsql_block = #([PLSQL_BLOCK, "plsql_block"], #plsql_block); }
     	;
      	
declare_spec:
	variable_declaration 
	| subtype_declaration 
	| cursor_declaration 
	| exception_declaration 
	| exception_pragma 
	| record_declaration 
	| plsql_table_declaration 
	| procedure_declaration 
	| function_declaration
	;

assignment_statement: 
	(object ASSIGNMENT_EQ function_call) => (object ASSIGNMENT_EQ function_call)
	|(object ASSIGNMENT_EQ plsql_expression)  => (object ASSIGNMENT_EQ plsql_expression)
	|function_call
	;

object: 
	variable_name
	| ( record_name DOT field_name ) 
	| ( plsql_table_name OPEN_PAREN! subscript CLOSE_PAREN! ) 
	| ( COLON host_variable ) 
	;

field_name:
	identifier
	;
	
subscript:
	plsql_expression 
	;
	
host_variable:
	identifier
	;
	
goto_statement:
	"goto" label_name
	;
	
label_name:
	identifier
	;	

exit_statement:
	"exit" (label_name)? ("when" plsql_condition)?
	;
	
datatype:
	"binary_integer" 
      	| "natural" 
      	| "positive" 
      	| ("number"(OPEN_PAREN! NUMBER (COMMA NUMBER)? CLOSE_PAREN! )? ) 
      	| ( "char" (OPEN_PAREN! NUMBER CLOSE_PAREN! )? ) 
      	| ("long" ("raw")?)
      	| "raw"
      	| "boolean"  
      	| "date"
      	| "smallint"
      	| "real"
      	| "numeric"
      	| "int"
      	| "integer"
      	| "double precesion"
      	| "decimal"
      	| "dec"
      	| ( "varchar2" ( OPEN_PAREN! NUMBER CLOSE_PAREN! )? )
      	| ( "varchar" ( OPEN_PAREN! NUMBER CLOSE_PAREN! )? )
      	| ( "character" ( OPEN_PAREN! NUMBER CLOSE_PAREN! )? )
      	| "mlslabel"
      	;      
      	
//Added package_name.variable_name
type_spec 
      	:
      	datatype 
      	| ( variable_name PERCENTAGE "type" ) 
      	| ( table_name DOT column_name PERCENTAGE "type" ) 
//     	| ( package_name DOT variable_name) 
      	| ( table_name PERCENTAGE"rowtype" ) 
      	| type_name
      	;

//Changed the type name to handle variable declaration      	      	
type_name:
	identifier (DOT identifier)*
	;
     	
parameter_spec :
      	parameter_name (type_spec)?
      	{ #parameter_spec = #([PARAMETER_SPEC, "parameter_spec"], #parameter_spec); }
      	;	
      	
parameter_name :
      	identifier
      	;
      	
cursor_spec: 
	"cursor" cursor_name 
	(OPEN_PAREN! parameter_spec (COMMA parameter_spec)* CLOSE_PAREN!)?
	"return" return_type SEMI! 
	;

procedure_spec: 
	"procedure" procedure_name 
	( OPEN_PAREN! argument ( COMMA argument )* CLOSE_PAREN! )? SEMI! 
	;
	
function_spec: 
	"function" function_name 
	OPEN_PAREN! argument ( COMMA argument)* CLOSE_PAREN! 
	"return" return_type SEMI! 
	;
   	   
exception_declaration :
      	exception_name "exception" SEMI!
      	;      	   

exception_name:
	(exception_package_name DOT)? identifier 
	;

exception_package_name:
	identifier
	;

exception_pragma :
	"pragma""exception_init" OPEN_PAREN! exception_name COMMA oracle_err_number CLOSE_PAREN! SEMI!
	;
	
oracle_err_number:
	NUMBER
	;
	
record_declaration :
      	record_type_dec 
      	| record_var_dec
      	;
      	
record_type_dec :
      	"type" type_name "is" "record" 
      	OPEN_PAREN! field_spec ( COMMA field_spec )* CLOSE_PAREN! SEMI!
      	;
      	
record_var_dec :
      	record_name type_name PERCENTAGE "rowtype" SEMI!
      	;	
	
field_spec:
        column_spec
    	;
    	
plsql_table_declaration :
      	table_type_dec | table_var_dec
      	;
      	
table_type_dec :
      	"type" type_name "is" "table" 
      	"of" field_spec 
      	"indexed" "by" "binary_integer" SEMI!
      	;
      	
table_var_dec :
      	plsql_table_name type_name SEMI!
      	;
      	
plsql_table_name :
      	identifier
      	;    	
      	
procedure_declaration :
      	procedure_body
      	;
      	
procedure_body :
      	(proc_fun_start)? "procedure" procedure_name 
      	( OPEN_PAREN! argument ( COMMA argument )* CLOSE_PAREN! )? 
      	( "return" return_type)?
	( "is" | "as" )
      	( ("declare")? ( declare_spec )* )?
      	("begin" )?
      	(seq_of_statements )?
     	( "exception" ( exception_handler )* )?
      	"end" ( procedure_name )? SEMI!
      	;
      	
begin_block:
	"begin"
	(seq_of_statements )?
	( "exception" ( exception_handler )+ )?
      	"end" 
      	;
      	
//Exception handler needs to be defined      	
exception_handler :
	"when" exception_name ("or" exception_name)* "then"
	seq_of_statements
	;       	

proc_fun_start :
	"create" ( "or replace" )?
	;
	
function_body :
      	(proc_fun_start)? "function" function_name 
      	( OPEN_PAREN! argument (COMMA argument)* CLOSE_PAREN!)? 
	"return" return_type ( "is" | "as" )
      	( "declare" ( declare_spec )* )?
       	("begin" )?
      	(seq_of_statements)?
     	( "exception" ( exception_handler )+ )?
      	"end" ( function_name )? SEMI!
	;
	
function_name :
      	( schema_name DOT )? identifier
      	;
     	
procedure_name :
      	( schema_name DOT )? identifier
      	;
      	
argument :
      	argument_name ( "in" | "out" | ( "inout" ) )? (argument_type )?
      	( ASSIGNMENT_EQ "default" value )?
	;
	
argument_name :
      	identifier
      	;
      	
argument_type :
      	type_spec
      	;
      	
value :
      	( ( PLUS | MINUS )? NUMBER ) | quoted_string
      	;
      	
return_type :
      	type_spec
      	;
      	
function_declaration :
      	function_body
      	;

function_call :
	 user_defined_function ( OPEN_PAREN! expression ( COMMA expression )* CLOSE_PAREN! ) 
	;
	
variable_name  : 
	identifier
	;

null_statement:
	"null" 
	;
	
raise_statement :
	"raise" ( exception_name )?
	;
		
return_statement :
	"return" ( plsql_expression )?
	;
	
loop_statement :
	(label_name)?
	(("while"^ plsql_condition) |("for"^ (cursor_loop_param | numeric_loop_param)))?
	"loop"^
	seq_of_statements
	"end""loop" (label_name)?
	;
	
plsql_condition :
	boolean_exp
	;

boolean_exp :
	("not")? boolean_term ("or" boolean_term)*
	;
	
boolean_term :
	boolean_factor ("and" boolean_factor)*
	;
		
boolean_factor : 
      boolean_literal 
      | variable_name 
      | ( function (OPEN_PAREN plsql_exp_list CLOSE_PAREN)? ) ( relational_op plsql_expression )?
      | ( OPEN_PAREN boolean_exp CLOSE_PAREN ) 
      | ( plsql_expression 
      ( ( relational_op plsql_expression ) 
      | ( "is" ("not")? "null" ) 
      | ( ("not")? "like" match_string ) 
      | ( ("not")? "between" plsql_expression 
      "and" plsql_expression ) 
      | ( ("not")? "in" OPEN_PAREN plsql_exp_list CLOSE_PAREN ) 
      | ( ( cursor_name | subquery )( PERCENTAGE "notfound" | PERCENTAGE "found" | PERCENTAGE "isopen" ) ) ) )
      | ( cursor_name (PERCENTAGE "notfound" | PERCENTAGE "found" | PERCENTAGE "isopen" ))?
      ;
      
boolean_literal :
	"true" | "false" | "null" 
	;
	
numeric_loop_param :
	index_name "in" ("reverse")? integer_expr DOUBLEDOT integer_expr
	;
index_name :
	identifier
	;

//Added typespec to handle packagename.variablename for loop statement
integer_expr :
	num_expression
	|type_spec
	;

cursor_name :
	identifier
	;
	
cursor_loop_param :
	record_name "in"
	(( cursor_name
	(OPEN_PAREN! plsql_exp_list CLOSE_PAREN!)?)
	|(OPEN_PAREN! select_statement CLOSE_PAREN!))
	;
	
record_name:
	identifier
	;
	
plsql_expression:
	num_expression
	|char_expression
	|date_expression
	|boolean_expression
	;

num_expression:
	(PLUS | MINUS)? num_term ((PLUS|MINUS) num_term)*
	;
	
num_term:
	num_factor ((ASTERISK | DIVIDE) num_factor)*
	;

num_factor:
	(numeric_literal
	|variable_name
	|host_variable
	|(function (OPEN_PAREN plsql_exp_list CLOSE_PAREN)?)
	|(OPEN_PAREN! num_expression CLOSE_PAREN!)
	|"null"
	|((cursor_name | subquery) "%rowcount")
	|(cursor_name "%rowcount")
	) ("**" integer_expr)?
	;
	
numeric_literal:
	NUMBER
	;
	
boolean_expression:
	identifier
	|column_spec
	|boolean_literal
	;
	
plsql_exp_list:
	plsql_expression (COMMA plsql_expression)*
	;
	
char_expression:
	char_term ("||" char_term)*
	;
	
char_term:
	(char_literal
	|variable_name
	|host_variable
	|(function (OPEN_PAREN plsql_exp_list CLOSE_PAREN)?)
	|(OPEN_PAREN! char_expression CLOSE_PAREN!)
	|"null")
	;
	
char_literal:
	QUOTED_STRING
	;
	
date_expression : 
      ( date_literal 
      | variable_name 
      | host_variable 
      | ( function (OPEN_PAREN plsql_exp_list CLOSE_PAREN)? ) 
      | ( OPEN_PAREN! date_expression CLOSE_PAREN! ) 
      | "null" ) 
      ;
      
date_literal:
	QUOTED_STRING
	;
     
commit_statement: 
	"commit"      
	;
      
//Added the greedy funda on 21st of August
if_statement:
	"if"^ plsql_condition "then" seq_of_statements
	("elsif" plsql_condition "then" seq_of_statements)*
	("else" seq_of_statements )?
	"end""if" 
	;      
	
//Removed the (SEMI)? after the sql_command as sql_statement already comes under statement
sql_statement: 
	sql_command 
	{ #sql_statement = #([SQL_STATEMENT, "sql_statement"], #sql_statement); }
	;
    
sql_command:
	to_modify_data 
	| to_control_data
        ;    
    
to_modify_data:
        select_command 
        | insert_command 
        | update_command
//      | delete_command
        | set_transaction_command
	;    

to_control_data:
	close_statement
	| commit_statement
	| fetch_statement
	| lock_table_statement
	| open_statement
	| rollback_statement
	| savepoint_statement
	;
	
select_command:
        select_statement ( "union" select_statement )*
        { #select_command = #([SELECT_COMMAND, "select_command"], #select_command); }
	;

select_statement:
        ( OPEN_PAREN! select_command CLOSE_PAREN! ) => OPEN_PAREN! select_command CLOSE_PAREN!
        | select_expression 
        ;

select_expression:
	"select"^ ( "all"! | "distinct"! )? select_list
	("into" column_name)?
	//"from" table_reference_list
	table_reference_list_from
	//( "where" where_condition )?
	(where_condition_whole)?
	( connect_clause )?
	( group_clause )?
	( ( set_clause ) => set_clause )?
	( ( order_clause ) => order_clause )?
	( ( update_clause ) => update_clause )?
        { #select_expression = #([SELECT_EXPRESSION,"select_expression"], #select_expression); }
	;

select_list:
	( ( displayed_column ) => displayed_column ( COMMA displayed_column )*
        | ASTERISK )  
        { #select_list = #([SELECT_LIST, "select_list"], #select_list); }
	;
	
table_reference_list_from:
        "from" selected_table ( COMMA! selected_table )*
        { #table_reference_list_from = #([TABLE_REFERENCE_LIST, "table_reference_list_from"], #table_reference_list_from); }
    	;

table_reference_list:
        selected_table ( COMMA selected_table )*
	{ #table_reference_list = #([TABLE_REFERENCE_LIST, "table_reference_list"], #table_reference_list); }
    	;
    	
where_condition_whole:
       "where" condition
       ;

where_condition:
        condition
	{ #where_condition = #([WHERE_CONDITION, "where_condition"], #where_condition); }
  	  ;

displayed_column :
      ( (schema_name DOT)? (variable)? table_name DOT ASTERISK ) => ( ( schema_name DOT )? table_name DOT ASTERISK )
      | ( exp_simple ( alias )? )
	;

schema_name:
	identifier
	;

table_name: 
	identifier 
	;

exp_simple:
	expression 
	;

expression:
	term ( ( PLUS | MINUS ) term )*
	| boolean_literal
	;

alias:
	( "as" )? identifier
	;

term:
	factor ( ( multiply | DIVIDE ) factor )*
	;

multiply:
        ASTERISK
	{ #multiply = #([MULTIPLY, "multiply"], #multiply); }
	;

factor:
	factor2 ( VERTBAR VERTBAR factor2 )*
	;

factor2:
	( sql_literal ) => sql_literal
	| ( ( PLUS | MINUS ) expression ) => ( PLUS | MINUS ) expression
	| ( function ( OPEN_PAREN! expression ( COMMA expression )* CLOSE_PAREN ) ) => function ( OPEN_PAREN expression ( COMMA expression )* CLOSE_PAREN )
	//Commented by Qazi on 28th of August
	//{ #factor2 = #([FUNCTION, "function"], #factor2); }
	| ( group_function OPEN_PAREN ( ASTERISK | "all" | "distinct" )? (expression)? CLOSE_PAREN ) => group_function OPEN_PAREN ( ASTERISK | "all" | "distinct" )? (expression)? CLOSE_PAREN
	//{ #factor2 = #([GROUP_FUNCTION, "group_function"], #factor2); }
	| ( user_defined_function ( OPEN_PAREN expression ( COMMA expression )* CLOSE_PAREN ) ) => user_defined_function ( OPEN_PAREN expression ( COMMA expression )* CLOSE_PAREN )
	//{ #factor2 = #([USER_FUNCTION, "user_function"], #factor2); }
	| ( OPEN_PAREN! expression CLOSE_PAREN! ) => OPEN_PAREN! expression CLOSE_PAREN!
	| ( variable ) => variable
	| expression_list
	;

expression_list:
	OPEN_PAREN! expression ( COMMA expression )+ CLOSE_PAREN!
	;

sql_literal:
        ( NUMBER | QUOTED_STRING | "null" )
      	{ #sql_literal = #([SQL_LITERAL, "sql_literal"], #sql_literal); }
	;

variable:
	( column_spec ( OPEN_PAREN! PLUS CLOSE_PAREN! ) ) => column_spec ( OPEN_PAREN! PLUS CLOSE_PAREN! )
        | column_spec
	;

column_spec:
	( ( schema_name DOT )? table_name DOT )? column_name
	;

user_defined_function:
	( ( schema_name DOT )? package_name DOT )? identifier
	;

column_name: 
	identifier 
	;

function:
	number_function 
	| char_function 
	| group_function 
	| conversion_function 
	| other_function 
	;

number_function:
	"abs" | "ceil" | "floor" | "mod" | "power" | "round" 
	| "sign" | "sqrt" | "trunc" 
	;


char_function:
	"chr" | "initcap" | "lower" | "lpad" | "ltrim" | "replace" 
	| "rpad" | "rtrim" | "soundex" | "substr" | "translate" | "upper" 
	| "ascii" | "instr" | "length" 
	| "concat"
    	;

group_function:
	"avg" | "count" | "max" | "min" | "stddev" | "sum" 
	| "variance" 
	;

conversion_function:
	"chartorowid" | "convert" | "hextoraw" | "rawtohex" | "rowidtochar" 
	| "to_char" | "to_date" | "to_number" 
	;

other_function 
	:
	"decode" | "dump" | "greatest" | "least" | "nvl" 
	| "uid" | "userenv" | "vsize" 
	;

pseudo_column:
	"user" | "sysdate"
	;

selected_table:
	( table_spec | subquery ) ( alias )?
	;

table_spec:
	( schema_name DOT )? table_name ( AT_SIGN link_name )?
	;

table_alias:
	( schema_name DOT )? table_name ( AT_SIGN link_name )? ( alias )?
	;

link_name:
	identifier
	;

condition:
	logical_term ( "or" logical_term )* 
	;

logical_term:
	logical_factor ( "and" logical_factor )*
	;

logical_factor:
	( ( "prior" ) ? exp_simple relational_op ( "prior" )? exp_simple ) => ( ( "prior" ) ? exp_simple relational_op ( "prior" )? exp_simple ) 
	| ( exp_simple ( "not" )? "in" ) => exp_simple ("not")? "in" exp_set
	| ( exp_simple ( "not" )? "like" ) => exp_simple ( "not" )? "like" expression ( "escape" QUOTED_STRING )?
	| ( exp_simple ( "not" )? "between" ) => exp_simple ( "not" )? "between" exp_simple "and" exp_simple
	| ( exp_simple "is" ( "not" )? "null" ) => exp_simple "is" ( "not" )? "null"
	| ( quantified_factor ) => quantified_factor 
	| ( "not" condition ) => "not" condition
	| ( OPEN_PAREN! condition CLOSE_PAREN! ) 
	;


quantified_factor:
	( exp_simple relational_op ( "all" | "any" )? subquery ) => exp_simple relational_op ( "all" | "any" )? subquery
	| ( ( "not" )? "exists" subquery ) => ( "not" )? "exists" subquery
	| subquery
	;

relational_op: 
	EQ | LT | GT | NOT_EQ | LE | GE 
	;


exp_set:
	( exp_simple ) => exp_simple
	| subquery
	;

subquery:
	OPEN_PAREN! select_command CLOSE_PAREN! 
	{ #subquery = #([SUBQUERY, "subquery"], #subquery); }
	;

connect_clause:
	( "start" "with" condition )? // the start can be before the connect by
	"connect" "by" 
// 	This appears to allow multiple comparisons, so just use the updated
// 	condition rule.
        ( ( "prior" exp_simple relational_op exp_simple ) 
        | ( exp_simple relational_op exp_simple "prior" ) )
        ( ( ( "prior" )? condition ) => ("prior")? condition
//	Qazi made a change here replace ? with *
        | exp_simple relational_op ( "prior" )? exp_simple ( "and" condition )?
        )
        condition
	( "start" "with" condition )?
	;

group_clause:
	"group" "by" expression ( COMMA expression )* ( "having" condition )?
	;

// Would this really do what is necessary?  The following does not look
// right, but not that familiar with what is being refered to here.

set_clause:
	( ( "union" "all" ) | "intersect" | "minus" ) select_command 
	;

order_clause:
	"order" "by" sorted_def ( COMMA sorted_def )*
	;

sorted_def:
	(( expression ) => expression | ( NUMBER ) => NUMBER ) ( "asc" | "desc" )? 
	;

update_clause:
	"for" "update" ( "of" column_name ( COMMA column_name )* )? ( "nowait" )?
	;

//In the Insert statement insted of plsql_exp_list, modified it to variable_name,
//and character literals.

insert_command: 
	"insert" "into" table_reference_list 
	( OPEN_PAREN! column_spec CLOSE_PAREN! )?
	( ( "values" OPEN_PAREN! (variable_name) (COMMA variable_name)* CLOSE_PAREN! ) 
	| select_statement ) 
	;

update_command:
	( subquery_update ) => subquery_update 
        | simple_update
	;

simple_update:
	"update" table_alias
	"set" column_spec EQ ( ( expression ) => expression | subquery ) 
	( COMMA column_spec EQ ( ( expression ) => expression | subquery ) )*
	"where" condition 
	;

subquery_update:
	"update" table_alias
	"set" OPEN_PAREN! column_spec ( COMMA column_spec )* CLOSE_PAREN! EQ subquery 
	"where" condition 
	;
   
set_transaction_command: 
	"set" "transaction" "read" "only" 
	;
	      
close_statement : 
      "close" cursor_name 
      ;
      
      
fetch_statement: 
	"fetch" cursor_name "into" 
	( ( variable_name (COMMA variable_name )* ) 
	| record_name ) 
	;
      
lock_table_statement: 
	"lock" "table" table_reference_list 
	"in" lock_mode "mode" ( "nowait" )?
	;
      
lock_mode:
	"row" "share"
	|"row" "exclusive"
	|"share" "update"
	|"share"
	|"share""row""exclusive"
	|"exclusive"
	;

open_statement: 
	"open" cursor_name (OPEN_PAREN! plsql_exp_list! CLOSE_PAREN!)?
	;
      
rollback_statement: 
	"rollback" ( "work" )?
	( "to" ( "savepoint" )? savepoint_name )?
	( "comment" quoted_string )?
	;
      
savepoint_statement: 
	"savepoint" savepoint_name 
	;
      
      
savepoint_name:
	identifier 
	;

// Direct mappings to lexer.

identifier:
        ( IDENTIFIER | QUOTED_STRING | keyword )
   	;

quoted_string : QUOTED_STRING ;

match_string : QUOTED_STRING ;

//
// These are non reserve words that can be used as identifiers.  If it is
// a reserved word in Oracle but not ANSI, that is noted and commented out
// (can not be used). If it is a reserve word in ANSI and not in Oracle,
// that is noted but it is not commented out (can be used).
//

keyword
    :
        "abs"
        | "ascii"
        | "ceil"
        | "chartorowid"
        | "chr"
        | "concat"
        | "convert"
        | "count"
        | "decode"
        | "dump"
        | "floor"
        | "greatest"
        | "hextoraw"
        | "initcap"
        | "instr"
        | "intersect"
        | "least"
        | "length"
        | "lower"
        | "lpad"
        | "ltrim"
     // | "max" // oracle
     // | "min" // oracle
     // | "minus" // oracle
     // | "mod" // oracle
     // | "not" // oracle
     // | "nowait" // oracle
        | "nvl"
        | "power"
     // | "prior" // oracle
        | "rawtohex"
        | "replace"
        | "round"
        | "rowidtochar"
        | "rpad"
        | "rtrim"
        | "sign"
        | "soundex"
        | "sqrt"
     // | "stddev" // oracle
        | "substr"
     // | "sum" // oracle
        | "sysdate"
        | "to_char"
        | "to_date"
        | "to_number"
        | "translate"
        | "trunc"
     // | "uid" // oracle
        | "upper"
        | "user" // ansi
        | "userenv"
     // | "variance" // oracle
        | "vsize"
    ;

//Below code deals with TreeWalker part that extends TreeParser

class PLSqlTreeWalker extends TreeParser;

options {
    exportVocab = PLSql;
    k = 4;
    buildAST = true;
}

start_rule: 
	(create_package)* EOF
	;

create_package: 
	"create" ( "or" "replace" )?
	(package_spec | package_body)?
	;
	
package_spec:
	"package" package_name ("is" | "as") 
	package_obj_spec ( package_obj_spec )*
	"end" (package_name)? SEMI!
	;
	
package_body: 
	"package" ("body")? package_name ("is" | "as")
	package_obj_body ( package_obj_body )*
	("begin")? (seq_of_statements)?  
	"end" (package_name )? SEMI!
	;
	
package_name:
	(schema_name DOT)? identifier 
	;

package_obj_spec:
	variable_declaration 
	| subtype_declaration 
	| cursor_declaration 
	| cursor_spec 
	| exception_declaration 
	| record_declaration 
	| plsql_table_declaration 
	| procedure_spec 
	| function_spec 
	;
	
variable_declaration: 
	variable_name ("constant")?
	type_spec ("not" "null")? 
	((ASSIGNMENT_EQ|"default") plsql_expression)? SEMI!
      	;	
      	
subtype_declaration:
      	"subtype" type_name "is" type_spec SEMI!
      	;      	
      	
cursor_declaration:
	"cursor" cursor_name
      	(OPEN_PAREN! parameter_spec! (COMMA! parameter_spec!)* CLOSE_PAREN! )?
      	"is"! select_command SEMI! 
      	;

package_obj_body: 
	variable_declaration 
	| subtype_declaration 
	| cursor_declaration 
	| exception_declaration 
	| record_declaration 
	| plsql_table_declaration 
	| procedure_body 
	| function_body 
	;

seq_of_statements: 
	statement SEMI!
	(statement SEMI!)*
	;  
	
statement:
	 assignment_statement
	| exit_statement
	| goto_statement
	| if_statement 
	| loop_statement 
	| null_statement
	| raise_statement
	| return_statement
	| sql_statement
//	| plsql_block
	| begin_block
	| function_call
	;
		
plsql_block:
	( START_LABEL label_name END_LABEL )?
	(("declare")? (declare_spec)+)? 
	("begin")?
     	seq_of_statements
     	("exception" exception_handler (exception_handler)*)? 
     	("end" (label_name)? SEMI!)?
     	;
      	
declare_spec:
	variable_declaration 
	| subtype_declaration 
	| cursor_declaration 
	| exception_declaration 
	| exception_pragma 
	| record_declaration 
	| plsql_table_declaration 
	| procedure_declaration 
	| function_declaration
	;

assignment_statement: 
	(object ASSIGNMENT_EQ function_call) => (object ASSIGNMENT_EQ function_call)
	|(object ASSIGNMENT_EQ plsql_expression)  => (object ASSIGNMENT_EQ plsql_expression)
	|function_call
	;

object: 
	variable_name
	| ( record_name DOT field_name ) 
	| ( plsql_table_name OPEN_PAREN! subscript CLOSE_PAREN! ) 
	| ( COLON host_variable ) 
	;

field_name:
	identifier
	;
	
subscript:
	plsql_expression 
	;
	
host_variable:
	identifier
	;
	
goto_statement:
	"goto" label_name
	;
	
label_name:
	identifier
	;	

exit_statement:
	"exit" (label_name)? ("when" plsql_condition)?
	;
	
datatype:
	"binary_integer" 
      	| "natural" 
      	| "positive" 
      	| ("number"(OPEN_PAREN! NUMBER (COMMA NUMBER)? CLOSE_PAREN! )? ) 
      	| ( "char" (OPEN_PAREN! NUMBER CLOSE_PAREN! )? ) 
      	| ("long" ("raw")?)
      	| "raw"
      	| "boolean"  
      	| "date"
      	| "smallint"
      	| "real"
      	| "numeric"
      	| "int"
      	| "integer"
      	| "double precesion"
      	| "decimal"
      	| "dec"
      	| ( "varchar2" ( OPEN_PAREN! NUMBER CLOSE_PAREN! )? )
      	| ( "varchar" ( OPEN_PAREN! NUMBER CLOSE_PAREN! )? )
      	| ( "character" ( OPEN_PAREN! NUMBER CLOSE_PAREN! )? )
      	| "mlslabel"
      	;      
      	
//Added package_name.variable_name
type_spec 
      	:
      	datatype 
      	| ( variable_name PERCENTAGE "type" ) 
      	| ( table_name DOT column_name PERCENTAGE "type" ) 
//     	| ( package_name DOT variable_name) 
      	| ( table_name PERCENTAGE"rowtype" ) 
      	| type_name
      	;

//Changed the type name to handle variable declaration      	      	
type_name:
	identifier (DOT identifier)*
	;
     	
parameter_spec :
      	parameter_name (type_spec)?
      	;	
      	
parameter_name :
      	identifier
      	;
      	
cursor_spec: 
	"cursor" cursor_name 
	(OPEN_PAREN! parameter_spec (COMMA parameter_spec)* CLOSE_PAREN!)?
	"return" return_type SEMI! 
	;

procedure_spec: 
	"procedure" procedure_name 
	( OPEN_PAREN! argument ( COMMA argument )* CLOSE_PAREN! )? SEMI! 
	;
	
function_spec: 
	"function" function_name 
	OPEN_PAREN! argument ( COMMA argument)* CLOSE_PAREN! 
	"return" return_type SEMI! 
	;
   	   
exception_declaration :
      	exception_name "exception" SEMI!
      	;      	   

exception_name:
	(exception_package_name DOT)? identifier 
	;

exception_package_name:
	identifier
	;

exception_pragma :
	"pragma""exception_init" OPEN_PAREN! exception_name COMMA oracle_err_number CLOSE_PAREN! SEMI!
	;
	
oracle_err_number:
	NUMBER
	;
	
record_declaration :
      	record_type_dec 
      	| record_var_dec
      	;
      	
record_type_dec :
      	"type" type_name "is" "record" 
      	OPEN_PAREN! field_spec ( COMMA field_spec )* CLOSE_PAREN! SEMI!
      	;
      	
record_var_dec :
      	record_name type_name PERCENTAGE "rowtype" SEMI!
      	;	
	
field_spec:
        column_spec
    	;
    	
plsql_table_declaration :
      	table_type_dec | table_var_dec
      	;
      	
table_type_dec :
      	"type" type_name "is" "table" 
      	"of" field_spec 
      	"indexed" "by" "binary_integer" SEMI!
      	;
      	
table_var_dec :
      	plsql_table_name type_name SEMI!
      	;
      	
plsql_table_name :
      	identifier
      	;    	
      	
procedure_declaration :
      	procedure_body
      	;
      	
procedure_body :
      	(proc_fun_start)? "procedure" procedure_name 
      	( OPEN_PAREN! argument ( COMMA argument )* CLOSE_PAREN! )? 
      	( "return" return_type)?
	( "is" | "as" )
      	( ("declare")? ( declare_spec )* )?
      	("begin" )?
      	(seq_of_statements )?
     	( "exception" ( exception_handler )* )?
      	"end" ( procedure_name )? SEMI!
      	;
      	
begin_block:
	"begin"
	(seq_of_statements )?
	( "exception" ( exception_handler )+ )?
      	"end" 
      	;
      	
//Exception handler needs to be defined      	
exception_handler :
	"when" exception_name ("or" exception_name)* "then"
	seq_of_statements
	;       	

proc_fun_start :
	"create" ( "or replace" )?
	;
	
function_body :
      	(proc_fun_start)? "function" function_name 
      	( OPEN_PAREN! argument (COMMA argument)* CLOSE_PAREN!)? 
	"return" return_type ( "is" | "as" )
      	( "declare" ( declare_spec )* )?
       	("begin" )?
      	(seq_of_statements)?
     	( "exception" ( exception_handler )+ )?
      	"end" ( function_name )? SEMI!
	;
	
function_name :
      	( schema_name DOT )? identifier
      	;
     	
procedure_name :
      	( schema_name DOT )? identifier
      	;
      	
argument :
      	argument_name ( "in" | "out" | ( "inout" ) )? (argument_type )?
      	( ASSIGNMENT_EQ "default" value )?
	;
	
argument_name :
      	identifier
      	;
      	
argument_type :
      	type_spec
      	;
      	
value :
      	( ( PLUS | MINUS )? NUMBER ) | quoted_string
      	;
      	
return_type :
      	type_spec
      	;
      	
function_declaration :
      	function_body
      	;

function_call :
	 user_defined_function ( OPEN_PAREN! expression ( COMMA expression )* CLOSE_PAREN! ) 
	;
	
variable_name  : 
	identifier
	;

null_statement:
	"null" 
	;
	
raise_statement :
	"raise" ( exception_name )?
	;
		
return_statement :
	"return" ( plsql_expression )?
	;
	
loop_statement :
	(label_name)?
	(#("while" plsql_condition) |#("for" (cursor_loop_param | numeric_loop_param)))?
	#("loop"
	seq_of_statements
	"end""loop" (label_name)? )
	;
	
plsql_condition :
	boolean_exp
	;

boolean_exp :
	("not")? boolean_term ("or" boolean_term)*
	;
	
boolean_term :
	boolean_factor ("and" boolean_factor)*
	;
		
boolean_factor : 
      boolean_literal 
      | variable_name 
      | ( function (OPEN_PAREN plsql_exp_list CLOSE_PAREN)? ) ( relational_op plsql_expression )?
      | ( OPEN_PAREN boolean_exp CLOSE_PAREN ) 
      | ( plsql_expression 
      ( ( relational_op plsql_expression ) 
      | ( "is" ("not")? "null" ) 
      | ( ("not")? "like" match_string ) 
      | ( ("not")? "between" plsql_expression 
      "and" plsql_expression ) 
      | ( ("not")? "in" OPEN_PAREN plsql_exp_list CLOSE_PAREN ) 
      | ( ( cursor_name | subquery )( PERCENTAGE "notfound" | PERCENTAGE "found" | PERCENTAGE "isopen" ) ) ) )
      | ( cursor_name (PERCENTAGE "notfound" | PERCENTAGE "found" | PERCENTAGE "isopen" ))?
      ;
      
boolean_literal :
	"true" | "false" | "null" 
	;
	
numeric_loop_param :
	index_name "in" ("reverse")? integer_expr DOUBLEDOT integer_expr
	;
index_name :
	identifier
	;

//Added typespec to handle packagename.variablename for loop statement
integer_expr :
	num_expression
	|type_spec
	;

cursor_name :
	identifier
	;
	
cursor_loop_param :
	record_name "in"
	(( cursor_name
	(OPEN_PAREN! plsql_exp_list CLOSE_PAREN!)?)
	|(OPEN_PAREN! select_statement CLOSE_PAREN!))
	;
	
record_name:
	identifier
	;
	
plsql_expression:
	num_expression
	|char_expression
	|date_expression
	|boolean_expression
	;

num_expression:
	(PLUS | MINUS)? num_term ((PLUS|MINUS) num_term)*
	;
	
num_term:
	num_factor ((ASTERISK | DIVIDE) num_factor)*
	;

num_factor:
	(numeric_literal
	|variable_name
	|host_variable
	|(function (OPEN_PAREN plsql_exp_list CLOSE_PAREN)?)
	|(OPEN_PAREN! num_expression CLOSE_PAREN!)
	|"null"
	|((cursor_name | subquery) "%rowcount")
	|(cursor_name "%rowcount")
	) ("**" integer_expr)?
	;
	
numeric_literal:
	NUMBER
	;
	
boolean_expression:
	identifier
	|column_spec
	|boolean_literal
	;
	
plsql_exp_list:
	plsql_expression (COMMA plsql_expression)*
	;
	
char_expression:
	char_term ("||" char_term)*
	;
	
char_term:
	(char_literal
	|variable_name
	|host_variable
	|(function (OPEN_PAREN plsql_exp_list CLOSE_PAREN)?)
	|(OPEN_PAREN! char_expression CLOSE_PAREN!)
	|"null")
	;
	
char_literal:
	QUOTED_STRING
	;
	
date_expression : 
      ( date_literal 
      | variable_name 
      | host_variable 
      | ( function (OPEN_PAREN plsql_exp_list CLOSE_PAREN)? ) 
      | ( OPEN_PAREN! date_expression CLOSE_PAREN! ) 
      | "null" ) 
      ;
      
date_literal:
	QUOTED_STRING
	;
     
commit_statement: 
	"commit"      
	;
      
//Added the greedy funda on 21st of August
if_statement:
	#("if" plsql_condition "then" seq_of_statements
	("elsif" plsql_condition "then" seq_of_statements)*
	("else" seq_of_statements )?
	"end""if" )
	;      
	
//Removed the (SEMI)? after the sql_command as sql_statement already comes under statement
sql_statement: 
	sql_command 
	;
    
sql_command:
	to_modify_data 
	| to_control_data
        ;    
    
to_modify_data:
        select_command 
        | insert_command 
        | update_command
//      | delete_command
        | set_transaction_command
	;    

to_control_data:
	close_statement
	| commit_statement
	| fetch_statement
	| lock_table_statement
	| open_statement
	| rollback_statement
	| savepoint_statement
	;
	
select_command:
        select_statement ( "union" select_statement )*
	;

select_statement:
        ( OPEN_PAREN! select_command CLOSE_PAREN! ) => OPEN_PAREN! select_command CLOSE_PAREN!
        | select_expression 
        ;

select_expression:
	#( "select" ( "all"! | "distinct"! )? select_list
	("into" column_name)?
	//"from" table_reference_list
	table_reference_list_from
	//( "where" where_condition )?
	(where_condition_whole)?
	( connect_clause )?
	( group_clause )?
	( ( set_clause ) => set_clause )?
	( ( order_clause ) => order_clause )?
	( ( update_clause ) => update_clause )? )
	;

select_list:
	( ( displayed_column ) => displayed_column ( COMMA displayed_column )*
        | ASTERISK )  
	;
	
table_reference_list_from:
        "from" selected_table ( COMMA! selected_table )*
    	;

table_reference_list:
        selected_table ( COMMA selected_table )*
    	;
    	
where_condition_whole:
       "where" condition
       ;

where_condition:
        condition
	;

displayed_column :
      ( (schema_name DOT)? (variable)? table_name DOT ASTERISK ) => ( ( schema_name DOT )? table_name DOT ASTERISK )
      | ( exp_simple ( alias )? )
	;

schema_name:
	identifier
	;

table_name: 
	identifier 
	;

exp_simple:
	expression 
	;

expression:
	term ( ( PLUS | MINUS ) term )*
	| boolean_literal
	;

alias:
	( "as" )? identifier
	;

term:
	factor ( ( multiply | DIVIDE ) factor )*
	;

multiply:
        ASTERISK
	;

factor:
	factor2 ( VERTBAR VERTBAR factor2 )*
	;

factor2:
	( sql_literal ) => sql_literal
	| ( ( PLUS | MINUS ) expression ) => ( PLUS | MINUS ) expression
	| ( function ( OPEN_PAREN! expression ( COMMA expression )* CLOSE_PAREN ) ) => function ( OPEN_PAREN expression ( COMMA expression )* CLOSE_PAREN )
	| ( group_function OPEN_PAREN ( ASTERISK | "all" | "distinct" )? (expression)? CLOSE_PAREN ) => group_function OPEN_PAREN ( ASTERISK | "all" | "distinct" )? (expression)? CLOSE_PAREN
	| ( user_defined_function ( OPEN_PAREN expression ( COMMA expression )* CLOSE_PAREN ) ) => user_defined_function ( OPEN_PAREN expression ( COMMA expression )* CLOSE_PAREN )
	| ( OPEN_PAREN! expression CLOSE_PAREN! ) => OPEN_PAREN! expression CLOSE_PAREN!
	| ( variable ) => variable
	| expression_list
	;

expression_list:
	OPEN_PAREN! expression ( COMMA expression )+ CLOSE_PAREN!
	;

sql_literal:
        ( NUMBER | QUOTED_STRING | "null" )
	;

variable:
	( column_spec ( OPEN_PAREN! PLUS CLOSE_PAREN! ) ) => column_spec ( OPEN_PAREN! PLUS CLOSE_PAREN! )
        | column_spec
	;

column_spec:
	( ( schema_name DOT )? table_name DOT )? column_name
	;

user_defined_function:
	( ( schema_name DOT )? package_name DOT )? identifier
	;

column_name: 
	identifier 
	;

function:
	number_function 
	| char_function 
	| group_function 
	| conversion_function 
	| other_function 
	;

number_function:
	"abs" | "ceil" | "floor" | "mod" | "power" | "round" 
	| "sign" | "sqrt" | "trunc" 
	;


char_function:
	"chr" | "initcap" | "lower" | "lpad" | "ltrim" | "replace" 
	| "rpad" | "rtrim" | "soundex" | "substr" | "translate" | "upper" 
	| "ascii" | "instr" | "length" 
	| "concat"
    	;

group_function:
	"avg" | "count" | "max" | "min" | "stddev" | "sum" 
	| "variance" 
	;

conversion_function:
	"chartorowid" | "convert" | "hextoraw" | "rawtohex" | "rowidtochar" 
	| "to_char" | "to_date" | "to_number" 
	;

other_function 
	:
	"decode" | "dump" | "greatest" | "least" | "nvl" 
	| "uid" | "userenv" | "vsize" 
	;

pseudo_column:
	"user" | "sysdate"
	;

selected_table:
	( table_spec | subquery ) ( alias )?
	;

table_spec:
	( schema_name DOT )? table_name ( AT_SIGN link_name )?
	;

table_alias:
	( schema_name DOT )? table_name ( AT_SIGN link_name )? ( alias )?
	;

link_name:
	identifier
	;

condition:
	logical_term ( "or" logical_term )* 
	;

logical_term:
	logical_factor ( "and" logical_factor )*
	;

logical_factor:
	( ( "prior" ) ? exp_simple relational_op ( "prior" )? exp_simple ) => ( ( "prior" ) ? exp_simple relational_op ( "prior" )? exp_simple ) 
	| ( exp_simple ( "not" )? "in" ) => exp_simple ("not")? "in" exp_set
	| ( exp_simple ( "not" )? "like" ) => exp_simple ( "not" )? "like" expression ( "escape" QUOTED_STRING )?
	| ( exp_simple ( "not" )? "between" ) => exp_simple ( "not" )? "between" exp_simple "and" exp_simple
	| ( exp_simple "is" ( "not" )? "null" ) => exp_simple "is" ( "not" )? "null"
	| ( quantified_factor ) => quantified_factor 
	| ( "not" condition ) => "not" condition
	| ( OPEN_PAREN! condition CLOSE_PAREN! ) 
	;


quantified_factor:
	( exp_simple relational_op ( "all" | "any" )? subquery ) => exp_simple relational_op ( "all" | "any" )? subquery
	| ( ( "not" )? "exists" subquery ) => ( "not" )? "exists" subquery
	| subquery
	;

relational_op: 
	EQ | LT | GT | NOT_EQ | LE | GE 
	;


exp_set:
	( exp_simple ) => exp_simple
	| subquery
	;

subquery:
	OPEN_PAREN! select_command CLOSE_PAREN! 
	;

connect_clause:
	( "start" "with" condition )? // the start can be before the connect by
	"connect" "by" 
        ( ( "prior" exp_simple relational_op exp_simple ) 
        | ( exp_simple relational_op exp_simple "prior" ) )
        ( ( ( "prior" )? condition ) => ("prior")? condition
        | exp_simple relational_op ( "prior" )? exp_simple ( "and" condition )?
        )
        condition
	( "start" "with" condition )?
	;

group_clause:
	"group" "by" expression ( COMMA expression )* ( "having" condition )?
	;

set_clause:
	( ( "union" "all" ) | "intersect" | "minus" ) select_command 
	;

order_clause:
	"order" "by" sorted_def ( COMMA sorted_def )*
	;

sorted_def:
	(( expression ) => expression | ( NUMBER ) => NUMBER ) ( "asc" | "desc" )? 
	;

update_clause:
	"for" "update" ( "of" column_name ( COMMA column_name )* )? ( "nowait" )?
	;

insert_command: 
	"insert" "into" table_reference_list 
	( OPEN_PAREN! column_spec CLOSE_PAREN! )?
	( ( "values" OPEN_PAREN! (variable_name) (COMMA variable_name)* CLOSE_PAREN! ) 
	| select_statement ) 
	;

update_command:
	( subquery_update ) => subquery_update 
        | simple_update
	;

simple_update:
	"update" table_alias
	"set" column_spec EQ ( ( expression ) => expression | subquery ) 
	( COMMA column_spec EQ ( ( expression ) => expression | subquery ) )*
	"where" condition 
	;

subquery_update:
	"update" table_alias
	"set" OPEN_PAREN! column_spec ( COMMA column_spec )* CLOSE_PAREN! EQ subquery 
	"where" condition 
	;
   
set_transaction_command: 
	"set" "transaction" "read" "only" 
	;
	      
close_statement : 
      "close" cursor_name 
      ;
      
      
fetch_statement: 
	"fetch" cursor_name "into" 
	( ( variable_name (COMMA variable_name )* ) 
	| record_name ) 
	;
      
lock_table_statement: 
	"lock" "table" table_reference_list 
	"in" lock_mode "mode" ( "nowait" )?
	;
      
lock_mode:
	"row" "share"
	|"row" "exclusive"
	|"share" "update"
	|"share"
	|"share""row""exclusive"
	|"exclusive"
	;

open_statement: 
	"open" cursor_name (OPEN_PAREN! plsql_exp_list! CLOSE_PAREN!)?
	;
      
rollback_statement: 
	"rollback" ( "work" )?
	( "to" ( "savepoint" )? savepoint_name )?
	( "comment" quoted_string )?
	;
      
savepoint_statement: 
	"savepoint" savepoint_name 
	;
      
      
savepoint_name:
	identifier 
	;

identifier:
        ( IDENTIFIER | QUOTED_STRING | keyword )
   	;

quoted_string : QUOTED_STRING ;

match_string : QUOTED_STRING ;

keyword
    :
        "abs"
        | "ascii"
        | "ceil"
        | "chartorowid"
        | "chr"
        | "concat"
        | "convert"
        | "count"
        | "decode"
        | "dump"
        | "floor"
        | "greatest"
        | "hextoraw"
        | "initcap"
        | "instr"
        | "intersect"
        | "least"
        | "length"
        | "lower"
        | "lpad"
        | "ltrim"
     // | "max" // oracle
     // | "min" // oracle
     // | "minus" // oracle
     // | "mod" // oracle
     // | "not" // oracle
     // | "nowait" // oracle
        | "nvl"
        | "power"
     // | "prior" // oracle
        | "rawtohex"
        | "replace"
        | "round"
        | "rowidtochar"
        | "rpad"
        | "rtrim"
        | "sign"
        | "soundex"
        | "sqrt"
     // | "stddev" // oracle
        | "substr"
     // | "sum" // oracle
        | "sysdate"
        | "to_char"
        | "to_date"
        | "to_number"
        | "translate"
        | "trunc"
     // | "uid" // oracle
        | "upper"
        | "user" // ansi
        | "userenv"
     // | "variance" // oracle
        | "vsize"
    ;

//
// Lexer
//

class PLSqlLexer extends Lexer;

options {
    exportVocab = PLSql;
    testLiterals = false;
    k = 2;
    caseSensitive = false;
    
    caseSensitiveLiterals = false;
    charVocabulary = '\3' .. '\177';
}



IDENTIFIER options { testLiterals=true; }
    : 
        'a' .. 'z' ( 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )*
    ;
    
ANY_CHARACTER:
	'a' .. 'z'
	;
    
QUOTED_STRING
      : 
      '\'' ( ~'\'' )* '\'' 
    ;

SEMI : ';'; 
COLON: ':';
DOT : '.' ;
COMMA : ',' ;
ASTERISK : '*' ;
AT_SIGN : '@' ;
OPEN_PAREN : '(' ;
CLOSE_PAREN : ')' ;    
PLUS : '+' ;
MINUS : '-' ;
DIVIDE : '/' ;
EQ : '=' ;
PERCENTAGE : '%' ;
DOUBLEDOT: "..";

START_LABEL : 
	"<<"
	;
	
END_LABEL:
	">>"
	;

ASSIGNMENT_EQ:
	":="
	;

VERTBAR : '|' ;
//LABELNAME
//	:
//	( 'a' .. 'z' | '0' .. '9' ) ( IDENTIFIER | WS | PLUS | MINUS | DIVIDE | VERTBAR | EQ | SEMI | ASTERISK | '<' | '>' | OPEN_PAREN | CLOSE_PAREN | '{' | '}' | '[' | ']' | '?' | '!' | '~' | ':' | AT_SIGN | '\''  | '\"' | '^' | '&' )*
//	;   

// Why did I do this?  Isn't this handle by just increasing the look ahead?
NOT_EQ :
            '<' { _ttype = LT; }
                (       ( '>' { _ttype = NOT_EQ; } )
                    |   ( '=' { _ttype = LE; } ) )?
        | "!=" | "^="
    ;
GT : '>' ( '=' { _ttype = GE; } )? ;






// This is not right.  It will never pickup a leading PLUS, MINUS, or DOT.
// Should look at examples/java/java/java.g and follow that example.  Not
// a priority just yet though.

NUMBER 
    :
        ( PLUS | MINUS )?
        ( ( N DOT N ) => N DOT N | DOT N | N )
        ( "e" ( PLUS | MINUS )? N )?
    ;

protected
N : '0' .. '9' ( '0' .. '9' )* ;


// Not sure exactly what the purpose of a double quote is.  It has cropped up
// around column names and aliases.  Maybe that means you could have
// table names, column names, or even aliases with spaces.  If so, they should
// no longer be skipped and added the rules.
DOUBLE_QUOTE : '"' { $setType(Token.SKIP); } ;


//Added by Qazi to preserve the newlines and white spaces and single line comments

WS	:	(' '
		|	'\t'
		|	('\n'|'\r'('\n')?) {newline();}
		)+
	;
	
// Single-line comments
SL_COMMENT
	:	"--"
		(~('\n'|'\r'))* ('\n'|'\r'('\n')?)
		//{$setType(Token.SKIP); newline();}
		{newline();}
	;

    
// Taken right from antlr-2.7.1/examples/java/java/java.g ...
// multiple-line comments
ML_COMMENT
	:	"/*"
		(	/*	'\r' '\n' can be matched in one alternative or by matching
				'\r' in one iteration and '\n' in another.  I am trying to
				handle any flavor of newline that comes in, but the language
				that allows both "\r\n" and "\r" and "\n" to all be valid
				newline is ambiguous.  Consequently, the resulting grammar
				must be ambiguous.  I'm shutting this warning off.
			 */
			options {
				generateAmbigWarnings=false;
			}
		:
			{ LA(2)!='/' }? '*'
		|	'\r' '\n'		{newline();}
		|	'\r'			{newline();}
		|	'\n'			{newline();}
		|	~('*'|'\n'|'\r')
		)*
		"*/"
		//{$setType(Token.SKIP);}
		{newline();}
	;
