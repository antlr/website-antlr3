/*
 * ANTLR-generated file resulting from grammar simple.g
 * 
 * Terence Parr, MageLang Institute
 * with John Lilley, Empathy Software
 * ANTLR Version 2.20b3; 1996,1997
 */

/* empty header */

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
public class SimpleLexer extends antlr.CharScannerNoBacktrackingNoInteractive implements SimpleTokenTypes, Tokenizer
 {
public SimpleLexer(InputStream in) {
	this(new CharBufferNoBacktrackingNoInteractive(in));
}
public SimpleLexer(CharBufferNoBacktrackingNoInteractive cb) {
	super(cb);
	literals = new Hashtable();
caseSensitiveLiterals = true;
}

public Token nextToken() {
	for (;;) {
		Token _token = null;
		int _ttype = Token.INVALID_TYPE;
		resetText();
		try {   // for error handling
			switch ( la_1) {
			case '\t':  case '\n':  case '\r':  case ' ':
			{
				mWS(true);
				Token _rettoken=_returnToken;
				break;
			}
			case 'A':  case 'a':
			{
				mA(true);
				Token _rettoken=_returnToken;
				break;
			}
			case 'B':  case 'b':
			{
				mB(true);
				Token _rettoken=_returnToken;
				break;
			}
			case 'C':  case 'c':
			{
				mC(true);
				Token _rettoken=_returnToken;
				break;
			}
			case 'D':  case 'd':
			{
				mD(true);
				Token _rettoken=_returnToken;
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

	public final void mA(boolean _createToken) throws ScannerException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = A;
		int _saveIndex;
		
		switch ( la_1) {
		case 'a':
		{
			match('a');
			break;
		}
		case 'A':
		{
			match('A');
			break;
		}
		default:
		{
			throw new ScannerException("no viable alt for char: "+(char)LA(1),getLine());
		}
		}
		if ( _createToken && _token==null ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}

	public final void mB(boolean _createToken) throws ScannerException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = B;
		int _saveIndex;
		
		switch ( la_1) {
		case 'b':
		{
			match('b');
			break;
		}
		case 'B':
		{
			match('B');
			break;
		}
		default:
		{
			throw new ScannerException("no viable alt for char: "+(char)LA(1),getLine());
		}
		}
		if ( _createToken && _token==null ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}

	public final void mC(boolean _createToken) throws ScannerException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = C;
		int _saveIndex;
		
		switch ( la_1) {
		case 'c':
		{
			match('c');
			break;
		}
		case 'C':
		{
			match('C');
			break;
		}
		default:
		{
			throw new ScannerException("no viable alt for char: "+(char)LA(1),getLine());
		}
		}
		if ( _createToken && _token==null ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}

	public final void mD(boolean _createToken) throws ScannerException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = D;
		int _saveIndex;
		
		switch ( la_1) {
		case 'd':
		{
			match('d');
			break;
		}
		case 'D':
		{
			match('D');
			break;
		}
		default:
		{
			throw new ScannerException("no viable alt for char: "+(char)LA(1),getLine());
		}
		}
		if ( _createToken && _token==null ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}

	
	
	}
