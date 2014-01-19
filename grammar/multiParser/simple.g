/* This grammar demonstrates the use of two parsers sharing a token 
 * vocabulary with a single lexer.
 */

header {
/* empty header */
}

{
import java.io.*;
}



class SimpleParser extends Parser;
options {
	k=2;
	tokenVocabulary=Simple;
}

simple :  (x)+;
x :
		(a)=> a
	|
		b
	;
a :  A B C;
b : A B D;


class SimpleParser2 extends Parser;
options {
	k=3;
	tokenVocabulary=Simple;
}

simple :  (x)+;
x :
		a
	|
		b
	;
a :  C B A;
b : D B A;

class SimpleLexer extends Lexer;

options {
	tokenVocabulary=Simple;
}

WS	:	(' '
	|	'\t'
	|	'\n'
	|	'\r')
		{ _ttype = Token.SKIP; }
	;


A : 'a' | 'A' ;
B : 'b' | 'B' ;
C : 'c' | 'C' ;
D : 'd' | 'D' ;

