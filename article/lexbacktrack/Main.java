import java.io.*;
import FormDataLexer;
import FormDataParser;
import java.util.Hashtable;

class Main {
	
	public static void main(String[] args) {
		Hashtable tags = null;
		String label=null;
		if ( args.length==0 ) {
			System.err.println("java Main \"index-enter-label\" < input-tag-file");
			System.exit(1);
		}
		else {
			label = args[0];
		}
		createTagTranslation(tags);
		try {
			FormDataLexer lexer =
			  new FormDataLexer(new DataInputStream(System.in));
			FormDataParser parser = new FormDataParser(lexer);
			parser.setBehavior(new BuildPageIndex(tags, label));
			parser.data();
		} catch(Exception e) {
			System.err.println("exception: "+e);
		}
	}
	
	public static void createTagTranslation(Hashtable tags) {
		// put in translation of tag names here.
		// tool will ignore anything not listed.
		/*
		tags = new Hashtable(40);
		tags.put("Company", "The Company");
		...
		*/
	}
}

