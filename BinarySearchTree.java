import java.util.ArrayList;


public class BinarySearchTree<P extends Comparable<P>> {

	private BSTreeNode<P> root;

	
	public void add(P p) {

		if (root == null) {
			root = new BSTreeNode<P>(p);
			root.parent = null;
		}
		else root.add(p);
	}
	
	public int count() {
		if (root == null) {
			return 0;
		}
		else return root.count();
	}

	
	
	public void setRoot(BSTreeNode<P> r) {
		root = r;
	}

	public BSTreeNode<P> getRoot() {
		return root;
	}
}

