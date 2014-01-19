/*
 * ANTLR-generated file resulting from grammar treewalk.g
 * 
 * Terence Parr, MageLang Institute
 * with John Lilley, Empathy Software
 * ANTLR Version 2.20b3; 1996,1997
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
public class LangParser extends antlr.LLkParserNoInteractive implements LangParserTokenTypes {
public LangParser(TokenBuffer tokenBuf) {
super(tokenBuf,1);
tokenNames = _tokenNames;
}

public LangParser(Tokenizer lexer) {
super(lexer,1);
tokenNames = _tokenNames;
}
	public final void block() throws ParserException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST block_AST = null;
		
		try {      // for error handling
			AST tmp1_AST = null;
			tmp1_AST = (AST)astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp1_AST);
			match(LCURLY);
			{
			_loop3:
			do {
				if ((_tokenSet_0.member(la_1))) {
					statement();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop3;
				}
				
			} while (true);
			}
			AST tmp2_AST = null;
			tmp2_AST = (AST)astFactory.create(LT(1));
			match(RCURLY);
			block_AST = (AST)currentAST.root;
		}
		catch (ParserException ex) {
			reportError(ex);
			consume();
			consumeUntil(_tokenSet_1);
		}
		returnAST = block_AST;
	}

	public final void statement() throws ParserException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST statement_AST = null;
		AST b_AST = null;
		
		try {      // for error handling
			switch ( la_1) {
			case ID:
			case INT:
			{
				expr();
				astFactory.addASTChild(currentAST, returnAST);
				AST tmp3_AST = null;
				tmp3_AST = (AST)astFactory.create(LT(1));
				match(SEMI);
				statement_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_if:
			{
				AST tmp4_AST = null;
				tmp4_AST = (AST)astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp4_AST);
				match(LITERAL_if);
				AST tmp5_AST = null;
				tmp5_AST = (AST)astFactory.create(LT(1));
				match(LPAREN);
				expr();
				astFactory.addASTChild(currentAST, returnAST);
				AST tmp6_AST = null;
				tmp6_AST = (AST)astFactory.create(LT(1));
				match(RPAREN);
				statement();
				astFactory.addASTChild(currentAST, returnAST);
				{
				if ((la_1==LITERAL_else)) {
					AST tmp7_AST = null;
					tmp7_AST = (AST)astFactory.create(LT(1));
					match(LITERAL_else);
					statement();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					
				}
				
				}
				statement_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_while:
			{
				AST tmp8_AST = null;
				tmp8_AST = (AST)astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp8_AST);
				match(LITERAL_while);
				AST tmp9_AST = null;
				tmp9_AST = (AST)astFactory.create(LT(1));
				match(LPAREN);
				expr();
				astFactory.addASTChild(currentAST, returnAST);
				AST tmp10_AST = null;
				tmp10_AST = (AST)astFactory.create(LT(1));
				match(RPAREN);
				statement();
				astFactory.addASTChild(currentAST, returnAST);
				statement_AST = (AST)currentAST.root;
				break;
			}
			case LCURLY:
			{
				block();
				b_AST = (AST)returnAST;
				statement_AST = b_AST;
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
		returnAST = statement_AST;
	}

	public final void expr() throws ParserException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST expr_AST = null;
		
		try {      // for error handling
			assignExpr();
			astFactory.addASTChild(currentAST, returnAST);
			expr_AST = (AST)currentAST.root;
		}
		catch (ParserException ex) {
			reportError(ex);
			consume();
			consumeUntil(_tokenSet_2);
		}
		returnAST = expr_AST;
	}

	public final void assignExpr() throws ParserException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST assignExpr_AST = null;
		
		try {      // for error handling
			aexpr();
			astFactory.addASTChild(currentAST, returnAST);
			{
			if ((la_1==ASSIGN)) {
				AST tmp11_AST = null;
				tmp11_AST = (AST)astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp11_AST);
				match(ASSIGN);
				assignExpr();
				astFactory.addASTChild(currentAST, returnAST);
			}
			else {
				
			}
			
			}
			assignExpr_AST = (AST)currentAST.root;
		}
		catch (ParserException ex) {
			reportError(ex);
			consume();
			consumeUntil(_tokenSet_2);
		}
		returnAST = assignExpr_AST;
	}

	public final void aexpr() throws ParserException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST aexpr_AST = null;
		
		try {      // for error handling
			mexpr();
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop13:
			do {
				if ((la_1==PLUS)) {
					AST tmp12_AST = null;
					tmp12_AST = (AST)astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp12_AST);
					match(PLUS);
					mexpr();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop13;
				}
				
			} while (true);
			}
			aexpr_AST = (AST)currentAST.root;
		}
		catch (ParserException ex) {
			reportError(ex);
			consume();
			consumeUntil(_tokenSet_3);
		}
		returnAST = aexpr_AST;
	}

	public final void mexpr() throws ParserException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST mexpr_AST = null;
		
		try {      // for error handling
			atom();
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop16:
			do {
				if ((la_1==STAR)) {
					AST tmp13_AST = null;
					tmp13_AST = (AST)astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp13_AST);
					match(STAR);
					atom();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop16;
				}
				
			} while (true);
			}
			mexpr_AST = (AST)currentAST.root;
		}
		catch (ParserException ex) {
			reportError(ex);
			consume();
			consumeUntil(_tokenSet_4);
		}
		returnAST = mexpr_AST;
	}

	public final void atom() throws ParserException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST atom_AST = null;
		
		try {      // for error handling
			if ((la_1==ID)) {
				AST tmp14_AST = null;
				tmp14_AST = (AST)astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp14_AST);
				match(ID);
				atom_AST = (AST)currentAST.root;
			}
			else if ((la_1==INT)) {
				AST tmp15_AST = null;
				tmp15_AST = (AST)astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp15_AST);
				match(INT);
				atom_AST = (AST)currentAST.root;
			}
			else {
				throw new NoViableAltException(LT(1));
			}
			
		}
		catch (ParserException ex) {
			reportError(ex);
			consume();
			consumeUntil(_tokenSet_5);
		}
		returnAST = atom_AST;
	}

	
	public static final String[] _tokenNames = {
		"0",
		"EOF",
		"<epsilon>",
		"NULL_TREE_LOOKAHEAD",
		"LCURLY",
		"RCURLY",
		"SEMI",
		"\"if\"",
		"LPAREN",
		"RPAREN",
		"\"else\"",
		"\"while\"",
		"ASSIGN",
		"PLUS",
		"STAR",
		"ID",
		"INT",
		"WS",
		"COMMA",
		"ESC",
		"DIGIT"
	};
	
	private static final long _tokenSet_0_data_[] = { 100496L, 0L };
	public static final BitSet _tokenSet_0 = new BitSet(_tokenSet_0_data_);
	private static final long _tokenSet_1_data_[] = { 101552L, 0L };
	public static final BitSet _tokenSet_1 = new BitSet(_tokenSet_1_data_);
	private static final long _tokenSet_2_data_[] = { 576L, 0L };
	public static final BitSet _tokenSet_2 = new BitSet(_tokenSet_2_data_);
	private static final long _tokenSet_3_data_[] = { 4672L, 0L };
	public static final BitSet _tokenSet_3 = new BitSet(_tokenSet_3_data_);
	private static final long _tokenSet_4_data_[] = { 12864L, 0L };
	public static final BitSet _tokenSet_4 = new BitSet(_tokenSet_4_data_);
	private static final long _tokenSet_5_data_[] = { 29248L, 0L };
	public static final BitSet _tokenSet_5 = new BitSet(_tokenSet_5_data_);
	
}
