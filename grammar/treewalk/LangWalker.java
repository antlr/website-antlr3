/*
 * ANTLR-generated file resulting from grammar treewalk.g
 * 
 * Terence Parr, MageLang Institute
 * with John Lilley, Empathy Software
 * ANTLR Version 2.20b3; 1996,1997
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
			AST __t19 = _t;
			match(_t,LCURLY);
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
			_t = __t19;
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
				AST __t23 = _t;
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
				_t = __t23;
				_t = _t.getNextSibling();
				break;
			}
			case LITERAL_while:
			{
				AST __t26 = _t;
				match(_t,LITERAL_while);
				_t = _t.getFirstChild();
				expr(_t);
				_t = _retTree;
				stat(_t);
				_t = _retTree;
				_t = __t26;
				_t = _t.getNextSibling();
				break;
			}
			case ASSIGN:
			case PLUS:
			case STAR:
			case ID:
			case INT:
			{
				expr(_t);
				_t = _retTree;
				break;
			}
			case LCURLY:
			{
				block(_t);
				_t = _retTree;
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
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case ASSIGN:
			{
				AST __t28 = _t;
				match(_t,ASSIGN);
				_t = _t.getFirstChild();
				expr(_t);
				_t = _retTree;
				expr(_t);
				_t = _retTree;
				_t = __t28;
				_t = _t.getNextSibling();
				System.out.println("found assign");
				break;
			}
			case PLUS:
			{
				AST __t29 = _t;
				match(_t,PLUS);
				_t = _t.getFirstChild();
				expr(_t);
				_t = _retTree;
				expr(_t);
				_t = _retTree;
				_t = __t29;
				_t = _t.getNextSibling();
				System.out.println("found +");
				break;
			}
			case STAR:
			{
				AST __t30 = _t;
				match(_t,STAR);
				_t = _t.getFirstChild();
				expr(_t);
				_t = _retTree;
				expr(_t);
				_t = _retTree;
				_t = __t30;
				_t = _t.getNextSibling();
				System.out.println("found *");
				break;
			}
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
		catch (ParserException ex) {
			reportError(ex);
			if (_t!=null) {_t = _t.getNextSibling();}
		}
		_retTree = _t;
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
	
	private static final long _tokenSet_0_data_[] = { 129168L, 0L };
	public static final BitSet _tokenSet_0 = new BitSet(_tokenSet_0_data_);
	
}
