package misc;

import java.util.Scanner;

class Stack1 {

	static final int MAX = 256;
	int top;
	int array[] = new int[MAX];
	boolean isEmpty() {
		return (top<0);
	}
	Stack1(){
		top=-1;
	}
	
	boolean push(int x) {
		
		if(top >= MAX) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			array[++top] = x;
//			System.out.println(x + " pushed into stack.");
			return true;
		}
		
	}
	int pop() {
		if(top < 0) {
			System.out.println("Stack underflow");
			return 0;
		}
		else {
			int x = array[top--];
			return x;
		}
	}
	
	int peek() {
		if(top < 0) {
			System.out.println("Stack underflow");
			return 0;
		}
		else {
			int x = array[top];
			return x;
		}
	}
	

	
}

public class QueueUsingStack{
	
		
		static Stack1 s1 = new Stack1();
		static Stack1 s2 = new Stack1();
		
		static void enqueue(int x) {
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			
			s1.push(x);
			
			while(!s2.isEmpty()) {
				s1.push(s2.pop());
			}
			
		}
		
		  static int deQueue()  
		    {  
		        // if first stack is empty  
		        if (s1.isEmpty())  
		        {  
		            System.out.println("Q is Empty");  
		            System.exit(0);  
		        }  
		  
		        int x = s1.peek();  
		        s1.pop();  
		        return x;  
		    } 
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("How many data you want in queue");
			int a = sc.nextInt();
			int x;
			System.out.println("Enter " + a + " values in queue");
			for(int i = 0; i < a; i++) {
				x = sc.nextInt();
				enqueue(x);
				
			}
			
			System.out.println("Data queued");
			
			for(int i = 0; i < a; i++) {
				System.out.println("Dequeued " + deQueue()); 
			}
	}
}
