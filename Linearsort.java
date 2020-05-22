package misc;

import java.util.Scanner;

public class Linearsort {

	
	 public static void linearSort(int arr[]) { 
	        int n = arr.length; 
	        for (int i=1; i<n; ++i) 
	        { 
	            int key = arr[i]; 
	            int j = i-1; 
	            while (j>=0 && arr[j] > key) 
	            { 
	                arr[j+1] = arr[j]; 
	                j = j-1; 
	            } 
	            arr[j+1] = key; 
	        } 
	    }
	 
	 public static void printArray(int arr[],int len) {
			System.out.println("Sorted Array: ");
			for(int i=0;i<len;i++) {
				System.out.println(arr[i]);
			}
		}
		
	 public static void main(String[] args) {
			
			Scanner sc= new Scanner(System.in);
			System.out.print("Enter the size of Array:");
			int n=sc.nextInt();
			int arr[]=new int[n];
			System.out.println("Enter the values of Array:");
			for(int i=0; i< n; i++) {
				arr[i] = sc.nextInt();
			}
			linearSort(arr);
			printArray(arr, n);
			sc.close();
	 }
}
