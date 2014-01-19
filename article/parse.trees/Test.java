import java.io.*;

class Test {
	public static void main(String[] args) {
		try {
			TinyCLexer lexer = new TinyCLexer(new DataInputStream(System.in));
			TinyCParser parser = new TinyCParser(lexer);
			parser.program();

			ParseTree tree = parser.getParseTree();
			System.out.println("parse tree: "+tree.toStringTree());
			/*
			System.out.println("derivation steps: "+parser.getNumberOfDerivationSteps());
			System.out.println("derivation step 0: "+tree.getLeftmostDerivationStep(0));
			System.out.println("derivation step 1: "+tree.getLeftmostDerivationStep(1));
			System.out.println("derivation step 2: "+tree.getLeftmostDerivationStep(2));
			System.out.println("derivation step 3: "+tree.getLeftmostDerivationStep(3));
			*/
			int nSteps = parser.getNumberOfDerivationSteps();
			System.out.println("derivation:\n"+
							   tree.getLeftmostDerivation(nSteps));

		} catch(Exception e) {
			System.err.println("exception: "+e);
		}
	}
}
