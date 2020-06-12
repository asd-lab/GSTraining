package misc;

class Node2 {
	int data;
	Node2 left, right;

	Node2(int d) {
		data = d;
		left = right = null;
	}
}

class HeightBalanced {
	Node2 root;

	boolean isBalanced(Node2 node) {
		int lh;

		int rh;

		if (node == null)
			return true;

		lh = height(node.left);
		rh = height(node.right);

		if (Math.abs(lh - rh) <= 1 && isBalanced(node.left) && isBalanced(node.right))
			return true;

		return false;
	}

	int height(Node2 node) {

		if (node == null)
			return 0;

		return 1 + Math.max(height(node.left), height(node.right));
	}

	public static void main(String args[]) {
		HeightBalanced tree = new HeightBalanced();
		tree.root = new Node2(1);
		tree.root.left = new Node2(2);
		tree.root.right = new Node2(3);
		tree.root.left.left = new Node2(4);
		tree.root.left.right = new Node2(5);
		tree.root.left.left.left = new Node2(8);

		if (tree.isBalanced(tree.root))
			System.out.println("Tree is balanced");
		else
			System.out.println("Tree is not balanced");
	}
}
