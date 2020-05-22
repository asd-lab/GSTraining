package misc;

import java.util.Scanner;

public class BubbleSort {

	public static void bubbleSort(int arr[] , int len) {
		int temp;
		for(int i = 0; i < len; i++) {
			
			for(int j = i+1; j<len; j++) {
				
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements you want in this array?");
		int len = sc.nextInt();
		int arr[] = new int[len];
		System.out.println("Enter " + len + " values in array");
		
		for(int i=0; i < len ; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("sorted array :");
		bubbleSort(arr, len);
		
		for(int i=0; i < len ; i++) {
			System.out.println(arr[i]);
		}
		sc.close();

	}

}
