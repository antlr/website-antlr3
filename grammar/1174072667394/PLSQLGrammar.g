/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

PROJECT:        PL/SQL Grammar
FILE:           PLSQLGrammar.g


AUTHOR: David Edwards (dme@e2systems.co.uk) 4th February 2007

Building upon work by:
                Qazi Firdous Ahmed (qazif_ahmed@infosys.com)
                Krupa Benhur (krupa_bg@infosys.com)
                Manojaba Banerjee (manojaba_banerjee@infosys.com)
                Infosys Technologies Ltd., Bangalore, India

DATED:                Sept 18, 2002


DESCRIPTION:    This grammar is for ORACLE PL/SQL.

                It far from being complete, nor has it been developed
                systematically. I started with the Qazi Firdous Ahmed file,
                and adapted it until that it more or less worked on my
                collection of PL/SQL source files, which were mostly developed
                with TOAD for ORACLE 9.2

                Obvious deficiencies are:
                -   k == 4 so the ambiguities are legion, to the extent that
                    I haven't even looked at them
                -   It sometimes messes up with chains of expressions
                -   There is no coverage of ORACLE Analytics
                -   There is little Object/Relational stuff
                -   DDL isn't handled at all
                -   It will choke if there are SQL*Plus commands interspersed
                    through the source files that aren't terminated with ;
                    or which are anything other than SET or SHOW
                -   Likewise DDL, or plain SQL statements that aren't present
                    in a PL/SQL block.
                -   It has been tweaked to allow some eccentric input that
                    ORACLE considers to be valid. Did you realise that the
                    INSERT INTO table can have an alias? Or that GROUP and
                    HAVING can go 'the wrong way round'?. I didn't, TOAD did,
                    and they can.
                -   On the other hand, plenty of obviously invalid stuff will
                    be acceptable.

                My objective was to get it into a state where it could support
                some simple-minded software metrics, and this it does.

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

header {
import antlr.CommonToken;
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
    PACKAGE_OBJ_BODY;
    SELECT_EXPRESSION;
    PLSQL_BLOCK;
    CURSOR_DECLARATION;
    PROCEDURE_BODY;
    FUNCTION_BODY;
    PARAMETER_SPEC;
    SQL_STATEMENT;
    IF_STATEMENT;
    LOOP_STATEMENT;
    STATEMENT;
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

start_rule: (create_package | sqlplus_command | begin_block | DIVIDE )* EOF
{
    #start_rule = #([START_RULE, "start_rule" ], #start_rule);
}
          ;

sqlplus_command:
    ("set" | "show" ) identifier ( base_expression ) *  ( SEMI ) *;

create_package:
        cr:"create" ( or:"or" "replace" )?
        (package_spec | package_body | procedure_body | function_body)
{
    #create_package = #([CREATE_PACKAGE, "create_package" ], #create_package);
}
        ;

package_spec returns [CommonToken pn= null ]
{
CommonToken id=null;
}                              :
        pk:"package" pn=package_name (au:"authid" id=identifier)?
{
    SoftwareMetrics.start(pn.getText(),"Package",pk.getLine());
}
          (i:"is" | a:"as")
        package_obj_spec ( package_obj_spec )*
        en:"end" (package_name)? SEMI!
{
    SoftwareMetrics.finish();
    #package_spec = #([PACKAGE_SPEC, "package_spec" ], #package_spec);
}
        ;

package_body returns [CommonToken pn= null ]:
        pk:"package" (bo:"body")? pn=package_name (i:"is" | a:"as")
{
    SoftwareMetrics.start(pn.getText(),"Package Body",pn.getLine());
}
        package_obj_body ( package_obj_body )*
        e:"end" (pn=package_name )? SEMI!
{
    SoftwareMetrics.finish();
    #package_body = #([PACKAGE_BODY, "package_body" ], #package_body);
}
        ;

package_name  returns [CommonToken id= null ]
{
CommonToken s = null;
}                           :
        id=schema_name (d:DOT s=identifier)?
{
    if (s != null)
        id.setText(id.getText() + '.' +s.getText());
}
        ;


package_obj_spec:
        (
        variable_declaration
        | subtype_declaration
        | cursor_declaration
        | cursor_spec
        | record_declaration
        | plsql_table_declaration
        | procedure_spec
        | function_spec
        | exception_declaration
        )
        ;

foreign_lang_spec :
       l:"language" j:"java" n:"name" char_literal SEMI!
;
variable_declaration returns [CommonToken v= null ]:
        v=variable_name (c:"constant")?
        type_spec (n:"not" "null")?
                ((a:ASSIGNMENT_EQ|d:"default") plsql_expression)? SEMI!
        ;

subtype_declaration returns [CommonToken t= null ]:
        s:"subtype" t=type_name i:"is" type_spec SEMI!
        ;

cursor_declaration returns [CommonToken cn= null ]:
        c:"cursor" cn=cursor_name
        (o:OPEN_PAREN! parameter_spec
        (co:COMMA! parameter_spec
        )* cp:CLOSE_PAREN!
        )?
        "is"! select_command SEMI!
{
     #cursor_declaration = #([CURSOR_DECLARATION, "cursor_declaration" ], #cursor_declaration);
}
        ;

package_obj_body:
                (
                ( (function_declaration) => function_body
                | function_spec )
                | ( (procedure_declaration) => procedure_body
                | procedure_spec
                )
                | begin_block SEMI!
                | package_obj_spec
                )
{
    #package_obj_body = #([PACKAGE_OBJ_BODY, "package_obj_body" ], #package_obj_body);
}
                ;

seq_of_statements:
        statement SEMI! ( statement SEMI! )*
        ;

statement returns [ CommonToken l = null ]:
        ( START_LABEL l=label_name END_LABEL )? (
          ("begin" | "declare ") => begin_block
        | ( "loop" | "for" | "while" ) => loop_statement
        | ( "forall" ) => forall_statement
        | ("if" ) => if_statement
        | ( "goto" ) => goto_statement
        | ( "raise" )=> raise_statement
        | ( "exit" ) => exit_statement
        | null_statement
        | ( "return" ) => return_statement
        | ( "with" | "select" | "update" | "insert" | "delete" | "alter" |
               "set" | "lock" | "grant" | "execute" | "commit"
           | "rollback" | "open" | "fetch" | "close" ) => sql_statement
        | ( lvalue ASSIGNMENT_EQ) => assignment_statement
        | ( lvalue lvalue ) => procedure_call
        | lvalue
        )
{
    #statement = #([STATEMENT, "statement" ], #statement);
}
        ;

declare_spec:
        variable_declaration
        | subtype_declaration
        | cursor_declaration
        | exception_declaration
        | exception_pragma
        | record_declaration
        | plsql_table_declaration
        |( (function_declaration) => function_body
        | function_spec )
        | ( (procedure_declaration) => procedure_body
        | procedure_spec)
        ;

assignment_statement returns [CommonToken l= null ]:
        l=lvalue ASSIGNMENT_EQ plsql_expression
        ;

lvalue  returns [CommonToken lv= null ]
{
CommonToken fn = null;
}                      :
        lv=function_call ( ( DOT "delete" ) => d:DOT de:"delete"
                 | ( DOT "first" ) => d1:DOT fi:"first"
                 | ( DOT "last" ) => d2:DOT la:"last"
                 |
(options {
      greedy = true;
} :
                  (d3:DOT fn=function_call
                   )*
)
                  ) ?
        ;

field_name  returns [CommonToken id= null ]:
        id=identifier
        ;

host_variable  returns [CommonToken hv= null ]:
        COLON hv=identifier
{
    hv.setText(':' + hv.getText());
}
        ;

goto_statement   returns [ CommonToken gs = null ]:
        g:"goto" gs=label_name
        ;

label_name   returns [ CommonToken l = null ]:
        l=identifier
        ;

exit_statement   returns [ CommonToken l = null ]:
        e:"exit" (l=label_name)? (w:"when" plsql_condition)?
{
    l = (CommonToken) e;
}
        ;

datatype   returns [ CommonToken dt = null ]:
        (
        bi:"binary_integer"
{
    dt = (CommonToken) bi;
}
              | n:"natural"
{
    dt = (CommonToken) n;
}
              | p:"positive"
{
    dt = (CommonToken) p;
}
              | (nu:"number"(OPEN_PAREN! NUMBER (COMMA NUMBER)? CLOSE_PAREN! )? )
{
    dt = (CommonToken) nu;
}
              | (c:"char" (OPEN_PAREN! NUMBER CLOSE_PAREN! )? )
{
    dt = (CommonToken) c;
}
              | (l:"long" (rw:"raw")?)
{
    dt = (CommonToken) l;
    if (rw != null)
        dt.setText("long raw");
}
              | r2:"raw"
{
    dt = (CommonToken) r2;
}
              | bo:"boolean"
{
    dt = (CommonToken) bo;
}
              | da:"date"
{
    dt = (CommonToken) da;
}
              | sm:"smallint"
{
    dt = (CommonToken) sm;
}
              | r3:"real"
{
    dt = (CommonToken) r3;
}
              | nc:"numeric"
{
    dt = (CommonToken) nc;
}
              | i:"int"
{
    dt = (CommonToken) i;
}
              | i2:"integer"
{
    dt = (CommonToken) i2;
}
              | db:"double precision"
{
    dt = (CommonToken) db;
}
              | dl:"decimal"
{
    dt = (CommonToken) dl;
}
              | ( v2:"varchar2" ( OPEN_PAREN! NUMBER CLOSE_PAREN! )? )
{
    dt = (CommonToken) v2;
}
              | ( v:"varchar" ( OPEN_PAREN! NUMBER CLOSE_PAREN! )? )
{
    dt = (CommonToken) v;
}
              | ( ch:"character" ( OPEN_PAREN! NUMBER CLOSE_PAREN! )? )
{
    dt = (CommonToken) ch;
}
              | ml:"mlslabel"
{
    dt = (CommonToken) ml;
}
)
              ;

type_spec    returns [ CommonToken ts = null ] 
{
CommonToken c;
}
              :
(              ts=datatype
              | ( ts=variable_name PERCENTAGE "type" )
              | ( ts=table_name DOT c=column_name PERCENTAGE "type" )
              | ( ts=table_name PERCENTAGE"rowtype"
)
              | ts=type_name
)
              ;

type_name   returns [ CommonToken tn = null ]
{
CommonToken lv;
}
                               :
 ( options { greedy = true; }  :
        ( identifier DOT ) => tn=identifier
        (d:DOT lv=identifier
{
    tn.setText(tn.getText() + '.' + lv.getText());
}
        )*
         | tn=identifier
         | tn=datatype
 )
        ;

parameter_spec    returns [ CommonToken pn = null ] :
 
              pn=parameter_name (i:"in"! ) ? (o:"out"!) ?
        (type_spec)? ( d:"default" plsql_expression )?
{
    #parameter_spec = #([PARAMETER_SPEC, "parameter_spec" ], #parameter_spec);
}
              ;

parameter_name    returns [ CommonToken pn = null ] :
              pn=identifier
              ;

cursor_spec    returns [ CommonToken cs = null ] 
{
CommonToken rt;
}                  :
        c:"cursor" cursor_name
{
    cs = (CommonToken) c;
}
        (o:OPEN_PAREN!
(options {
    greedy = true;
} :
      parameter_spec
        (co:COMMA parameter_spec
        )* ) cp:CLOSE_PAREN!
        )?
        r:"return" rt=return_type SEMI!
        ;

procedure_spec    returns [ CommonToken ps = null ] :
        ps=procedure_declaration
        SEMI!
{
    SoftwareMetrics.finish();
}
        ;

function_spec    returns [ CommonToken fs = null ] :
        fs=function_declaration SEMI!
{
    SoftwareMetrics.finish();
}
        ;

exception_declaration    returns [ CommonToken ed = null ] :
              ed=exception_name ep:"exception" SEMI!
              ;

exception_name returns [ CommonToken en = null ] 
{
CommonToken ep = null;
}                          :
        en=exception_package_name (d:DOT ep=identifier)?
        ;

exception_package_name    returns [ CommonToken ep = null ] :
        ep=identifier
        ;

exception_pragma    returns [ CommonToken ep = null ] 
{
CommonToken or;
}                             :
        p:"pragma" e:"exception_init" o:OPEN_PAREN! ep=exception_name c:COMMA or=oracle_err_number cp:CLOSE_PAREN! SEMI!
        ;

numeric_literal    returns [ CommonToken nl = null ] :
        n:NUMBER
{
    nl = (CommonToken) n;
}
        ;

oracle_err_number    returns [ CommonToken oen = null ] :
        (p:PLUS | m:MINUS) ? n:NUMBER
{
    oen = (CommonToken) n;
}
        ;

record_declaration    returns [ CommonToken rd = null ]  :
              rd=record_type_dec
            | rd=record_var_dec
              ;

record_type_dec    returns [ CommonToken rt = null ] :

   rt=record_table_preamble (
        ( r:"record"
(options { greedy = true; } :
              o:OPEN_PAREN field_spec type_spec
        ( co:COMMA field_spec type_spec
             )* cp:CLOSE_PAREN!
)       )
              | ( rf:"ref" cu:"cursor" ( rg:"return" record_name) ? )
        | ( v:"varray" OPEN_PAREN! plsql_expression c2:CLOSE_PAREN! o1:"of" rt=type_name
        ) ) SEMI!
              ;

record_var_dec    returns [ CommonToken rv = null ] :
              record_name rv=type_name PERCENTAGE "rowtype" SEMI!
              ;

field_spec    returns [ CommonToken fs = null ] :
        fs=column_spec
            ;

plsql_table_declaration   returns [ CommonToken pt = null ] :
              pt=table_type_dec | pt=table_var_dec
              ;

table_type_dec    returns [ CommonToken tt = null ] :
              record_table_preamble t:"table"
              o:"of" ( type_spec | type_name )
              i:"index" b:"by" bi:"binary_integer" SEMI!
{
    tt = (CommonToken) bi;
}
              ;

record_table_preamble   returns [ CommonToken rt = null ] :
       t:"type" rt=type_name i:"is"
        ;
table_var_dec    returns [ CommonToken tv = null ]  :
              plsql_table_name tv=type_name SEMI!
              ;

plsql_table_name   returns [ CommonToken pt = null ] :
              pt=identifier
              ;

procedure_declaration    returns [ CommonToken pr = null ] :
              p:"procedure" pr=procedure_name
{
    SoftwareMetrics.start(pr.getText(),"Procedure",pr.getLine());
}
(options { greedy = true; } :
              ( o:OPEN_PAREN! argument
( co:COMMA argument
             )* cp:CLOSE_PAREN!
)?
)
              ;

procedure_body    returns [ CommonToken pb = null ] :
              pb=procedure_declaration
         ( i:"is" | a:"as" )
         (
            foreign_lang_spec
          | func_proc_statements
         )
{
    SoftwareMetrics.finish();
    #procedure_body = #([PROCEDURE_BODY, "procedure_body" ], #procedure_body);
}
              ;

func_proc_statements returns [CommonToken e= null ]
{
CommonToken pn = null;
}
        : (declare_spec)*
        b:"begin"
        (seq_of_statements )?
        ( "exception" ( e=exception_handler
                       )+ )?
              en:"end" ( pn=identifier ) ? SEMI!
{
    #func_proc_statements = #([PLSQL_BLOCK, "func_proc_statements" ],
           #func_proc_statements);
}
              ;

begin_block returns [CommonToken e= null ]
{
CommonToken pn = null;
}
          :
        ((d:"declare"
        ) (declare_spec)+)?
        b:"begin"
        (seq_of_statements )?
        ( "exception" ( e=exception_handler
                      )+ )?
              en:"end" ( pn=identifier ) ?
{
    #begin_block = #([PLSQL_BLOCK, "begin_block" ], #begin_block);
}
//        { System.out.println("Parser:Recognised begin_block"); }
              ;

exception_handler returns [ CommonToken eh = null ]
{
CommonToken e;
}                          :
        w:"when" eh=exception_name
        (o:"or" e=exception_name
{
    eh.setText(eh.getText() + '+' + e.getText());
}
        )* t:"then"
        seq_of_statements
//        { System.out.println("Parser:Recognised exception_handler"); }
        ;

function_declaration    returns [ CommonToken fn = null ]
{
CommonToken rt;
}                            :
              f:"function" fn=function_name
{
    SoftwareMetrics.start(fn.getText(),"Function",f.getLine());
}
(options { greedy = true; } :
              ( o:OPEN_PAREN! argument
( co:COMMA argument
             )* cp:CLOSE_PAREN!
             )?
)
        r:"return" rt=return_type
//        { System.out.println("Parser:Recognised function_declaration"); }
        ;
function_body    returns [ CommonToken fb = null ]  :
        fb=function_declaration
         ( i:"is" | a:"as" )
         (
           foreign_lang_spec
         | func_proc_statements
         )
{
    SoftwareMetrics.finish();
}
//        { System.out.println("Parser:Recognised function_body"); }
        { #function_body = #([FUNCTION_BODY, "function_body" ], #function_body); }
        ;

function_name    returns [ CommonToken fn = null ] 
{
CommonToken lv;
}
                  :
(options {
    greedy = true;
} :

        fn=identifier
        (d:DOT lv=identifier
{
    fn.setText(fn.getText() + '.' + lv.getText());
}
        )?
  )
              ;

procedure_name    returns [ CommonToken pn = null ] 
{
CommonToken lv;
}                         :
(options {
    greedy = true;
} :

        pn=identifier
        (d:DOT lv=identifier
{
    pn.setText(pn.getText() + '.' + lv.getText());
}
        )*
  )
              ;

argument    returns [ CommonToken v = null ] :
              parameter_spec (( a:ASSIGNMENT_EQ|d:"default")
                      plsql_expression ) ?
        ;

return_type    returns [ CommonToken t = null ] :
              t=type_spec
              ;

function_call    returns [ CommonToken f = null ] 
                         :
       (function OUTER_JOIN ) => f=function ou:OUTER_JOIN
      | ( function ~OPEN_PAREN )  =>    f=function
      |  ( op:"open" | f=function ) o:OPEN_PAREN!
         (call_argument_list )?  cp:CLOSE_PAREN!
        ;
procedure_call    returns [ CommonToken f = null ] :
         f=function (call_argument_list )?
        ;

variable_name    returns [ CommonToken id = null ]  :
        id=identifier
        ;

null_statement:
        n:"null"
        ;

raise_statement returns [ CommonToken en= null ]:
        r:"raise"
       ( en=exception_name
       )?
        ;

return_statement :
        r:"return"
        ( plsql_expression
        )?
        ;

forall_statement:
	  "forall" lvalue "in"  lvalue DOUBLEDOT lvalue statement
    ;
loop_statement    returns [ CommonToken l = null ]
{
CommonToken la = null;
}             :
        (l=label_name
        )?
        ((w:"while"^
           plsql_condition)
       |(f:"for"^
         (cursor_loop_param | numeric_loop_param)
         ))?
        lo:"loop"^
        seq_of_statements
        e:"end" "loop" (la=label_name)?
{
    #loop_statement = #([LOOP_STATEMENT, "loop_statement" ], #loop_statement);
}
//        { System.out.println("Parser:Recognised loop_statement"); }
        ;

plsql_condition :
         boolean_exp
        ;

boolean_exp :
(options {
      greedy = true;
} :
        boolean_term (o:"or"
        boolean_term)*
)
        ;

boolean_term :
(options {
      greedy = true;
} :
        maybe_negated_factor (a:"and"
         maybe_negated_factor)*
)
        ;
maybe_negated_factor:
        (n0:"not"
        )? boolean_factor
        ;

boolean_factor    returns [ CommonToken r = null ] :
          ( OPEN_PAREN boolean_exp CLOSE_PAREN ) =>
        o:OPEN_PAREN boolean_exp cp:CLOSE_PAREN
      | ( plsql_expression
      ( (relational_op plsql_expression) =>( r=relational_op
          plsql_expression )
      | ( "is" ) => ( i:"is" (no:"not")? n:"null" )
      | ( ( "not" ) ? "like") =>( (n1:"not")? l:"like" match_string )
      | ( ( "not" ) ? "between") => (n2:"not")? b:"between" plsql_expression
                                a:"and" plsql_expression 
      | ( (n3:"not")? in:"in" op:OPEN_PAREN plsql_exp_list c2:CLOSE_PAREN )
      | ( ( cursor_name | subquery )
           pc:PERCENTAGE
           (nf:"notfound"
            | fo:"found"
            | io:"isopen"
        ) ) ) )
      | ( cursor_name (p3:PERCENTAGE
          (n4:"notfound"
         |  f2:"found"
         | i2:"isopen"
      )))?
      | boolean_literal
      ;

boolean_literal  returns [ CommonToken bl = null ] :
        t:"true"
{
    bl = (CommonToken) t;
}
      | f:"false"
{
    bl = (CommonToken) f;
}
      | n:"null"
{
    bl = (CommonToken) n;
}
        ;

numeric_loop_param :
        index_name in:"in" (r:"reverse")? integer_expr d:DOUBLEDOT integer_expr
        ;
index_name    returns [ CommonToken id = null ] :
        id=identifier
        ;

integer_expr :
        plsql_expression
        |type_spec
        ;

cursor_name    returns [ CommonToken cn = null ] :
        cn=identifier
        ;

cursor_loop_param :
        record_name i:"in"
        (( cursor_name
        (o1:OPEN_PAREN! plsql_exp_list c1:CLOSE_PAREN!
        )?)
        |(o2:OPEN_PAREN! select_expression c2:CLOSE_PAREN!)
        )
        ;

record_name   returns [ CommonToken id = null ] :
        id=identifier
        ;

num_expression:
 ( options { greedy = true; }  :
         num_term
        ((p:PLUS|m:MINUS) num_term
        )*
)
        ;

num_term:
 ( options { greedy = true; }  :
        num_factor ((a:ASTERISK | d:DIVIDE) num_factor
        )*
)
        ;

num_factor:
        (PLUS | MINUS)?
          base_expression
          (p:"**" integer_expr
          )?
        ;


plsql_exp_list:
    (options {
         greedy = true;
    }
    :
        ( plsql_expression COMMA ) => plsql_expression (c:COMMA plsql_expression
        )*
        |plsql_expression )
        ;

plsql_expression:
(options {
      greedy = true;
} :
        num_expression (c:CONCAT num_expression
        )*
)
//        { System.out.println("Parser:Recognised plsql_expression"); }
        ;

base_expression: 
        ( "cast" ) => ( cast_proc )
      | ( "trim" ) => ( trim_function )
      | ( "count" ) => ( count_function )
      | ( "case" ) => ( case_expression )
      | (( "all" | "any" )) => ( a1:"all" | a2:"any" ) subquery
      | ((cursor_name | subquery) "%rowcount") => ((cursor_name | subquery) r:"%rowcount"
          )
      | ( OPEN_PAREN "select") => subquery
      | o:OPEN_PAREN
                   plsql_expression cp:CLOSE_PAREN!
      | char_literal
      | date_literal
      | numeric_literal
      | boolean_literal
      | pseudo_column
      | lvalue
      ;

count_function: c:"count" op:OPEN_PAREN!
                ( a:ASTERISK | ( (d:"distinct")? plsql_expression ))
               cp:CLOSE_PAREN!
       ;

char_literal    returns [ CommonToken cl = null ] :
        q:QUOTED_STRING
{
    cl = (CommonToken) q;
}
        ;
date_literal   returns [ CommonToken dl = null ] :
        q:QUOTED_STRING
{
    dl = (CommonToken) q;
}
        ;

commit_statement:
        c:"commit" ( "work" )?
        ;

case_expression:
        c:"case"
        ( w:"when"
          condition t:"then"
         plsql_expression )+
        ( e:"else"
         plsql_expression ) ?
       en:"end"
      ;
if_statement:
        i:"if"^ plsql_condition t:"then" seq_of_statements
        (ei:"elsif" plsql_condition t1:"then" seq_of_statements
        )*
        (el:"else" seq_of_statements
        )?
        ef:"end" "if"
{
    #if_statement = #([IF_STATEMENT, "if_statement" ], #if_statement);
}
        ;

sql_statement:
        sql_command
{
    #sql_statement = #([SQL_STATEMENT, "sql_statement" ], #sql_statement);
}
        ;

sql_command:
        to_modify_data
        | to_control_data
        ;

to_modify_data:
        select_command
        | insert_command
        | update_command
        | delete_command
        | immediate_command
        | set_transaction_command
        | alter_command
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
        select_expression
{
    #select_command = #([SELECT_COMMAND, "select_command" ], #select_command);
}
        | subquery
        ;
immediate_command:
      e:"execute" i1:"immediate" plsql_expression
         ( ("bulk" "collect")? i2:"into" plsql_exp_list ) ?
         ( "using" plsql_exp_list ) ?
      ; 
/*
 * There is so much more of this ...
 *
 * The 'scope' is commented out because its use as an alias confuses the parser.
 */
alter_command:
    "alter" ( "system" | "session" )(
            ( "flush" "shared_pool" )
           |  (
                ( "set"  identifier EQ
                    ( char_literal | numeric_literal | identifier ) 
                )
              | ( "reset" identifier )
              )
//              ("scope" EQ ( "both" | "spfile" | "memory" )) ?
              ( "sid" EQ ( char_literal | ASTERISK ) ) ?
            )
    ;

select_expression :
(options { greedy = true; } :
    select_first
        (( ( u:"union" ( a:"all" )? ) | i:"intersect" | m:"minus" )
     select_subsequent ) *
)
    ( order_clause )?
    ( update_clause )?
{
    #select_expression = #([SELECT_EXPRESSION,"select_expression" ],
                            #select_expression);
}
     ;

select_up_to_list:
(options { greedy = true; } :
        (w:"with" alias  a1:"as" subquery
         (c:COMMA alias a2:"as" subquery
         )*
         )?
         s:"select"^
         ( a3:"all"! | d:"distinct"!
         )?
         select_list
)
      ;
/*
 * There are ambiguity issues here; it seems to be legal to put any number
 * of brackets round a select statement, but then the thing reports an
 * unexpected token when the MINUS turns up.
 */

select_first:
        select_up_to_list
        ( ("bulk" "collect")? i:"into"
         plsql_exp_list
         ) ?
        table_reference_list_from
        ( where_condition_whole )?
        ( connect_clause )?
        ( group_clause )?
    | o:OPEN_PAREN select_first c:CLOSE_PAREN
    ;
select_subsequent:
    select_up_to_list
        table_reference_list_from
        ( where_condition_whole )?
        ( connect_clause )?
        ( group_clause )?
    | o:OPEN_PAREN select_subsequent c:CLOSE_PAREN
    ;


select_list:
(options {
      greedy = true;
} :
        displayed_column ( c:COMMA
         displayed_column )*
)
{
    #select_list = #([SELECT_LIST, "select_list" ], #select_list);
}
        ;

table_reference_list_from:
        f:"from" selected_table
        (
         ( "left" | "right" | "inner") => ansi_spec
         | c:COMMA! selected_table
         
        )*
{
    #table_reference_list_from = #([TABLE_REFERENCE_LIST,
              "table_reference_list_from" ], #table_reference_list_from);
}
            ;

table_reference_list:
(options {
      greedy = true;
} :
        selected_table ( c:COMMA! selected_table
        )*
)
{
    #table_reference_list = #([TABLE_REFERENCE_LIST, "table_reference_list" ],
                                 #table_reference_list);
}
            ;

where_condition_whole:
       w:"where" condition
{
    #where_condition_whole = #([WHERE_CONDITION, "where_condition_whole" ],
                       #where_condition_whole);
}
       ;

displayed_column    returns [ CommonToken id = null ] :
        (ASTERISK) =>  a0:ASTERISK
        | (identifier DOT ASTERISK) =>  id=identifier d:DOT a:ASTERISK
        | plsql_expression ( ("as") =>  alias
        |  id=identifier
                               )?
        ;
call_argument_list:
        (call_argument COMMA) =>
(options {
      greedy = true;
} :
          call_argument ( c:COMMA call_argument
          )*)
        | call_argument
       ;

call_argument :
        (variable_name p:PASS_BY_NAME
        )? plsql_expression
        ;

schema_name    returns [ CommonToken id = null ] :
        id=identifier
        ;

table_name    returns [ CommonToken id = null ] :
        id=identifier
        ;


alias    returns [ CommonToken id = null ] :
        ( a:"as" )?  id=identifier
        ;

column_spec returns [ CommonToken cs = null ]:
        ( ( schema_name d1:DOT )? table_name d2:DOT )? cs=column_name
        ;

user_defined_function    returns [ CommonToken i1 = null ] 
{
CommonToken i2 = null;
CommonToken i3 = null;
}:
        i1=identifier
        ;

column_name    returns [ CommonToken id = null ] 
{
CommonToken o = null;
CommonToken i1 = null;
}                       :
                id=identifier (d:DOT i1=identifier )?
{
    if (d != null)
        id.setText(i1.getText() + '.' + i1.getText());
}
        ;

function    returns [ CommonToken f = null ] :
         f=built_in_function
        | f=user_defined_function
        ;

built_in_function    returns [ CommonToken f = null ] :
          f=number_function
        | f=char_function
        | f=group_function
        | f=conversion_function
        | f=other_function
        ;

number_function    returns [ CommonToken nf = null ] :
        a1:"abs"
{
    nf = (CommonToken) a1;
}
        | a2:"ascii"
{
    nf = (CommonToken) a2;
}
        | c:"ceil"
{
    nf = (CommonToken) c;
}
        | f:"floor"
{
    nf = (CommonToken) f;
}
        | i:"instr"
{
    nf = (CommonToken) i;
}
        | l:"length"
{
    nf = (CommonToken) l;
}
        | m:"mod"
{
    nf = (CommonToken) m;
}
        | p:"power"
{
    nf = (CommonToken) p;
}
        | r:"round"
{
    nf = (CommonToken) r;
}
        | s1:"sign"
{
    nf = (CommonToken) s1;
}
        | s2:"sqrt"
{
    nf = (CommonToken) s2;
}
        | t:"trunc"
{
    nf = (CommonToken) t;
}
        ;


char_function   returns [ CommonToken cf = null ] :
        c1:"chr"
{
    cf = (CommonToken) c1;
}
        | c2:"concat"
{
    cf = (CommonToken) c2;
}
        | i:"initcap"
{
    cf = (CommonToken) i;
}
        | l1:"lower"
{
    cf = (CommonToken) l1;
}
        | l2:"lpad"
{
    cf = (CommonToken) l2;
}
        | l3:"ltrim"
{
    cf = (CommonToken) l3;
}
        | r1:"replace"
{
    cf = (CommonToken) r1;
}
        | r2:"rpad"
{
    cf = (CommonToken) r2;
}
        | r3:"rtrim"
{
    cf = (CommonToken) r3;
}
        | s1:"soundex"
{
    cf = (CommonToken) s1;
}
        | s2:"substr"
{
    cf = (CommonToken) s2;
}
        | t:"translate"
{
    cf = (CommonToken) t;
}
        | u:"upper"
{
    cf = (CommonToken) u;
}
            ;
group_function    returns [ CommonToken gf = null ] :
        a:"avg"
{
    gf = (CommonToken) a;
}
        | c:"count"
{
    gf = (CommonToken) c;
}
        | m1:"max"
{
    gf = (CommonToken) m1;
}
        | m2:"min"
{
    gf = (CommonToken) m2;
}
        | s1:"stddev"
{
    gf = (CommonToken) s1;
}
        | s2:"sum"
{
    gf = (CommonToken) s2;
}
        | v:"variance"
{
    gf = (CommonToken) v;
}
        ;

conversion_function    returns [ CommonToken cf = null ] :
        c1:"chartorowid"
{
    cf = (CommonToken) c1;
}
        | c2:"convert"
{
    cf = (CommonToken) c2;
}
        | h:"hextoraw"
{
    cf = (CommonToken) h;
}
        | r1:"rawtohex"
{
    cf = (CommonToken) r1;
}
        | r2:"rowidtochar"
{
    cf = (CommonToken) r2;
}
        | t1:"to_char"
{
    cf = (CommonToken) t1;
}
        | t2:"to_date"
{
    cf = (CommonToken) t2;
}
        | t3:"to_number"
{
    cf = (CommonToken) t3;
}
        ;

other_function    returns [ CommonToken of = null ] 
        :
        d1:"decode"
{
    of = (CommonToken) d1;
}
        | d2:"dump"
{
    of = (CommonToken) d2;
}
        | g:"greatest"
{
    of = (CommonToken) g;
}
        | l:"least"
{
    of = (CommonToken) l;
}
        | n:"nvl"
{
    of = (CommonToken) n;
}
        | u1:"uid"
{
    of = (CommonToken) u1;
}
        | u2:"userenv"
{
    of = (CommonToken) u2;
}
        | v:"vsize"
{
    of = (CommonToken) v;
}
        ;
trim_function     returns [ CommonToken tf = null ] :
        t:"trim" o:OPEN_PAREN!
          ( l:"leading" | tr:"trailing" | b:"both") ?
          plsql_expression ( f:"from" plsql_expression )? cp:CLOSE_PAREN!
{
    tf = (CommonToken) t;
}
        ;
pseudo_column    returns [ CommonToken pc = null ]  :
        u:"user"
{
    pc = (CommonToken) u;
}
        | s:"sysdate"
{
    pc = (CommonToken) s;
}
        ;

selected_table:
        (
          ("table")=> row_proc
        | ("the") => the_proc
        | subquery
        | table_spec
        ) ( alias )?
        ;

ansi_spec :
      ( i:"inner" | (( l:"left " | r:"right") o:"outer" )) j:"join"
      selected_table 
      on:"on"
      condition
      ;


row_proc    returns [ CommonToken rp = null ] :
        t:"table" o:OPEN_PAREN  ( select_command | cast_proc ) cp:CLOSE_PAREN!
{
    rp = (CommonToken) t;
}
        ;

the_proc returns [CommonToken tp= null ]:
        t:"the" subquery
{
    tp = (CommonToken) t;
}
        ;

cast_proc  returns [CommonToken cp= null ]:
        c:"cast" o:OPEN_PAREN! plsql_expression a:"as"! type_name c2:CLOSE_PAREN!
{
    cp = (CommonToken) c;
}
        ;

table_spec:
        ( schema_name DOT )? table_name ( AT_SIGN link_name )?
        ;

table_alias:
        table_spec ( alias )?
        ;

link_name    returns [ CommonToken ln = null ] :
        ln=identifier
        ;

condition:
        logical_term ( o:"or"^ logical_term
        )*
//        { System.out.println("Parser:Recognised condition"); }
        ;

logical_term:
        maybe_neg_factor  ( a:"and"^
        maybe_neg_factor
        )*
//        { System.out.println("Parser:Recognised logical_term"); }
        ;

maybe_neg_factor:
        (n0:"not"
        )? logical_factor
//        { System.out.println("Parser:Recognised maybe_neg_factor"); }
      ;

logical_factor:
         ( OPEN_PAREN condition CLOSE_PAREN ) =>
         o:OPEN_PAREN condition cp:CLOSE_PAREN! 
        | ( "exists" ) => es:"exists" subquery
        | (prior_plsql_expression relational_op prior_plsql_expression )
              => prior_plsql_expression relational_op prior_plsql_expression
        | (prior_plsql_expression ("not" )? "in" )
              => ( prior_plsql_expression (n:"not")? i:"in"^ exp_set
        )
        |  ( prior_plsql_expression ( "not" )? "like" ) =>
           ( prior_plsql_expression ( n1:"not" )? l:"like"^ prior_plsql_expression ( e:"escape" q:QUOTED_STRING )?
        )
        |  ( prior_plsql_expression ( "not" )? "between") =>
           ( prior_plsql_expression ( n2:"not" )? b:"between"^ prior_plsql_expression a:"and"! prior_plsql_expression
        )
        | ( prior_plsql_expression i2:"is" ( n3:"not" )? n4:"null"
        )
        ;

prior_plsql_expression :
    ( p1:"prior" )?
           plsql_expression
        ;


relational_op    returns [ CommonToken ro = null ] :
        e:EQ
{
    ro = (CommonToken) e;
}
        | l1:LT
{
    ro = (CommonToken) l1;
}
        | g1:GT
{
    ro = (CommonToken) g1;
}
        | n:NOT_EQ
{
    ro = (CommonToken) n;
}
        | l2:LE
{
    ro = (CommonToken) l2;
}
        | g2:GE
{
    ro = (CommonToken) g2;
}
        ;


exp_set:
         ( OPEN_PAREN "select" ) => subquery
       | b:OPEN_PAREN
                 plsql_exp_list cp:CLOSE_PAREN!
       | plsql_expression
        ;

subquery:
        o:OPEN_PAREN
        select_command cp:CLOSE_PAREN!
{
    #subquery = #([SUBQUERY, "subquery" ], #subquery);
}
        ;

connect_clause:
        ( s1:"start" w1:"with" condition )? // The start can precede the connect by
        c1:"connect" "by" 
            condition
        |  ( c2:"connect" "by"
            condition ) ?
        s2:"start" w2:"with" condition
        ;

group_clause:
        g1:"group" "by"
        plsql_exp_list ( h1:"having"
                   condition
        )?
        | h2:"having"
           condition ( g2:"group" "by"
                       plsql_exp_list
           )?
        ;

order_clause:
        o:"order" "by" sorted_def
        ( c:COMMA sorted_def
        )*
        ;

sorted_def:
        plsql_expression ( a:"asc" | d:"desc" )?
        ;

update_clause:
        f:"for" "update"
        ( o:"of" column_name
        ( c:COMMA column_name
        )* )?
        ( n:"nowait"
        )?
        ;

insert_command:
        i:"insert" "into" table_spec ( alias )?
        ( OPEN_PAREN! column_spec
        ( c1:COMMA column_spec
        )* CLOSE_PAREN! )?
        ( ( v:"values" OPEN_PAREN! plsql_exp_list
            cp:CLOSE_PAREN!
           )
          | select_expression
        )
        ;

update_command:
        ( subquery_update ) => subquery_update
        | simple_update
        ;

simple_update:
        u:"update" table_alias
        s:"set" column_spec e1:EQ
         plsql_expression
        ( c:COMMA column_spec e2:EQ
        plsql_expression )*
        ( w:"where"
            condition ) ?
        ;

delete_command:
        d:"delete" ( "from" )? table_alias
        ( w:"where"
        condition ) ?
        ;

subquery_update:
        u:"update" table_alias
        s:"set"
        o:OPEN_PAREN!
        column_spec ( c:COMMA column_spec
        )* cp:CLOSE_PAREN!
        e:EQ subquery
        ( w:"where"
          condition )?
        ;

set_transaction_command:
        s:"set" t:"transaction" r:"read" o:"only"
        ;

close_statement :
      c:"close" cursor_name
      ;


fetch_statement:
        f:"fetch" cursor_name ( b:"bulk" "collect" ) ? i:"into"
        ( ( variable_name (c:COMMA variable_name
        )* )
        | record_name )
        ;

lock_table_statement:
        l:"lock" t:"table" table_reference_list
        i:"in" lock_mode m:"mode" ( n:"nowait" )?
        ;

lock_mode:
        r1:"row" s1:"share"
        | r2:"row" e1:"exclusive"
        |s2:"share" u:"update"
        | s3:"share"
        | s4:"share" r3:"row" e2:"exclusive"
        | e3:"exclusive"
        ;

open_statement:
        o:"open" cursor_name  (b:OPEN_PAREN plsql_exp_list! cp:CLOSE_PAREN!)?
         ( f:"for" ( select_expression | plsql_expression ))?
         ( "using" plsql_exp_list ) ?
        ;

rollback_statement:
        r:"rollback" ( w:"work" )?
        ( t:"to" ( s:"savepoint" )? savepoint_name )?
        ( c:"comment" char_literal )?
        ;

savepoint_statement:
        s:"savepoint" savepoint_name
        ;


savepoint_name    returns [ CommonToken sn = null ] :
        sn=identifier
        ;

// Direct mappings to lexer.

identifier    returns [ CommonToken id = null ] :
        ( i:IDENTIFIER
{
    id = (CommonToken) i;
}
        | d:DOUBLE_QUOTED_STRING
{
    id = (CommonToken) d;
}
        | id=keyword
       )
           ;

match_string     returns [ CommonToken ms = null ] : q:QUOTED_STRING
{
    ms = (CommonToken) q;
}
           ;

//
// These are non reserve words that can be used as identifiers.  If it is
// a reserved word in Oracle but not ANSI, that is noted and commented out
// (can not be used). If it is a reserve word in ANSI and not in Oracle,
// that is noted but it is not commented out (can be used).
//

keyword     returns [ CommonToken k = null ] :
         a1:"abs"
{
    k = (CommonToken) a1;
}
        | a2:"ascii"
{
    k = (CommonToken) a2;
}
        | c1:"ceil"
{
    k = (CommonToken) c1;
}
        | c2:"chartorowid"
{
    k = (CommonToken) c2;
}
        | c3:"chr"
{
    k = (CommonToken) c3;
}
        | c4:"concat"
{
    k = (CommonToken) c4;
}
        | c5:"convert"
{
    k = (CommonToken) c5;
}
        | c6:"count"
{
    k = (CommonToken) c6;
}
        | d1:"decode"
{
    k = (CommonToken) d1;
}
        | d2:"dump"
{
    k = (CommonToken) d2;
}
        | f:"floor"
{
    k = (CommonToken) f;
}
        | g:"greatest"
{
    k = (CommonToken) g;
}
        | h:"hextoraw"
{
    k = (CommonToken) h;
}
        | i1:"initcap"
{
    k = (CommonToken) i1;
}
        | i2:"instr"
{
    k = (CommonToken) i2;
}
        | i3:"intersect"
{
    k = (CommonToken) i3;
}
        | l4:"least"
{
    k = (CommonToken) l4;
}
        | l5:"length"
{
    k = (CommonToken) l5;
}
        | l6:"lower"
{
    k = (CommonToken) l6;
}
        | l7:"lpad"
{
    k = (CommonToken) l7;
}
        | l8:"ltrim"
{
    k = (CommonToken) l8;
}
     // | m1:"max" // oracle
     // | m2:"min" // oracle
     // | m3:"minus" // oracle
     // | m4:"mod" // oracle
     // | n1:"not" // oracle
     // | n2:"nowait" // oracle
        | n:"nvl"
{
    k = (CommonToken) n;
}
        | p:"power"
{
    k = (CommonToken) p;
}
     // | p1:"prior" // oracle
        | r1:"rawtohex"
{
    k = (CommonToken) r1;
}
        | r2:"replace"
{
    k = (CommonToken) r2;
}
        | s1:"sign"
{
    k = (CommonToken) s1;
}
        | s2:"soundex"
{
    k = (CommonToken) s2;
}
        | s3:"sqrt"
{
    k = (CommonToken) s3;
}
     // | s4:"stddev" // oracle
        | s5:"substr"
{
    k = (CommonToken) s5;
}
     // | s6:"sum" // oracle
        | s7:"sysdate"
{
    k = (CommonToken) s7;
}
        | t1:"to_char"
{
    k = (CommonToken) t1;
}
        | t2:"to_date"
{
    k = (CommonToken) t2;
}
        | t3:"to_number"
{
    k = (CommonToken) t2;
}
        | t4:"translate"
{
    k = (CommonToken) t4;
}
        | t5:"trunc"
{
    k = (CommonToken) t5;
}
     // | u:"uid" // oracle
        | u1:"upper"
{
    k = (CommonToken) u1;
}
        | u2:"user" // ansi
{
    k = (CommonToken) u2;
}
        | u3:"userenv"
{
    k = (CommonToken) u3;
}
     // | v1:"variance" // oracle
        | v:"vsize"
{
    k = (CommonToken) v;
}
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
    charVocabulary = '\3' .. '\377';
}

IDENTIFIER options { testLiterals=true; }
    :
        'a' .. 'z' ( 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )*
{
    SoftwareMetrics.adjustMetrics(getText(), getLine());
}
    ;

protected ANY_CHARACTER:
        'a' .. 'z'
        ;

QUOTED_STRING
      :
      ( '\'' 
           (
              ('\n'|'\r'('\n')?) {newline();}
              | ~'\'' 
           )* '\'' )+
{
    SoftwareMetrics.adjustMetrics(getText(), getLine());
}
    ;


DOUBLE_QUOTED_STRING
      :
      ( '"' ( ~'"' )* '"' )+
{
    SoftwareMetrics.adjustMetrics(getText(), getLine());
}
    ;

SEMI : ';'
{
    SoftwareMetrics.adjustMetrics(getText(),getLine());
    SoftwareMetrics.incStatements();
};
COLON: ':' { SoftwareMetrics.adjustMetrics(getText(),getLine()); };
DOT : '.'  { SoftwareMetrics.adjustMetrics(getText(),getLine()); };
COMMA : ','  { SoftwareMetrics.adjustMetrics(getText(),getLine()); };
ASTERISK : '*'  { SoftwareMetrics.adjustMetrics(getText(),getLine()); };
AT_SIGN : '@'  { SoftwareMetrics.adjustMetrics(getText(),getLine()); };
OPEN_PAREN : '('  { SoftwareMetrics.adjustMetrics(getText(),getLine()); };
CLOSE_PAREN : ')'  { SoftwareMetrics.adjustMetrics(getText(),getLine()); };
PLUS : '+'  { SoftwareMetrics.adjustMetrics(getText(),getLine()); };
MINUS : '-'  { SoftwareMetrics.adjustMetrics(getText(),getLine()); };
DIVIDE : '/'  { SoftwareMetrics.adjustMetrics(getText(),getLine()); };
EQ : '='  { SoftwareMetrics.adjustMetrics(getText(),getLine()); };
PERCENTAGE : '%'  { SoftwareMetrics.adjustMetrics(getText(),getLine()); };
DOUBLEDOT: ".." { SoftwareMetrics.adjustMetrics(getText(),getLine()); };
CONCAT: "||" { SoftwareMetrics.adjustMetrics(getText(),getLine()); };
OUTER_JOIN: "(+)" { SoftwareMetrics.adjustMetrics(getText(),getLine()); };

START_LABEL :
        "<<"
{
    SoftwareMetrics.adjustMetrics(getText(), getLine());
}
        ;

END_LABEL:
        ">>"
{
    SoftwareMetrics.adjustMetrics(getText(), getLine());
}
        ;

ASSIGNMENT_EQ:
        ":="
{
    SoftwareMetrics.adjustMetrics(getText(), getLine());
}
        ;
PASS_BY_NAME:
        "=>"
{
    SoftwareMetrics.adjustMetrics(getText(), getLine());
}
        ;

VERTBAR : '|'  { SoftwareMetrics.adjustMetrics(getText(),getLine()); };

NOT_EQ :
        (    '<' { _ttype = LT; }
                (       ( '>' { _ttype = NOT_EQ; } )
                    |   ( '=' { _ttype = LE; } ) )?
        | "!=" | "^="
        )
{
    SoftwareMetrics.adjustMetrics(getText(), getLine());
}
    ;
GT : '>' ( '=' { _ttype = GE; } )?  { SoftwareMetrics.adjustMetrics(getText(), getLine()); };

NUMBER
    :
        ( ( N DOT N ) => N DOT N | DOT N | N )
        ( "e" ( PLUS | MINUS )? N )?
{
    SoftwareMetrics.adjustMetrics(getText(), getLine());
}
    ;

protected
N : '0' .. '9' ( '0' .. '9' )* ;


WS
{
int lcnt = 0;
}
        :        (' '
                |        '\t'
                |        ('\n'|'\r'('\n')?) {lcnt++; newline();}
                )+
        { if (lcnt > 0) SoftwareMetrics.incBlanks(lcnt - 1); }
        { $setType(Token.SKIP); }
        ;

// Single-line comments
SL_COMMENT
        :        "--"
                (~('\n'|'\r'))* ('\n'|'\r'('\n')?)
                {newline();}
        { SoftwareMetrics.incComments(1); }
        { $setType(Token.SKIP); }
        ;


// Taken right from antlr-2.7.1/examples/java/java/java.g ...
// multiple-line comments
ML_COMMENT
{
    int lcnt = 0;
}
        :          "/*"
                (
/*
 *  '\r' '\n' can be matched in one alternative or by matching
 *  '\r' in one iteration and '\n' in another.  I am trying to
 *  handle any flavor of newline that comes in, but the language
 *  that allows both "\r\n" and "\r" and "\n" to all be valid
 *  newline is ambiguous.  Consequently, the resulting grammar
 *  must be ambiguous.  I'm shutting this warning off.
 */
                        options {
                                generateAmbigWarnings=false;
                        }
                :
                        { LA(2)!='/' }? '*'
                |        '\r' '\n'                {lcnt++; newline();}
                |        '\r'                        {lcnt++; newline();}
                |        '\n'                        {lcnt++; newline();}
                |        ~('*'|'\n'|'\r')
                )*
                "*/"
        { SoftwareMetrics.incComments(lcnt); }
        { $setType(Token.SKIP); }
;
