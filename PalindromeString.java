package misc;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		int i,j;
		boolean flag = false;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		String str=sc.next();
		i=0;
		j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				flag= false;
				break;
			}
			i++;
			j--;
			flag=true;	
		}
		if(flag==true) {
			System.out.println("String "+str+" is palindrome.");
		}
		else {
			System.out.println("String "+str+" is Not palindrome.");
		}
		sc.close();
	}
}
