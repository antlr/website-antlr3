// $ANTLR 2.7.3-20030430: "calc.g" -> "CalcTreeWalker.java"$

import antlr.TreeParser;
import antlr.Token;
import antlr.collections.AST;
import antlr.RecognitionException;
import antlr.ANTLRException;
import antlr.NoViableAltException;
import antlr.MismatchedTokenException;
import antlr.SemanticException;
import antlr.collections.impl.BitSet;
import antlr.ASTPair;
import antlr.collections.impl.ASTArray;


public class CalcTreeWalker extends antlr.TreeParser       implements CalcParserTokenTypes
 {

	TokenStreamTracker tracker;
	public CalcTreeWalker(TokenStreamTracker tracker) {
		this();
		this.tracker = tracker;
	}
public CalcTreeWalker() {
	tokenNames = _tokenNames;
}

	public final void prog(AST _t) throws RecognitionException {
		
		ASTMinMax prog_AST_in = (ASTMinMax)_t;
		
		try {      // for error handling
			{
			int _cnt29=0;
			_loop29:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_t.getType()==EQUALS||_t.getType()==LITERAL_print)) {
					stat(_t);
					_t = _retTree;
				}
				else {
					if ( _cnt29>=1 ) { break _loop29; } else {throw new NoViableAltException(_t);}
				}
				
				_cnt29++;
			} while (true);
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			if (_t!=null) {_t = _t.getNextSibling();}
		}
		_retTree = _t;
	}
	
	public final void stat(AST _t) throws RecognitionException {
		
		ASTMinMax stat_AST_in = (ASTMinMax)_t;
		ASTMinMax a = null;
		ASTMinMax p = null;
		
		try {      // for error handling
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case EQUALS:
			{
				AST __t31 = _t;
				a = _t==ASTNULL ? null :(ASTMinMax)_t;
				match(_t,EQUALS);
				_t = _t.getFirstChild();
				ASTMinMax tmp1_AST_in = (ASTMinMax)_t;
				match(_t,ID);
				_t = _t.getNextSibling();
				expr(_t);
				_t = _retTree;
				_t = __t31;
				_t = _t.getNextSibling();
				System.out.println("assign: "+tracker.toString(a.getMin(),a.getMax()));
				break;
			}
			case LITERAL_print:
			{
				AST __t32 = _t;
				p = _t==ASTNULL ? null :(ASTMinMax)_t;
				match(_t,LITERAL_print);
				_t = _t.getFirstChild();
				expr(_t);
				_t = _retTree;
				_t = __t32;
				_t = _t.getNextSibling();
				System.out.println("print: "+tracker.toString(p.getMin(),p.getMax()));
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			if (_t!=null) {_t = _t.getNextSibling();}
		}
		_retTree = _t;
	}
	
	public final void expr(AST _t) throws RecognitionException {
		
		ASTMinMax expr_AST_in = (ASTMinMax)_t;
		ASTMinMax p = null;
		
		try {      // for error handling
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case PLUS:
			{
				AST __t34 = _t;
				p = _t==ASTNULL ? null :(ASTMinMax)_t;
				match(_t,PLUS);
				_t = _t.getFirstChild();
				expr(_t);
				_t = _retTree;
				expr(_t);
				_t = _retTree;
				_t = __t34;
				_t = _t.getNextSibling();
				System.out.println("addition: "+tracker.toString(p.getMin(),p.getMax()));
				break;
			}
			case STAR:
			{
				AST __t35 = _t;
				ASTMinMax tmp2_AST_in = (ASTMinMax)_t;
				match(_t,STAR);
				_t = _t.getFirstChild();
				expr(_t);
				_t = _retTree;
				expr(_t);
				_t = _retTree;
				_t = __t35;
				_t = _t.getNextSibling();
				break;
			}
			case INT:
			{
				ASTMinMax tmp3_AST_in = (ASTMinMax)_t;
				match(_t,INT);
				_t = _t.getNextSibling();
				break;
			}
			case ID:
			{
				ASTMinMax tmp4_AST_in = (ASTMinMax)_t;
				match(_t,ID);
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			if (_t!=null) {_t = _t.getNextSibling();}
		}
		_retTree = _t;
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
	
	}
	
