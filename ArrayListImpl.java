package misc;

import java.util.Arrays;

public class ArrayListImpl {

	int SIZE = 15;
	String[] arr = new String[SIZE];
	int logicalSize = 0;
	String[] arr1;

	public void add(String s) {
		logicalSize++;
		if (logicalSize == arr.length) {
			arr[logicalSize - 1] = s;
			arr = increaseSize(arr);
		}

		else {
			arr[logicalSize - 1] = s;
		}
	}

	private String[] increaseSize(String[] arr2) {

		SIZE = SIZE + SIZE / 2;
		arr = Arrays.copyOf(arr, SIZE);
		return arr;

	}

	public String remove(int index) {
		String s = "";
		for (int i = index; i < logicalSize; i++) {
			if (i == index) {
				s = arr[i];
			}
			arr[i] = arr[i + 1];
		}

		return s;
	}

	public String display(int index) {

		return arr[index];
	}

	public static void main(String[] args) {
		ArrayListImpl a = new ArrayListImpl();
		for (int i = 0; i < 23; i++)
			a.add("hello " + i);

		System.out.println(a.display(21));
		System.out.println(a.display(14));
		System.out.println(a.display(15));
		System.out.println(a.remove(10));

		System.out.println(a.display(15));

	}
}
