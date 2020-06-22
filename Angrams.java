package misc;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindAnagram {

	public static void main(String[] args) {
		

	String[] input = {"cat","dog","tac","god","act"};
	List<String> list = Arrays.asList(input);
	
	Map<String,List<String>> anagram = list.stream().collect(Collectors.groupingBy(str -> {char[] c = 
										str.toCharArray();
										Arrays.sort(c);
										return new String(c);
										}));
	anagram.forEach((k,v)->System.out.println(v));;
	}
}
