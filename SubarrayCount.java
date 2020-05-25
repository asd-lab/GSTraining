package misc;

import java.util.Scanner;

public class SubarrayCount {
	
	public static int countSubarray(int arr[] , int n, int k) {
		
		int count=0, i, j;
		int mul;
		
		for(i=0; i<n; i++) {
			
			if(arr[i] <= k) {
				count++;
			}
			
			mul = arr[i];
			for(j = i+1; j < n; j++) {
				
				mul = mul * arr[j];
				
				if(mul <= k) {
					count++;
				}
				else {
					break;
				}
			}
		}
		
		return count;
		
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
    	System.out.println("Enter size of the array");
    	int n = sc.nextInt();
    	int[] arr = new int[n];
    	System.out.println("Enter " + n +" values in array");
    	for(int i =0;i<n;i++) {
    		arr[i] = sc.nextInt();
    	}
    	
    	System.out.println("Enter the value to count possible sub arrays having product less than this value : ");
    	int k = sc.nextInt();
    	System.out.println("Total sub-arrays having product less than " + k + " are "+countSubarray(arr, n, k));
	}

}
