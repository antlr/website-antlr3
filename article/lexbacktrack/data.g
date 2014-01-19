class FormDataParser extends Parser;

{
	FormDataBehavior behavior = null;

	public void setBehavior(FormDataBehavior b) {
		behavior = b;
	}
}

data
{
	String s;
	behavior.enter();
}
	:	(	t:TAG s=string
			{behavior.dataPair(t.getText(), s);}
		)+
		{behavior.exit();}
	;

string returns [String s]
{
	s=null;
	StringBuffer sbuf = new StringBuffer();
}
	:	(	c:CHAR
			{sbuf.append(c.getText());}
		)+
		{s=sbuf.toString();}
	;

class FormDataLexer extends Lexer;
options {
	charVocabulary='\3'..'\377';
}

// grab a tag for single character.
// note the use of '!' to discard the '=' from the tag text
FORMTOKEN
	:	( TAG '=' ) => TAG '='!		{$setType(TAG);}
	|	(	'\n'		{newline();}
		|	'\r' '\n'	{newline();}
		|	.
		)
		{$setType(CHAR);}
	;

protected
TAG	:	('a'..'z'|'A'..'Z'|'0'..'9')+
	;
