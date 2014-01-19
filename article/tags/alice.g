header {
	package alice.io;
}

class AliceParser extends Parser;
tokens {
	O_ALICE ="<alice>",
	O_CATEGORY="<category>",
	O_PATTERN="<pattern>",
	O_THAT	="<that>",
	O_TEMPLATE="<template>",
	C_ALICE ="</alice>",
	C_CATEGORY="</category>",
	C_PATTERN="</pattern>",
	C_THAT	="</that>",
	C_TEMPLATE="</template>"
}

{
	protected String patternText;
	protected String thatPatternText;
	protected String templateText;

	protected AliceReaderListener behavior = null;

	public void addListener(AliceReaderListener parasite) {
		behavior = parasite;
	}
}

categories
	:	O_ALICE (TEXT)?
		(
			{patternText=thatPatternText=templateText=null;}
			category
		)+
		C_ALICE
	;

category
	:	O_CATEGORY (TEXT)?
		pattern
		(thatPattern)?
		template
		C_CATEGORY (TEXT)?
		{behavior.newCategory(patternText,thatPatternText,templateText);}
	;

pattern
	:	O_PATTERN
		patternText=stuff
		C_PATTERN (TEXT)?
	;

thatPattern
	:	O_THAT
		thatPatternText=stuff
		C_THAT (TEXT)?
	;

template
	:	O_TEMPLATE
		templateText=stuff
		C_TEMPLATE (TEXT)?
	;

stuff returns [String junk]
{
	StringBuffer buf=new StringBuffer();
	junk = "";
}
	:	(	tag:TAG	{buf.append(tag.getText());}
		|	t:TEXT	{buf.append(t.getText());}
		)*
		{junk = buf.toString();}
	;

class AliceLexer extends Lexer;
options {	
	charVocabulary = '\3'..'\377';
}

TAG
	:	'<' (~'>')* '>'
//		{System.out.println("tag: "+$getText);}
	;

TEXT
	:	(
			/* Language for combining any flavor
			 * newline is ambiguous.  Shutting off the warning.
			 * '\r' '\n' can be matched in one alternative or by matching
			 * '\r' in one iteration and '\n' in another.
			 */
			options {
				generateAmbigWarnings=false;
			}
		:	'\r' '\n'		{newline();}
		|	'\r'			{newline();}
		|	'\n'			{newline();}
		|	~('<'|'\n'|'\r')
		)+
	;

/*
protected
TEXTCHAR
	:	'\r' '\n'		{newline();}
	|	'\r'			{newline();}
	|	'\n'			{newline();}
	|	~('<'|'\n'|'\r')
	;
*/

