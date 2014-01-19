class XPathParser extends Parser;
	options
	{
		k = 2;
		exportVocab=XPath;
	}

xpath
	:
		union_expr
	;

location_path 
	:
			absolute_location_path
		|	relative_location_path
	;

absolute_location_path
	:
		(	SLASH^
		|	DOUBLE_SLASH^
		)
		(	(AT|STAR|IDENTIFIER)=>
			i_relative_location_path
			|
		)
	;

relative_location_path
	:
		i_relative_location_path
	;

i_relative_location_path
	:
		step
		(	(	SLASH^
			|	DOUBLE_SLASH^
			) 	step
		)*
	;

step
	:
		(
			// If it has an axis
			(	(IDENTIFIER DOUBLE_COLON | AT)=> axis
			|
			)

			(
				(	
					(
							(ns:IDENTIFIER COLON)? 
							(	id:IDENTIFIER
							|	STAR
							)
					)
				)

				|	

				special_step
			)
			(
				predicate

			)*
		)
		|	abbr_step
			(
				predicate
			)*
	;

special_step
	:
	{
		LT(1).getText().equals("processing-instruction")
	}?
		IDENTIFIER LEFT_PAREN 
			(	IDENTIFIER 
			)?
		RIGHT_PAREN
	|
	{
		LT(1).getText().equals("comment")
			||
		LT(1).getText().equals("text")
			||
		LT(1).getText().equals("node")
	}?
		IDENTIFIER LEFT_PAREN RIGHT_PAREN
	;

axis
	:
		(	id:IDENTIFIER DOUBLE_COLON^
		|	AT
		)
	;

// ----------------------------------------
//		Section 2.4
//			Predicates
// ----------------------------------------

// .... production [8] ....
//
predicate
	:
		LEFT_BRACKET^ predicate_expr RIGHT_BRACKET!
	;

// .... production [9] ....
//
predicate_expr
	:
		expr
	;

// .... production [12] ....
//
abbr_step
	:
			DOT
		|	DOT_DOT
	;

// .... production [13] ....
//
abbr_axis_specifier
	:
		( AT )?
	;


// ----------------------------------------
//		Section 3
//			Expressions
// ----------------------------------------

// ----------------------------------------
//		Section 3.1
//			Basics
// ----------------------------------------

// .... production [14] ....
//
expr
	:
		or_expr
	;

// .... production [15] ....
//
primary_expr
	:
			variable_reference
		|	LEFT_PAREN! expr RIGHT_PAREN!
		|	literal
		|	number
		|	function_call
	;

literal
	:
		lit:LITERAL^
	;

number
	:
		NUMBER^
	;

variable_reference
	:
		DOLLAR_SIGN^ IDENTIFIER
	;

// ----------------------------------------
//		Section 3.2
//			Function Calls
// ----------------------------------------

// .... production [16] ....
//
function_call
	:
		IDENTIFIER LEFT_PAREN^ ( arg_list )? RIGHT_PAREN!
	;

// .... production [16.1] ....
//
arg_list
	:
		argument 

		( COMMA argument )*
	;

// .... production [17] ....
//
argument
	:
		expr
	;

// ----------------------------------------
//		Section 3.3
//			Node-sets
// ----------------------------------------

// .... production [18] ....
//
union_expr
	:
		path_expr
		( 	PIPE! path_expr
		)*
	;

// .... production [19] ....
//

path_expr
	:
		// This is here to differentiate between the
		// special case of the first step being a NodeTypeTest
		// or just a normal filter-expr function call.

		// Is it a special nodeType 'function name'

		(IDENTIFIER LEFT_PAREN)=>{ 
			LT(1).getText().equals("processing-instruction")
				||
			LT(1).getText().equals("comment")
				||
			LT(1).getText().equals("text")
				||
			LT(1).getText().equals("node")
		}?

		location_path
		|	
		(IDENTIFIER LEFT_PAREN)=>
		filter_expr 
			(	absolute_location_path 
			)?
		|
		(DOT|DOT_DOT|SLASH|DOUBLE_SLASH|IDENTIFIER|AT)=>
		location_path		
		|	
		filter_expr 
			(	absolute_location_path 
			)?
	;

// .... production [20] ....
//
filter_expr
	:
		primary_expr 
		(	predicate 
		)*
	;


// ----------------------------------------
//		Section 3.4
//			Booleans
// ----------------------------------------

// .... production [21] ....
//
or_expr
	:
		and_expr (	KW_OR^				
						and_expr 
		)*
	;

// .... production [22] ....
//
and_expr
	:
		equality_expr (	KW_AND^ 			
							equality_expr )?
	;

// .... production [23] ....
//
equality_expr
	:
		relational_expr (	(	EQUALS^		
								|	NOT_EQUALS^
								)
								relational_expr
							)?
	;

// .... production [24] ....
//
relational_expr
	:
		additive_expr	(	(	LT^		
								|	GT^		
								|	LTE^	
								|	GTE^	
								)
								additive_expr
							)?
	;

// ----------------------------------------
//		Section 3.5
//			Numbers
// ----------------------------------------

// .... production [25] ....
//
additive_expr
	:
		mult_expr	(	(	PLUS^	
							|	MINUS^
							)
							mult_expr
						)?
	;

// .... production [26] ....
//
mult_expr
	:
		unary_expr	(	(	STAR^	
							|	DIV^	
							|	MOD^	
							)
							unary_expr
						)?
	;

// .... production [27] ....
//
unary_expr
	:
			union_expr
		|
			MINUS unary_expr
	;

class XPathLexer extends Lexer;
	options
	{
		charVocabulary='\3'..'\377';
		k = 3;
		importVocab=XPath;
	}

	tokens
	{
		KW_OR = "or";
		KW_AND = "and";
	}

WS
	:
		('\n' | ' ' | '\t' | '\r')+
		{
			$setType(Token.SKIP);
		}
	;

protected
DIGIT
	:
		('0'..'9')
	;

protected 
SINGLE_QUOTE_STRING
	:
		'\''! (~('\''))* '\''!
	;

protected
DOUBLE_QUOTE_STRING
	:
		'"'! (~('"'))* '"'!
	;

LITERAL
	:
		SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING
	;

NUMBER
	:
		(DIGIT)+ ('.' (DIGIT)+)?
	;

IDENTIFIER

	options
	{
		testLiterals=true;
	}

	: 	
		('\241'..'\377'|'a'..'z'|'A'..'Z'|'_') ('\241'..'\377'|'a'..'z'|'A'..'Z'|'-'|'_'|'0'..'9'|'.')*	
	;

LEFT_PAREN
	:	'('		;

RIGHT_PAREN	
	:	')'		;

LEFT_BRACKET
	:	'['		;

RIGHT_BRACKET	
	:	']'		;
	
PIPE
	:	'|'		;

DOT
	:	'.'		;

DOT_DOT
	:	".."	;

AT
	:	'@'		;

COMMA
	:	','		;

DOUBLE_COLON
	:	"::"	;

COLON
	:	":"		;

SLASH
	:	'/'		;

DOUBLE_SLASH
	:	'/' '/'	;

DOLLAR_SIGN
	:	'$'		;

PLUS
	:	'+'		;

MINUS
	:	'-'		;

EQUALS
	:	'='		;

NOT_EQUALS
	:	"!="	;

LT
	:	'<'		;

LTE
	:	"<="	;

GT
	:	'>'		;

GTE
	:	">="	;

STAR
	:	'*'		;
