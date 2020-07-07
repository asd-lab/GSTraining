package mock;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveElement {

	public static int[] removeElement(int[] arr, int index) {
		if (arr == null || index < 0 || index >= arr.length) {

			return arr;
		}

		return IntStream.range(0, arr.length)
						.filter(i -> i != index)
						.map(i -> arr[i])
						.toArray();
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		System.out.println("Original Array: " + Arrays.toString(arr));

		int index = 3;
		arr = removeElement(arr, index);

		System.out.println("Resultant Array: " + Arrays.toString(arr));
	}
}
