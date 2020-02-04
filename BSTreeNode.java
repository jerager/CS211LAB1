import java.util.Vector;

public class BSTreeNode<P extends Comparable<P>> {

	P p;

	BSTreeNode<P> right, left, parent;

	public BSTreeNode(P p){
		this.p = p;
	}


	public BSTreeNode<P> add(P newP) {

		// we found it - don't add it

		int compare = p.compareTo(newP);
		if (compare == 0)
			return this;
		if (compare < 0) {
			return null;
		}
		else {
			if (left == null) {
				left = new BSTreeNode<P>(newP);
				return left;
			}
			else {
				return left.add(newP);
			}
		}
	}


	public int count() {
		return 0;
		
	}


}

