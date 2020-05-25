package misc;

public class DoublyLinkedList {
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node previous;
		
		Node(int d){
			data = d;
			next = null;
			previous = null;
		}
	}
	
	//adding a node at the front of the list
	public static void insert(DoublyLinkedList list , int data) {
		
		Node new_node = new Node(data);
		new_node.next = list.head;
		new_node.previous = null;
		 if(list.head != null) {
			 list.head.previous = new_node;
		 }
		 list.head = new_node;	
				
	}
	
	//adding a node after the given node
	
	public static void insertAfter(Node prev_node , int data) {
		
		if(prev_node == null) {
			System.out.println("given previous node can not be null");
			
		}
		 Node new_node = new Node(data);
		 
		 new_node.next = prev_node.next;
		 prev_node.next = new_node;
		 new_node.previous = prev_node;
		 
		 if(new_node.next != null) {
			  new_node.next.previous = new_node;
		 }

	}
	
	//Adding a node at the end of the list
	
	public static void insertAtEnd(DoublyLinkedList list, int data) {
		 Node new_node = new Node(data);
		  Node last = list.head;
		  new_node.next = null;
		  
		  if(list.head == null) {
			  new_node.previous = null; 
	            list.head = new_node;
	            return;
		  }
		  
		  while(last.next != null) {
			  last = last.next;
		  }
		  
		  last.next = new_node;
		  
		  new_node.next = null;
	}
	
	public static void printList(Node node) {
		
		Node last = null;
		
		System.out.println("Traversal in forward Direction"); 
        while (node != null) { 
            System.out.print(node.data + " "); 
            last = node; 
            node = node.next; 
        } 
        System.out.println(); 
        System.out.println("Traversal in reverse direction"); 
        while (last != null) { 
            System.out.print(last.data + " "); 
            last = last.previous; 
        } 
	}
	
	public static void main(String[] args) {
		
		DoublyLinkedList dll = new DoublyLinkedList();
		
		DoublyLinkedList.insertAtEnd(dll, 5);
		
		DoublyLinkedList.insert(dll, 7);
		
		DoublyLinkedList.insert(dll, 8);
		
		DoublyLinkedList.insertAfter(dll.head.next, 20);
		
		System.out.println("Created DLL is: ");
		DoublyLinkedList.printList(dll.head);
	}

}
