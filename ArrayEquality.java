package misc;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEquality {
	
	
	public static boolean isEqual(int firstArray[], int secondArray[], int len1) {
		
		Arrays.sort(firstArray);
		Arrays.sort(secondArray);
		
		for(int i = 0; i < len1; i++) {
			if(firstArray[i] != secondArray[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
    	System.out.println("Enter size of the first array");
    	int len1 = sc.nextInt();
    	
    	
    	System.out.println("Enter size of the Second array");
       	int len2 = sc.nextInt();
    	
    	if(len1 != len2) {
    		System.out.println("Arrays are not equal");
    	}
    	
    	else {
    		int[] firstArray = new int[len1];
    		
    		System.out.println("Enter " + len1 +" values in first array");
    		for(int i =0;i<len1;i++) {
    			firstArray[i] = sc.nextInt();
    		}
    	
    		int[] secondArray = new int[len2];
    		System.out.println("Enter " + len2 +" values in second array");
    		
    		for(int i =0;i<len2;i++) {
    			secondArray[i] = sc.nextInt();
    		}
    		
    	
    		boolean check = isEqual(firstArray, secondArray, len1);
    		
    		if(check == true) {
    			System.out.println("Both arrays are equal");
    		}
    		else
    			System.out.println("Arrays are not equal");
    	}
    	sc.close();	
    	
	}

}
