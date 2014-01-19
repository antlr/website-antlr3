
import antlr.TokenStream;
import antlr.Token;
import antlr.TokenStreamException;
import antlr.collections.impl.BitSet;

import java.util.List;
import java.util.ArrayList;

/** This token stream tracks the entire token stream coming from
 *  a lexer, but does not pass on the whitespace to the parser.
 *
 *  This class can then be asked for the ith token in the input stream.
 *  Useful for dumping out the input stream exactly after doing some
 *  augmentation or other manipulations.
 */
public class TokenStreamTracker implements TokenStream {
	/** Track the incoming list of tokens */
	protected List tokens = new ArrayList();

	/** track index of tokens; first token position is 0 */
	int index = 0;

	/** Who do we suck tokens from? */
	TokenStream stream;

	/** Which (whitespace) token(s) to throw out */
	protected BitSet discardMask = new BitSet();

	public TokenStreamTracker(TokenStream upstream) {
		stream = upstream;
	}

	public Token nextToken() throws TokenStreamException {
		TokenWithIndex t;
		// suck tokens until end of stream or we find a non-discarded token
		do {
           	t = (TokenWithIndex)stream.nextToken();
			if ( t!=null && t.getType()!=Token.EOF_TYPE) {
				t.setIndex(index);  // what is t's index in list?
				tokens.add(t); 		// track all tokens
				index++;			// move to next position
			}
		} while ( t!=null && discardMask.member(t.getType()) );
		return t;
	}

	public void discard(int ttype) {
		discardMask.add(ttype);
	}

	public Token getToken(int i) {
		return (Token)tokens.get(i);
	}

	public int getTokenStreamSize() {
		return tokens.size();
	}

	public String toString() {
		return toString(0, getTokenStreamSize());
	}

	public String toString(int start, int end) {
		StringBuffer buf = new StringBuffer();
		for (int i=start; i>=0 && i<=end && i<tokens.size(); i++) {
			buf.append(getToken(i).getText());
		}
		return buf.toString();
	}

	public String toDebugString() {
		return toDebugString(0, getTokenStreamSize());
	}

	public String toDebugString(int start, int end) {
		StringBuffer buf = new StringBuffer();
		for (int i=start; i>=0 && i<=end && i<tokens.size(); i++) {
			buf.append(getToken(i));
		}
		return buf.toString();
	}
}
