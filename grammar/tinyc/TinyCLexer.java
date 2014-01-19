/*
 * ANTLR-generated file resulting from grammar lexer.g
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
public class TinyCLexer extends antlr.CharScannerNoBacktrackingNoInteractive implements TinyCTokenTypes, Tokenizer
 {
public TinyCLexer(InputStream in) {
	this(new CharBufferNoBacktrackingNoInteractive(in));
}
public TinyCLexer(CharBufferNoBacktrackingNoInteractive cb) {
	super(cb);
	literals = new Hashtable();
	literals.put(new ANTLRHashString("while", this), new Integer(8));
	literals.put(new ANTLRHashString("else", this), new Integer(7));
	literals.put(new ANTLRHashString("int", this), new Integer(5));
	literals.put(new ANTLRHashString("if", this), new Integer(4));
	literals.put(new ANTLRHashString("char", this), new Integer(6));
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
			case '"':
			{
				mSTRING_LITERAL(true);
				_rettoken=_returnToken;
				break;
			}
			case '\'':
			{
				mCHAR_LITERAL(true);
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
			case '{':
			{
				mLCURLY(true);
				_rettoken=_returnToken;
				break;
			}
			case '}':
			{
				mRCURLY(true);
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
			case '=':
			{
				mASSIGN(true);
				_rettoken=_returnToken;
				break;
			}
			case ';':
			{
				mSEMI(true);
				_rettoken=_returnToken;
				break;
			}
			case ',':
			{
				mCOMMA(true);
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
			case 'A':  case 'B':  case 'C':  case 'D':
			case 'E':  case 'F':  case 'G':  case 'H':
			case 'I':  case 'J':  case 'K':  case 'L':
			case 'M':  case 'N':  case 'O':  case 'P':
			case 'Q':  case 'R':  case 'S':  case 'T':
			case 'U':  case 'V':  case 'W':  case 'X':
			case 'Y':  case 'Z':  case '_':  case 'a':
			case 'b':  case 'c':  case 'd':  case 'e':
			case 'f':  case 'g':  case 'h':  case 'i':
			case 'j':  case 'k':  case 'l':  case 'm':
			case 'n':  case 'o':  case 'p':  case 'q':
			case 'r':  case 's':  case 't':  case 'u':
			case 'v':  case 'w':  case 'x':  case 'y':
			case 'z':
			{
				mID(true);
				_rettoken=_returnToken;
				break;
			}
			default:
				if ((la_1=='/') && (la_2=='/')) {
					mSL_COMMENT(true);
					_rettoken=_returnToken;
				}
				else if ((la_1=='/') && (la_2=='*')) {
					mML_COMMENT(true);
					_rettoken=_returnToken;
				}
			else {
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
			newline();
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

	public final void mSL_COMMENT(boolean _createToken) throws ScannerException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SL_COMMENT;
		int _saveIndex;
		
		match("//");
		{
		_loop5:
		do {
			if ((_tokenSet_0.member(la_1))) {
				matchNot('\n');
			}
			else {
				break _loop5;
			}
			
		} while (true);
		}
		match('\n');
		_ttype = Token.SKIP; newline();
		if ( _createToken && _token==null ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}

	public final void mML_COMMENT(boolean _createToken) throws ScannerException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ML_COMMENT;
		int _saveIndex;
		
		match("/*");
		{
		_loop8:
		do {
			switch ( la_1) {
			case '"':
			{
				mSTRING_LITERAL(false);
				break;
			}
			case '\'':
			{
				mCHAR_LITERAL(false);
				break;
			}
			case '\n':
			{
				match('\n');
				newline();
				break;
			}
			case '\3':  case '\4':  case '\5':  case '\6':
			case '\7':  case '\10':  case '\t':  case '\13':
			case '\14':  case '\r':  case '\16':  case '\17':
			case '\20':  case '\21':  case '\22':  case '\23':
			case '\24':  case '\25':  case '\26':  case '\27':
			case '\30':  case '\31':  case '\32':  case '\33':
			case '\34':  case '\35':  case '\36':  case '\37':
			case ' ':  case '!':  case '#':  case '$':
			case '%':  case '&':  case '(':  case ')':
			case '+':  case ',':  case '-':  case '.':
			case '/':  case '0':  case '1':  case '2':
			case '3':  case '4':  case '5':  case '6':
			case '7':  case '8':  case '9':  case ':':
			case ';':  case '<':  case '=':  case '>':
			case '?':  case '@':  case 'A':  case 'B':
			case 'C':  case 'D':  case 'E':  case 'F':
			case 'G':  case 'H':  case 'I':  case 'J':
			case 'K':  case 'L':  case 'M':  case 'N':
			case 'O':  case 'P':  case 'Q':  case 'R':
			case 'S':  case 'T':  case 'U':  case 'V':
			case 'W':  case 'X':  case 'Y':  case 'Z':
			case '[':  case '\\':  case ']':  case '^':
			case '_':  case '`':  case 'a':  case 'b':
			case 'c':  case 'd':  case 'e':  case 'f':
			case 'g':  case 'h':  case 'i':  case 'j':
			case 'k':  case 'l':  case 'm':  case 'n':
			case 'o':  case 'p':  case 'q':  case 'r':
			case 's':  case 't':  case 'u':  case 'v':
			case 'w':  case 'x':  case 'y':  case 'z':
			case '{':  case '|':  case '}':  case '~':
			case '\177':  case '\200':  case '\201':  case '\202':
			case '\203':  case '\204':  case '\205':  case '\206':
			case '\207':  case '\210':  case '\211':  case '\212':
			case '\213':  case '\214':  case '\215':  case '\216':
			case '\217':  case '\220':  case '\221':  case '\222':
			case '\223':  case '\224':  case '\225':  case '\226':
			case '\227':  case '\230':  case '\231':  case '\232':
			case '\233':  case '\234':  case '\235':  case '\236':
			case '\237':  case '\240':  case '\241':  case '\242':
			case '\243':  case '\244':  case '\245':  case '\246':
			case '\247':  case '\250':  case '\251':  case '\252':
			case '\253':  case '\254':  case '\255':  case '\256':
			case '\257':  case '\260':  case '\261':  case '\262':
			case '\263':  case '\264':  case '\265':  case '\266':
			case '\267':  case '\270':  case '\271':  case '\272':
			case '\273':  case '\274':  case '\275':  case '\276':
			case '\277':  case '\300':  case '\301':  case '\302':
			case '\303':  case '\304':  case '\305':  case '\306':
			case '\307':  case '\310':  case '\311':  case '\312':
			case '\313':  case '\314':  case '\315':  case '\316':
			case '\317':  case '\320':  case '\321':  case '\322':
			case '\323':  case '\324':  case '\325':  case '\326':
			case '\327':  case '\330':  case '\331':  case '\332':
			case '\333':  case '\334':  case '\335':  case '\336':
			case '\337':  case '\340':  case '\341':  case '\342':
			case '\343':  case '\344':  case '\345':  case '\346':
			case '\347':  case '\350':  case '\351':  case '\352':
			case '\353':  case '\354':  case '\355':  case '\356':
			case '\357':  case '\360':  case '\361':  case '\362':
			case '\363':  case '\364':  case '\365':  case '\366':
			case '\367':  case '\370':  case '\371':  case '\372':
			case '\373':  case '\374':  case '\375':  case '\376':
			case '\377':
			{
				matchNot('*');
				break;
			}
			default:
				if ((la_1=='*') && (_tokenSet_1.member(la_2))) {
					match('*');
					matchNot('/');
				}
			else {
				break _loop8;
			}
			}
		} while (true);
		}
		match("*/");
		_ttype = Token.SKIP;
		if ( _createToken && _token==null ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}

	public final void mSTRING_LITERAL(boolean _createToken) throws ScannerException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = STRING_LITERAL;
		int _saveIndex;
		
		match('"');
		{
		_loop22:
		do {
			switch ( la_1) {
			case '\\':
			{
				mESC(false);
				break;
			}
			case '\3':  case '\4':  case '\5':  case '\6':
			case '\7':  case '\10':  case '\t':  case '\n':
			case '\13':  case '\14':  case '\r':  case '\16':
			case '\17':  case '\20':  case '\21':  case '\22':
			case '\23':  case '\24':  case '\25':  case '\26':
			case '\27':  case '\30':  case '\31':  case '\32':
			case '\33':  case '\34':  case '\35':  case '\36':
			case '\37':  case ' ':  case '!':  case '#':
			case '$':  case '%':  case '&':  case '\'':
			case '(':  case ')':  case '*':  case '+':
			case ',':  case '-':  case '.':  case '/':
			case '0':  case '1':  case '2':  case '3':
			case '4':  case '5':  case '6':  case '7':
			case '8':  case '9':  case ':':  case ';':
			case '<':  case '=':  case '>':  case '?':
			case '@':  case 'A':  case 'B':  case 'C':
			case 'D':  case 'E':  case 'F':  case 'G':
			case 'H':  case 'I':  case 'J':  case 'K':
			case 'L':  case 'M':  case 'N':  case 'O':
			case 'P':  case 'Q':  case 'R':  case 'S':
			case 'T':  case 'U':  case 'V':  case 'W':
			case 'X':  case 'Y':  case 'Z':  case '[':
			case ']':  case '^':  case '_':  case '`':
			case 'a':  case 'b':  case 'c':  case 'd':
			case 'e':  case 'f':  case 'g':  case 'h':
			case 'i':  case 'j':  case 'k':  case 'l':
			case 'm':  case 'n':  case 'o':  case 'p':
			case 'q':  case 'r':  case 's':  case 't':
			case 'u':  case 'v':  case 'w':  case 'x':
			case 'y':  case 'z':  case '{':  case '|':
			case '}':  case '~':  case '\177':  case '\200':
			case '\201':  case '\202':  case '\203':  case '\204':
			case '\205':  case '\206':  case '\207':  case '\210':
			case '\211':  case '\212':  case '\213':  case '\214':
			case '\215':  case '\216':  case '\217':  case '\220':
			case '\221':  case '\222':  case '\223':  case '\224':
			case '\225':  case '\226':  case '\227':  case '\230':
			case '\231':  case '\232':  case '\233':  case '\234':
			case '\235':  case '\236':  case '\237':  case '\240':
			case '\241':  case '\242':  case '\243':  case '\244':
			case '\245':  case '\246':  case '\247':  case '\250':
			case '\251':  case '\252':  case '\253':  case '\254':
			case '\255':  case '\256':  case '\257':  case '\260':
			case '\261':  case '\262':  case '\263':  case '\264':
			case '\265':  case '\266':  case '\267':  case '\270':
			case '\271':  case '\272':  case '\273':  case '\274':
			case '\275':  case '\276':  case '\277':  case '\300':
			case '\301':  case '\302':  case '\303':  case '\304':
			case '\305':  case '\306':  case '\307':  case '\310':
			case '\311':  case '\312':  case '\313':  case '\314':
			case '\315':  case '\316':  case '\317':  case '\320':
			case '\321':  case '\322':  case '\323':  case '\324':
			case '\325':  case '\326':  case '\327':  case '\330':
			case '\331':  case '\332':  case '\333':  case '\334':
			case '\335':  case '\336':  case '\337':  case '\340':
			case '\341':  case '\342':  case '\343':  case '\344':
			case '\345':  case '\346':  case '\347':  case '\350':
			case '\351':  case '\352':  case '\353':  case '\354':
			case '\355':  case '\356':  case '\357':  case '\360':
			case '\361':  case '\362':  case '\363':  case '\364':
			case '\365':  case '\366':  case '\367':  case '\370':
			case '\371':  case '\372':  case '\373':  case '\374':
			case '\375':  case '\376':  case '\377':
			{
				matchNot('"');
				break;
			}
			default:
			{
				break _loop22;
			}
			}
		} while (true);
		}
		match('"');
		if ( _createToken && _token==null ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}

	public final void mCHAR_LITERAL(boolean _createToken) throws ScannerException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = CHAR_LITERAL;
		int _saveIndex;
		
		match('\'');
		{
		switch ( la_1) {
		case '\\':
		{
			mESC(false);
			break;
		}
		case '\3':  case '\4':  case '\5':  case '\6':
		case '\7':  case '\10':  case '\t':  case '\n':
		case '\13':  case '\14':  case '\r':  case '\16':
		case '\17':  case '\20':  case '\21':  case '\22':
		case '\23':  case '\24':  case '\25':  case '\26':
		case '\27':  case '\30':  case '\31':  case '\32':
		case '\33':  case '\34':  case '\35':  case '\36':
		case '\37':  case ' ':  case '!':  case '"':
		case '#':  case '$':  case '%':  case '&':
		case '(':  case ')':  case '*':  case '+':
		case ',':  case '-':  case '.':  case '/':
		case '0':  case '1':  case '2':  case '3':
		case '4':  case '5':  case '6':  case '7':
		case '8':  case '9':  case ':':  case ';':
		case '<':  case '=':  case '>':  case '?':
		case '@':  case 'A':  case 'B':  case 'C':
		case 'D':  case 'E':  case 'F':  case 'G':
		case 'H':  case 'I':  case 'J':  case 'K':
		case 'L':  case 'M':  case 'N':  case 'O':
		case 'P':  case 'Q':  case 'R':  case 'S':
		case 'T':  case 'U':  case 'V':  case 'W':
		case 'X':  case 'Y':  case 'Z':  case '[':
		case ']':  case '^':  case '_':  case '`':
		case 'a':  case 'b':  case 'c':  case 'd':
		case 'e':  case 'f':  case 'g':  case 'h':
		case 'i':  case 'j':  case 'k':  case 'l':
		case 'm':  case 'n':  case 'o':  case 'p':
		case 'q':  case 'r':  case 's':  case 't':
		case 'u':  case 'v':  case 'w':  case 'x':
		case 'y':  case 'z':  case '{':  case '|':
		case '}':  case '~':  case '\177':  case '\200':
		case '\201':  case '\202':  case '\203':  case '\204':
		case '\205':  case '\206':  case '\207':  case '\210':
		case '\211':  case '\212':  case '\213':  case '\214':
		case '\215':  case '\216':  case '\217':  case '\220':
		case '\221':  case '\222':  case '\223':  case '\224':
		case '\225':  case '\226':  case '\227':  case '\230':
		case '\231':  case '\232':  case '\233':  case '\234':
		case '\235':  case '\236':  case '\237':  case '\240':
		case '\241':  case '\242':  case '\243':  case '\244':
		case '\245':  case '\246':  case '\247':  case '\250':
		case '\251':  case '\252':  case '\253':  case '\254':
		case '\255':  case '\256':  case '\257':  case '\260':
		case '\261':  case '\262':  case '\263':  case '\264':
		case '\265':  case '\266':  case '\267':  case '\270':
		case '\271':  case '\272':  case '\273':  case '\274':
		case '\275':  case '\276':  case '\277':  case '\300':
		case '\301':  case '\302':  case '\303':  case '\304':
		case '\305':  case '\306':  case '\307':  case '\310':
		case '\311':  case '\312':  case '\313':  case '\314':
		case '\315':  case '\316':  case '\317':  case '\320':
		case '\321':  case '\322':  case '\323':  case '\324':
		case '\325':  case '\326':  case '\327':  case '\330':
		case '\331':  case '\332':  case '\333':  case '\334':
		case '\335':  case '\336':  case '\337':  case '\340':
		case '\341':  case '\342':  case '\343':  case '\344':
		case '\345':  case '\346':  case '\347':  case '\350':
		case '\351':  case '\352':  case '\353':  case '\354':
		case '\355':  case '\356':  case '\357':  case '\360':
		case '\361':  case '\362':  case '\363':  case '\364':
		case '\365':  case '\366':  case '\367':  case '\370':
		case '\371':  case '\372':  case '\373':  case '\374':
		case '\375':  case '\376':  case '\377':
		{
			matchNot('\'');
			break;
		}
		default:
		{
			throw new ScannerException("no viable alt for char: "+(char)LA(1),getLine());
		}
		}
		}
		match('\'');
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

	public final void mLCURLY(boolean _createToken) throws ScannerException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = LCURLY;
		int _saveIndex;
		
		match('{');
		if ( _createToken && _token==null ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}

	public final void mRCURLY(boolean _createToken) throws ScannerException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = RCURLY;
		int _saveIndex;
		
		match('}');
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

	public final void mASSIGN(boolean _createToken) throws ScannerException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ASSIGN;
		int _saveIndex;
		
		match('=');
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

	public final void mCOMMA(boolean _createToken) throws ScannerException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = COMMA;
		int _saveIndex;
		
		match(',');
		if ( _createToken && _token==null ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}

	protected final void mESC(boolean _createToken) throws ScannerException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ESC;
		int _saveIndex;
		
		match('\\');
		{
		switch ( la_1) {
		case 'n':
		{
			match('n');
			break;
		}
		case 'r':
		{
			match('r');
			break;
		}
		case 't':
		{
			match('t');
			break;
		}
		case 'b':
		{
			match('b');
			break;
		}
		case 'f':
		{
			match('f');
			break;
		}
		case '"':
		{
			match('"');
			break;
		}
		case '\'':
		{
			match('\'');
			break;
		}
		case '\\':
		{
			match('\\');
			break;
		}
		case '0':  case '1':  case '2':  case '3':
		{
			matchRange('0','3');
			{
			if (((la_1 >= '0' && la_1 <= '9')) && ((la_2 >= '\3' && la_2 <= '\377'))) {
				mDIGIT(false);
				{
				if (((la_1 >= '0' && la_1 <= '9')) && ((la_2 >= '\3' && la_2 <= '\377'))) {
					mDIGIT(false);
				}
				else if (((la_1 >= '\3' && la_1 <= '\377'))) {
				}
				else {
					throw new ScannerException("no viable alt for char: "+(char)LA(1),getLine());
				}
				
				}
			}
			else if (((la_1 >= '\3' && la_1 <= '\377'))) {
			}
			else {
				throw new ScannerException("no viable alt for char: "+(char)LA(1),getLine());
			}
			
			}
			break;
		}
		case '4':  case '5':  case '6':  case '7':
		{
			matchRange('4','7');
			{
			if (((la_1 >= '0' && la_1 <= '9')) && ((la_2 >= '\3' && la_2 <= '\377'))) {
				mDIGIT(false);
			}
			else if (((la_1 >= '\3' && la_1 <= '\377'))) {
			}
			else {
				throw new ScannerException("no viable alt for char: "+(char)LA(1),getLine());
			}
			
			}
			break;
		}
		default:
		{
			throw new ScannerException("no viable alt for char: "+(char)LA(1),getLine());
		}
		}
		}
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
		int _cnt31=0;
		_loop31:
		do {
			if (((la_1 >= '0' && la_1 <= '9'))) {
				mDIGIT(false);
			}
			else {
				if ( _cnt31>=1 ) { break _loop31; } else {throw new ScannerException("no viable alt for char: "+(char)LA(1),getLine());}
			}
			
			_cnt31++;
		} while (true);
		}
		if ( _createToken && _token==null ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}

	public final void mID(boolean _createToken) throws ScannerException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ID;
		int _saveIndex;
		
		{
		switch ( la_1) {
		case 'a':  case 'b':  case 'c':  case 'd':
		case 'e':  case 'f':  case 'g':  case 'h':
		case 'i':  case 'j':  case 'k':  case 'l':
		case 'm':  case 'n':  case 'o':  case 'p':
		case 'q':  case 'r':  case 's':  case 't':
		case 'u':  case 'v':  case 'w':  case 'x':
		case 'y':  case 'z':
		{
			matchRange('a','z');
			break;
		}
		case 'A':  case 'B':  case 'C':  case 'D':
		case 'E':  case 'F':  case 'G':  case 'H':
		case 'I':  case 'J':  case 'K':  case 'L':
		case 'M':  case 'N':  case 'O':  case 'P':
		case 'Q':  case 'R':  case 'S':  case 'T':
		case 'U':  case 'V':  case 'W':  case 'X':
		case 'Y':  case 'Z':
		{
			matchRange('A','Z');
			break;
		}
		case '_':
		{
			match('_');
			break;
		}
		default:
		{
			throw new ScannerException("no viable alt for char: "+(char)LA(1),getLine());
		}
		}
		}
		{
		_loop35:
		do {
			switch ( la_1) {
			case 'a':  case 'b':  case 'c':  case 'd':
			case 'e':  case 'f':  case 'g':  case 'h':
			case 'i':  case 'j':  case 'k':  case 'l':
			case 'm':  case 'n':  case 'o':  case 'p':
			case 'q':  case 'r':  case 's':  case 't':
			case 'u':  case 'v':  case 'w':  case 'x':
			case 'y':  case 'z':
			{
				matchRange('a','z');
				break;
			}
			case 'A':  case 'B':  case 'C':  case 'D':
			case 'E':  case 'F':  case 'G':  case 'H':
			case 'I':  case 'J':  case 'K':  case 'L':
			case 'M':  case 'N':  case 'O':  case 'P':
			case 'Q':  case 'R':  case 'S':  case 'T':
			case 'U':  case 'V':  case 'W':  case 'X':
			case 'Y':  case 'Z':
			{
				matchRange('A','Z');
				break;
			}
			case '_':
			{
				match('_');
				break;
			}
			case '0':  case '1':  case '2':  case '3':
			case '4':  case '5':  case '6':  case '7':
			case '8':  case '9':
			{
				matchRange('0','9');
				break;
			}
			default:
			{
				break _loop35;
			}
			}
		} while (true);
		}
		_ttype = testLiteralsTable(_ttype);
		if ( _createToken && _token==null ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}

	
	private static final long _tokenSet_0_data_[] = { -1032L, -1L, -1L, -1L, 0L, 0L, 0L, 0L };
	public static final BitSet _tokenSet_0 = new BitSet(_tokenSet_0_data_);
	private static final long _tokenSet_1_data_[] = { -140737488355336L, -1L, -1L, -1L, 0L, 0L, 0L, 0L };
	public static final BitSet _tokenSet_1 = new BitSet(_tokenSet_1_data_);
	
	}
