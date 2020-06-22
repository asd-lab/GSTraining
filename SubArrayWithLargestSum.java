package misc;

class SubArrayWithLargestSum {

	static int maxSubArraySum(int a[], int size) {
		int max = Integer.MIN_VALUE, currMax = 0, start = 0, end = 0, s = 0;

		for (int i = 0; i < size; i++) {
			currMax += a[i];

			if (max < currMax) {
				max = currMax;
				start = s;
				end = i;
			}

			if (currMax < 0) {
				currMax = 0;
				s = i + 1;
			}
		}

		System.out.println("Starting index " + start);
		System.out.println("Ending index " + end);
		return max;

	}

	public static void main(String[] args) {
		int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int n = a.length;
		System.out.println("Maximum contiguous sum is " + maxSubArraySum(a, n));
	}
}
