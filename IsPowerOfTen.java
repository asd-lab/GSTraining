package misc;

import java.util.Scanner;

public class IsPowerOfTen {

	public static boolean isPowerOfTen(int input) {
		
		while(input > 9 && input % 10 == 0) {
			input /= 10;
			
		}
		return input == 1;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number to check whether it is power of 10 or not");
		int input = sc.nextInt();
		boolean check = isPowerOfTen(input);
		
		if(check == true) 
			System.out.println(input + " is power of 10");
		else
			System.out.println(input + " input is not power of 10");
		
		sc.close();
		}
	
}
