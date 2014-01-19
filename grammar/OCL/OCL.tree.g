header {
import java.util.Vector;
}

/** OCL 1.3 AST Recognizer Grammar
 *
 * Author:
 *	Frederic FONDEMENT	f.fondement@objexion.com
 *
 * This grammar is in the PUBLIC DOMAIN
 */

class OCLTreeParser extends TreeParser;

options{
	importVocab = OCL;
}

{
	private Vector errors = new Vector();
	private Vector warnings = new Vector();
	
	/**@return The number of errors found in the Type control*/
	public int errorNumber(){
		return errors.size();
	}
	
	/**@return The number of warnings found in the Type control*/
	public int warningNumber(){
		return warnings.size();
	}
	
	/**@return All errors messages found in the Type control*/
	public String [] errors () {
		String [] ret = new String [errors.size()];
		for (int i = 0; i < ret.length; ++i)
			ret[i] = (String)errors.elementAt(i);
		return ret;
	}
	
	/**@return All warning messages found in the Type control*/
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
	:	#(CONSTR 
			constraintDeclaration 
			(constraintBody)+
		)
	;

constraintDeclaration
	:	classConstraint
	|	operationConstraint
	;

classConstraint
	:	#(CLASSCONTEXT (NAME)? TYPE)
	;

operationConstraint
	:	#(OPCONTEXT TYPE formalParameters (TYPE)?)
	;

formalParameters
	:	(#(PARAMLIST
			(#(FORMAL
				NAME
				TYPE
			))+
		))?
	;

constraintBody
	:	#(CONSTR_BODY
			STEREOTYPE
			(NAME)?
			POINTS
			expression
		)
	;

expression
	:	 let
	|	operator
	|	arrow
	|	point
	|	litteralCollection
	|	number
	|	featureCall
	;

number
	:	 i:INT
	|	f:FLOAT
	|	s:STRING
	|	b:BOOLEAN
	|	ty:TYPE
	|	#(DIESE nm:NAME)
	;

litteralCollection
	:	#(coll:COLLECTION
			(
			|	#(EXPRLIST (expression)*)
			|	#(EXPRRANGE expression expression)
			)
		)
	;

let
	:	#(LET
			NAME
			(#(TYPEINIT
				(#(ENUMERATION
					(NAME)*
				))?
			))?
			expression
			expression
		)
	;

operator
	:	#(OPERATOR expression (expression (expression)?)?)
	;
	
point
	:	#(POINT expression featureCall)
	;

arrow
	:	#(ARROW expression featureCall)
	;


featureCall
	:	#(AROBAPRE featureCall)
	| 	#(NAME (
			// this is my modification of OCL to allow navigation to association class of qualified links, giving the destination role
			(
				(#(QUALIFIERS NAME) QUALIFIERS)=> (#(QUALIFIERS NAME))
		//	|	{Is the field exists ?}? (#(QUALIFIERS NAME)) => (#(QUALIFIERS nq2:NAME))
			)?
			parameters
		)
	)
	;

parameters
	:	(	#(QUALIFIERS (expression)*)
		|	#(PARAMETERS (expression)*)
		|	#(PARAMETERSDEFININGVARS declarator expression)
		)?
	;

declarator
	:	#(DECLARATION
			(#(DECLARATION
				(NAME)+
				(TYPEINIT (#(ENUMERATION (NAME)*))?)?
				(EQ expression)?
			))+
		)
	;
