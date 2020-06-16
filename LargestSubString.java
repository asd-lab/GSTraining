package misc;

public class LargestSubString {

	static String myString = "aabbbbbCDaA";
	static int largestSequence = 0;

	public static void main(String args[]) {
		int currentSequence = 0;
		char current = '\0';
		char next = '\0';
		int index = -1;
		if (myString == "")
			System.out.println("index is : "+index + "\nsequence : 0");
		else {

			for (int i = 0; i < myString.length() - 1; i++) {
				current = myString.charAt(i);
				next = myString.charAt(i + 1);

				if (current == next) {
					currentSequence += 1;
				} else {
					if (currentSequence > largestSequence) {
						largestSequence = currentSequence;
						index = i;

					}
					currentSequence = 0;
				}
			}
			if (currentSequence > largestSequence) {
				largestSequence = currentSequence;

			}

			System.out.println(largestSequence + 1 + "\nindex : "+(index-largestSequence));

		}
	}

}
