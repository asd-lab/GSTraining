public class PositionOfRobot {

	static void finalPosition(String movement) {

		int l = movement.length();
		int moveUp = 0, moveDown = 0;
		int moveLeft = 0, moveRight = 0;

		for (int i = 0; i < l; i++) {

			if (movement.charAt(i) == 'U')
				moveUp++;

			else if (movement.charAt(i) == 'D')
				moveDown++;

			else if (movement.charAt(i) == 'L')
				moveLeft++;

			else if (movement.charAt(i) == 'R')
				moveRight++;
			else {
				System.out.println("Invalid input");
				return;
			}
		}

		System.out.println(" (" + (moveRight - moveLeft) + ", " + (moveUp - moveDown) + ")");
	}


	public static void main(String[] args) {
		String move = "ULLLDUDUURLRLR";
		finalPosition(move);
	}
}
