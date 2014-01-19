header {
import java.util.Vector;
}

/** OCL 1.3 Recognizer
 *
 * author:	Frederic FONDEMENT	f.fondement@objexion.com
 * Version 1.00 August 2, 2000 -- initial release
 *
 * This grammar is in the PUBLIC DOMAIN
 */

class OCLParser extends Parser;

options {
	k = 2;
	exportVocab = OCL;
	buildAST = true;
}

tokens {
	CONSTR;
	CLASSCONTEXT;
	OPCONTEXT;
	CONSTR_BODY;
	STEREOTYPE;
	FORMAL;
	PARAMLIST;
	LET;
	QUALIFIERS;
	PARAMETERS;
	PARAMETERSDEFININGVARS;
	DECLARATION;
	VALUE;
	EXPRLIST;
	EXPRRANGE;
	OPERATOR;
	TYPE;
	TYPEINIT;
	ENUMERATION;
	COLLECTION;
	BOOLEAN;
}

{	
	private Vector errors = new Vector();
	private Vector warnings = new Vector();
	
	/**@return The number of errors found in the parser*/
	public int errorNumber(){
		return errors.size();
	}
	
	/**@return The number of warnings found in the parser*/
	public int warningNumber(){
		return warnings.size();
	}
	
	/**@return All errors messages found in the parser*/
	public String [] errors () {
		String [] ret = new String [errors.size()];
		for (int i = 0; i < ret.length; ++i)
			ret[i] = (String)errors.elementAt(i);
		return ret;
	}
	
	/**@return All warning messages found in the parser*/
	public String [] warnings () {
		String [] ret = new String [warnings.size()];
		for (int i = 0; i < ret.length; ++i)
			ret[i] = (String)warnings.elementAt(i);
		return ret;
	}

	public void reportError(RecognitionException ex) {
		errors.addElement(ex.getMessage());
	}
	
	public void reportError(String s) {
		errors.addElement(s);
	}
	
	public void reportWarning(String s) {
		warnings.addElement(s);
	}
}

constraint
	:	contextDeclaration (constraintBody)+
	{#constraint = #(#[CONSTR,"CONSTR"],constraint);}
	;

contextDeclaration
	:	"context"!
		(
			((~(LPAREN|"inv"|"pre"|"post"))* LPAREN) => operationContext
		|	classifierContext
		)
	;

classifierContext
	:	(NAME POINTS!)? classifierType 
	{#classifierContext = #(#[CLASSCONTEXT,"CLASSCONTEXT"],classifierContext);}
	;

operationContext
	:	classifierType /*includes the operation name!!!*/
		LPAREN! (formalParameterList)? RPAREN! (POINTS! (classifierType|oclType))?
	{#operationContext = #(#[OPCONTEXT,"OPCONTEXT"], #operationContext);}
	;

formalParameterList
	:	formalParameter (SEMI! formalParameter)*
	{#formalParameterList = #(#[PARAMLIST,"PARAMLIST"], formalParameterList);}
	;

formalParameter
	:	NAME POINTS^ {#POINTS.setType(FORMAL); #POINTS.setText("FORMAL");} typeName
	;

constraintBody
	:	stereotype (NAME)? POINTS expression
	{#constraintBody = #(#[CONSTR_BODY,"CONSTR_BODY"],constraintBody);}
	;

stereotype
	:	("inv" | "pre" | "post")
	{#stereotype.setType(STEREOTYPE);}
	;

classifierType
	:	pathName
	{#classifierType.setType(TYPE);}
	;

fileExpression
	:	expression EOF!
	;

expression
	:	letExpression
	|	logicalExpression
	;

letExpression
	:	"let"! NAME (POINTS! t:typeName {#t.setType(TYPEINIT);})? EQ! expression "in"! expression
	{#letExpression = #(#[LET,"LET"], letExpression);}
	;

logicalExpression
	:	relationalExpression (("and"^|"or"^|"xor"^|"implies"^) relationalExpression {#logicalExpression.setType(OPERATOR);})*
	;

relationalExpression
	:	additiveExpression ((EQ^|GT^|LT^|GE^|LE^|NE^) additiveExpression {#relationalExpression.setType(OPERATOR);})?
	;

additiveExpression
	:	multiplicativeExpression ((PLUS^|MINUS^) multiplicativeExpression {#additiveExpression.setType(OPERATOR);})*
	;

multiplicativeExpression
	:	unaryExpression ((STAR^|DIV^) unaryExpression {#multiplicativeExpression.setType(OPERATOR);})*
	;

unaryExpression
	:	(("not"^|MINUS^) {#unaryExpression.setType(OPERATOR);})? postfixExpression
	;

postfixExpression
	:	primaryExpression((POINT^|ARROW^) featureCall)*
	;

primaryExpression
	:	litteralCollection
	|	litteral
	|	featureCall
	|	LPAREN! expression RPAREN!
	|	ifExpression
	;

litteralCollection
	:	collType:oclCollection! LCURLY! (collDef:expressionListOrRange!)? RCURLY!
	{#litteralCollection = #(collType, collDef);}
	;

expressionListOrRange
	:	expression 
		(	{#expressionListOrRange = #(#[EXPRLIST,"EXPRLIST"], #expressionListOrRange);}
		|	(COMA! expression)+ {#expressionListOrRange = #(#[EXPRLIST,"EXPRLIST"], expressionListOrRange);}
		|	POINT_POINT! expression {#expressionListOrRange = #(#[EXPRRANGE,"EXPRRANGE"], expressionListOrRange);}
		)
	;

litteral
	:	number
	|	DIESE^ NAME
	;

ifExpression
	:	"if"! cond:expression! "then"! onTrue:expression! "else"! onFalse:expression! "endif"!
	{#ifExpression = #(#[OPERATOR,"if"], cond, onTrue, onFalse);}
	;
	
qualifiers
	:	LSQUARE! actualParameterList RSQUARE!
	{
		#qualifiers.setType(QUALIFIERS);
		#qualifiers.setText("QUALIFIERS");
	}
	;

featureCall {
	boolean previous = false;
}
	:	pn:pathName!
		((LSQUARE NAME RSQUARE)=>(qualifiers))?
		(AROBAPRE! {previous = true;})?
		(	qualifiers
		|	parameters
		)?
	{
		#featureCall = #(pn, #featureCall);
		if (previous)
			#featureCall = #(#[AROBAPRE, "AROBAPRE"], #featureCall);
	}
	;
	
parameters {
	int i = 1; boolean b = false;
}	:	LPAREN! {
			int lparen = 0;
			while ((lparen != 0) || (LA(i) != EOF) && (! b) && (LA(i) != RPAREN)){
				b = (LA(i) == PIPE);
				if (LA(i) == LPAREN)
					lparen++;
				else if (LA(i) == RPAREN)
					lparen--;
				++i;
			}
		}
		(
			{b}? declarator (expression)?
		|	actualParameterList
		)
		RPAREN!
	{
		if (b)
			#parameters = #(#[PARAMETERSDEFININGVARS,"PARAMETERSDEFININGVARS"], parameters);
		else {
			#parameters.setText ("PARAMETERS");
			#parameters.setType (PARAMETERS);
		}
	}
	;

declarator
	:	declaration
		(SEMI! declaration)*
		PIPE!
	{#declarator = #(#[DECLARATION,"DECLARATION"], #declarator);}
	;
	
declaration
	:	NAME 
		(COMA! NAME)*
		(POINTS! t:typeName {#t.setType(TYPEINIT);})?
		(EQ expression)?
	{#declaration = #(#[DECLARATION,"DECLARATION"], #declaration);}
	;

actualParameterList
	:	(expression (COMA! expression)*)?
	{#actualParameterList = #(#[EXPRLIST,"EXPRLIST"], actualParameterList);}
	;

typeName
	:	pathName {#typeName.setType(TYPE);}
	|	enumType
	|	oclType
	;
	
enumType
	:	"enum"! LCURLY! DIESE! NAME (COMA! DIESE! NAME)* RCURLY!
	{#enumType = #(#[TYPE,"TYPE"], #([ENUMERATION,"ENUMERATION"], #enumType));}
	;

oclType
	:	(	"OclType"
		|	"OclAny"
		|	"Real"
		|	"Integer"
		|	"String"
		|	"Boolean"
		|	coll:oclCollection LPAREN! type:typeName! RPAREN! {
				#oclType.setText(#coll.getText()
						+ '('
						+ #type.getText()
						+ ')'
						);}
		)
	{#oclType.setType(TYPE);}
	;

oclCollection
	:	(	"Collection"
		|	"Set"
		|	"Bag"
		|	"Sequence"
		)
	{#oclCollection.setType(COLLECTION);}
	;

pathName
	:	head:NAME
		(FOUR_POINTS! field:NAME! {
			head.setText(head.getText()
					+ OCL.Tools.FieldManipulator.packageSeparator
					+ field.getText()
					);
		})*
	{#pathName.setText(head.getText());}
	;

number
	:	INT
	|	FLOAT
	|	STRING
	|	bool
	|	oclType
	;

bool
	:	("true" | "false")
	{#bool.setType(BOOLEAN);}
	;
	
///////////////////////////////////////////////////////////////////////////
//Lexer
///////////////////////////////////////////////////////////////////////////

class OCLLexer extends Lexer;

options {
	k = 2;
	exportVocab = OCL; 
	charVocabulary = '\0' .. '\u00FF';
}

{
	private Vector errors = new Vector();
	private Vector warnings = new Vector();
	
	/**@return The number of errors found in the lexer*/
	public int errorNumber(){
		return errors.size();
	}
	
	/**@return The number of warnings found in the lexer*/
	public int warningNumber(){
		return warnings.size();
	}
	
	/**@return All errors messages found in the lexer*/
	public String [] errors () {
		String [] ret = new String [errors.size()];
		for (int i = 0; i < ret.length; ++i)
			ret[i] = (String)errors.elementAt(i);
		return ret;
	}
	
	/**@return All warning messages found in the lexer*/
	public String [] warnings () {
		String [] ret = new String [warnings.size()];
		for (int i = 0; i < ret.length; ++i)
			ret[i] = (String)warnings.elementAt(i);
		return ret;
	}

	public void reportError(RecognitionException ex) {
		errors.addElement(ex.getMessage());
	}
	
	public void reportError(String s) {
		errors.addElement(s);
	}
	
	public void reportWarning(String s) {
		warnings.addElement(s);
	}
}

protected
NL	
	:	(	'\r' '\n' 
		|	'\n' '\r'  //Improbable
		|	'\r'
		|	'\n'
		)
	{newline();}
	;


WS
	:	(	' '
		|	'\t'   
		|	NL
		)
	{ $setType(Token.SKIP); }
	;

COMMENT
	:	"--"
		(~(	'\r'
		|	'\n'
		))*
		({LA(1) != EOF_CHAR}? NL)?
	{ $setType(Token.SKIP); }
	;

LPAREN
options {
	paraphrase = "a left parenthesis ('(')";
}:
	'('
	;

RPAREN
options {
	paraphrase = "a right parenthesis (')')";
}:
	')'
	;

LSQUARE
options {
	paraphrase = "a left squared parenthesis ('[')";
}:
	'['
	;

RSQUARE
options {
	paraphrase = "a right squared parenthesis (']')";
}:
	']'
	;

LCURLY
options {
	paraphrase = "a collection opening('{')";
}:
	'{'
	;

RCURLY
options {
	paraphrase = "a collection closure ('}')";
}:
	'}'
	;

PIPE
options {
	paraphrase = "a pipe ('|')";
}:
	'|'
	;

POINT
options {
	paraphrase = "'.'";
}:
	'.'
	;

POINT_POINT
options {
	paraphrase = "..";
}:
	".."
	;

COMA
options {
	paraphrase = "','";
}:
	','
	;

SEMI
options {
	paraphrase = "';'";
}:
	';'
	;

AROBAPRE
options {
	paraphrase = "@pre";
}:
	"@pre"
	;

DIESE
options {
	paraphrase = "#";
}:
	'#'
	;

POINTS
options {
	paraphrase = "':'";
}:
	':'
	;

FOUR_POINTS
options {
	paraphrase = "'::'";
}:
	"::"
	;
	
ARROW
options {
	paraphrase = "'->'";
}:
	"->"
	;

STAR
options {
	paraphrase = "*";
}:
	'*'
	;

DIV
options {
	paraphrase = "/";
}:
	'/'
	;

PLUS
options {
	paraphrase = "+";
}:
	'+'
	;

MINUS
options {
	paraphrase = "-";
}:
	'-'
	;

EQ
options {
	paraphrase = "=";
}:
	"="
	;

NE
options {
	paraphrase = "<>";
}:
	"<>"
	;

LT
options {
	paraphrase = "<";
}:
	'<'
	;

LE
options {
	paraphrase = "<=";
}:
	"<="
	;

GT
options {
	paraphrase = ">";
}:
	'>'
	;


GE
options {
	paraphrase = ">=";
}:
	">="
	;

protected
DIGIT
	:	'0'..'9'
	;

protected
ALPHA
	:	'a'..'z' 
	|	'A'..'Z'
	|	'_'
	//For Unicode compatibility (from 0000 to 00ff)
	|	'\u00C0' .. '\u00D6'
	|	'\u00D8' .. '\u00F6'
	|	'\u00F8' .. '\u00FF'
	;

INT
options {
	paraphrase = "a number";
}	:	(DIGIT)+
		(('.'DIGIT)=> '.' (DIGIT)+ {$setType(FLOAT);})?
	;

NAME
options {
	paraphrase = "a name";
}	:	(ALPHA) (ALPHA | DIGIT)*
	;

protected
ESC
	:	'\\'!
		(	'n' {$setText("\n");}
		|	'r' {$setText("\r");}
		|	't' {$setText("\t");}
		|	'b' {$setText("\b");}
		|	'f' {$setText("\f");}
		|	'"' {$setText("\"");}
		|	'\'' {$setText("\'");}
		|	'\\' {$setText("\\");}
		|	(
				('0'..'3')
				(
					options {
						warnWhenFollowAmbig = false;
					}
				:	('0'..'7')
					(	
						options {
							warnWhenFollowAmbig = false;
						}
					:	'0'..'7'
					)?
				)?
			|	('4'..'7')
				(
					options {
						warnWhenFollowAmbig = false;
					}
				:	('0'..'7')
				)?
			)
				{
					String s = $getText;
					int i;
					int ret = 0;
					String ans;
					for (i=0; i<s.length(); ++i)
						ret = ret*8 + s.charAt(i) - '0';
					ans = String.valueOf((char) ret);
					$setText(ans);
				}
		)
	;

STRING
options {
	paraphrase = "a string value";
}	:	'\''!
		(	ESC
		|	~('\\'|'\'')
		)*
		'\''!
	;

RECOVER
	:	(~(	'0'..'9' | 'A'..'Z' | 'a'..'z' | '_'
		|	'+'|'-'|'*'|'/'
		|	'>'|'<'|'='
		|	'\''|'#'|'@'|':'|'.'|','|';'|'|'
		|	'('|')'|'{'|'}'|'['|']'
		|	' '|'\t'|'\n'|'\r'
		|	'\u00C0' .. '\u00D6'
		|	'\u00D8' .. '\u00F6'
		|	'\u00F8' .. '\u00FF'
		))
		(~(	' '
		|	'\t'
		|	'\n'
		|	'\r'
		))*
	{
		String s=$getText;
		$setText("line " + getLine() + ": " + s + ": Unknown lexem; Token ignored");
		reportWarning($getText);
		$setType(Token.SKIP);
	}
	;
