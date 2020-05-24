package misc;

import java.util.Scanner;

public class BinarySearch {
	
	public static void binarySearch(int arr[] , int l , int r, int x) {
		
		int mid  = (l + r)/2;
		if(arr[mid] == x) {
			System.out.println("Data found at index : "+mid);
			return;
		}
		
		if(x > arr[mid]) {
			binarySearch(arr, mid + 1, r, x);
		}
		else if(x < arr[mid]) {
			binarySearch(arr, l, mid - 1, x);
		}
		else {
			System.out.println("data not found");
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements you want in this array?");
		int len = sc.nextInt();
		int arr[] = new int[len];
		System.out.println("Enter " + len + " values in array in sorted order");
		
		for(int i=0; i < len ; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter data to search in array: ");
		int x = sc.nextInt();
		binarySearch(arr, 0, len - 1, x);
		sc.close();
	}

}
