import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LastNonRepeated {

	public static void lastNonRepeated(String str) {
		
		Map<Character, Integer> counts = new LinkedHashMap<>(str.length());
		char rptChar=' ';
		
		for(char ch : str.toCharArray()) {
			
			counts.put(ch,counts.containsKey(ch)?counts.get(ch)+1 :1);
		}
		for (int i = str.length()-1; i >=0 ; i--) {
	            
	            if(counts.get(str.charAt(i))==1){
	                rptChar = str.charAt(i);
	                break;
	            }
		}
		 System.out.println("Last non repeated character in given string is : "+rptChar);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to find last non repeated character ");
		String str = sc.next();
		lastNonRepeated(str);
		sc.close();
	}
}
