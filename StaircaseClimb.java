package misc;

import java.util.Scanner;

public class StaircaseClimb {

	public static int staircaseClimbing(int n) {
		
		int[] res = new int[n+1];
		res[0] = 1;
		res[1] = 1;
		res[2] = 2;
		
		for(int i = 3; i <= n; i++) {
			res[i] = res[i-1] + res[i-2] + res[i-3];
		}
		return res[n];
 	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of stairs to climb");
		
		int n = sc.nextInt();
		if(n==0) {
			System.out.println("Number of ways to climb : 1 ");
		}
		else
		System.out.println("Number of ways to climb : "+staircaseClimbing(n));
	}
}
