
public class PowerOfThreeAndTen {

	static boolean check(int n) {

		return 1162261467 % n == 0;
	}

	static boolean isPower(int n) {
		
		while (n % 3 == 0) {
		    n /= 3;
		}
		return n == 1;

	}
	static boolean isPowerOfTen(int input) {
		
		while (input > 9 && input % 10 == 0) 
			  input /= 10;
			return input == 1;
	}

	public static void main(String args[]) {
		int n = 6;

		if (n != 0) {

			if (isPower(n))
				System.out.println("true");
			else
				System.out.println("false");
		}
		else {
			System.out.println("Enter valid number");
		}
		
		System.out.println(isPowerOfTen(100));
	}

}
