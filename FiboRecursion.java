 package misc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FiboRecursion 
{
	static int generateFibo(int n)
	{
		if(n==0||n==1)
		{
			return n;
		}
		return generateFibo(n-1)+generateFibo(n-2);
	}
	
	public static void main(String args[])
	{
		int n = 0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Length of Fibonacci Series:");
		try
		{
			n=sc.nextInt();
		}
		catch(InputMismatchException e) 
		{
			System.out.println("Please enter only numeric input");
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(generateFibo(i));
			if(i<n-1)
				System.out.print(" , ");
		}
	}
}
