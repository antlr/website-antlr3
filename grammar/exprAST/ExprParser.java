/*
 * ANTLR-generated file resulting from grammar expr.g
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

import java.io.*;

public class ExprParser extends antlr.LLkParserNoInteractive implements ExprParserTokenTypes {
public ExprParser(TokenBuffer tokenBuf) {
super(tokenBuf,1);
tokenNames = _tokenNames;
}

public ExprParser(Tokenizer lexer) {
super(lexer,1);
tokenNames = _tokenNames;
}
	public final void expr() throws ParserException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		antlr.CommonAST expr_AST = null;
		
		assignExpr();
		if (guessing==0) {
			astFactory.addASTChild(currentAST, returnAST);
		}
		expr_AST = (antlr.CommonAST)currentAST.root;
		returnAST = expr_AST;
	}

	public final void assignExpr() throws ParserException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		antlr.CommonAST assignExpr_AST = null;
		
		addExpr();
		if (guessing==0) {
			astFactory.addASTChild(currentAST, returnAST);
		}
		{
		if ((la_1==ASSIGN)) {
			antlr.CommonAST tmp1_AST = null;
			if (guessing==0) {
				tmp1_AST = (antlr.CommonAST)astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp1_AST);
			}
			match(ASSIGN);
			assignExpr();
			if (guessing==0) {
				astFactory.addASTChild(currentAST, returnAST);
			}
		}
		else {
			
		}
		
		}
		assignExpr_AST = (antlr.CommonAST)currentAST.root;
		returnAST = assignExpr_AST;
	}

	public final void addExpr() throws ParserException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		antlr.CommonAST addExpr_AST = null;
		Token  pm = null;
		antlr.CommonAST pm_AST = null;
		antlr.CommonAST me_AST = null;
		
		multExpr();
		if (guessing==0) {
			astFactory.addASTChild(currentAST, returnAST);
		}
		{
		_loop7:
		do {
			if ((la_1==PLUS_MINUS)) {
				try {      // for error handling
					pm = LT(1);
					if (guessing==0) {
						pm_AST = (antlr.CommonAST)astFactory.create(pm);
						astFactory.makeASTRoot(currentAST, pm_AST);
					}
					match(PLUS_MINUS);
					multExpr();
					if (guessing==0) {
						me_AST = (antlr.CommonAST)returnAST;
						astFactory.addASTChild(currentAST, returnAST);
					}
				}
				catch ( ParserException ex ) {
					if (guessing==0) {
						System.out.println("Caught error in addExpr");
						reportError(ex.toString());
					} else {
						throw ex ;
					}
				}
			}
			else {
				break _loop7;
			}
			
		} while (true);
		}
		addExpr_AST = (antlr.CommonAST)currentAST.root;
		returnAST = addExpr_AST;
	}

	public final void multExpr() throws ParserException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		antlr.CommonAST multExpr_AST = null;
		
		postfixExpr();
		if (guessing==0) {
			astFactory.addASTChild(currentAST, returnAST);
		}
		{
		_loop10:
		do {
			if ((la_1==MULT_DIV)) {
				antlr.CommonAST tmp2_AST = null;
				if (guessing==0) {
					tmp2_AST = (antlr.CommonAST)astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp2_AST);
				}
				match(MULT_DIV);
				postfixExpr();
				if (guessing==0) {
					astFactory.addASTChild(currentAST, returnAST);
				}
			}
			else {
				break _loop10;
			}
			
		} while (true);
		}
		multExpr_AST = (antlr.CommonAST)currentAST.root;
		returnAST = multExpr_AST;
	}

	public final void postfixExpr() throws ParserException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		antlr.CommonAST postfixExpr_AST = null;
		Token  id = null;
		antlr.CommonAST id_AST = null;
		Token  id2 = null;
		antlr.CommonAST id2_AST = null;
		
		try {      // for error handling
			boolean synPredMatched13 = false;
			if (((la_1==ID))) {
				int _m13 = mark();
				synPredMatched13 = true;
				guessing++;
				try {
					{
					match(ID);
					match(LPAREN);
					}
				}
				catch (ParserException pe) {
					synPredMatched13 = false;
				}
				rewind(_m13);
				guessing--;
			}
			if ( synPredMatched13 ) {
				id2 = LT(1);
				if (guessing==0) {
					id2_AST = (antlr.CommonAST)astFactory.create(id2);
					astFactory.makeASTRoot(currentAST, id2_AST);
				}
				match(ID);
				{
				if ((la_1==LPAREN)) {
					parenArgs();
					if (guessing==0) {
						astFactory.addASTChild(currentAST, returnAST);
					}
				}
				else {
					
				}
				
				}
				postfixExpr_AST = (antlr.CommonAST)currentAST.root;
			}
			else if ((_tokenSet_0.member(la_1))) {
				atom();
				if (guessing==0) {
					astFactory.addASTChild(currentAST, returnAST);
				}
				postfixExpr_AST = (antlr.CommonAST)currentAST.root;
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
		returnAST = postfixExpr_AST;
	}

	public final void parenArgs() throws ParserException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		antlr.CommonAST parenArgs_AST = null;
		
		antlr.CommonAST tmp3_AST = null;
		tmp3_AST = (antlr.CommonAST)astFactory.create(LT(1));
		match(LPAREN);
		{
		if ((_tokenSet_0.member(la_1))) {
			expr();
			if (guessing==0) {
				astFactory.addASTChild(currentAST, returnAST);
			}
			{
			_loop19:
			do {
				if ((la_1==COMMA)) {
					antlr.CommonAST tmp4_AST = null;
					tmp4_AST = (antlr.CommonAST)astFactory.create(LT(1));
					match(COMMA);
					expr();
					if (guessing==0) {
						astFactory.addASTChild(currentAST, returnAST);
					}
				}
				else {
					break _loop19;
				}
				
			} while (true);
			}
		}
		else {
			
		}
		
		}
		antlr.CommonAST tmp5_AST = null;
		tmp5_AST = (antlr.CommonAST)astFactory.create(LT(1));
		match(RPAREN);
		parenArgs_AST = (antlr.CommonAST)currentAST.root;
		returnAST = parenArgs_AST;
	}

	public final void atom() throws ParserException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		antlr.CommonAST atom_AST = null;
		
		switch ( la_1) {
		case ID:
		{
			antlr.CommonAST tmp6_AST = null;
			if (guessing==0) {
				tmp6_AST = (antlr.CommonAST)astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp6_AST);
			}
			match(ID);
			atom_AST = (antlr.CommonAST)currentAST.root;
			break;
		}
		case INT:
		{
			antlr.CommonAST tmp7_AST = null;
			if (guessing==0) {
				tmp7_AST = (antlr.CommonAST)astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp7_AST);
			}
			match(INT);
			atom_AST = (antlr.CommonAST)currentAST.root;
			break;
		}
		case CHAR_LITERAL:
		{
			antlr.CommonAST tmp8_AST = null;
			if (guessing==0) {
				tmp8_AST = (antlr.CommonAST)astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp8_AST);
			}
			match(CHAR_LITERAL);
			atom_AST = (antlr.CommonAST)currentAST.root;
			break;
		}
		case STRING_LITERAL:
		{
			antlr.CommonAST tmp9_AST = null;
			if (guessing==0) {
				tmp9_AST = (antlr.CommonAST)astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp9_AST);
			}
			match(STRING_LITERAL);
			atom_AST = (antlr.CommonAST)currentAST.root;
			break;
		}
		case LPAREN:
		{
			antlr.CommonAST tmp10_AST = null;
			tmp10_AST = (antlr.CommonAST)astFactory.create(LT(1));
			match(LPAREN);
			expr();
			if (guessing==0) {
				astFactory.addASTChild(currentAST, returnAST);
			}
			antlr.CommonAST tmp11_AST = null;
			tmp11_AST = (antlr.CommonAST)astFactory.create(LT(1));
			match(RPAREN);
			atom_AST = (antlr.CommonAST)currentAST.root;
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1));
		}
		}
		returnAST = atom_AST;
	}

	
	public static final String[] _tokenNames = {
		"<0>",
		"EOF",
		"<epsilon>",
		"NULL_TREE_LOOKAHEAD",
		"ASSIGN",
		"PLUS_MINUS",
		"MULT_DIV",
		"ID",
		"LPAREN",
		"COMMA",
		"RPAREN",
		"INT",
		"CHAR_LITERAL",
		"STRING_LITERAL",
		"WS",
		"ESC",
		"DIGIT"
	};
	
	private static final long _tokenSet_0_data_[] = { 14720L, 0L };
	public static final BitSet _tokenSet_0 = new BitSet(_tokenSet_0_data_);
	private static final long _tokenSet_1_data_[] = { 1648L, 0L };
	public static final BitSet _tokenSet_1 = new BitSet(_tokenSet_1_data_);
	
}
