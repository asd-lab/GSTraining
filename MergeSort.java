package misc;

import java.util.Scanner;

public class MergeSort {

	public static void merge(int arr[], int low,int mid,int high) {
		int i,j,k;
		int[] c = new int[high-low+1];
		k = 0;
		i=low;
		j = mid + 1;
		while(i <= mid && j <= high) {
			if(arr[i] <= arr[j]) {
				c[k++] = arr[i++];
			}
			else {
				c[k++] = arr[j++];
			}
		}
		while(i<=mid) {
			c[k++] = arr[i++];
		}
		while(j<=high) {
			c[k++] = arr[j++];
		}
		k=0;
		for(i=low; i<= high; i++) {
			arr[i] = c[k++];
		}
	}
	
	public static void mergeSort(int arr[], int low, int high) {
		
		if(high-low +1 >1) {
			int mid = (low+high)/2;
			mergeSort(arr,low,mid);
			mergeSort(arr, mid+1, high);
			merge(arr,low,mid ,high);
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
		mergeSort(arr, 0, len-1);
		System.out.println("After sorting");
		for(int i=0 ; i<len; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}
	
	    
}
