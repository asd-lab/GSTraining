package misc;

import java.util.Scanner;

public class QuickSort {

	public static int partition(int arr[], int low , int high) {
		int i = low-1;
		int j,temp;
		int pivot = arr[high];
		for (j=low; j<high; j++)
		{
			if(arr[j]<pivot) {
				i++;
				temp=arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
	}
	
	public static void sort(int arr[], int low , int high) {
		
		if(low<high){
			
			int pi = partition(arr,low,high);
			
			sort(arr, low, pi-1);
			sort(arr,pi+1,high);
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
		sort(arr,0,n-1);
		printArray(arr, n);
		sc.close();
	}
}
