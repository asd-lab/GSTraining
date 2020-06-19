package misc;

public class CheckPower {

	public static boolean checkPower(int x, int y) {
		
		if(x == 1)
			return true;
		
		int power = 1;
		while(power < y) {
			power = power * x;
		}
		
		return (power == y);
	}
	public static void main(String[] args) {
		
		boolean check = checkPower(11, 121);
		System.out.println(check);
	}
}
