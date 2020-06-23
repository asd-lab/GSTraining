package misc;

public class StringReverse {

	public static char[] reverse(char str[]) {

		int r = str.length - 1, l = 0;
		while (l < r) {

			if (!Character.isAlphabetic(str[l]))
				l++;
			else if (!Character.isAlphabetic(str[r]))
				r--;
			else {
				char tmp = str[l];
				str[l] = str[r];
				str[r] = tmp;
				l++;
				r--;
			}
		}
		return str;
	}

	public static void main(String[] args) {
		String str = "a!!!b.c.d,e'f,ghi";
		char[] charArray = str.toCharArray();

		System.out.println("Input string: " + str);
		char[] charArray1 = reverse(charArray);
		String revStr = new String(charArray1);

		System.out.println("Output string: " + revStr);
	}
}
