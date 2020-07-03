package misc;

import java.util.Arrays;

public class TripletSum {

	boolean find3Numbers(int A[], int arr_size, int sum) {
		int l, r;

		for (int i = 0; i < arr_size - 2; i++) {

			l = i + 1;
			r = arr_size - 1;
			while (l < r) {
				if (A[i] + A[l] + A[r] == sum) {
					System.out.print( A[i] + ", " + A[l] + ", " + A[r]);
					return true;
				} else if (A[i] + A[l] + A[r] < sum)
					l++;

				else
					r--;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		TripletSum triplet = new TripletSum();
		int arr[] = { 1, 4, 45, 6, 10, 8 };
		Arrays.sort(arr);
		int sum = 22;
		int arr_size = arr.length;

		boolean b = triplet.find3Numbers(arr, arr_size, sum);
		if(b==false) {
			System.out.println("Triplet sum"+b);
		}
		else {
			System.out.println("  "+b);
		}
	}
}
