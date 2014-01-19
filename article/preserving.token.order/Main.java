
import java.io.DataInputStream;

public class Main {
	public static void main(String[] args) throws Exception {
		CalcLexer lexer = new CalcLexer(new DataInputStream(System.in));
		lexer.setTokenObjectClass("TokenWithIndex");
		TokenStreamTracker tracker = new TokenStreamTracker(lexer);
		tracker.discard(CalcLexer.WS);
		CalcParser parser = new CalcParser(tracker);
		parser.setASTFactory(new TrackerASTFactory());
		parser.setASTNodeClass("ASTMinMax");
		parser.prog();
		System.out.println("Tree: "+parser.getAST().toStringList());

		System.out.println("\nWhole token stream:\n"+tracker.toDebugString());
		System.out.println("\nOriginal text:\n-----\n"+tracker+"-----");

		CalcTreeWalker walker = new CalcTreeWalker(tracker);
		System.out.println("Walking tree, showing tokens for various subtrees");
		walker.prog(parser.getAST());
	}
}
