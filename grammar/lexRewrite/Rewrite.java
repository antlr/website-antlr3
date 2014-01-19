/*
 * ANTLR-generated file resulting from grammar rewrite.g
 * 
 * Terence Parr, MageLang Institute
 * with John Lilley, Empathy Software
 * ANTLR Version 2.2.2; 1996,1997
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
public class Rewrite extends antlr.CharScannerNoBacktrackingNoInteractive implements RewriteTokenTypes, Tokenizer
 {
public Rewrite(InputStream in) {
	this(new CharBufferNoBacktrackingNoInteractive(in));
}
public Rewrite(CharBufferNoBacktrackingNoInteractive cb) {
	super(cb);
	literals = new Hashtable();
caseSensitiveLiterals = true;
}

public Token nextToken() { return new CommonToken(Token.EOF_TYPE, ""); }

	protected final void mSTART(boolean _createToken) throws ScannerException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = START;
		int _saveIndex;
		Token id=null;
		Token expr=null;
		
		mID(true);
		id=_returnToken;
		{
		switch ( la_1) {
		case '\t':  case '\n':  case ' ':
		{
			_saveIndex=text.length();
			mWS(false);
			text.setLength(_saveIndex);
			break;
		}
		case ':':
		{
			break;
		}
		default:
		{
			throw new ScannerException("no viable alt for char: "+(char)LA(1),getLine());
		}
		}
		}
		_saveIndex=text.length();
		match(":=");
		text.setLength(_saveIndex);
		{
		switch ( la_1) {
		case '\t':  case '\n':  case ' ':
		{
			_saveIndex=text.length();
			mWS(false);
			text.setLength(_saveIndex);
			break;
		}
		case '(':
		{
			break;
		}
		default:
		{
			throw new ScannerException("no viable alt for char: "+(char)LA(1),getLine());
		}
		}
		}
		_saveIndex=text.length();
		match('(');
		text.setLength(_saveIndex);
		{
		switch ( la_1) {
		case '\t':  case '\n':  case ' ':
		{
			_saveIndex=text.length();
			mWS(false);
			text.setLength(_saveIndex);
			break;
		}
		case '0':  case '1':  case '2':  case '3':
		case '4':  case '5':  case '6':  case '7':
		case '8':  case '9':  case 'a':  case 'b':
		case 'c':  case 'd':  case 'e':  case 'f':
		case 'g':  case 'h':  case 'i':  case 'j':
		case 'k':  case 'l':  case 'm':  case 'n':
		case 'o':  case 'p':  case 'q':  case 'r':
		case 's':  case 't':  case 'u':  case 'v':
		case 'w':  case 'x':  case 'y':  case 'z':
		{
			break;
		}
		default:
		{
			throw new ScannerException("no viable alt for char: "+(char)LA(1),getLine());
		}
		}
		}
		mEXPR(true);
		expr=_returnToken;
		{
		switch ( la_1) {
		case '\t':  case '\n':  case ' ':
		{
			_saveIndex=text.length();
			mWS(false);
			text.setLength(_saveIndex);
			break;
		}
		case ')':
		{
			break;
		}
		default:
		{
			throw new ScannerException("no viable alt for char: "+(char)LA(1),getLine());
		}
		}
		}
		_saveIndex=text.length();
		match(')');
		text.setLength(_saveIndex);
		{
		if ((la_1=='\t'||la_1=='\n'||la_1==' ')) {
			_saveIndex=text.length();
			mWS(false);
			text.setLength(_saveIndex);
		}
		else {
		}
		
		}
		// can access text matched for any rule
		System.out.println("found "+id.getText()+","+expr.getText());
		// text will be ID+EXPR minus whitespace
		if ( _createToken && _token==null ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}

	protected final void mID(boolean _createToken) throws ScannerException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ID;
		int _saveIndex;
		Token let=null;
		
		{
		int _cnt9=0;
		_loop9:
		do {
			if (((la_1 >= 'a' && la_1 <= 'z'))) {
				mLETTER(true);
				let=_returnToken;
				System.out.println("letter "+let.getText());
			}
			else {
				if ( _cnt9>=1 ) { break _loop9; } else {throw new ScannerException("no viable alt for char: "+(char)LA(1),getLine());}
			}
			
			_cnt9++;
		} while (true);
		}
		if ( _createToken && _token==null ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}

	protected final void mEXPR(boolean _createToken) throws ScannerException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = EXPR;
		int _saveIndex;
		Token i=null;
		
		switch ( la_1) {
		case '0':  case '1':  case '2':  case '3':
		case '4':  case '5':  case '6':  case '7':
		case '8':  case '9':
		{
			_saveIndex=text.length();
			mINT(true);
			text.setLength(_saveIndex);
			i=_returnToken;
			text.setLength(_begin); text.append(i.getText());
			break;
		}
		case 'a':  case 'b':  case 'c':  case 'd':
		case 'e':  case 'f':  case 'g':  case 'h':
		case 'i':  case 'j':  case 'k':  case 'l':
		case 'm':  case 'n':  case 'o':  case 'p':
		case 'q':  case 'r':  case 's':  case 't':
		case 'u':  case 'v':  case 'w':  case 'x':
		case 'y':  case 'z':
		{
			mID(false);
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

	protected final void mLETTER(boolean _createToken) throws ScannerException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = LETTER;
		int _saveIndex;
		
		matchRange('a','z');
		String s = new String(text.getBuffer(),_begin,text.length()-_begin);		// get access text of this rule
		text.setLength(_begin); text.append(s.toUpperCase());	// can reset it too
		if ( _createToken && _token==null ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}

	protected final void mINT(boolean _createToken) throws ScannerException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = INT;
		int _saveIndex;
		
		{
		int _cnt14=0;
		_loop14:
		do {
			if (((la_1 >= '0' && la_1 <= '9'))) {
				matchRange('0','9');
			}
			else {
				if ( _cnt14>=1 ) { break _loop14; } else {throw new ScannerException("no viable alt for char: "+(char)LA(1),getLine());}
			}
			
			_cnt14++;
		} while (true);
		}
		if ( _createToken && _token==null ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}

	protected final void mWS(boolean _createToken) throws ScannerException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = WS;
		int _saveIndex;
		
		{
		int _cnt17=0;
		_loop17:
		do {
			switch ( la_1) {
			case ' ':
			{
				_saveIndex=text.length();
				match(' ');
				text.setLength(_saveIndex);
				break;
			}
			case '\t':
			{
				_saveIndex=text.length();
				match('\t');
				text.setLength(_saveIndex);
				break;
			}
			case '\n':
			{
				_saveIndex=text.length();
				match('\n');
				text.setLength(_saveIndex);
				newline();
				break;
			}
			default:
			{
				if ( _cnt17>=1 ) { break _loop17; } else {throw new ScannerException("no viable alt for char: "+(char)LA(1),getLine());}
			}
			}
			_cnt17++;
		} while (true);
		}
		_ttype = Token.SKIP;
		if ( _createToken && _token==null ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}

	
	
	}
