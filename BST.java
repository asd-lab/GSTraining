package misc;

class BST {

	class Node {
		int key;
		Node left, right;

		public Node(int item) {
			key = item;
			left = right = null;
		}
	}

	Node root;

	BST() {
		root = null;
	}

	void put(int key) {
		root = putRec(root, key);
	}

	Node putRec(Node root, int key) {

		if (root == null) {
			root = new Node(key);
			return root;
		}

		if (key < root.key)
			root.left = putRec(root.left, key);
		else if (key > root.key)
			root.right = putRec(root.right, key);

		return root;
	}

	void inorder() {
		inorderRec(root);
	}

	void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
	}

	public static void main(String[] args) {
		BST tree = new BST();

		tree.put(50);
		tree.put(30);
		tree.put(20);
		tree.put(40);
		tree.put(70);
		tree.put(60);
		tree.put(80);

		tree.inorder();
	}
}
