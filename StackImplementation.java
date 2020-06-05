package misc;

import java.util.Arrays;
import java.util.Scanner;

public class StackImplementation {

	int top;
	static int MAX = 10;
	static int array[] = new int[MAX];

	public static int[] sizeIncrement(int size) {

		int array1[] = Arrays.copyOf(array, size * 2);
		return array1;
	}

	boolean isEmpty() {
		return (top < 0);
	}

	StackImplementation() {
		top = -1;
	}

	boolean push(int x, int size) {

		if (top >= MAX) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			if (size > MAX) {
				array = sizeIncrement(size);
			}
			array[++top] = x;
			System.out.println(x + " pushed into stack.");
		}
		return true;

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
			s.push(data, size);
		}

		System.out.println("deleted element is : " + s.pop());

		System.out.println("Element at the top of stack is : " + s.peek());

		System.out.println("is stack empty :" + s.isEmpty());

		sc.close();
	}

}
