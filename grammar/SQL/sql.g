#header
<<
// any definitions that you need in the generated files
>>


<<
// scanner definitions would go here
#include "DLexerBase.h"
#include "DLGLexer.h"
#include "AToken.h"
typedef ANTLRCommonToken ANTLRToken;

int main(int argc, char **argv)
{
    DLGFileInput in(stdin);
    DLGLexer scanner(&in);
    ANTLRTokenBuffer pipe(&scanner);
    ANTLRToken tok;
    scanner.setToken(&tok);
    SQLParser sqlParser(&pipe);

    sqlParser.init(); // initialize
    sqlParser.starting_rule(); // start first rule
    return 0;
}
>>


// scanner rules

#lexclass START // Not really necessary, but
                // good commentary nonetheless

// White Space
#token "[\ \t\r]"       <<skip();>>
#token "\n"           <<skip(); newline();>>

// Comments
#token "// ~[\n@]* [\n@]" <<skip(); newline();>>

// Literals
#token INTLIT  "[0-9]+"
#token CHARLIT "\' ~[] \'"
#token         "\"" << // start STRINGLIT
                        skip();
                        mode(STRING);
                    >>
// Keywords
#token  ALL               "all"
#token  AND               "and"
#token  ANY               "any"
#token  ASC               "asc"
#token  AVG               "avg"
#token  BY                "by"
#token  CALL              "call"
#token  COUNT             "count"
#token  CREATE            "create"
#token  DAY               "day"
#token  DELETE            "delete"
#token  DESC              "desc"
#token  DISTINCT          "distinct"
#token  DROP              "drop"
#token  EVERY             "every"
#token  FULL              "full"
#token  FROM              "from"
#token  GROUP             "group"
#token  HAVING            "having"
#token  HOUR              "hour"
#token  INDEX             "index"
#token  INSERT            "insert"
#token  INTERVAL          "interval"
#token  INTO              "into"
#token  JOIN              "join"
#token  LEFT              "left"
#token  MAX               "max"
#token  MIN               "min"
#token  MINUTE            "minute"
#token  MONTH             "month"
#token  NULL_VALUE        "null"
#token  NOT               "not"
#token  OJ                "oj"
#token  ON                "on"
#token  OR                "or"
#token  ORDER             "order"
#token  OUTER             "outer"
#token  RIGHT             "right"
#token  SECOND            "second"
#token  SELECT            "select"
#token  SET               "set"
#token  SOME              "some"
#token  SUM               "sum"
#token  TABLE             "table"
#token  TO                "to"
#token  UPDATE            "update"
#token  UNIQUE            "unique"
#token  USER              "user"
#token  VALUES            "values"
#token  WHERE             "where"
#token  YEAR              "year"
//#token  STRING_LITERAL    "string_literal"
#token  INNER             "inner"
#token  CHARACTER          "character"
#token  CHAR              "char"
#token  VARYING           "varying"
#token  VARCHAR           "varchar"
#token  BIT               "bit"
#token  NUMERIC           "numeric"
#token  DECIMAL           "decimal"
#token  DEC               "dec"
#token  INTEGER           "integer"
#token  INT               "int"
#token  SMALLINT          "smallint"
#token  FLOAT             "float"
#token  REAL              "real"
#token  DOUBLE            "double"
#token  PRECISION         "precision"
#token  DATE              "date"
#token  TIME              "time"
#token  WITH              "with"
#token  ZONE              "zone"
#token  TIMESTAMP         "timestamp"
#token  UNDERBAR          "_"

// Operators
#token  ASTERISK          "\*"
#token  CLOSE_PAREN       "\)"
#token  COLON             ":"
#token  COMMA             ","
#token  CURLY_OPEN        "\{"
#token  CURLY_CLOSE       "\}"
#token  D                 "d"
#token  DIV               "/"
#token  DOT               "."
#token  E                 "e"
#token  EQ                "="
#token  GE                ">="
#token  GT                ">"
#token  LE                "<="
#token  LT_               "<"
#token  MINUS             "\-"
#token  NE                "!="
#token  NEQ               "<>"
#token  OPEN_PAREN        "\("
#token  PLUS              "\+"
#token  QUESTION_EQUALS   "?="
#token  QUESTION_MARK     "?"
#token  SINGLE_QUOTE      "\'"
#token  UP_CARAT          "^"
#token  FN_PI             "pi"
#token  FN_RAND           "rand"

// Identifiers
#token IDENT "[a-zA-Z] [a-zA-Z0-9_]*"
#token LOWER_CASE_LETTER "[a-z]"
#token UPPER_CASE_LETTER "[A-Z]"
#token DIGIT "[0-9]"
#token HEX_DIGIT "[0-9a-fA-F]"

// String Literal Processing
// Separate Scanner class!
#lexclass STRING
#token           "\"\"" <<
                            more();
                            replchar('\"');
                        >>
#token BADSTRING "\n"   <<
                            replchar('\0');
                            newline();
                            mode(START);
                            /* error message */
                        >>
#token STRINGLIT "\""   <<
                            replchar('\0');
                            mode(START);
                        >>
#token           "~[]"  <<more();>>

#token Eof "@" << printf("Eof Found\n"); >>

#tokclass STRING_LITERAL {STRINGLIT BADSTRING}
//#tokclass ADD_OP {PLUS MINUS}
//#tokclass RELATIONAL_OP {EQ NE GT GE LT_ LE}
//#tokclass BOOLEAN_OP {AND OR}
//#tokclass MULT_OP {ASTERISK DIV MOD}

class SQLParser
{
<<
    // parser definitions go here

    public:
        void init()
        {
            ANTLRParser::init();
            // any specific initialization you need
            // (if none, don't override the init() method
        }
>>


// Grammar rules
starting_rule :
  ( sql_statement )* Eof ;

sql_statement :
        ( select_statement
        | insert_statement
        | update_statement_searched
        | delete_statement_searched
        | create_table_statement
        | create_index_statement
        | drop_table_statement
        | drop_index_statement
        | /* Empty statement */
        )
        ;



approximate_numeric_literal : ( mantissa E exponent | mantissa D exponent ) ;
base_index_identifier : ( user_defined_name ) ;
base_index_name : ( base_index_identifier ) ;
base_table_identifier : ( user_defined_name ) ;
base_table_name : ( base_table_identifier ) ;

//boolean_primary : ( comparison_predicate | search_condition ) ;
boolean_primary : ( comparison_predicate );
boolean_term : ( { NOT } boolean_primary  { AND boolean_term } ) ;
search_condition : ( boolean_term { OR search_condition } ) ;

comparison_predicate : ( expression comparison_operator expression ) ;
term : (factor { ( ASTERISK | DIV ) term } ) ;
expression : ( term { ( PLUS | MINUS ) expression } ) ;
factor : ( { PLUS | MINUS } primary ) ;
catalog_name : ( user_defined_name ) ;
catalog_separator : ( DOT ) ;
character_string_literal : ( STRING_LITERAL ) ;
clock_high_value : ( HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT ) ;
clock_low_value : ( HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT ) ;
clock_middle_value : ( HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT ) ;
clock_node_value : ( HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT ) ;
clock_seq_value : ( HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT ) ;
column_identifier : ( user_defined_name ) ;
column_name : ( { table_name DOT } column_identifier ) ;
comparison_operator : ( LT_ | GT | LE | GE | EQ | NE | NEQ ) ;
computational_operation : (AVG | MAX | MIN | SUM | EVERY | ANY | SOME | COUNT);
correlation_name : ( user_defined_name ) ;
create_table_statement : ( CREATE TABLE base_table_name OPEN_PAREN column_identifier data_type ( COMMA column_identifier data_type ) * CLOSE_PAREN ) ;
create_index_statement : ( CREATE { UNIQUE } INDEX base_index_name OPEN_PAREN column_identifier { ASC | DESC } ( COMMA column_identifier { ASC | DESC } ) * CLOSE_PAREN ) ;
//data_type : ( character_string_type ) ;
date_separator : ( MINUS ) ;
date_value : ( years_value date_separator months_value date_separator days_value ) ;
datetime_field : ( non_second_datetime_field | SECOND ) ;
datetime_value : ( unsigned_integer ) ;
day_time_interval : ( days_value { hours_value { COLON minutes_value { COLON seconds_value } } } ) ;
day_time_literal : ( day_time_interval | time_interval ) ;
days_value : ( datetime_value | DIGIT DIGIT ) ;
delete_statement_searched : ( DELETE FROM table_name { WHERE search_condition } ) ;
drop_table_statement : ( DROP TABLE base_table_name ) ;
drop_index_statement : ( DROP INDEX base_index_name ) ;
dynamic_parameter : ( QUESTION_MARK ) ;
end_field : ( non_second_datetime_field | SECOND { ( interval_fractional_seconds_precision ) } ) ;
escape_character : ( UP_CARET ) ;
exact_numeric_literal : ( unsigned_integer { period { unsigned_integer } } ) ;
exponent : ( signed_integer ) ;
general_set_function : (computational_operation OPEN_PAREN { set_quantifier } expression CLOSE_PAREN);
//guid_separator : ( MINUS ) ;
//guid_value : ( clock_low_value guid_separator clock_middle_value guid_separator clock_high_value guid_separator clock_seq_value guid_separator node_value ) ;
hours_value : ( datetime_value | ( DIGIT DIGIT ) ) ;
insert_statement : ( INSERT INTO table_name OPEN_PAREN { column_identifier ( COMMA column_identifier ) * CLOSE_PAREN } VALUES OPEN_PAREN insert_value ( COMMA insert_value ) * CLOSE_PAREN ) ;
insert_value : ( dynamic_parameter | literal | NULL_VALUE | USER ) ;
interval_fractional_seconds_precision : ( unsigned_integer ) ;
interval_leading_field_precision : ( unsigned_integer ) ;
interval_literal : ( INTERVAL { PLUS | MINUS } interval_string interval_qualifier ) ;
interval_qualifier : ( start_field TO end_field | single_datetime_field ) ;
interval_string : ( quote ( year_month_literal | day_time_literal ) quote ) ;
letter : ( LOWER_CASE_LETTER | UPPER_CASE_LETTER ) ;
literal : ( character_string_literal ) ;
mantissa : ( exact_numeric_literal ) ;
minus_sign : ( MINUS ) ;
minutes_value : ( datetime_value | ( DIGIT DIGIT )) ;
months_value : ( datetime_value | ( DIGIT DIGIT ) ) ;
non_second_datetime_field : ( YEAR | MONTH | DAY | HOUR | MINUTE ) ;
numeric_literal : ( signed_numeric_literal | unsigned_numeric_literal ) ;
odbc_date_escape : ( odbc_esc_initiator "d" SINGLE_QUOTE date_value SINGLE_QUOTE odbc_esc_terminator ) ;
odbc_date_time_escape : ( odbc_date_escape | odbc_time_escape | odbc_timestamp_escape ) ;
odbc_esc_initiator : ( CURLY_OPEN ) ;
odbc_esc_terminator : ( CURLY_CLOSE ) ;
//odbc_guid_escape : ( odbc_esc_initiator guid SINGLE_QUOTE guid_value SINGLE_QUOTE odbc_esc_terminator ) ;
odbc_like_escape : ( odbc_esc_initiator "escape" SINGLE_QUOTE escape_character SINGLE_QUOTE  odbc_esc_terminator ) ;
odbc_outer_join_escape : ( odbc_esc_initiator OJ outer_join odbc_esc_terminator ) ;
odbc_procedure_escape : ( odbc_esc_initiator { QUESTION_EQUALS } CALL procedure odbc_esc_terminator ) ;
odbc_scalar_function_escape : ( odbc_esc_initiator "fn" scalar_function odbc_esc_terminator ) ;
odbc_time_escape : ( odbc_esc_initiator "t" SINGLE_QUOTE time_value SINGLE_QUOTE  odbc_esc_terminator ) ;
odbc_timestamp_escape : ( odbc_esc_initiator "ts" SINGLE_QUOTE timestamp_value SINGLE_QUOTE  odbc_esc_terminator ) ;
order_by_clause : ( ORDER BY sort_specification ( COMMA sort_specification ) * ) ;
join_operator : ( ( ( ( LEFT | RIGHT | FULL ) OUTER) | INNER ) ) ;
outer_join_guts : ( table_name { correlation_name } join_operator JOIN ( table_name { correlation_name } | outer_join ) ON search_condition ) ;
outer_join : ( CURLY_OPEN OJ outer_join_guts CURLY_CLOSE ) ;
owner_name : ( user_defined_name ) ;
period : ( DOT ) ;
plus_sign : ( PLUS ) ;
primary : ( column_name | dynamic_parameter | literal | set_function_specification | OPEN_PAREN expression CLOSE_PAREN ) ;
procedure : ( procedure_name | procedure_name OPEN_PAREN procedure_parameter_list CLOSE_PAREN ) ;
procedure_identifier : ( user_defined_name ) ;
procedure_name : ( procedure_identifier | owner_name DOT procedure_identifier | catalog_name catalog_separator procedure_identifier | catalog_name catalog_separator { owner_name } DOT procedure_identifier ) ;
procedure_parameter : ( dynamic_parameter | literal ) * ;
procedure_parameter_list : ( procedure_parameter | procedure_parameter COMMA procedure_parameter_list ) ;
quote : ( SINGLE_QUOTE ) ;
scalar_function : ( function_name OPEN_PAREN argument_list CLOSE_PAREN ) ;
argument_list : ( expression | column_name | ) ;
seconds_fraction : ( unsigned_integer ) ;
seconds_integer_value : ( unsigned_integer ) ;
seconds_value : ( seconds_integer_value { DOT { seconds_fraction } } ) ;
select_list : ( ASTERISK | select_sublist ( COMMA select_sublist ) * ) ;
select_statement : ( SELECT { ALL | DISTINCT } select_list FROM table_reference_list { WHERE search_condition } { GROUP BY column_name (COMMA column_name) * } { HAVING search_condition } { order_by_clause } ) ;
select_sublist : ( expression ) ;
set_function_specification : (COUNT OPEN_PAREN ASTERISK CLOSE_PAREN | general_set_function);
set_quantifier : (DISTINCT | ALL);
sign : ( PLUS | MINUS ) ;
signed_integer : ( { sign } unsigned_integer ) ;
signed_numeric_literal : ( { sign } unsigned_numeric_literal ) ;
single_datetime_field : ( non_second_datetime_field { interval_leading_field_precision } | SECOND ( interval_leading_field_precision { COMMA ( interval_fractional_seconds_precision ) } ) ) ;
sort_specification : ( ( unsigned_integer | column_name ) { ASC | DESC } ) ;
start_field : ( non_second_datetime_field { ( interval_leading_field_precision ) } ) ;
statement : ( create_table_statement | delete_statement_searched | drop_table_statement | insert_statement | select_statement | update_statement_searched ) ;
table_identifier : ( user_defined_name ) ;
table_name : ( table_identifier ) ;
table_reference : ( table_name ) ;
table_reference_list : ( table_reference ( COMMA table_reference ) * ) ;
time_interval : ( hours_value { COLON minutes_value { COLON seconds_value } } | minutes_value { COLON seconds_value } | seconds_value ) ;
time_separator : ( COLON ) ;
time_value : ( hours_value time_separator minutes_value time_separator seconds_value ) ;
timestamp_separator : ( SINGLE_QUOTE  SINGLE_QUOTE  ) ; // ( The blank character ) ;
timestamp_value : ( date_value timestamp_separator time_value ) ;
unsigned_integer : ( DIGIT ) + ;
unsigned_numeric_literal : ( exact_numeric_literal | approximate_numeric_literal ) ;
update_statement_searched : ( UPDATE table_name SET column_identifier EQ ( expression | NULL_VALUE ) ( COMMA column_identifier EQ ( expression | NULL_VALUE ) ) * { WHERE search_condition } ) ;
user_defined_name : ( letter ( DIGIT | letter | UNDERBAR ) * ) ;
year_month_literal : ( years_value | { years_value } months_value ) ;
years_value : ( datetime_value | ( DIGIT DIGIT DIGIT DIGIT ) ) ;

data_type : (
      character_string_type
//       { CHARACTER SET character_set_specification }
//   |  national_character_string_type
//   |  binary_large_object_string_type
   |  bit_string_type
   |  numeric_type
// |  boolean_type
   |  datetime_type
   |  interval_type
);

character_string_type : (
     CHARACTER { OPEN_PAREN length CLOSE_PAREN }
   | CHAR { OPEN_PAREN length CLOSE_PAREN }
   | CHARACTER VARYING OPEN_PAREN length CLOSE_PAREN
   | CHAR VARYING OPEN_PAREN length CLOSE_PAREN
   | VARCHAR OPEN_PAREN length CLOSE_PAREN
// | CHARACTER LARGE OBJECT { OPEN_PAREN large_object_length CLOSE_PAREN
// | CHAR LARGE OBJECT { OPEN_PAREN large_object_length CLOSE_PAREN }
// | CLOB { OPEN_PAREN large_object_length CLOSE_PAREN }
);

length : ( unsigned_integer );

large_object_length : (
      unsigned_integer
// |  unsigned_integer K
// |  unsigned_integer M
// |  unsigned_integer G
);

//national_character_string_type : (
//     NATIONAL CHARACTER { OPEN_PAREN length CLOSE_PAREN }
//   | NATIONAL CHAR { OPEN_PAREN length CLOSE_PAREN }
//   | NCHAR { OPEN_PAREN length CLOSE_PAREN }
//   | NATIONAL CHARACTER VARYING OPEN_PAREN length CLOSE_PAREN
//   | NATIONAL CHAR VARYING OPEN_PAREN length CLOSE_PAREN
//   | NCHAR VARYING OPEN_PAREN length CLOSE_PAREN
//   | NATIONAL CHARACTER LARGE OBJECT { OPEN_PAREN large_object_length CLOSE_PAREN }
//   | NCHAR LARGE OBJECT { OPEN_PAREN large_object_length CLOSE_PAREN }
//   | NCLOB { OPEN_PAREN large_object_length CLOSE_PAREN }
//);

//binary_large_object_string_type : (
//     BINARY LARGE OBJECT { OPEN_PAREN large_object_length CLOSE_PAREN }
//   | BLOB { OPEN_PAREN large_object_length CLOSE_PAREN }
//);

bit_string_type : (
     BIT { OPEN_PAREN length CLOSE_PAREN }
   | BIT VARYING OPEN_PAREN length CLOSE_PAREN
);

numeric_type : (
      exact_numeric_type
   |  approximate_numeric_type
);

exact_numeric_type : (
     NUMERIC { OPEN_PAREN precision { COMMA  scale  }  CLOSE_PAREN  }
   | DECIMAL { OPEN_PAREN precision { COMMA  scale  }  CLOSE_PAREN  }
   | DEC { OPEN_PAREN precision { COMMA  scale  }  CLOSE_PAREN  }
   | INTEGER
   | INT
   | SMALLINT
);

precision : ( unsigned_integer );

scale  : ( unsigned_integer );

approximate_numeric_type : (
     FLOAT { OPEN_PAREN precision CLOSE_PAREN }
   | REAL
   | DOUBLE PRECISION
);

//boolean_type : ( BOOLEAN );

datetime_type : (
     DATE
   | TIME { OPEN_PAREN time_precision CLOSE_PAREN }
       { WITH TIME ZONE }
   | TIMESTAMP { OPEN_PAREN timestamp_precision CLOSE_PAREN }
       { WITH TIME ZONE }
);

time_precision : ( time_fractional_seconds_precision );

time_fractional_seconds_precision : ( unsigned_integer );

timestamp_precision : ( time_fractional_seconds_precision );

interval_type : ( INTERVAL interval_qualifier );

function_name : ( FN_PI | FN_RAND ) (OPEN_PAREN CLOSE_PAREN);

}
