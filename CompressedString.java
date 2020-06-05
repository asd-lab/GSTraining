package misc;

import java.util.Arrays;
import java.util.Scanner;

public class CompressedString {
	public static void stringCompress(String str, int len) {

		String compressedString = "";
		int count;

		for (int i = 0; i < str.length(); i++) {

			count = 1;
			while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {

				count++;
				i++;
			}
			compressedString += str.charAt(i) + String.valueOf(count);
		}
		System.out.println("Compressed String is : " + compressedString);
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to be compressed : ");
		String str = sc.next();
		int len = str.length();
		if (str == " " || str == null) {
			System.out.println();
		}
		else {
			char[] arr = str.toCharArray();
			Arrays.sort(arr);
			String str1 = new String(arr);
			stringCompress(str1, len);
		}
		sc.close();
	}
}
