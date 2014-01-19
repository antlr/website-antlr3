// $ANTLR 2.7.3-20030430: "tinyc.g" -> "TinyCParser.java"$

	import java.util.*;

import antlr.TokenBuffer;
import antlr.TokenStreamException;
import antlr.TokenStreamIOException;
import antlr.ANTLRException;
import antlr.LLkParser;
import antlr.Token;
import antlr.TokenStream;
import antlr.RecognitionException;
import antlr.NoViableAltException;
import antlr.MismatchedTokenException;
import antlr.SemanticException;
import antlr.ParserSharedInputState;
import antlr.collections.impl.BitSet;

public class TinyCParser extends antlr.LLkParser       implements TinyCParserTokenTypes
 {

TokenStreamRewriteEngine engine;

public TinyCParser(TokenStreamRewriteEngine lexer) {
  this(lexer,1);
  engine = lexer;
}

protected TinyCParser(TokenBuffer tokenBuf, int k) {
  super(tokenBuf,k);
  tokenNames = _tokenNames;
}

public TinyCParser(TokenBuffer tokenBuf) {
  this(tokenBuf,1);
}

protected TinyCParser(TokenStream lexer, int k) {
  super(lexer,k);
  tokenNames = _tokenNames;
}

public TinyCParser(TokenStream lexer) {
  this(lexer,1);
}

public TinyCParser(ParserSharedInputState state) {
  super(state,1);
  tokenNames = _tokenNames;
}

	public final void program() throws RecognitionException, TokenStreamException {
		
		
		try {      // for error handling
			{
			_loop3:
			do {
				if ((LA(1)==ID||LA(1)==LITERAL_int||LA(1)==LITERAL_char)) {
					declaration();
				}
				else {
					break _loop3;
				}
				
			} while (true);
			}
			match(Token.EOF_TYPE);
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				consume();
				consumeUntil(_tokenSet_0);
			} else {
			  throw ex;
			}
		}
	}
	
	public final void declaration() throws RecognitionException, TokenStreamException {
		
		
		try {      // for error handling
			boolean synPredMatched6 = false;
			if (((LA(1)==ID||LA(1)==LITERAL_int||LA(1)==LITERAL_char))) {
				int _m6 = mark();
				synPredMatched6 = true;
				inputState.guessing++;
				try {
					{
					globalVariable();
					}
				}
				catch (RecognitionException pe) {
					synPredMatched6 = false;
				}
				rewind(_m6);
				inputState.guessing--;
			}
			if ( synPredMatched6 ) {
				globalVariable();
			}
			else if ((LA(1)==ID||LA(1)==LITERAL_int||LA(1)==LITERAL_char)) {
				function();
			}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				consume();
				consumeUntil(_tokenSet_1);
			} else {
			  throw ex;
			}
		}
	}
	
/** Convert "int foo;" into "extern int foo;" */
	public final void globalVariable() throws RecognitionException, TokenStreamException {
		
		
		try {      // for error handling
			if ( inputState.guessing==0 ) {
				engine.insertBefore(LT(1),"extern ");
			}
			variable();
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				consume();
				consumeUntil(_tokenSet_1);
			} else {
			  throw ex;
			}
		}
	}
	
/** Convert "int foo() {...}" into "extern int foo();" */
	public final void function() throws RecognitionException, TokenStreamException {
		
		Token  id = null;
		
		int rcurly=0;
		
		
		try {      // for error handling
			if ( inputState.guessing==0 ) {
				engine.insertBefore(LT(1),"extern ");
			}
			type();
			id = LT(1);
			match(ID);
			match(LPAREN);
			{
			switch ( LA(1)) {
			case ID:
			case LITERAL_int:
			case LITERAL_char:
			{
				formalParameter();
				{
				_loop13:
				do {
					if ((LA(1)==COMMA)) {
						match(COMMA);
						formalParameter();
					}
					else {
						break _loop13;
					}
					
				} while (true);
				}
				break;
			}
			case RPAREN:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			match(RPAREN);
			block(true);
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				consume();
				consumeUntil(_tokenSet_1);
			} else {
			  throw ex;
			}
		}
	}
	
	public final void declarator() throws RecognitionException, TokenStreamException {
		
		Token  id = null;
		Token  id2 = null;
		
		try {      // for error handling
			switch ( LA(1)) {
			case ID:
			{
				id = LT(1);
				match(ID);
				break;
			}
			case STAR:
			{
				match(STAR);
				id2 = LT(1);
				match(ID);
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				consume();
				consumeUntil(_tokenSet_2);
			} else {
			  throw ex;
			}
		}
	}
	
	public final void variable() throws RecognitionException, TokenStreamException {
		
		
		try {      // for error handling
			type();
			declarator();
			match(SEMI);
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				consume();
				consumeUntil(_tokenSet_3);
			} else {
			  throw ex;
			}
		}
	}
	
	public final void type() throws RecognitionException, TokenStreamException {
		
		
		try {      // for error handling
			switch ( LA(1)) {
			case LITERAL_int:
			{
				match(LITERAL_int);
				break;
			}
			case LITERAL_char:
			{
				match(LITERAL_char);
				break;
			}
			case ID:
			{
				match(ID);
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				consume();
				consumeUntil(_tokenSet_4);
			} else {
			  throw ex;
			}
		}
	}
	
	public final void formalParameter() throws RecognitionException, TokenStreamException {
		
		
		try {      // for error handling
			type();
			declarator();
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				consume();
				consumeUntil(_tokenSet_5);
			} else {
			  throw ex;
			}
		}
	}
	
	public final void block(
		boolean functionLevel
	) throws RecognitionException, TokenStreamException {
		
		Token  a = null;
		Token  b = null;
		
		try {      // for error handling
			a = LT(1);
			match(LCURLY);
			{
			_loop18:
			do {
				if ((_tokenSet_6.member(LA(1)))) {
					statement();
				}
				else {
					break _loop18;
				}
				
			} while (true);
			}
			b = LT(1);
			match(RCURLY);
			if ( inputState.guessing==0 ) {
				
				if ( functionLevel ) {
				int prevTokenIndex = ((TokenWithIndex)a).getIndex()-1;
				TokenWithIndex prevToken = engine.getToken(prevTokenIndex);
				if ( prevToken.getType()==RPAREN ) {
				engine.replace(a,b,";");
				}
				else {
				engine.replace(prevToken,b,";"); // replace whitespace too
				}
				}
				
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				consume();
				consumeUntil(_tokenSet_3);
			} else {
			  throw ex;
			}
		}
	}
	
	public final void statement() throws RecognitionException, TokenStreamException {
		
		
		try {      // for error handling
			switch ( LA(1)) {
			case LITERAL_if:
			{
				match(LITERAL_if);
				match(LPAREN);
				expr();
				match(RPAREN);
				statement();
				{
				if ((LA(1)==LITERAL_else)) {
					match(LITERAL_else);
					statement();
				}
				else if ((_tokenSet_7.member(LA(1)))) {
				}
				else {
					throw new NoViableAltException(LT(1), getFilename());
				}
				
				}
				break;
			}
			case LITERAL_while:
			{
				match(LITERAL_while);
				match(LPAREN);
				expr();
				match(RPAREN);
				statement();
				break;
			}
			case LCURLY:
			{
				block(false);
				break;
			}
			default:
				boolean synPredMatched21 = false;
				if (((LA(1)==ID||LA(1)==LITERAL_int||LA(1)==LITERAL_char))) {
					int _m21 = mark();
					synPredMatched21 = true;
					inputState.guessing++;
					try {
						{
						variable();
						}
					}
					catch (RecognitionException pe) {
						synPredMatched21 = false;
					}
					rewind(_m21);
					inputState.guessing--;
				}
				if ( synPredMatched21 ) {
					variable();
				}
				else if ((_tokenSet_8.member(LA(1)))) {
					expr();
					match(SEMI);
				}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				consume();
				consumeUntil(_tokenSet_7);
			} else {
			  throw ex;
			}
		}
	}
	
	public final void expr() throws RecognitionException, TokenStreamException {
		
		
		try {      // for error handling
			assignExpr();
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				consume();
				consumeUntil(_tokenSet_9);
			} else {
			  throw ex;
			}
		}
	}
	
	public final void assignExpr() throws RecognitionException, TokenStreamException {
		
		
		try {      // for error handling
			aexpr();
			{
			switch ( LA(1)) {
			case ASSIGN:
			{
				match(ASSIGN);
				assignExpr();
				break;
			}
			case SEMI:
			case RPAREN:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				consume();
				consumeUntil(_tokenSet_9);
			} else {
			  throw ex;
			}
		}
	}
	
	public final void aexpr() throws RecognitionException, TokenStreamException {
		
		
		try {      // for error handling
			mexpr();
			{
			_loop28:
			do {
				if ((LA(1)==PLUS)) {
					match(PLUS);
					mexpr();
				}
				else {
					break _loop28;
				}
				
			} while (true);
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				consume();
				consumeUntil(_tokenSet_10);
			} else {
			  throw ex;
			}
		}
	}
	
	public final void mexpr() throws RecognitionException, TokenStreamException {
		
		
		try {      // for error handling
			atom();
			{
			_loop31:
			do {
				if ((LA(1)==STAR)) {
					match(STAR);
					atom();
				}
				else {
					break _loop31;
				}
				
			} while (true);
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				consume();
				consumeUntil(_tokenSet_11);
			} else {
			  throw ex;
			}
		}
	}
	
	public final void atom() throws RecognitionException, TokenStreamException {
		
		
		try {      // for error handling
			switch ( LA(1)) {
			case ID:
			{
				match(ID);
				break;
			}
			case INT:
			{
				match(INT);
				break;
			}
			case CHAR_LITERAL:
			{
				match(CHAR_LITERAL);
				break;
			}
			case STRING_LITERAL:
			{
				match(STRING_LITERAL);
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				consume();
				consumeUntil(_tokenSet_12);
			} else {
			  throw ex;
			}
		}
	}
	
	
	public static final String[] _tokenNames = {
		"<0>",
		"EOF",
		"<2>",
		"NULL_TREE_LOOKAHEAD",
		"ID",
		"STAR",
		"SEMI",
		"LPAREN",
		"COMMA",
		"RPAREN",
		"\"int\"",
		"\"char\"",
		"LCURLY",
		"RCURLY",
		"\"if\"",
		"\"else\"",
		"\"while\"",
		"ASSIGN",
		"PLUS",
		"INT",
		"CHAR_LITERAL",
		"STRING_LITERAL",
		"WS",
		"SL_COMMENT",
		"ML_COMMENT",
		"DIGIT"
	};
	
	private static final long[] mk_tokenSet_0() {
		long[] data = { 2L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
	private static final long[] mk_tokenSet_1() {
		long[] data = { 3090L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_1 = new BitSet(mk_tokenSet_1());
	private static final long[] mk_tokenSet_2() {
		long[] data = { 832L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_2 = new BitSet(mk_tokenSet_2());
	private static final long[] mk_tokenSet_3() {
		long[] data = { 3800082L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_3 = new BitSet(mk_tokenSet_3());
	private static final long[] mk_tokenSet_4() {
		long[] data = { 48L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_4 = new BitSet(mk_tokenSet_4());
	private static final long[] mk_tokenSet_5() {
		long[] data = { 768L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_5 = new BitSet(mk_tokenSet_5());
	private static final long[] mk_tokenSet_6() {
		long[] data = { 3759120L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_6 = new BitSet(mk_tokenSet_6());
	private static final long[] mk_tokenSet_7() {
		long[] data = { 3800080L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_7 = new BitSet(mk_tokenSet_7());
	private static final long[] mk_tokenSet_8() {
		long[] data = { 3670032L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_8 = new BitSet(mk_tokenSet_8());
	private static final long[] mk_tokenSet_9() {
		long[] data = { 576L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_9 = new BitSet(mk_tokenSet_9());
	private static final long[] mk_tokenSet_10() {
		long[] data = { 131648L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_10 = new BitSet(mk_tokenSet_10());
	private static final long[] mk_tokenSet_11() {
		long[] data = { 393792L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_11 = new BitSet(mk_tokenSet_11());
	private static final long[] mk_tokenSet_12() {
		long[] data = { 393824L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_12 = new BitSet(mk_tokenSet_12());
	
	}
