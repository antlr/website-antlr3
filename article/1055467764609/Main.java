import java.io.*;

class Main {
	public static void main(String[] args) {
		try {
			L lexer = new L(new DataInputStream(System.in));
			P parser = new P(lexer);
			parser.startRule();
		} catch(Exception e) {
			System.err.println("exception: "+e);
		}
	}
}

