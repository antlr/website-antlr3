/*
 * ANTLR-generated file resulting from grammar calc.g
 * 
 * Terence Parr, MageLang Institute
 * with John Lilley, Empathy Software
 * ANTLR Version 2.20; 1996,1997
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
import antlr.collections.AST;
import antlr.ASTPair;
import antlr.collections.impl.ASTArray;
public class CalcParser extends antlr.LLkParserNoInteractive implements CalcParserTokenTypes {

protected CalcParser(TokenBuffer tokenBuf, int k) {
	super(tokenBuf,k);
	tokenNames = _tokenNames;
}

public CalcParser(TokenBuffer tokenBuf) {
	this(tokenBuf,1);
}

protected CalcParser(Tokenizer lexer, int k) {
	super(lexer,k);
	tokenNames = _tokenNames;
}

public CalcParser(Tokenizer lexer) {
	this(lexer,1);
}

	public final void expr() throws ParserException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		antlr.CommonAST expr_AST = null;
		
		try {      // for error handling
			mexpr();
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop3:
			do {
				if ((la_1==PLUS)) {
					antlr.CommonAST tmp1_AST = null;
					tmp1_AST = (antlr.CommonAST)astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp1_AST);
					match(PLUS);
					mexpr();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop3;
				}
				
			} while (true);
			}
			antlr.CommonAST tmp2_AST = null;
			tmp2_AST = (antlr.CommonAST)astFactory.create(LT(1));
			match(SEMI);
			expr_AST = (antlr.CommonAST)currentAST.root;
		}
		catch (ParserException ex) {
			reportError(ex);
			consume();
			consumeUntil(_tokenSet_0);
		}
		returnAST = expr_AST;
	}

	public final void mexpr() throws ParserException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		antlr.CommonAST mexpr_AST = null;
		
		try {      // for error handling
			atom();
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop6:
			do {
				if ((la_1==STAR)) {
					antlr.CommonAST tmp3_AST = null;
					tmp3_AST = (antlr.CommonAST)astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp3_AST);
					match(STAR);
					atom();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop6;
				}
				
			} while (true);
			}
			mexpr_AST = (antlr.CommonAST)currentAST.root;
		}
		catch (ParserException ex) {
			reportError(ex);
			consume();
			consumeUntil(_tokenSet_1);
		}
		returnAST = mexpr_AST;
	}

	public final void atom() throws ParserException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		antlr.CommonAST atom_AST = null;
		
		try {      // for error handling
			antlr.CommonAST tmp4_AST = null;
			tmp4_AST = (antlr.CommonAST)astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp4_AST);
			match(INT);
			atom_AST = (antlr.CommonAST)currentAST.root;
		}
		catch (ParserException ex) {
			reportError(ex);
			consume();
			consumeUntil(_tokenSet_2);
		}
		returnAST = atom_AST;
	}

	
	public static final String[] _tokenNames = {
		"<0>",
		"EOF",
		"<epsilon>",
		"NULL_TREE_LOOKAHEAD",
		"PLUS",
		"SEMI",
		"STAR",
		"INT",
		"WS",
		"LPAREN",
		"RPAREN",
		"DIGIT"
	};
	
	private static final long _tokenSet_0_data_[] = { 2L, 0L };
	public static final BitSet _tokenSet_0 = new BitSet(_tokenSet_0_data_);
	private static final long _tokenSet_1_data_[] = { 48L, 0L };
	public static final BitSet _tokenSet_1 = new BitSet(_tokenSet_1_data_);
	private static final long _tokenSet_2_data_[] = { 112L, 0L };
	public static final BitSet _tokenSet_2 = new BitSet(_tokenSet_2_data_);
	
}
