// $ANTLR 2.7.3-20030430: "calc.g" -> "CalcParser.java"$

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
import antlr.collections.AST;
import java.util.Hashtable;
import antlr.ASTFactory;
import antlr.ASTPair;
import antlr.collections.impl.ASTArray;

public class CalcParser extends antlr.LLkParser       implements CalcParserTokenTypes
 {

protected CalcParser(TokenBuffer tokenBuf, int k) {
  super(tokenBuf,k);
  tokenNames = _tokenNames;
  buildTokenTypeASTClassMap();
  astFactory = new ASTFactory(getTokenTypeToASTClassMap());
}

public CalcParser(TokenBuffer tokenBuf) {
  this(tokenBuf,1);
}

protected CalcParser(TokenStream lexer, int k) {
  super(lexer,k);
  tokenNames = _tokenNames;
  buildTokenTypeASTClassMap();
  astFactory = new ASTFactory(getTokenTypeToASTClassMap());
}

public CalcParser(TokenStream lexer) {
  this(lexer,1);
}

public CalcParser(ParserSharedInputState state) {
  super(state,1);
  tokenNames = _tokenNames;
  buildTokenTypeASTClassMap();
  astFactory = new ASTFactory(getTokenTypeToASTClassMap());
}

	public final void prog() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		ASTMinMax prog_AST = null;
		
		try {      // for error handling
			{
			int _cnt3=0;
			_loop3:
			do {
				if ((LA(1)==ID||LA(1)==LITERAL_print)) {
					stat();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					if ( _cnt3>=1 ) { break _loop3; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt3++;
			} while (true);
			}
			prog_AST = (ASTMinMax)currentAST.root;
		}
		catch (RecognitionException ex) {
			reportError(ex);
			consume();
			consumeUntil(_tokenSet_0);
		}
		returnAST = prog_AST;
	}
	
	public final void stat() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		ASTMinMax stat_AST = null;
		
		try {      // for error handling
			switch ( LA(1)) {
			case ID:
			{
				ASTMinMax tmp5_AST = null;
				tmp5_AST = (ASTMinMax)astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp5_AST);
				match(ID);
				ASTMinMax tmp6_AST = null;
				tmp6_AST = (ASTMinMax)astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp6_AST);
				match(EQUALS);
				expr();
				astFactory.addASTChild(currentAST, returnAST);
				match(SEMI);
				stat_AST = (ASTMinMax)currentAST.root;
				break;
			}
			case LITERAL_print:
			{
				ASTMinMax tmp8_AST = null;
				tmp8_AST = (ASTMinMax)astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp8_AST);
				match(LITERAL_print);
				expr();
				astFactory.addASTChild(currentAST, returnAST);
				match(SEMI);
				stat_AST = (ASTMinMax)currentAST.root;
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			consume();
			consumeUntil(_tokenSet_1);
		}
		returnAST = stat_AST;
	}
	
	public final void expr() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		ASTMinMax expr_AST = null;
		
		try {      // for error handling
			mexpr();
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop7:
			do {
				if ((LA(1)==PLUS)) {
					ASTMinMax tmp10_AST = null;
					tmp10_AST = (ASTMinMax)astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp10_AST);
					match(PLUS);
					mexpr();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop7;
				}
				
			} while (true);
			}
			expr_AST = (ASTMinMax)currentAST.root;
		}
		catch (RecognitionException ex) {
			reportError(ex);
			consume();
			consumeUntil(_tokenSet_2);
		}
		returnAST = expr_AST;
	}
	
	public final void mexpr() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		ASTMinMax mexpr_AST = null;
		
		try {      // for error handling
			atom();
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop10:
			do {
				if ((LA(1)==STAR)) {
					ASTMinMax tmp11_AST = null;
					tmp11_AST = (ASTMinMax)astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp11_AST);
					match(STAR);
					atom();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop10;
				}
				
			} while (true);
			}
			mexpr_AST = (ASTMinMax)currentAST.root;
		}
		catch (RecognitionException ex) {
			reportError(ex);
			consume();
			consumeUntil(_tokenSet_3);
		}
		returnAST = mexpr_AST;
	}
	
	public final void atom() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		ASTMinMax atom_AST = null;
		
		try {      // for error handling
			switch ( LA(1)) {
			case INT:
			{
				ASTMinMax tmp12_AST = null;
				tmp12_AST = (ASTMinMax)astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp12_AST);
				match(INT);
				atom_AST = (ASTMinMax)currentAST.root;
				break;
			}
			case ID:
			{
				ASTMinMax tmp13_AST = null;
				tmp13_AST = (ASTMinMax)astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp13_AST);
				match(ID);
				atom_AST = (ASTMinMax)currentAST.root;
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			consume();
			consumeUntil(_tokenSet_4);
		}
		returnAST = atom_AST;
	}
	
	
	public static final String[] _tokenNames = {
		"<0>",
		"EOF",
		"<2>",
		"NULL_TREE_LOOKAHEAD",
		"ID",
		"EQUALS",
		"SEMI",
		"\"print\"",
		"PLUS",
		"STAR",
		"INT",
		"WS",
		"LPAREN",
		"RPAREN"
	};
	
	protected void buildTokenTypeASTClassMap() {
		tokenTypeToASTClassMap=null;
	};
	
	private static final long[] mk_tokenSet_0() {
		long[] data = { 2L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
	private static final long[] mk_tokenSet_1() {
		long[] data = { 146L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_1 = new BitSet(mk_tokenSet_1());
	private static final long[] mk_tokenSet_2() {
		long[] data = { 64L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_2 = new BitSet(mk_tokenSet_2());
	private static final long[] mk_tokenSet_3() {
		long[] data = { 320L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_3 = new BitSet(mk_tokenSet_3());
	private static final long[] mk_tokenSet_4() {
		long[] data = { 832L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_4 = new BitSet(mk_tokenSet_4());
	
	}
