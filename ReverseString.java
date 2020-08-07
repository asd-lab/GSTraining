package misc;

//Java program to reverse a string 

public class ReverseString { 

	public static StringBuilder reverse(String str) {
		String[] s = str.split(" ");
		
		StringBuilder ans=new StringBuilder(""); 
		for (int i = s.length - 1; i >= 0; i--) { 
			ans.append(s[i]); 
			ans.append(" "); 
		}
		return ans;
	}
	
	public static void main(String[] args) 
	{ 
		String s = "i like this program very much"; 
	
		System.out.print("Reversed String: "); 
		System.out.println(reverse(s)); 
	} 
} 
