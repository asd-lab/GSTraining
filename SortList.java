package misc;

public class SortList {

	Node head = null;

	static class Node {
		int val;
		Node next;

		public Node(int val) {
			this.val = val;
		}
	}

	Node sortList(Node a, Node b) {
		Node result = null;
		
		if (a == null)
			return b;
		if (b == null)
			return a;
		
		if (a.val <= b.val) {
			result = a;
			result.next = sortList(a.next, b);
		} else {
			result = b;
			result.next = sortList(a, b.next);
		}
		return result;
	}

	Node mergeSort(Node head) {

		if (head == null || head.next == null) {
			return head;
		}

		// middle of the list
		Node middle = getMiddle(head);
		Node nextofmiddle = middle.next;

		middle.next = null;

		// mergeSort -> left list
		Node left = mergeSort(head);

		// mergeSort -> right list
		Node right = mergeSort(nextofmiddle);

		// Merging lists
		Node sortedlist = sortList(left, right);
		return sortedlist;
	}

	public static Node getMiddle(Node head) {
		if (head == null)
			return head;

		Node slow = head, fast = head;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	void push(int new_data) {

		Node new_node = new Node(new_data);

		new_node.next = head;

		head = new_node;
	}

	void printList(Node head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {

		SortList li = new SortList();

		li.push(15);
		li.push(10);
		li.push(5);
		li.push(20);
		li.push(3);
		li.push(2);

		// merge Sort
		li.head = li.mergeSort(li.head);
		System.out.print("\n Sorted Linked List is: \n");
		li.printList(li.head);
	}
}
