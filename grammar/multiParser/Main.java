import java.io.*;
import SimpleLexer;
import SimpleParser;
import antlr.TokenBuffer;

public class Main {
	public static void main(String[] args) {
		try {
			SimpleLexer lexer = new SimpleLexer(new DataInputStream(System.in));
			TokenBuffer buffer = new TokenBuffer(lexer);

			/* Invoke first parser */
			System.out.println("first parser");
			SimpleParser parser = new SimpleParser(buffer);
			parser.simple();

			/* When first parser runs out, invoke secnond parser */
			System.out.println("second parser");
			SimpleParser2 parser2 = new SimpleParser2(buffer);
			parser2.simple();

		} catch(Exception e) {
			System.err.println("exception: "+e);
		}
	}
}

