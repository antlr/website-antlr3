/*

 Copyright 2007 by Nathaniel Harward <nharward@gmail.com>

 ANTLR grammar for Oracle Network Services configuration files

 This grammar can parse entries in an Oracle Network Services configuration
 file (tnsnames.ora, listener.ora, sqlnet.ora, cman.ora, ldap.ora...), based
 on the Oracle 10g document:

 http://download-west.oracle.com/docs/cd/B19306_01/network.102/b14213/syntax.htm

 This grammar does not strictly conform to the document.  In paricular it does
 not enforce that parameters start at column 0, and that continuation lines do
 not start in column 0 -- whitespace is ignored (as are comments).  All other
 rules should be observed.

 The Oracle "spec" above is a little vague as a standalone language/syntax
 definition: I don't see how "NAMES.DIRECTORY_PATH= (TNSNAMES, ONAMES)" is
 valid since ',' is not listed as a delimiter.  Of course I might have just
 misunderstood the document :)  At any rate, if you come across valid syntax
 that this grammar does not allow please let me know so I can post a fix.

*/

class OracleNetServicesParser extends Parser;

options {
    k = 3;
    buildAST = true;
    codeGenDebug = false;
}

configuration_file
    : ( parameter )*
    ;

parameter
    : keyword EQUALS^ ( value
                      | LEFT_PAREN! value_list RIGHT_PAREN!
                      | ( LEFT_PAREN! parameter RIGHT_PAREN! )+
                      )
    ;

keyword
    : UNQUOTED_STRING
    ;

value
    : UNQUOTED_STRING
    | QUOTED_STRING
    ;

value_list
    : value ( COMMA! value )*
    ;

class OracleNetServicesLexer extends Lexer;

options {
    charVocabulary = '\3' .. '\177';
    exportVocab=ORANETCONFIG;
}

protected
NETWORK_CHARACTER_SET_CHAR
    : 'A' .. 'Z'
    | 'a' .. 'z'
    | '0' .. '9'
    | '<'
    | '>'
    | '/'
    | '.'
    | ':'
    | ';'
    | '-'
    | '_'
    | '$'
    | '+'
    | '*'
    | '&'
    | '!'
    | '%'
    | '?'
    | '@'
    | ESCAPED_CHAR
    ;

protected
ESCAPED_CHAR
    : '\\' .
    ;

UNQUOTED_STRING
    : ( NETWORK_CHARACTER_SET_CHAR )+
    ;

QUOTED_STRING
    : "'" ( ~( '\'' ) )* "'"
    | "\"" ( ~( '"' ) )* "\""
    ;

LEFT_PAREN
    : '('
    ;

RIGHT_PAREN
    : ')'
    ;

EQUALS
    : '='
    ;

COMMA
    : ','
    ;

COMMENT
    : '#' ( ~( '\n' ) )*
    { $setType(Token.SKIP); }
    ;

WHITESPACE
    : ( '\t'
      | ' '
      )
      { $setType(Token.SKIP); }
    ;

NEWLINE
    : ( '\r' )? '\n'
    { $setType(Token.SKIP); newline(); }
    ;

