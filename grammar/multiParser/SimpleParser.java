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

import java.io.*;

public class SimpleParser extends antlr.LLkParserNoInteractive implements SimpleTokenTypes {
public SimpleParser(TokenBuffer tokenBuf) {
super(tokenBuf,2);
tokenNames = _tokenNames;
}

public SimpleParser(Tokenizer lexer) {
super(lexer,2);
tokenNames = _tokenNames;
}
	public final void simple() throws ParserException {
		
		
		try {      // for error handling
			{
			int _cnt=0;
			_loop:
			do {
				if ((la_1==A)) {
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
			if (guessing==0) {
				reportError(ex);
				consume();
				consumeUntil(_tokenSet_0);
			} else {
				throw ex;
			}
		}
	}

	public final void x() throws ParserException {
		
		
		try {      // for error handling
			boolean synPredMatched6 = false;
			if (((la_1==A) && (la_2==B))) {
				int _m6 = mark();
				synPredMatched6 = true;
				guessing++;
				try {
					{
					a();
					}
				}
				catch (ParserException pe) {
					synPredMatched6 = false;
				}
				rewind(_m6);
				guessing--;
			}
			if ( synPredMatched6 ) {
				a();
			}
			else if ((la_1==A) && (la_2==B)) {
				b();
			}
			else {
				throw new NoViableAltException(LT(1));
			}
			
		}
		catch (ParserException ex) {
			if (guessing==0) {
				reportError(ex);
				consume();
				consumeUntil(_tokenSet_1);
			} else {
				throw ex;
			}
		}
	}

	public final void a() throws ParserException {
		
		
		try {      // for error handling
			match(A);
			match(B);
			match(C);
		}
		catch (ParserException ex) {
			if (guessing==0) {
				reportError(ex);
				consume();
				consumeUntil(_tokenSet_1);
			} else {
				throw ex;
			}
		}
	}

	public final void b() throws ParserException {
		
		
		try {      // for error handling
			match(A);
			match(B);
			match(D);
		}
		catch (ParserException ex) {
			if (guessing==0) {
				reportError(ex);
				consume();
				consumeUntil(_tokenSet_1);
			} else {
				throw ex;
			}
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
	private static final long _tokenSet_1_data_[] = { 18L, 0L };
	public static final BitSet _tokenSet_1 = new BitSet(_tokenSet_1_data_);
	
}
