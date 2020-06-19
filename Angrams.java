package misc;

import java.util.Arrays;

public class Angrams {
	
	static final int SIZE = 256; 
	public static boolean isAnagram(String str1, String str2) {
		
		int[] count = new int[SIZE];
		int i;
		
		for(i = 0; i < str1.length() && i < str2.length(); i++) {
			count[str1.charAt(i)]++; 
			count[str2.charAt(i)]--; 
		}
		
		 if (str1.length() != str2.length()) 
	          return false; 
	  
		 for (i = 0; i < SIZE; i++) 
	            if (count[i] != 0) 
	                return false; 
	         return true; 
	}
	
	static void findAllAnagrams(String arr[], int n) 
    { 
        for (int i = 0; i < n; i++) 
            for (int j = i+1; j < n; j++) 
                if (isAnagram(arr[i], arr[j])) 
                    System.out.print("["+arr[i] +","+ arr[j]+"]"); 
    }
	public static void main(String args[]) 
    { 
        String arr[] = {"cat","dog", "tac","god", "act"}; 
        Arrays.sort(arr);
        int n = arr.length; 
        findAllAnagrams(arr, n); 
    } 
}
