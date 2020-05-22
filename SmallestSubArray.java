package misc;

import java.util.Scanner;

public class SmallestSubArray {

    static int smallestSubWithSum(int arr[], int n, int x) {
        int currSum = 0, minLen = n+1; 
  
        int start = 0, end = 0; 
        while (end < n) {
            while (currSum <= x && end < n) 
                currSum += arr[end++]; 
  
            while (currSum > x && start < n) {
                if (end - start < minLen) 
                    minLen = end - start; 
   
                currSum -= arr[start++]; 
            } 
        } 
        return minLen; 
    }
    
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter size of the array");
    	int n = sc.nextInt();
    	int[] arr = new int[n];
    	System.out.println("Enter " + n +" values in array");
    	for(int i =0;i<n;i++) {
    		arr[i] = sc.nextInt();
    	}
    	 System.out.println("Enter value to find smallest subarray");
    	 int x = sc.nextInt();
    	 int result = smallestSubWithSum(arr,n,x);
    	 System.out.println(" Smallest length of sub array : "+ result);
    	 sc.close();
    	
    }
}
