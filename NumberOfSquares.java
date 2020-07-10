package mock;

public class NumberOfSquares {

	public static void main(String[] args) {
		int sum = count(0);
		System.out.println(sum);
	}
	
	public static int count(int n) {
		int sum = 0;
		for(int i = 1;i<= n; i++) {
			sum = sum + i*i;
		}
		return sum;
	}
}
