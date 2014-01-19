/*
 * Make sure to run antlr.Tool on the lexer.g file first!
 */
options {
	mangleLiteralPrefix = "TK_";
}

class TinyCLexer extends Lexer;
options {
	k=2;
	tokenVocabulary=TinyC;
	charVocabulary = '\3'..'\377';
	literal="if";
	literal="int";
	literal="char";
	literal="if";
	literal="else";
	literal="while";
}

WS	:	(' '
	|	'\t'
	|	'\n'	{newline();}
	|	'\r')
		{ _ttype = Token.SKIP; }
	;


SL_COMMENT : 
	"//" 
	(~'\n')* '\n'
	{ _ttype = Token.SKIP; newline(); }
	;

ML_COMMENT
	:	"/*"
		(	{ LA(2)!='/' }? '*'
		|	'\n' { newline(); }
		|	~('*'|'\n')
		)*
		"*/"
			{ $setType(Token.SKIP); }
	;


LPAREN
options {
	paraphrase="'('";
}
	:	'('
	;

RPAREN
options {
	paraphrase="')'";
}
	:	')'
	;

LCURLY:	'{'
	;

RCURLY:	'}'
	;

STAR:	'*'
	;

PLUS:	'+'
	;

ASSIGN
	:	'='
	;

SEMI:	';'
	;

COMMA
	:	','
	;

CHAR_LITERAL
	:	'\'' (ESC|~'\'') '\''
	;

STRING_LITERAL
	:	'"' (ESC|~'"')* '"'
	;

protected
ESC	:	'\\'
		(	'n'
		|	'r'
		|	't'
		|	'b'
		|	'f'
		|	'"'
		|	'\''
		|	'\\'
		|	'0'..'3' ( DIGIT (DIGIT)? )?
		|	'4'..'7' (DIGIT)?
		)
	;

protected
DIGIT
	:	'0'..'9'
	;

INT	:	(DIGIT)+
	;

ID
options {
	testLiterals = true;
	paraphrase = "an identifier";
}
	:	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	;


