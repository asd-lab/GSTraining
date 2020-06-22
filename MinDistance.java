package misc;

public class MinDistance {

	public static int distance(String str, String word1, String word2) {
		if (word1.equals(word2)) {
			return 0;
		}

		String words[] = str.split(" ");
		int minimum_dist = (words.length) + 1;

		for (int index1 = 0; index1 < words.length; index1++) {
			if (words[index1].equals(word1)) {
				for (int index2 = 0; index2 < words.length; index2++) {
					if (words[index2].equals(word2)) {
						int current = Math.abs(index1 - index2) - 1;

						if (current < minimum_dist) {
							minimum_dist = current;
						}
					}
				}
			}
		}

		return minimum_dist;

	}

	public static void main(String args[]) {

		String str = "geeks for geeks contribute practice";
		String word1 = "geeks";
		String word2 = "practice";

		System.out.print(distance(str, word1, word2));

	}
}
