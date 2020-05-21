
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	    
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to calculate factorial:");
		int num =sc.nextInt();
		long factorial = recursiveFact(num);
		System.out.println("factorial of "+ num + " = " +recursiveFact(num));
	}

	static long recursiveFact(int num){
	    
		        if(num>1){
		            
				return num*recursiveFact(num-1);
			} 
			else{
			    
				return 1;
			}

	}
}
