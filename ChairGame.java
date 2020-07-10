package mock;

public class ChairGame {

	public static int chairGame(int n, int k) {

		if (n == 0 || n < 0 ||k < 0)
			return 0;

		int sum = 0;

		for (int i = 5; i <= n; i++) {
			sum = (sum + k) % i;
		}

		return sum + 1;
	}

	public static void main(String[] args) {
		int n = 5;
		int k = 2;
		System.out.println(chairGame(n, k));
	}
}
