package misc;

class Node1 {
	int key;
	Node1 left, right;

	public Node1(int item) {
		key = item;
		left = right = null;
	}
}

public class DFSTraversal {

	Node1 root;

	DFSTraversal() {
		root = null;
	}

	void printPostorder(Node1 node) {
		if (node == null)
			return;

		printPostorder(node.left);

		printPostorder(node.right);

		System.out.print(node.key + " ");
	}

	void printInorder(Node1 node) {
		if (node == null)
			return;

		printInorder(node.left);

		System.out.print(node.key + " ");

		printInorder(node.right);
	}

	void printPreorder(Node1 node) {
		if (node == null)
			return;

		System.out.print(node.key + " ");

		printPreorder(node.left);

		printPreorder(node.right);
	}

	void printPostorder() {
		printPostorder(root);
	}

	void printInorder() {
		printInorder(root);
	}

	void printPreorder() {
		printPreorder(root);
	}

	public static void main(String[] args) {
		DFSTraversal tree = new DFSTraversal();
		tree.root = new Node1(1);
		tree.root.left = new Node1(2);
		tree.root.right = new Node1(3);
		tree.root.left.left = new Node1(4);
		tree.root.left.right = new Node1(5);

		System.out.println("Preorder traversal of binary tree is ");
		tree.printPreorder();

		System.out.println("\nInorder traversal of binary tree is ");
		tree.printInorder();

		System.out.println("\nPostorder traversal of binary tree is ");
		tree.printPostorder();
	}
}
