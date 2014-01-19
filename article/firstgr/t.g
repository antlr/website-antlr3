class P extends Parser;

// match one-or-more 'name followed by age' pairs
startRule
	:	(	n:NAME a:AGE
			{System.out.println("("+n.getText()+","+a.getText()+")");}
		)+	
	;

class L extends Lexer;

// match an upper/lower case name of any length
NAME:	( 'a'..'z' | 'A'..'Z' )+
	;

// match a decimal age of any length
AGE	:	( '0'..'9' )+
	;

// whitespace
WS	:	(	' '
		|	'\t'
		|	'\r' '\n' { newline(); }
		|	'\n' { newline(); }
		)
		{$setType(Token.SKIP);}	//ignore this token
	;
