//**************************************************
// * VRML 2.0 Parser
// * Copyright (C) 1996 Silicon Graphics, Inc.
// *
// * Author(s)	: Gavin Bell
// *                Daniel Woods (first port)
// **************************************************
// */

//header {
//}

options {
	language="Cpp";
}

/*****************************************************************************
 * The VRML Parser
 *****************************************************************************
 */
class VRMLParser extends Parser;
options {
	k = 4;							// two token lookahead
	tokenVocabulary=VRML;			// Call its vocabulary "VRML"
}

/* General */
vrmlFile:
		Header
		vrmlScene
	;

vrmlScene:
		statements
	;

statements:
		(statement)*
	;

statement:
		nodeStatement
	|	protoStatement
	|	routeStatement
	;

nodeStatement:
		node
	|	DEF nodeNameId node
	|	USE nodeNameId
	;

rootNodeStatement:
		node
	|	DEF nodeNameId node
	;

protoStatement:
		proto
	|	externproto
	;

protoStatements:
		(protoStatement)*
	;

proto:
		PROTO nodeTypeId
			OPEN_BRACKET interfaceDeclarations CLOSE_BRACKET
			OPEN_BRACE protoBody CLOSE_BRACE
	;

protoBody:
		protoStatements rootNodeStatement statements
	;

interfaceDeclarations:
		(interfaceDeclaration)*
	;

restrictedInterfaceDeclaration:
		eventIn fieldType eventInId
	|	eventOut fieldType eventOutId
	|	field fieldType fieldId fieldValue
	;

interfaceDeclaration:
		restrictedInterfaceDeclaration
	|	exposedField fieldType fieldId fieldValue
	;

externproto:
		EXTERNPROTO nodeTypeId OPEN_BRACKET externInterfaceDeclarations CLOSE_BRACKET urlList
	;

externInterfaceDeclarations:
		(externInterfaceDeclaration)*
	;

externInterfaceDeclaration:
		eventIn fieldType eventInId
	|	eventOut fieldType eventOutId
	|	field fieldType fieldId
	|	exposedField fieldType fieldId
	;

routeStatement:
		ROUTE nodeNameId PERIOD eventOutId TO nodeNameId PERIOD eventInId
	;

urlList:
		mfstringValue
	;

/* Nodes */
node:
		nodeTypeId OPEN_BRACE nodeBody CLOSE_BRACE
	|	Script OPEN_BRACE scriptBody CLOSE_BRACE
	;

nodeBody:
		(nodeBodyElement)*
	;

scriptBody:
		(scriptBodyElement)*
	;

scriptBodyElement:
		nodeBodyElement
	|	restrictedInterfaceDeclaration
	|	eventIn fieldType eventInId IS eventInId
	|	eventOut fieldType eventOutId IS eventOutId
	|	field fieldType fieldId IS fieldId
	;

nodeBodyElement:
		fieldId fieldValue
	|	fieldId IS fieldId
	|	eventInId IS eventInId
	|	eventOutId IS eventOutId
	|	routeStatement
	|	protoStatement
	;

nodeNameId:
		id
	;

nodeTypeId:
		id
	;

fieldId:
		id
	;

eventInId:
		id
	;

eventOutId:
		id
	;

id:
		IdFirstChar (IdRestChars)?
	;

fieldValue:
		sfboolValue
	|	sfcolorValue
	|	sffloatValue
	|	sfimageValue
	|	sfint32Value
	|	sfnodeValue
	|	sfrotationValue
	|	sfstringValue
	|	sftimeValue
	|	sfvec2fValue
	|	sfvec3fValue
	|	mfcolorValue
	|	mffloatValue
	|	mfint32Value
	|	mfnodeValue
	|	mfrotationValue
	|	mfstringValue
	|	mftimeValue
	|	mfvec2fValue
	|	mfvec3fValue
	;

sfcolorValue:
		float float float
	;

sffloatValue:
		float
	;

sfimageValue:
		int32 int32 int32 (int32)*
	;

sfint32Value:
	    int32
	;

sfnodeValue:
		nodeStatement
	|	SFN_NULL
	;

sfrotationValue:
		float float float float
	;

sfstringValue:
		string
	;

sftimeValue:
		double
	;

mftimeValue:
		sftimeValue
	|	OPEN_BRACKET CLOSE_BRACKET
	|	OPEN_BRACKET sftimeValues CLOSE_BRACKET
	;

sftimeValues:
		(sftimeValue)+
	;

sfvec2fValue:
		float float
	;

sfvec3fValue:
		float float float
	;

mfcolorValue:
		sfcolorValue
	|	OPEN_BRACKET CLOSE_BRACKET
	|	OPEN_BRACKET sfcolorValues CLOSE_BRACKET
	;

sfcolorValues:
		(sfcolorValue)+
	;

mffloatValue:
		sffloatValue
	|	OPEN_BRACKET CLOSE_BRACKET
	|	OPEN_BRACKET sffloatValues CLOSE_BRACKET
	;

sffloatValues:
		(sffloatValue)+
	;

mfint32Value:
		sfint32Value
	|	OPEN_BRACKET CLOSE_BRACKET
	|	OPEN_BRACKET sfint32Values CLOSE_BRACKET
	;

sfint32Values:
		(sfint32Value)+
	;

mfnodeValue:
		nodeStatement
	|	OPEN_BRACKET CLOSE_BRACKET
	|	OPEN_BRACKET nodeStatements CLOSE_BRACKET
	;

nodeStatements:
		(nodeStatement)+
	;

mfrotationValue:
		sfrotationValue
	|	OPEN_BRACKET CLOSE_BRACKET
	|	OPEN_BRACKET sfrotationValues CLOSE_BRACKET
	;

sfrotationValues:
		(sfrotationValue)+
	;

mfstringValue:
		sfstringValue
	|	OPEN_BRACKET CLOSE_BRACKET
	|	OPEN_BRACKET sfstringValues CLOSE_BRACKET
	;

sfstringValues:
		(sfstringValue)+
	;

mfvec2fValue:
		sfvec2fValue
	|	OPEN_BRACKET CLOSE_BRACKET
	|	OPEN_BRACKET sfvec2fValues CLOSE_BRACKET
	;

sfvec2fValues:
		(sfvec2fValue)+
	;

mfvec3fValue:
		sfvec3fValue
	|	OPEN_BRACKET CLOSE_BRACKET
	|	OPEN_BRACKET sfvec3fValues CLOSE_BRACKET
	;

sfvec3fValues:
		(sfvec3fValue)+
	;

/************************************************************************************
 * The VRML Lexer
 ************************************************************************************
 */
class VRMLLexer extends Lexer;
options {
	tokenVocabulary=VRML;	// call the vocabulary "VRML"
	//k = 10;					// four characters of lookahead
}

	/* keywords */
DEF:			"DEF";
EXTERNPROTO:	"EXTERNPROTO";
BOOL_TRUE:		"TRUE";
BOOL_FALSE:		"FALSE";
IS:				"IS";
SFN_NULL:		"NULL";
PROTO:			"PROTO";
ROUTE:			"ROUTE";
TO:				"TO";
USE:			"USE";
EventIn:		"eventIn";
EventOut:		"eventOut";
ExposedField:	"exposedField";
Field:			"field";

	/* Terminal Symbols */
PERIOD:			'.';
OPEN_BRACE:		'{';
CLOSE_BRACE:	'}';
OPEN_BRACKET:	'[';
CLOSE_BRACKET:	']';


	/* Any ISO-10646 character encoded using UTF-8 except: 0x30-0x39, 0x0-0x20,		*/
	/* 0x22, 0x23, 0x27, 0x2b, 0x2c, 0x2d, 0x2e, 0x5b, 0x5c, 0x5d, 0x7b, 0x7d, 0x7f */
IdFirstChar:
	(~('\60'..'\71' | '\00'..'\40' | '\42' | '\43' | '\47' | '\53'..'\56'
		| '\133'..'\135' | '\173' | '\175' | '\177'));

	/* Any number of ISO-10646 characters except: 0x0-0x20, 0x22, 0x23, 0x27,	*/
	/* 0x2c, 0x2e, 0x5b, 0x5c, 0x5d, 0x7b,	0x7d, 0x7f							*/
IdRestChars:
	(~('\00'..'\40' | '\42' | '\43' | '\47' | '\54' | '\56' | '\133'..'\135'
		| '\173' | '\175'));

fieldType:
		"MFColor"
	|	"MFFloat"
	|	"MFInt32"
	|	"MFNode"
	|	"MFRotation"
	|	"MFString"
	|	"MFTime"
	|	"MFVec2f"
	|	"MFVec3f"
	|	"SFBool"
	|	"SFColor"
	|	"SFFloat"
	|	"SFImage"
	|	"SFInt32"
	|	"SFNode"
	|	"SFRotation"
	|	"SFString"
	|	"SFTime"
	|	"SFVec2f"
	|	"SFVec3f"
	;

sfboolValue:
		"TRUE"
	|	"FALSE"
	;

int32:
		(('+'|'-')? ((('0'..'9')+) | ('0' ('x'|'X') ('0'..'9' | 'a'..'f' | 'A'..'F')+)))
	;

float:
		(('+'|'-')? (((('0'..'9')+ ('.')?) | (('0'..'9')* '.' ('0'..'9')+))
		(('e'|'E') ('+'|'-')? ('0'..'9')+)?))
	;

double:
		(('+'|'-')? (((('0'..'9')+ ('.')?) | (('0'..'9')* '.' ('0'..'9')+))
		(('e'|'E')('+'|'-')? ('0'..'9')+)?))
	;

	/* ".*" ... double-quotes must be \", backslashes must be \\... */
string:
		'"' (ESC | ~('"'|'\\'))* '"'
	;

ESC:
		'\\' ('\\' | '"')
	;

HEADER:		"#VRML V2.0 utf8" (~'\n')* '\n';

COMMENT:	'#' (~'\n')* '\n';

WS_:
		( ' '
		| '\t'
		| '\f'
		| ','
		// handle newlines
		|	( "\r\n"	// Evil DOS
			| '\r'		// Macintosh
			| '\n'		// Unix (the right way)
			)
		)+
	;
