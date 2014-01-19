{
import java.io.*;
}

class HTMLIndexer extends Parser;
{
	PrintStream output;
	String prefix = ".";
	PrintStream indexOutput = System.out;
	String fileName;
	String bookmarkPrefix = "_bb";

	public void setOutputStream(PrintStream o) {
		output = o;
	}

	public void setFilePrefix(String p) {
		prefix = p;
	}

	public void setFileName(String f) {
		fileName = f;
	}

	public void printIndexEntry(int oldlevel, int level, int bookmark, String section) {
	}
}

document
{
	String section="";
	String indexSection="";
	int n=1;	// bookmark number for <a> tag
	int level=0, oldlevel = -1;
}
	:	(	{section=""; indexSection="";}
			h:HEADER
			(	sec:OTHER
				{
				section += sec.getText();
				indexSection += sec.getText();
				}

				// for index, ignore any existing anchor
				// for output, don't duplicate our generated anchor
			|	a:ANCHOR
				{
				boolean ignoreAnchor=false;
				if ( !a.getText().startsWith("<a name=\""+bookmarkPrefix) ) {
					section += a.getText();
					ignoreAnchor=true;
				}
				}
				(	oo:OTHER
					{
					section += oo.getText();
					indexSection += oo.getText();
					}
				)*
				a_:ANCHOR_
				{if ( !ignoreAnchor ) section += a_.getText();}

				// catch </a> from <a href...> tags
			|	ANCHOR_
				{
				reportError("<a href=...> nested in header tag");
				}

			|	// error condition
				HEADER
				{
				reportError("mismatched or nested header tag");
				}
			)+
			h_:HEADER_

			{
				// write modified header back out to file
				output.print(
					h.getText()+
					"<a name=\""+bookmarkPrefix+n+"\">"+
					section+
					"</a>"+
					h_.getText());

				level = h.getText().charAt(2)-'1';

				if ( level<oldlevel ) {
					// close off old list
					indexOutput.println("</ul>");
				}

				// add index entry
				if ( level>oldlevel ) {
					// make new <ul>
					indexOutput.println("<ul>");
				}

				indexOutput.println(
					"<li>"+
					"<a href=\""+
						prefix+"/"+fileName+"#"+bookmarkPrefix+n+
					"\">"+
					indexSection+
					"</a>"+
					"</li>");

				oldlevel = level;
				n++;
			}

		|	o:OTHER			{output.print(o.getText());}
		|	a1:ANCHOR		{output.print(a1.getText());}
		|	a1_:ANCHOR_		{output.print(a1_.getText());}
		)*

		{
		// close off index lists
		for ( ; level>=0; level-- ) {
			indexOutput.println("</ul>");
		}
		}
	;

class HTMLHeaderGrabber extends Lexer;
options {
	k=4;
	charVocabulary = '\3'..'\377';
	caseSensitive=false;
}

HEADER
	:		'<' 'h' '1'..'5' TAG_GUTS '>'
	|	'<' '/' 'h' '1'..'5' '>'		{$setType(HEADER_);}
	|	'<' 'a' WS
		(	"name"						{$setType(ANCHOR);}
		|	"href"						{$setType(OTHER);}
		)
		(~'>')+ '>'
	|	'<' '/' 'a' '>'					{$setType(ANCHOR_);}
	|	'<' TAG_GUTS '>'				{$setType(OTHER);}
	;

protected
TAG_GUTS
	:	(	'\n'{newline();}
		|	~('>'|'\n')
		)*
	;

OTHER
	:	(	'\n'	{newline();}
		|	~('<'|'\n')
		)+
	;

protected
WS	:	(	' '
		|	'\t'
		|	'\r'
		|	'\n'		{newline();}
		)+
	;