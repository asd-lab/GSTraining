package misc;

import java.util.Scanner;

class Queue{
	private static int front, rear  ,capacity ;
	private static int queue[];
	
	Queue(int c){
		rear = front = 0;
		capacity = c;
		queue = new int[capacity];
	}
	
	static void enqueue(int data) {
		if(capacity == rear) {
			System.out.println("Queue is full");
			return;
		}
		else {
			queue[rear] = data;
			rear++;
		}
		return;
	}
	static void dequeue() {
		if(front == rear) {
			System.out.println("Queue is empty");
		}
		else {
			for(int i=0; i<rear-1; i++) {
				queue[i] = queue[i+1];
			}
			if(rear < capacity) {
				queue[rear]=0;
			}
			rear--;
		}
		return;
	}
	static void displayFront() {
		if (front == rear) { 
            System.out.println("Queue is Empty"); 
            return; 
        } 
        System.out.println("Front Element is:"+ queue[front]); 
        return; 
     }
	static void queueDisplay() {
		if(front == rear) {
			System.out.println("queue is empty");
			return;
		}
		else {
			System.out.println("Data in queue");
			for(int i = front; i < rear ; i++) {
				System.out.println(queue[i]);
			}
			return;
		}
	}
	
}
public class QueueInJava{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Enter capacity of the queue");
		 int capacity = sc.nextInt();
		 Queue q = new Queue(capacity);
		 int data;
		 System.out.println("Enter "+ capacity + " values in queue\n");
		 for(int i=0; i < capacity; i++) {

			 data = sc.nextInt();
			 Queue.enqueue(data);
		 }
		 Queue.displayFront();
		 Queue.dequeue();
		 Queue.dequeue();
		 System.out.println(" Data available in queue after two deque operation");
		Queue.queueDisplay();
	}
	
}
