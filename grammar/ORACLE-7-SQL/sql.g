//
// Oracle 7 SQL grammar
//
// The BNF notation found at
// http://cui.unige.ch/db-research/Enseignement/analyseinfo/BNFweb.html
// may prove to be useful as a reference.
//
// Recent updates by bwiese@metasolv.com
//
// ToDo:
//   - Acknowledge all 7 parser ambiguities.
//   - Proper support of floating point numbers in lexer.  A floating point
//     number like '.9' will not be handled correctly.  I believe the way
//     java.g handles this should be more than sufficient, just has not
//     been an issue yet.
//   - Confirm that the lexer rules NOT_EQ and GT work and are even necessary.
//   - Deal with 3 lexer ambiguities, unless they were taken care of when
//     resolving the last to items.
//
// Changes:
//   5/17/2002 - Start version using above mentioned BNF as base
//   5/22/2002 - Changes include (any number is the line from pb.sql):
//      - Allow 'not' after 'or', not just at beginning of select.
//      - (2500) Added concat char_function.
//      - (1796) Moved "user" from other_function to new rule pseudo_column
//               and added pseudo_column to variable.
//      - (2624) Renamed 'constante_nonsigne' to literal, and in this rule
//               changed 'N' to NUMBER, where number was moved to the lexer
//               since 1e9 was being split into a number '1' and a literal
//               'e9', which was no good.  Also changed the "E" in number to
//               lowercase for case insensitivity.  The NUMBER in the lexer
//               needs work, see comment.
//      - (3327) The unary PLUS & MINUS is messed up, why would that be
//               mixed up with the binary addition and subtraction?  The
//               BNF above was helpful for the most part, but definitely
//               leaves a lot to be desired.  It would be nice to send them
//               all the fixes if I could manage it, but with all the changes
//               I am not sure that is pratical.
//      - (3414) Multiple "prior" conditions are allowed in a connect by,
//               so I just moved the optional "prior" qualifier to the
//               first alt of logical_factor.
//      - (3419) Add support for a list as an expression, needed to support
//               list comparisons.
//      - (3864) Add a bunch of keywords to identifiers, since "length" is
//               the name of a column and also a char_function.
//      - (4849) Allow in expression in exp_set, the 'simple_value' is not
//               sufficient.
//      - (5171) Make precedence of logical_not to be just lower then
//               parenthesises.
//      - (5221) Allow for an option "escape" followed by a QUOTED_STRING
//               after a like and match_string.
//      - (5252) Need to allow complex expression for match_string when used
//               with the "like" comparison operator.
//      - (5364) Make columns optional on update_clause.
//      - (2499) Allow for arbitrary parenthesises around select statements
//               by updating the select_statement rule to refer back to the
//               select_command rule, rather than going directly to the
//               select_expression rule.  The way it was only allow for
//               an optional set of parenthesises, not any number.

class SqlParser extends Parser;

options {
    exportVocab = Sql;
    k = 4;
    buildAST = true;
}

tokens {
    SQL_STATEMENT;
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
}

start_rule: (sql_statement)* EOF;

sql_statement: sql_command (SEMI)?
        { #sql_statement = #([SQL_STATEMENT, "sql_statement"], #sql_statement); }
    ;

sql_command: // to_define_data 
//       | to_control_data 
//      | to_modify_data
        to_modify_data
    ;

to_modify_data:
        select_command 
//      | insert_command 
        | update_command 
        | delete_command 
//      | truncate_command 
//      | transaction_command 
//      | set_transaction_command 
//      | lock_command 
    ;

select_command
    :
        select_statement ( "union" select_statement )*
    ;

select_statement
    :
        ( OPEN_PAREN select_command CLOSE_PAREN ) => OPEN_PAREN select_command CLOSE_PAREN
        | select_expression
    ;


select_expression:
      "select" ( "all" | "distinct" )? select_list
      "from" table_reference_list
      ( "where" where_condition )?
      ( connect_clause )?
      ( group_clause )?
      ( ( set_clause ) => set_clause )?
      ( ( order_clause ) => order_clause )?
      ( ( update_clause ) => update_clause )?
    ;

select_list:
      ( ( displayed_column ) => displayed_column ( COMMA displayed_column )*
        | ASTERISK )
        { #select_list = #([SELECT_LIST, "select_list"], #select_list); }
    ;

table_reference_list:
        selected_table ( COMMA selected_table )*
        { #table_reference_list = #([TABLE_REFERENCE_LIST, "table_reference_list"], #table_reference_list); }
    ;

where_condition:
        condition
        { #where_condition = #([WHERE_CONDITION, "where_condition"], #where_condition); }
    ;

displayed_column
      :
      ( (schema_name DOT)? table_name DOT ASTERISK ) => ( ( schema_name DOT )? table_name DOT ASTERISK )
      | ( exp_simple ( alias )? )
    ;

schema_name 
      : identifier
    ;

table_name 
      : identifier 
    ;

exp_simple : expression ;

expression 
      : term ( ( PLUS | MINUS ) term )*
    ;

alias 
      : ( "as" )? identifier
    ;

term 
      : factor ( ( multiply | DIVIDE ) factor )*
    ;

multiply:
        ASTERISK
        { #multiply = #([MULTIPLY, "multiply"], #multiply); }
    ;

factor 
      : factor2 ( VERTBAR VERTBAR factor2 )*
    ;

factor2
      : ( sql_literal ) => sql_literal
      | ( ( PLUS | MINUS ) expression ) => ( PLUS | MINUS ) expression
      | ( function ( OPEN_PAREN expression ( COMMA expression )* CLOSE_PAREN ) ) => function ( OPEN_PAREN expression ( COMMA expression )* CLOSE_PAREN )
        { #factor2 = #([FUNCTION, "function"], #factor2); }
      | ( group_function OPEN_PAREN ( ASTERISK | "all" | "distinct" )? (expression)? CLOSE_PAREN ) => group_function OPEN_PAREN ( ASTERISK | "all" | "distinct" )? (expression)? CLOSE_PAREN
        { #factor2 = #([GROUP_FUNCTION, "group_function"], #factor2); }
      | ( user_defined_function ( OPEN_PAREN expression ( COMMA expression )* CLOSE_PAREN ) ) => user_defined_function ( OPEN_PAREN expression ( COMMA expression )* CLOSE_PAREN )
        { #factor2 = #([USER_FUNCTION, "user_function"], #factor2); }
      | ( OPEN_PAREN expression CLOSE_PAREN ) => OPEN_PAREN expression CLOSE_PAREN
      | ( variable ) => variable
        | expression_list
    ;

expression_list : OPEN_PAREN expression ( COMMA expression )+ CLOSE_PAREN ;

sql_literal:
        ( NUMBER | QUOTED_STRING | "null" )
        { #sql_literal = #([SQL_LITERAL, "sql_literal"], #sql_literal); }
    ;

variable 
    :
        ( column_spec ( OPEN_PAREN PLUS CLOSE_PAREN ) ) => column_spec ( OPEN_PAREN PLUS CLOSE_PAREN )
        | column_spec
    ;

column_spec
    :
        ( ( schema_name DOT )? table_name DOT )? column_name
    ;

user_defined_function
      : ( ( schema_name DOT )? package_name DOT )? identifier
    ;

package_name : identifier ;

column_name : identifier ;

function 
      :
      number_function 
      | char_function 
//      | group_function 
      | conversion_function 
      | other_function 
    ;

number_function 
      :
      "abs" | "ceil" | "floor" | "mod" | "power" | "round" 
      | "sign" | "sqrt" | "trunc" 
    ;


char_function 
      :
      "chr" | "initcap" | "lower" | "lpad" | "ltrim" | "replace" 
      | "rpad" | "rtrim" | "soundex" | "substr" | "translate" | "upper" 
      | "ascii" | "instr" | "length" 
      | "concat"
    ;

group_function 
      :
      "avg" | "count" | "max" | "min" | "stddev" | "sum" 
      | "variance" 
    ;

conversion_function 
      :
      "chartorowid" | "convert" | "hextoraw" | "rawtohex" | "rowidtochar" 
      | "to_char" | "to_date" | "to_number" 
    ;

other_function 
      :
      "decode" | "dump" | "greatest" | "least" | "nvl" 
      | "uid" | "userenv" | "vsize" 
    ;

// This is not being used currently, but might be useful at some point.
pseudo_column
    :
        "user" | "sysdate"
    ;

selected_table 
      :
        ( table_spec | subquery ) ( alias )?
    ;

table_spec
    :
      ( schema_name DOT )? table_name ( AT_SIGN link_name )?
    ;

table_alias
    :
      ( schema_name DOT )? table_name ( AT_SIGN link_name )? ( alias )?
    ;

link_name 
      : identifier
    ;

condition : logical_term ( "or" logical_term )* ;

logical_term 
      : logical_factor ( "and" logical_factor )*
    ;

logical_factor 
      :
      // Added "prior" to a comparison expression to support use of a
      // condition in a connect_clause.
      ( ( "prior" ) ? exp_simple comparison_op ( "prior" )? exp_simple ) => ( ( "prior" ) ? exp_simple comparison_op ( "prior" )? exp_simple ) 
      | ( exp_simple ( "not" )? "in" ) => exp_simple ("not")? "in" exp_set
      | ( exp_simple ( "not" )? "like" ) => exp_simple ( "not" )? "like" expression ( "escape" QUOTED_STRING )?
      | ( exp_simple ( "not" )? "between" ) => exp_simple ( "not" )? "between" exp_simple "and" exp_simple
      | ( exp_simple "is" ( "not" )? "null" ) => exp_simple "is" ( "not" )? "null"
      | ( quantified_factor ) => quantified_factor 
      | ( "not" condition ) => "not" condition
      | ( OPEN_PAREN condition CLOSE_PAREN ) 
    ;


quantified_factor 
      :
      ( exp_simple comparison_op ( "all" | "any" )? subquery ) => exp_simple comparison_op ( "all" | "any" )? subquery
      | ( ( "not" )? "exists" subquery ) => ( "not" )? "exists" subquery
      | subquery
    ;

comparison_op 
      : 
      EQ | LT | GT | NOT_EQ | LE | GE 
    ;


exp_set 
      : ( exp_simple ) => exp_simple
      | subquery
    ;

subquery 
    :
        OPEN_PAREN select_command CLOSE_PAREN 
        { #subquery = #([SUBQUERY, "subquery"], #subquery); }
    ;

connect_clause 
      :
      ( "start" "with" condition )? // the start can be before the connect by
      "connect" "by" 
// This appears to allow multiple comparisons, so just use the updated
// condition rule.
//      ( ( "prior" exp_simple comparison_op exp_simple ) 
//      | ( exp_simple comparison_op exp_simple "prior" ) )
//      ( ( ( "prior" )? condition ) => ("prior")? condition
//        | exp_simple comparison_op ( "prior" )? exp_simple ( "and" condition )?
//      )
        condition
      ( "start" "with" condition )?
    ;

group_clause 
      :
      "group" "by" expression ( COMMA expression )* ( "having" condition )?
    ;

// Would this really do what is necessary?  The following does not look
// right, but not that familiar with what is being refered to here.
set_clause 
      :
      ( ( "union" "all" ) | "intersect" | "minus" ) select_command 
    ;

order_clause
      :
      "order" "by" sorted_def ( COMMA sorted_def )*
    ;

sorted_def 
      :
      (( expression ) => expression | ( NUMBER ) => NUMBER ) ( "asc" | "desc" )? 
    ;

update_clause 
      :
      "for" "update" ( "of" column_name ( COMMA column_name )* )? ( "nowait" )?
    ;


delete_command 
      :
      "delete" ( "from" )? table_alias ( "where" condition )?
    ;

update_command 
    :
        ( subquery_update ) => subquery_update 
        | simple_update
    ;

simple_update 
      :
      "update" table_alias
      "set" column_spec EQ ( ( expression ) => expression | subquery ) 
      ( COMMA column_spec EQ ( ( expression ) => expression | subquery ) )*
      "where" condition 
    ;

subquery_update 
      :
      "update" table_alias
      "set" OPEN_PAREN column_spec ( COMMA column_spec )* CLOSE_PAREN EQ subquery 
      "where" condition 
    ;


//
// Direct mappings to lexer.
//

identifier:
        ( IDENTIFIER | QUOTED_STRING | keyword )
        { #identifier = #([SQL_IDENTIFIER, "sql_identifier"], #identifier); }
        
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

//
// Lexer
//

class SqlLexer extends Lexer;

options {
    exportVocab = Sql;
    testLiterals = false;
    k = 2;
    caseSensitive = false;
    caseSensitiveLiterals = false;
    charVocabulary = '\3' .. '\177';
}

//
// Literals were put here in the lexer to get them to be case insensitive.
//

// identifier 
//     ::= 
//     ( "letter" { "letter" | "digit" | "underline" | "dollar" | "sharp" } ) 
//     | "quote" { "any character" } "quote" 

IDENTIFIER options { testLiterals=true; }
    : 
        'a' .. 'z' ( 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )*
    ;


// quoted_string 
//    ::= "'" { "any_character" } "'" 

QUOTED_STRING
      : '\'' ( ~'\'' )* '\'' 
    ;


SEMI : ';';

DOT : '.' ;
COMMA : ',' ;
ASTERISK : '*' ;
AT_SIGN : '@' ;

OPEN_PAREN : '(' ;
CLOSE_PAREN : ')' ;

PLUS : '+' ;
MINUS : '-' ;
DIVIDE : '/' ;

VERTBAR : '|' ;

EQ : '=' ;

// Why did I do this?  Isn't this handle by just increasing the look ahead?
NOT_EQ :
            '<' { _ttype = LT; }
                (       ( '>' { _ttype = NOT_EQ; } )
                    |   ( '=' { _ttype = LE; } ) )?
        | "!=" | "^="
    ;
GT : '>' ( '=' { _ttype = GE; } )? ;

// match_string 
//    ::= "'" { "any_character" | "_" | "%" } "'" 

//
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

WS  :   (   ' '
        |   '\t'
        |   '\r' '\n' { newline(); }
        |   '\n'      { newline(); }
        |   '\r'      { newline(); }
        )
        {$setType(Token.SKIP);} //ignore this token
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
		{$setType(Token.SKIP);}
	;

