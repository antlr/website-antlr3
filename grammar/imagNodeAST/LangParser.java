/*
 * ANTLR-generated file resulting from grammar treewalk.g
 * 
 * Terence Parr, MageLang Institute
 * with John Lilley, Empathy Software
 * ANTLR Version 2.20b4; 1996,1997
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
			block_AST= (AST)astFactory.make( (new ASTArray(2)).add((AST)astFactory.create(BLOCK,"BLOCK")).add(block_AST));
			currentAST.root = block_AST;
			currentAST.child = block_AST!=null &&block_AST.getFirstChild()!=null ?
				block_AST.getFirstChild() : block_AST;
			currentAST.advanceChildToEnd();
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
			{
				AST tmp3_AST = null;
				tmp3_AST = (AST)astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp3_AST);
				match(ID);
				AST tmp4_AST = null;
				tmp4_AST = (AST)astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp4_AST);
				match(ASSIGN);
				expr();
				astFactory.addASTChild(currentAST, returnAST);
				AST tmp5_AST = null;
				tmp5_AST = (AST)astFactory.create(LT(1));
				match(SEMI);
				statement_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_if:
			{
				AST tmp6_AST = null;
				tmp6_AST = (AST)astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp6_AST);
				match(LITERAL_if);
				AST tmp7_AST = null;
				tmp7_AST = (AST)astFactory.create(LT(1));
				match(LPAREN);
				expr();
				astFactory.addASTChild(currentAST, returnAST);
				AST tmp8_AST = null;
				tmp8_AST = (AST)astFactory.create(LT(1));
				match(RPAREN);
				statement();
				astFactory.addASTChild(currentAST, returnAST);
				{
				if ((la_1==LITERAL_else)) {
					AST tmp9_AST = null;
					tmp9_AST = (AST)astFactory.create(LT(1));
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
				AST tmp10_AST = null;
				tmp10_AST = (AST)astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp10_AST);
				match(LITERAL_while);
				AST tmp11_AST = null;
				tmp11_AST = (AST)astFactory.create(LT(1));
				match(LPAREN);
				expr();
				astFactory.addASTChild(currentAST, returnAST);
				AST tmp12_AST = null;
				tmp12_AST = (AST)astFactory.create(LT(1));
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
		Token  id = null;
		AST id_AST = null;
		
		try {      // for error handling
			switch ( la_1) {
			case ID:
			{
				id = LT(1);
				id_AST = (AST)astFactory.create(id);
				match(ID);
				expr_AST = (AST)currentAST.root;
				expr_AST= (AST)astFactory.make( (new ASTArray(2)).add((AST)astFactory.create(EXPR,"EXPR")).add(id_AST));
				currentAST.root = expr_AST;
				currentAST.child = expr_AST!=null &&expr_AST.getFirstChild()!=null ?
					expr_AST.getFirstChild() : expr_AST;
				currentAST.advanceChildToEnd();
				break;
			}
			case INT:
			{
				AST tmp13_AST = null;
				tmp13_AST = (AST)astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp13_AST);
				match(INT);
				expr_AST = (AST)currentAST.root;
				expr_AST= (AST)astFactory.make( (new ASTArray(2)).add((AST)astFactory.create(EXPR,"EXPR")).add(expr_AST));
				currentAST.root = expr_AST;
				currentAST.child = expr_AST!=null &&expr_AST.getFirstChild()!=null ?
					expr_AST.getFirstChild() : expr_AST;
				currentAST.advanceChildToEnd();
				expr_AST = (AST)currentAST.root;
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
			consumeUntil(_tokenSet_2);
		}
		returnAST = expr_AST;
	}

	public final void imaginaryTokenDefinitions() throws ParserException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST imaginaryTokenDefinitions_AST = null;
		
		try {      // for error handling
			AST tmp14_AST = null;
			tmp14_AST = (AST)astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp14_AST);
			match(BLOCK);
			imaginaryTokenDefinitions_AST = (AST)currentAST.root;
		}
		catch (ParserException ex) {
			reportError(ex);
			consume();
			consumeUntil(_tokenSet_3);
		}
		returnAST = imaginaryTokenDefinitions_AST;
	}

	
	public static final String[] _tokenNames = {
		"<0>",
		"EOF",
		"<epsilon>",
		"NULL_TREE_LOOKAHEAD",
		"LCURLY",
		"RCURLY",
		"ID",
		"ASSIGN",
		"SEMI",
		"\"if\"",
		"LPAREN",
		"RPAREN",
		"\"else\"",
		"\"while\"",
		"INT",
		"BLOCK",
		"EXPR",
		"WS",
		"DIGIT"
	};
	
	private static final long _tokenSet_0_data_[] = { 8784L, 0L };
	public static final BitSet _tokenSet_0 = new BitSet(_tokenSet_0_data_);
	private static final long _tokenSet_1_data_[] = { 12912L, 0L };
	public static final BitSet _tokenSet_1 = new BitSet(_tokenSet_1_data_);
	private static final long _tokenSet_2_data_[] = { 2304L, 0L };
	public static final BitSet _tokenSet_2 = new BitSet(_tokenSet_2_data_);
	private static final long _tokenSet_3_data_[] = { 2L, 0L };
	public static final BitSet _tokenSet_3 = new BitSet(_tokenSet_3_data_);
	
}
