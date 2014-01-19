header {
package panorama.mdx;
	
import java.io.DataInputStream;
import antlr.CommonAST;
import antlr.*;
}

/**
 *  This is a parser definition for the MDX language as 
 *  described by Microsoft at http://msdn.microsoft.com
 *  It may be a start point for developing MDX parsers.
 *  This grammar was not well tested as I had only two 
 *  hours to write it. I expect great improvements in 
 *  this code of somebody.
 *
 *  Vitaly Shelest, vitalys@panorama.com
 */


class MDXRecognizer extends Parser;
options {
	k = 2;                          // two token lookahead
	exportVocab=Java;               // Call its vocabulary "Java"
	buildAST = true; 				// uses CommonAST by default
}

{
	public static void main(String[] args) {
        // Create a scanner that reads from the input stream passed to us
        panorama.mdx.MDXLexer lexer = new panorama.mdx.MDXLexer(new DataInputStream(System.in));
            
        // Create a parser that reads from the scanner
        panorama.mdx.MDXRecognizer parser = new panorama.mdx.MDXRecognizer(lexer);
            
        // start parsing at the compilationUnit rule
        try {
            parser.select_statement();
        }
        catch (RecognitionException e) {
            e.printStackTrace();
        }
        catch (TokenStreamException e) {
            e.printStackTrace();
        }
   		System.out.println("Success!!!");
	}
}


select_statement	: with_formula_specification_opt 
					  SELECT axis_specification_list_opt
					  FROM cube_specification
					  where_clause_opt
					  cell_props_opt SEMICOLON
					;
					
with_formula_specification_opt :
					| WITH formula_specification
					;

formula_specification :
					  (single_formula_specification)+
					;
					
single_formula_specification :
					  member_specification
					| set_specification
					;
					
set_specification	: SET set_name AS 
					  (
					  	( QUOTE expression QUOTE) 
					  	  | expression
					  	)					
					;
					
member_specification :
					  MEMBER member_name AS 
					  (
					  	( QUOTE value_expression QUOTE
					      comma_member_property_def_list_opt
					    )
			       	  | ( value_expression
					      comma_member_property_def_list_opt
					    )
					  )
					;				
										
comma_member_property_def_list_opt: COMMA member_property_def_list
					|
					;
										
axis_specification_list_opt : axis_specification_list
					| 
					;
					
axis_specification_list : axis_specification (COMMA axis_specification)* 
					;
					
member_property_def_list :
					  member_property_definition (COMMA member_property_definition)*
					;
					
member_name 		: compound_id
					;
					
member_property_definition :
					  identifier EQ value_expression
					;					
					
set_name 			: compound_id 
					;
					
compound_id 		: (identifier)=>(identifier (DOT identifier)*)
					| 
					;
					
axis_specification	: (non_empty_opt | ) expression (dim_props_opt |) ON axis_name					
					;
					
non_empty_opt		: NON EMPTY
					;
					
dim_props_opt		: dim_props
					;
					
axis_name 			: identifier
					;
					
dim_props			: dimension_opt PROPERTIES property_list
					;
					
dimension_opt		: DIMENSION
					|
					;
					
property_list		: property (COMMA property)*
					;
					
property			: compound_id
					;
					
cube_specification	: cube_name
					;

cube_name 			: compound_id 
					;

slicer_specification: expression
					;					
					
cell_props			: cell_opt PROPERTIES cell_property_list
					;
					
cell_opt			: CELL
					|
					;
					
cell_property_list	: cell_property (COMMA cell_property)*
					;
					
cell_property		: mandatory_cell_property
					/*| optional_cell_property*/
					| provider_specific_cell_property
					;
					
//optional_cell_property:         FORMAT_STRING
// 							  | FORE_COLOR
// 							  | BACK_COLOR
// 							  | FONT_NAME
// 							  | FONT_SIZE
// 							  | FONT_FLAGS
					
					
mandatory_cell_property: CELL_ORDINAL 
					| VALUE 
					| FORMATTED_VALUE
					;															
					
provider_specific_cell_property : identifier
					;					
					
where_clause_opt 	: WHERE slicer_specification
					|	
					;
					
cell_props_opt		: (cell_props | )
					;					
					
expression 			: value_expression (COLON value_expression)*
					;
					
value_expression 	: term5 
					  (
					  	  value_xor_expression 
					  	| 
					  	  value_or_expression
					  )*
					;
					
value_xor_expression: XOR term5
					;

value_or_expression	: OR term5
					;
					
term5 				: term4 
					  (
					  	AND term4
					  )*
					;
					
term4 				: NOT term4	
					| term3
					;
					
term3 				: term2 (comp_op term2)*
					;
					
term2 				: term ((CONCAT | PLUS | MINUS) term)*
					;
					
term 				: factor ((SOLIDUS | ASTERISK) factor)*
					;
					
factor 				: MINUS value_expression_primary
					| PLUS value_expression_primary 
					| value_expression_primary
					;
															
value_expression_primary: value_expression_primary0 
					( DOT 
					  (   unquoted_identifier 
						| quoted_identifier 
						| amp_quoted_identifier 
						| (identifier LPAREN exp_list_opt RPAREN)
					  )
					)* 
					;
										
value_expression_primary0: (identifier LPAREN exp_list_opt RPAREN)
					| (LPAREN exp_list RPAREN)
					| (LBRACE exp_list_opt RBRACE)
					| case_expression
					| STRING
					| NUMBER
					| identifier
					;
									
exp_list_opt 		: exp_list
					|	
					;
exp_list 			: expression (COMMA expression)*
					;
									
																											
case_expression 	: CASE value_expression_opt
					  when_list
					  else_clause_opt
					  END
					;
															
value_expression_opt: value_expression
					|	
					;
					
when_list 			: when_clause (when_clause)*
					|
					;
					
when_clause 		: WHEN value_expression THEN value_expression
					;
					
else_clause_opt 	: ((ELSE value_expression) | )
					;
					
comp_op 			: EQ
					| NE
					| LT
					| GT
					| LE
					| GE
					;
					
identifier 			: unquoted_identifier
    				| quoted_identifier
					;
					
unquoted_identifier : keyword
					| ID
					;
					
amp_quoted_identifier: AMP_QUOTED_ID
					;
					
quoted_identifier 	: QUOTED_ID
					;
					
keyword 			: DIMENSION
					| PROPERTIES
					;
					
// MDX Lexical Rules					

class MDXLexer extends Lexer;
options {
	exportVocab=Java;      
	testLiterals=false;    
	k = 2;
	charVocabulary='\u0001'..'\uFFFF';
	codeGenBitsetTestThreshold=20;
	caseSensitiveLiterals=false;
}
tokens {
// Keywords
	AND 			= "AND";
	AS 				= "AS";
	CASE 			= "CASE";
	CELL 			= "CELL";
	CELL_ORDINAL 	= "CELL_ORDINAL";
	DIMENSION 		= "DIMENSION";
	ELSE 			= "ELSE";
	EMPTY 			= "EMPTY";
	END 			= "END";
	FORMATTED_VALUE = "FORMATTED_VALUE";
	FROM 			= "FROM";
	MEMBER 			= "MEMBER";
	NON 			= "NON";
	NOT 			= "NOT";
	ON 				= "ON";
	OR 				= "OR";
	PROPERTIES 		= "PROPERTIES";
	SELECT 			= "SELECT";
	SET 			= "SET";
	THEN 			= "THEN";
	VALUE 			= "VALUE";
	WHEN 			= "WHEN";
	WHERE 			= "WHERE";
	XOR 			= "XOR";
	WITH 			= "WITH";
	
// Symbols
	QUOTE 		= "'";
	ASTERISK 	= "*";
	COLON 		= ":";
	SEMICOLON 	= ";";
	COMMA 		= ",";
	CONCAT 		= "||";
	DOT 		= ".";
	EQ 			= "=";
	GE 			= ">=";
	GT 			= ">";
	LBRACE 		= "{";
	LE 			= "<=";
	LPAREN 		= "(";
	LT 			= "<";
	MINUS 		= "-";
	NE 			= "<>";
	PLUS 		= "+";
	RBRACE 		= "}";
	RPAREN 		= ")";
	SOLIDUS 	= "/";
	
}

// Typed
QUOTE 		: "'";
ASTERISK 	: '*';
COLON 		: ':';
SEMICOLON 	: ';';
COMMA 		: ',';
CONCAT 		: "||";
DOT 		: '.';
EQ 			: '=';
GE 			: ">=";
GT 			: '>';
LBRACE 		: '{';
LE 			: "<=";
LPAREN 		: '(';
LT 			: '<';
MINUS 		: '-';
NE 			: "<>";
PLUS 		: '+';
RBRACE 		: '}';
RPAREN 		: ')';
SOLIDUS 	: '/';


NUMBER  : ('0'..'9')+
		;
ID		options {testLiterals=true;}
		:  ('a'..'z'|'A'..'Z'|'_'|'$') ('a'..'z'|'A'..'Z'|'_'|'0'..'9'|'$')*
		;
AMP_QUOTED_ID: "[&" ID (WS ID)* ']'
		;
QUOTED_ID: ('[' ID (WS ID)* ']') | '[' NUMBER ']'
		;
STRING  : '"' (~'"')* '"'
		| '\'' (~'\'')* '\''
		;
		
WS	:	(	' '
		|	'\t'
		|	'\f'
			// handle newlines
		|	(	options {generateAmbigWarnings=false;}
			:	"\r\n"  // Evil DOS
			|	'\r'    // Macintosh
			|	'\n'    // Unix (the right way)
			)
			{ newline(); }
		)+
		{ _ttype = Token.SKIP; }
	;
		
