import java.util.HashSet;
import java.util.Set;

public class Pangram {
	
	public static boolean checkPangram(String str) {
	
		boolean flag = false;
		String s = str.replaceAll(" ", "");
		
		char[] ch = s.toCharArray();
		
		Set<Character> set  = new HashSet<>();
		
		for(char c : ch)
			set.add(c);
		
		
		if(set.size()==26)
			flag = true;
		return flag;
	}
	public static void main(String[] args) {
		String str = "a quick brown fox jumps over the lazy dog";
		System.out.println(checkPangram(str));
	}
}
