
public class FindInitials {

	public static char[] findInitials(String str) {
		
		
		int i = 0;
		String words[] = str.split(" ");
		char[] array = new char[words.length];

		for (String word : words) {
			char arr= Character.toUpperCase(word.charAt(0));
			array[i] = arr;
			i++;
		}
		return array;

	}

	public static void main(String[] args) {
		String str = "prabhat kumar singh";
		char[] arr = findInitials(str);
		for(char ch : arr) {
			System.out.print(ch+ " ");
		}
	}
}
