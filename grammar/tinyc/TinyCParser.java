/*
 * ANTLR-generated file resulting from grammar tinyc.g
 * 
 * Terence Parr, MageLang Institute
 * with John Lilley, Empathy Software
 * ANTLR Version 2.2.2; 1996,1997
 */
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

class Main {
	public static void main(String[] args) {
		try {
			TinyCLexer lexer = new TinyCLexer(new DataInputStream(System.in));
			TinyCParser parser = new TinyCParser(lexer);
			parser.program();
		} catch(Exception e) {
			System.err.println("exception: "+e);
		}
	}
}

public class TinyCParser extends antlr.LLkParserNoInteractive implements TinyCParserTokenTypes {

protected TinyCParser(TokenBuffer tokenBuf, int k) {
	super(tokenBuf,k);
	tokenNames = _tokenNames;
}

public TinyCParser(TokenBuffer tokenBuf) {
	this(tokenBuf,1);
}

protected TinyCParser(Tokenizer lexer, int k) {
	super(lexer,k);
	tokenNames = _tokenNames;
}

public TinyCParser(Tokenizer lexer) {
	this(lexer,1);
}

	public final void program() throws ParserException {
		
		
		try {      // for error handling
			{
			_loop3:
			do {
				if ((la_1==TK_int||la_1==TK_char||la_1==ID)) {
					declaration();
				}
				else {
					break _loop3;
				}
				
			} while (true);
			}
			match(Token.EOF_TYPE);
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

	public final void declaration() throws ParserException {
		
		
		try {      // for error handling
			boolean synPredMatched6 = false;
			if (((la_1==TK_int||la_1==TK_char||la_1==ID))) {
				int _m6 = mark();
				synPredMatched6 = true;
				guessing++;
				try {
					{
					variable();
					}
				}
				catch (ParserException pe) {
					synPredMatched6 = false;
				}
				rewind(_m6);
				guessing--;
			}
			if ( synPredMatched6 ) {
				variable();
			}
			else if ((la_1==TK_int||la_1==TK_char||la_1==ID)) {
				function();
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

	public final void variable() throws ParserException {
		
		
		try {      // for error handling
			type();
			declarator();
			match(SEMI);
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

	public final void function() throws ParserException {
		
		Token  id = null;
		
		try {      // for error handling
			type();
			id = LT(1);
			match(ID);
			match(LPAREN);
			{
			switch ( la_1) {
			case TK_int:
			case TK_char:
			case ID:
			{
				formalParameter();
				{
				_loop12:
				do {
					if ((la_1==COMMA)) {
						match(COMMA);
						formalParameter();
					}
					else {
						break _loop12;
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
				throw new NoViableAltException(LT(1));
			}
			}
			}
			match(RPAREN);
			block();
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

	public final void declarator() throws ParserException {
		
		Token  id = null;
		Token  id2 = null;
		
		try {      // for error handling
			switch ( la_1) {
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
				throw new NoViableAltException(LT(1));
			}
			}
		}
		catch (ParserException ex) {
			if (guessing==0) {
				reportError(ex);
				consume();
				consumeUntil(_tokenSet_2);
			} else {
				throw ex;
			}
		}
	}

	public final void type() throws ParserException {
		
		Token  id = null;
		
		try {      // for error handling
			{
			switch ( la_1) {
			case TK_int:
			{
				match(TK_int);
				break;
			}
			case TK_char:
			{
				match(TK_char);
				break;
			}
			case ID:
			{
				id = LT(1);
				match(ID);
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1));
			}
			}
			}
		}
		catch (ParserException ex) {
			if (guessing==0) {
				reportError(ex);
				consume();
				consumeUntil(_tokenSet_3);
			} else {
				throw ex;
			}
		}
	}

	public final void formalParameter() throws ParserException {
		
		
		try {      // for error handling
			type();
			declarator();
		}
		catch (ParserException ex) {
			if (guessing==0) {
				reportError(ex);
				consume();
				consumeUntil(_tokenSet_4);
			} else {
				throw ex;
			}
		}
	}

	public final void block() throws ParserException {
		
		
		try {      // for error handling
			match(LCURLY);
			{
			_loop18:
			do {
				if ((_tokenSet_5.member(la_1))) {
					statement();
				}
				else {
					break _loop18;
				}
				
			} while (true);
			}
			match(RCURLY);
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

	public final void statement() throws ParserException {
		
		
		try {      // for error handling
			switch ( la_1) {
			case TK_if:
			{
				match(TK_if);
				match(LPAREN);
				expr();
				match(RPAREN);
				statement();
				{
				if ((la_1==TK_else)) {
					match(TK_else);
					statement();
				}
				else if ((_tokenSet_6.member(la_1))) {
				}
				else {
					throw new NoViableAltException(LT(1));
				}
				
				}
				break;
			}
			case TK_while:
			{
				match(TK_while);
				match(LPAREN);
				expr();
				match(RPAREN);
				statement();
				break;
			}
			case LCURLY:
			{
				block();
				break;
			}
			default:
				boolean synPredMatched21 = false;
				if (((la_1==TK_int||la_1==TK_char||la_1==ID))) {
					int _m21 = mark();
					synPredMatched21 = true;
					guessing++;
					try {
						{
						declaration();
						}
					}
					catch (ParserException pe) {
						synPredMatched21 = false;
					}
					rewind(_m21);
					guessing--;
				}
				if ( synPredMatched21 ) {
					declaration();
				}
				else if ((_tokenSet_7.member(la_1))) {
					expr();
					match(SEMI);
				}
			else {
				throw new NoViableAltException(LT(1));
			}
			}
		}
		catch (ParserException ex) {
			if (guessing==0) {
				reportError(ex);
				consume();
				consumeUntil(_tokenSet_6);
			} else {
				throw ex;
			}
		}
	}

	public final void expr() throws ParserException {
		
		
		try {      // for error handling
			assignExpr();
		}
		catch (ParserException ex) {
			if (guessing==0) {
				reportError(ex);
				consume();
				consumeUntil(_tokenSet_8);
			} else {
				throw ex;
			}
		}
	}

	public final void assignExpr() throws ParserException {
		
		
		try {      // for error handling
			aexpr();
			{
			switch ( la_1) {
			case ASSIGN:
			{
				match(ASSIGN);
				assignExpr();
				break;
			}
			case RPAREN:
			case SEMI:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1));
			}
			}
			}
		}
		catch (ParserException ex) {
			if (guessing==0) {
				reportError(ex);
				consume();
				consumeUntil(_tokenSet_8);
			} else {
				throw ex;
			}
		}
	}

	public final void aexpr() throws ParserException {
		
		
		try {      // for error handling
			mexpr();
			{
			_loop28:
			do {
				if ((la_1==PLUS)) {
					match(PLUS);
					mexpr();
				}
				else {
					break _loop28;
				}
				
			} while (true);
			}
		}
		catch (ParserException ex) {
			if (guessing==0) {
				reportError(ex);
				consume();
				consumeUntil(_tokenSet_9);
			} else {
				throw ex;
			}
		}
	}

	public final void mexpr() throws ParserException {
		
		
		try {      // for error handling
			atom();
			{
			_loop31:
			do {
				if ((la_1==STAR)) {
					match(STAR);
					atom();
				}
				else {
					break _loop31;
				}
				
			} while (true);
			}
		}
		catch (ParserException ex) {
			if (guessing==0) {
				reportError(ex);
				consume();
				consumeUntil(_tokenSet_10);
			} else {
				throw ex;
			}
		}
	}

	public final void atom() throws ParserException {
		
		
		try {      // for error handling
			switch ( la_1) {
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
				throw new NoViableAltException(LT(1));
			}
			}
		}
		catch (ParserException ex) {
			if (guessing==0) {
				reportError(ex);
				consume();
				consumeUntil(_tokenSet_11);
			} else {
				throw ex;
			}
		}
	}

	
	public static final String[] _tokenNames = {
		"<0>",
		"EOF",
		"<end-of-syn-pred>",
		"NULL_TREE_LOOKAHEAD",
		"\"if\"",
		"\"int\"",
		"\"char\"",
		"\"else\"",
		"\"while\"",
		"WS",
		"SL_COMMENT",
		"ML_COMMENT",
		"'('",
		"')'",
		"LCURLY",
		"RCURLY",
		"STAR",
		"PLUS",
		"ASSIGN",
		"SEMI",
		"COMMA",
		"CHAR_LITERAL",
		"STRING_LITERAL",
		"ESC",
		"DIGIT",
		"INT",
		"an identifier"
	};
	
	private static final long _tokenSet_0_data_[] = { 2L, 0L };
	public static final BitSet _tokenSet_0 = new BitSet(_tokenSet_0_data_);
	private static final long _tokenSet_1_data_[] = { 107004402L, 0L };
	public static final BitSet _tokenSet_1 = new BitSet(_tokenSet_1_data_);
	private static final long _tokenSet_2_data_[] = { 1581056L, 0L };
	public static final BitSet _tokenSet_2 = new BitSet(_tokenSet_2_data_);
	private static final long _tokenSet_3_data_[] = { 67174400L, 0L };
	public static final BitSet _tokenSet_3 = new BitSet(_tokenSet_3_data_);
	private static final long _tokenSet_4_data_[] = { 1056768L, 0L };
	public static final BitSet _tokenSet_4 = new BitSet(_tokenSet_4_data_);
	private static final long _tokenSet_5_data_[] = { 106971504L, 0L };
	public static final BitSet _tokenSet_5 = new BitSet(_tokenSet_5_data_);
	private static final long _tokenSet_6_data_[] = { 107004400L, 0L };
	public static final BitSet _tokenSet_6 = new BitSet(_tokenSet_6_data_);
	private static final long _tokenSet_7_data_[] = { 106954752L, 0L };
	public static final BitSet _tokenSet_7 = new BitSet(_tokenSet_7_data_);
	private static final long _tokenSet_8_data_[] = { 532480L, 0L };
	public static final BitSet _tokenSet_8 = new BitSet(_tokenSet_8_data_);
	private static final long _tokenSet_9_data_[] = { 794624L, 0L };
	public static final BitSet _tokenSet_9 = new BitSet(_tokenSet_9_data_);
	private static final long _tokenSet_10_data_[] = { 925696L, 0L };
	public static final BitSet _tokenSet_10 = new BitSet(_tokenSet_10_data_);
	private static final long _tokenSet_11_data_[] = { 991232L, 0L };
	public static final BitSet _tokenSet_11 = new BitSet(_tokenSet_11_data_);
	
}
