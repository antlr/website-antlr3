import antlr.*;
import antlr.collections.AST;

public class ASTMinMax extends BaseAST {
	/** What token was matched for this node */
	Token token;

	/** The index of the first token associated with this node */
	int min;

	/** The index of the first token associated with this node */
	int max;

	public void initialize(int i, String s) {
	}

	public void initialize(AST ast) {
	}

	public void initialize(Token token) {
		this.token = token;
		// a node starts out with min/max set to the index of the token
		min = max = ((TokenWithIndex)token).getIndex();
	}

	public String getText() {
		return token.getText();
	}

	public int getType() {
		return token.getType();
	}

	public int getMin() {
		return min;
	}

	public int getMax() {
		return max;
	}

	public void updateMinMax(ASTMinMax ast) {
		if ( this!=ast ) { // don't update yourself
			min = Math.min(getMin(), ast.getMin());
			max = Math.max(getMax(), ast.getMax());
		}
	}

	public void updateMinMaxFromSiblingList(ASTMinMax list) {
		if ( this!=list && list!=null ) { // don't update yourself
			ASTMinMax t = list;
			while (t != null) {
				this.updateMinMax(t); // update self with respect to each node
				t = (ASTMinMax)t.getNextSibling();
			}
		}
	}

	public String toString() {
		return super.toString()+"["+getMin()+".."+getMax()+"]";
	}
}
