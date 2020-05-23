package misc;

import java.util.Scanner;

public class LinearSearch {
	
	public static int linearSearch(int arr[], int data, int len) {
		
		for(int i=0; i < len; i++) {
			if(arr[i]==data) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array\n");
		int len = sc.nextInt();
		
		int arr[] = new int[len];
		
		System.out.println("Enter "+ len + "values \n");
		for(int i = 0; i < len ;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter data to search in array\n");
		int data = sc.nextInt();
		
		int x = linearSearch(arr, data, len);
		
		if(x == -1) {
			System.out.println("data not found.");
		}
		else {
			System.out.println("Data found at index "+x);
			
		}
		sc.close();
	}
}
