class TinyCParser extends Parser;
statement
	:	(declaration) => declaration
	|	





TK_if LPAREN expr RPAREN statement
		( TK_else statement )?
	;

expr:	E
	;

