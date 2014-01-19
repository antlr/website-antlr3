import java.io.*;

class GenHdr {
	public static void main(String[] args) {
		try {
			TinyCLexer lexer = null;
			if ( args.length>0 ) {
				lexer = new TinyCLexer(new BufferedReader(new FileReader(args[0])));
			}
			else {
				lexer = new TinyCLexer(new DataInputStream(System.in));
			}
			lexer.setTokenObjectClass("TokenWithIndex");
			TokenStreamRewriteEngine rewriteEngine =
					new TokenStreamRewriteEngine(lexer);
			rewriteEngine.discard(TinyCLexer.WS);
			TinyCParser parser = new TinyCParser(rewriteEngine);
			parser.program();
			System.out.print(rewriteEngine.toString());
		} catch(Exception e) {
			System.err.println("exception: "+e);
		}
	}
}
