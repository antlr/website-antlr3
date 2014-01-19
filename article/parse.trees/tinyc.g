header {
	import java.util.*;
}

class TinyCParser extends Parser;
// OR USING 2.7.3: class TinyCParser extends Parser("antlr.debug.ParseTreeDebugParser");

{
	/** Each new rule invocation must have it's own subtree.  Tokens
	 *  are added to the current root so we must have a stack of subtree roots.
	 */
	protected Stack currentParseTreeRoot = new Stack();

	/** Track most recently created parse subtree so that when parsing
	 *  is finished, we can get to the root.
	 */
	protected ParseTreeRule mostRecentParseTreeRoot = null;

	/** For every rule replacement with a production, we bump up count. */
	protected int numberOfDerivationSteps = 1; // n replacements plus step 0

	public ParseTree getParseTree() {
		return mostRecentParseTreeRoot;
	}

	public int getNumberOfDerivationSteps() {
		return numberOfDerivationSteps;
	}

	public void match(int i) throws MismatchedTokenException, TokenStreamException {
		addCurrentTokenToParseTree();
		super.match(i);
	}

	public void match(BitSet bitSet) throws MismatchedTokenException, TokenStreamException {
		addCurrentTokenToParseTree();
		super.match(bitSet);
	}

	public void matchNot(int i) throws MismatchedTokenException, TokenStreamException {
		addCurrentTokenToParseTree();
		super.matchNot(i);
	}

	/** This adds LT(1) to the current parse subtree.  Note that the match()
	 *  routines add the node before checking for correct match.  This means
	 *  that, upon mismatched token, there will a token node in the tree
	 *  corresponding to where that token was expected.  For no viable
	 *  alternative errors, no node will be in the tree as nothing was
	 *  matched() (the lookahead failed to predict an alternative).
	 */
	protected void addCurrentTokenToParseTree() throws TokenStreamException {
		if (inputState.guessing>0) {
			return;
		}
		ParseTreeRule root = (ParseTreeRule)currentParseTreeRoot.peek();
		ParseTreeToken tokenNode = null;
		if ( LA(1)==Token.EOF_TYPE ) {
			tokenNode = new ParseTreeToken(new antlr.CommonToken("EOF"));
		}
		else {
			tokenNode = new ParseTreeToken(LT(1));
		}
		root.addChild(tokenNode);
	}

	/** Create a rule node, add to current tree, and make it current root */
	public void traceIn(String s) throws TokenStreamException {
		if (inputState.guessing>0) {
			return;
		}
		ParseTreeRule subRoot = new ParseTreeRule(s);
		if ( currentParseTreeRoot.size()>0 ) {
			ParseTreeRule oldRoot = (ParseTreeRule)currentParseTreeRoot.peek();
			oldRoot.addChild(subRoot);
		}
		currentParseTreeRoot.push(subRoot);
		numberOfDerivationSteps++;
	}

	/** Pop current root; back to adding to old root */
	public void traceOut(String s) throws TokenStreamException {
		if (inputState.guessing>0) {
			return;
		}
		mostRecentParseTreeRoot = (ParseTreeRule)currentParseTreeRoot.pop();
	}
}

program
	:	( declaration )* EOF
	;

declaration
	:	(variable) => variable
	|	function
	;

declarator
	:	id:ID
	|	STAR id2:ID
	;

variable
	:	type declarator SEMI
	;

function
	:	type id:ID LPAREN
		(formalParameter (COMMA formalParameter)*)?
		RPAREN
		block
	;

formalParameter
	:	type declarator
	;

type:	"int" | "char" | ID ;

block
	:	LCURLY ( statement )* RCURLY
	;

statement
	:	(declaration) => declaration
	|	expr SEMI
	|	"if" LPAREN expr RPAREN statement
		( "else" statement )?
	|	"while" LPAREN expr RPAREN statement
	|	block
	;

expr:	assignExpr
	;

assignExpr
	:	aexpr (ASSIGN assignExpr)?
	;

aexpr
	:	mexpr (PLUS mexpr)*
	;

mexpr
	:	atom (STAR atom)*
	;

atom:	ID
	|	INT
	|	CHAR_LITERAL
	|	STRING_LITERAL
	;

class TinyCLexer extends Lexer;
options {
	k=2;
	charVocabulary = '\3'..'\377';
}

WS	:	(' '
	|	'\t'
	|	'\n'	{newline();}
	|	'\r')
		{ $setType(Token.SKIP); }
	;

SL_COMMENT : 
	"//" 
	(~'\n')* '\n'
	{ $setType(Token.SKIP); newline(); }
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
	:	'('
	;

RPAREN
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
	:	'\'' (options {greedy=false;}:.)* '\''
	;

STRING_LITERAL
	:	'"' (options {greedy=false;}:.)* '"'
	;

protected
DIGIT
	:	'0'..'9'
	;

INT	:	(DIGIT)+
	;

ID	:	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	;


