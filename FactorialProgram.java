import java.util.Scanner;

public class FactorialProgram {
	
	public static void factorialIteration(int input) {
		
		long res = 1;
		for(int i = 1; i <= input; i++) {
			
			res = res *i;
		}
		System.out.println("Factorial calculation using Iteration : "+res);
	}
	
	public static long factorialRecursion (int input) {
		
		
		if(input == 0 || input == 1) {
			return 1;
			
		}
		else {
			return input * factorialRecursion(input - 1);
		}
	}
	
	
	public static void main(String[] args) {

	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number to calculate factorial");
		int input = sc.nextInt();
		factorialIteration(input);
		System.out.println("Factorial calculation using recursion : "+factorialRecursion(input));
		sc.close();
		
	}

}
