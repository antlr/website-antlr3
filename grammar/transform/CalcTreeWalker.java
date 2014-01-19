/*
 * ANTLR-generated file resulting from grammar calc.g
 * 
 * Terence Parr, MageLang Institute
 * with John Lilley, Empathy Software
 * ANTLR Version 2.20; 1996,1997
 */
import antlr.TreeParser;
import antlr.Token;
import antlr.collections.AST;
import antlr.ParserException;
import antlr.NoViableAltException;
import antlr.MismatchedTokenException;
import antlr.SemanticException;
import antlr.collections.impl.BitSet;
import antlr.ASTPair;
import antlr.collections.impl.ASTArray;

public class CalcTreeWalker extends antlr.TreeParser implements CalcParserTokenTypes
 {
public CalcTreeWalker() {
	tokenNames = _tokenNames;
}

	public final void expr(AST _t) throws ParserException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		antlr.CommonAST expr_AST = null;
		antlr.CommonAST expr_AST_in = (antlr.CommonAST)_t;
		antlr.CommonAST left_AST = null;
		antlr.CommonAST left = null;
		antlr.CommonAST right_AST = null;
		antlr.CommonAST right = null;
		antlr.CommonAST i = null;
		antlr.CommonAST i_AST = null;
		
		try {      // for error handling
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case PLUS:
			{
				AST __t20 = _t;
				antlr.CommonAST tmp5_AST = null;
				antlr.CommonAST tmp5_AST_in = null;
				tmp5_AST = (antlr.CommonAST)astFactory.create((antlr.CommonAST)_t);
				tmp5_AST_in = (antlr.CommonAST)_t;
				ASTPair __currentAST20 = currentAST.copy();
				currentAST.root = currentAST.child;
				currentAST.child = null;
				match(_t,PLUS);
				_t = _t.getFirstChild();
				left = _t==ASTNULL ? null : (antlr.CommonAST)_t;
				expr(_t);
				_t = _retTree;
				left_AST = (antlr.CommonAST)returnAST;
				right = _t==ASTNULL ? null : (antlr.CommonAST)_t;
				expr(_t);
				_t = _retTree;
				right_AST = (antlr.CommonAST)returnAST;
				currentAST = __currentAST20;
				_t = __t20;
				_t = _t.getNextSibling();
				expr_AST = (antlr.CommonAST)currentAST.root;
				if ( right_AST.getType()==INT &&
				Integer.parseInt(right_AST.getText())==0 ) // x+0
				{
				expr_AST = left_AST;
				}
				else if ( left_AST.getType()==INT &&
				Integer.parseInt(left_AST.getText())==0 ) // 0+x
				{
				expr_AST = right_AST;
				}
				else { // x+y
				expr_AST = (antlr.CommonAST)astFactory.make( (new ASTArray(3)).add(tmp5_AST).add(left_AST).add(right_AST));
				}
				currentAST.root = expr_AST;
				currentAST.child = expr_AST!=null &&expr_AST.getFirstChild()!=null ?
					expr_AST.getFirstChild() : expr_AST;
				currentAST.advanceChildToEnd();
				break;
			}
			case STAR:
			{
				AST __t21 = _t;
				antlr.CommonAST tmp6_AST = null;
				antlr.CommonAST tmp6_AST_in = null;
				tmp6_AST = (antlr.CommonAST)astFactory.create((antlr.CommonAST)_t);
				tmp6_AST_in = (antlr.CommonAST)_t;
				astFactory.addASTChild(currentAST, tmp6_AST);
				ASTPair __currentAST21 = currentAST.copy();
				currentAST.root = currentAST.child;
				currentAST.child = null;
				match(_t,STAR);
				_t = _t.getFirstChild();
				expr(_t);
				_t = _retTree;
				astFactory.addASTChild(currentAST, returnAST);
				expr(_t);
				_t = _retTree;
				astFactory.addASTChild(currentAST, returnAST);
				currentAST = __currentAST21;
				_t = __t21;
				_t = _t.getNextSibling();
				expr_AST = (antlr.CommonAST)currentAST.root;
				break;
			}
			case INT:
			{
				i = (antlr.CommonAST)_t;
				i_AST = (antlr.CommonAST)astFactory.create(i);
				astFactory.addASTChild(currentAST, i_AST);
				match(_t,INT);
				_t = _t.getNextSibling();
				expr_AST = (antlr.CommonAST)currentAST.root;
				break;
			}
			default:
			{
				throw new NoViableAltException();
			}
			}
		}
		catch (ParserException ex) {
			reportError(ex);
			if (_t!=null) {_t = _t.getNextSibling();}
		}
		returnAST = expr_AST;
		_retTree = _t;
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
	
	
}
