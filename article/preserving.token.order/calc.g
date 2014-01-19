class CalcParser extends Parser;
options {
	buildAST = true;	// uses CommonAST by default
    ASTLabelType = "ASTMinMax";
}

prog:	(stat)+
	;

stat:	ID EQUALS^ expr SEMI!
	|	"print"^ expr SEMI!
    ;

expr
	:	mexpr (PLUS^ mexpr)*
	;

mexpr
	:	atom (STAR^ atom)*
	;

atom:	INT
	|	ID
	;

class CalcLexer extends Lexer;

WS	:	(	' '
		|	'\t'
		|	'\n' {newline();}
		|	'\r'
		)+
	;

EQUALS: '=';

LPAREN:	'(' ;

RPAREN:	')' ;

STAR:	'*' ;

PLUS:	'+' ;

SEMI:	';' ;

INT	:	('0'..'9')+
	;

ID	:	('a'..'z'|'A'..'Z')+
	;

class CalcTreeWalker extends TreeParser;

options {
    ASTLabelType = "ASTMinMax";
}

{
	TokenStreamTracker tracker;
	public CalcTreeWalker(TokenStreamTracker tracker) {
		this();
		this.tracker = tracker;
	}
}

prog:	(stat)+
	;

stat:   #(a:EQUALS ID expr)
		{System.out.println("assign: "+tracker.toString(a.getMin(),a.getMax()));}
	|	#(p:"print" expr)
		{System.out.println("print: "+tracker.toString(p.getMin(),p.getMax()));}
    ;

expr:	#(p:PLUS expr expr)
		{System.out.println("addition: "+tracker.toString(p.getMin(),p.getMax()));}
	|	#(STAR expr expr)
	|	INT
	|	ID
	;
