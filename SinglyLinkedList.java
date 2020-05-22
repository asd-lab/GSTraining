package misc;

public class SinglyLinkedList {
	Node head;
	
	static class Node{
		int data;
		Node next;
	
	 Node(int d){
		 data=d; 
		 next=null;
	 }
	}
	public static SinglyLinkedList insert(SinglyLinkedList list, int data) {
		Node new_node = new Node(data);
		new_node.next=null;
		
		if(list.head==null)
			list.head = new_node;
		else {
			Node last=list.head;
			while(last.next!=null) {
				last = last.next;
			}
			
			last.next=new_node;
			System.out.println("\nNode inserted : "+new_node.data);
		}
		 return list;
		 
	 }
	public static void printList(SinglyLinkedList list){
		Node currNode=list.head;
		
		System.out.println("\nLisked List :");
		
		while(currNode!=null) {
			System.out.println("\nNode "+currNode.data + " printed");
			
			currNode = currNode.next;
		}
	}
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);
		list = insert(list, 6);
		list = insert(list, 7);
		list = insert(list, 7);
		list = insert(list, 8);
		
		printList(list);
	}
}


