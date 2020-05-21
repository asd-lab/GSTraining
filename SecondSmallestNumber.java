package misc;

import java.util.Scanner;

public class SecondSmallestNumber {
	
	public static int getSecondSmallestNumber(int arr[],int len) {
		
		int temp;
		for(int i=0;i<len;i++) {
			
			for(int j=i+1;j<len;j++) {
				
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[1];
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of the array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter " + n + "values in array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Second smallest number in array is:" +getSecondSmallestNumber(arr,n) );
		sc.close();
	}
}
