
import antlr.ASTFactory;
import antlr.ASTPair;
import antlr.collections.AST;

/** The tree construction routines need to be modified so
 *  that they update the min max of any root node, indicating
 *  the index of the first and last token contained within
 *  any children.
 */
public class TrackerASTFactory extends ASTFactory {
	public TrackerASTFactory() {
		;
	}

	/** Only useful with AST nodes that track min/max */
	public Class getASTNodeType(int i) {
		return ASTMinMax.class; // force tree type
	}

	public void addASTChild(ASTPair currentAST, AST child) {
		super.addASTChild(currentAST, child);
		// very inefficient as it must rewalk children, but given
		// current implementation of ASTPair (root is not always
		// a real root), I must walk children to set min/max of root
		// to be sure the values are correct; i must walk the children
		// for each child addition. :(  Oh well.
		if (currentAST.root != null) {
			((ASTMinMax)currentAST.root)
					.updateMinMaxFromSiblingList((ASTMinMax)currentAST.root.getFirstChild());
		}
	}

	public void makeASTRoot(ASTPair currentAST, AST root) {
		super.makeASTRoot(currentAST, root);
		// update the root to have min/max of all children
		// not the most efficient way to do this.  Should
		// track min/max in currentAST ASTPair for a sibling list
		((ASTMinMax)root).updateMinMaxFromSiblingList((ASTMinMax)root.getFirstChild());
	}
}
