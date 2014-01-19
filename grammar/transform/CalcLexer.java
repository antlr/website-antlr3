/*
 * ANTLR-generated file resulting from grammar calc.g
 * 
 * Terence Parr, MageLang Institute
 * with John Lilley, Empathy Software
 * ANTLR Version 2.20; 1996,1997
 */
import java.io.InputStream;
import java.util.Hashtable;
import antlr.CharScannerNoBacktrackingNoInteractive;
import antlr.CharBufferNoBacktrackingNoInteractive;
import antlr.Token;
import antlr.CommonToken;
import antlr.ScannerException;
import antlr.Tokenizer;
import antlr.ANTLRHashString;
import antlr.collections.impl.BitSet;
public class CalcLexer extends antlr.CharScannerNoBacktrackingNoInteractive implements CalcParserTokenTypes, Tokenizer
 {
public CalcLexer(InputStream in) {
	this(new CharBufferNoBacktrackingNoInteractive(in));
}
public CalcLexer(CharBufferNoBacktrackingNoInteractive cb) {
	super(cb);
	literals = new Hashtable();
caseSensitiveLiterals = true;
}

public Token nextToken() {
	Token _rettoken=null;
	for (;;) {
		Token _token = null;
		int _ttype = Token.INVALID_TYPE;
		resetText();
		try {   // for error handling
			switch ( la_1) {
			case '\t':  case '\n':  case '\r':  case ' ':
			{
				mWS(true);
				_rettoken=_returnToken;
				break;
			}
			case '(':
			{
				mLPAREN(true);
				_rettoken=_returnToken;
				break;
			}
			case ')':
			{
				mRPAREN(true);
				_rettoken=_returnToken;
				break;
			}
			case '*':
			{
				mSTAR(true);
				_rettoken=_returnToken;
				break;
			}
			case '+':
			{
				mPLUS(true);
				_rettoken=_returnToken;
				break;
			}
			case ';':
			{
				mSEMI(true);
				_rettoken=_returnToken;
				break;
			}
			case '0':  case '1':  case '2':  case '3':
			case '4':  case '5':  case '6':  case '7':
			case '8':  case '9':
			{
				mINT(true);
				_rettoken=_returnToken;
				break;
			}
			default:
			{
				if (LA(1)!=EOF_CHAR) throw new ScannerException("no viable alt for char: "+(char)LA(1),getLine());_returnToken = makeToken(Token.EOF_TYPE);
			}
			}
			_ttype = _returnToken.getType();
			_ttype = testLiteralsTable(_ttype);
			if ( _ttype!=Token.SKIP ) {
				_returnToken.setType(_ttype);
				return _returnToken;
			}
		}
		catch (ScannerException e) {
			consume();
			reportError(e);
		}
	}
}

	public final void mWS(boolean _createToken) throws ScannerException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = WS;
		int _saveIndex;
		
		{
		switch ( la_1) {
		case ' ':
		{
			match(' ');
			break;
		}
		case '\t':
		{
			match('\t');
			break;
		}
		case '\n':
		{
			match('\n');
			break;
		}
		case '\r':
		{
			match('\r');
			break;
		}
		default:
		{
			throw new ScannerException("no viable alt for char: "+(char)LA(1),getLine());
		}
		}
		}
		_ttype = Token.SKIP;
		if ( _createToken && _token==null ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}

	public final void mLPAREN(boolean _createToken) throws ScannerException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = LPAREN;
		int _saveIndex;
		
		match('(');
		if ( _createToken && _token==null ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}

	public final void mRPAREN(boolean _createToken) throws ScannerException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = RPAREN;
		int _saveIndex;
		
		match(')');
		if ( _createToken && _token==null ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}

	public final void mSTAR(boolean _createToken) throws ScannerException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = STAR;
		int _saveIndex;
		
		match('*');
		if ( _createToken && _token==null ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}

	public final void mPLUS(boolean _createToken) throws ScannerException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = PLUS;
		int _saveIndex;
		
		match('+');
		if ( _createToken && _token==null ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}

	public final void mSEMI(boolean _createToken) throws ScannerException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SEMI;
		int _saveIndex;
		
		match(';');
		if ( _createToken && _token==null ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}

	protected final void mDIGIT(boolean _createToken) throws ScannerException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = DIGIT;
		int _saveIndex;
		
		matchRange('0','9');
		if ( _createToken && _token==null ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}

	public final void mINT(boolean _createToken) throws ScannerException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = INT;
		int _saveIndex;
		
		{
		int _cnt=0;
		_loop:
		do {
			if (((la_1 >= '0' && la_1 <= '9'))) {
				mDIGIT(false);
			}
			else {
				if ( _cnt>=1 ) { break _loop; } else {throw new ScannerException("no viable alt for char: "+(char)LA(1),getLine());}
			}
			
			_cnt++;
		} while (true);
		}
		if ( _createToken && _token==null ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}

	
	
	}
