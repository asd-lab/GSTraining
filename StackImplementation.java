package misc;

import java.util.Scanner;

public class StackImplementation {
	static final int MAX = 256;
	int top;
	int array[] = new int[MAX];

	boolean isEmpty() {
		return (top < 0);
	}

	StackImplementation() {
		top = -1;
	}

	boolean push(int x) {

		if (top >= MAX) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			array[++top] = x;
			System.out.println(x + " pushed into stack.");
			return true;
		}

	}

	int pop() {
		if (top < 0) {
			System.out.println("Stack underflow");
			return 0;
		} else {
			int x = array[top--];
			return x;
		}
	}

	int peek() {
		if (top < 0) {
			System.out.println("Stack underflow");
			return 0;
		} else {
			int x = array[top];
			return x;
		}
	}

	public static void main(String[] args) {

		StackImplementation s = new StackImplementation();
		Scanner sc = new Scanner(System.in);
		int data = 0;

		System.out.println("How many element you want to push into stack ");
		int size = sc.nextInt();
		System.out.println("Enter " + size + " Elements");
		for (int i = 0; i < size; i++) {
			data = sc.nextInt();
			s.push(data);
		}

		System.out.println("deleted element is : "+s.pop());

		System.out.println("Element at the top of stack is : " + s.peek());

		System.out.println("is stack empty :"+s.isEmpty());

		
		sc.close();
	}

}
