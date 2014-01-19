import antlr.CommonToken;

public class TokenWithIndex extends CommonToken {
    /** Index into token array indicating position in input stream */
    int index;

	public void setIndex(int i) {
		index = i;
	}

	public int getIndex() {
		return index;
	}

	public String toString() {
		return "["+index+":\"" + getText() + "\",<" + getType() + ">,line=" + line + ",col=" +
col + "]\n";
	}
}
