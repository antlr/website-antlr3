/*
 * ANTLR-generated file resulting from grammar treewalk.g
 * 
 * Terence Parr, MageLang Institute
 * with John Lilley, Empathy Software
 * ANTLR Version 2.20b4; 1996,1997
 */
import antlr.TreeParser;
import antlr.Token;
import antlr.collections.AST;
import antlr.ParserException;
import antlr.NoViableAltException;
import antlr.MismatchedTokenException;
import antlr.SemanticException;
import antlr.collections.impl.BitSet;

public class LangWalker extends antlr.TreeParser implements LangParserTokenTypes
 {
public LangWalker() {
	tokenNames = _tokenNames;
}

	public final void block(AST _t) throws ParserException {
		
		
		try {      // for error handling
			AST __t10 = _t;
			match(_t,BLOCK);
			_t = _t.getFirstChild();
			{
			int _cnt=0;
			_loop:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_tokenSet_0.member(_t.getType()))) {
					stat(_t);
					_t = _retTree;
				}
				else {
					if ( _cnt>=1 ) { break _loop; } else {throw new NoViableAltException();}
				}
				
				_cnt++;
			} while (true);
			}
			_t = __t10;
			_t = _t.getNextSibling();
		}
		catch (ParserException ex) {
			reportError(ex);
			if (_t!=null) {_t = _t.getNextSibling();}
		}
		_retTree = _t;
	}

	public final void stat(AST _t) throws ParserException {
		
		
		try {      // for error handling
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case LITERAL_if:
			{
				AST __t14 = _t;
				match(_t,LITERAL_if);
				_t = _t.getFirstChild();
				expr(_t);
				_t = _retTree;
				stat(_t);
				_t = _retTree;
				{
				if (_t==null) _t=ASTNULL;
				if ((_tokenSet_0.member(_t.getType()))) {
					stat(_t);
					_t = _retTree;
				}
				else {
					
				}
				
				}
				_t = __t14;
				_t = _t.getNextSibling();
				break;
			}
			case LITERAL_while:
			{
				AST __t17 = _t;
				match(_t,LITERAL_while);
				_t = _t.getFirstChild();
				expr(_t);
				_t = _retTree;
				stat(_t);
				_t = _retTree;
				_t = __t17;
				_t = _t.getNextSibling();
				break;
			}
			case EXPR:
			{
				expr(_t);
				_t = _retTree;
				break;
			}
			case BLOCK:
			{
				block(_t);
				_t = _retTree;
				break;
			}
			case ASSIGN:
			{
				AST __t18 = _t;
				match(_t,ASSIGN);
				_t = _t.getFirstChild();
				match(_t,ID);
				_t = _t.getNextSibling();
				expr(_t);
				_t = _retTree;
				_t = __t18;
				_t = _t.getNextSibling();
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
		_retTree = _t;
	}

	public final void expr(AST _t) throws ParserException {
		
		AST a = null;
		AST b = null;
		
		try {      // for error handling
			AST __t20 = _t;
			match(_t,EXPR);
			_t = _t.getFirstChild();
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case ID:
			{
				a = (AST)_t;
				match(_t,ID);
				_t = _t.getNextSibling();
				System.out.println("found ID "+a.getText());
				break;
			}
			case INT:
			{
				b = (AST)_t;
				match(_t,INT);
				_t = _t.getNextSibling();
				System.out.println("found INT "+b.getText());
				break;
			}
			default:
			{
				throw new NoViableAltException();
			}
			}
			}
			_t = __t20;
			_t = _t.getNextSibling();
		}
		catch (ParserException ex) {
			reportError(ex);
			if (_t!=null) {_t = _t.getNextSibling();}
		}
		_retTree = _t;
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
	
	private static final long _tokenSet_0_data_[] = { 107136L, 0L };
	public static final BitSet _tokenSet_0 = new BitSet(_tokenSet_0_data_);
	
}
