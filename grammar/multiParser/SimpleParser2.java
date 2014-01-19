/*
 * ANTLR-generated file resulting from grammar simple.g
 * 
 * Terence Parr, MageLang Institute
 * with John Lilley, Empathy Software
 * ANTLR Version 2.20b3; 1996,1997
 */

/* empty header */

import antlr.Tokenizer;
import antlr.TokenBuffer;
import antlr.LLkParserNoInteractive;
import antlr.Token;
import antlr.ParserException;
import antlr.NoViableAltException;
import antlr.MismatchedTokenException;
import antlr.SemanticException;
import antlr.collections.impl.BitSet;
public class SimpleParser2 extends antlr.LLkParserNoInteractive implements SimpleTokenTypes {
public SimpleParser2(TokenBuffer tokenBuf) {
super(tokenBuf,3);
tokenNames = _tokenNames;
}

public SimpleParser2(Tokenizer lexer) {
super(lexer,3);
tokenNames = _tokenNames;
}
	public final void simple() throws ParserException {
		
		
		try {      // for error handling
			{
			int _cnt=0;
			_loop:
			do {
				if ((la_1==C||la_1==D)) {
					x();
				}
				else {
					if ( _cnt>=1 ) { break _loop; } else {throw new NoViableAltException(LT(1));}
				}
				
				_cnt++;
			} while (true);
			}
		}
		catch (ParserException ex) {
			reportError(ex);
			consume();
			consumeUntil(_tokenSet_0);
		}
	}

	public final void x() throws ParserException {
		
		
		try {      // for error handling
			switch ( la_1) {
			case C:
			{
				a();
				break;
			}
			case D:
			{
				b();
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1));
			}
			}
		}
		catch (ParserException ex) {
			reportError(ex);
			consume();
			consumeUntil(_tokenSet_1);
		}
	}

	public final void a() throws ParserException {
		
		
		try {      // for error handling
			match(C);
			match(B);
			match(A);
		}
		catch (ParserException ex) {
			reportError(ex);
			consume();
			consumeUntil(_tokenSet_1);
		}
	}

	public final void b() throws ParserException {
		
		
		try {      // for error handling
			match(D);
			match(B);
			match(A);
		}
		catch (ParserException ex) {
			reportError(ex);
			consume();
			consumeUntil(_tokenSet_1);
		}
	}

	
	public static final String[] _tokenNames = {
		"0",
		"EOF",
		"<epsilon>",
		"NULL_TREE_LOOKAHEAD",
		"A",
		"B",
		"C",
		"D",
		"WS"
	};
	
	private static final long _tokenSet_0_data_[] = { 2L, 0L };
	public static final BitSet _tokenSet_0 = new BitSet(_tokenSet_0_data_);
	private static final long _tokenSet_1_data_[] = { 194L, 0L };
	public static final BitSet _tokenSet_1 = new BitSet(_tokenSet_1_data_);
	
}
