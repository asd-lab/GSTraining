package misc;

import java.util.HashMap;
import java.util.Stack;

public class ParenthesisValidation {

	private HashMap<Character, Character> mappings;

	public ParenthesisValidation() {
		mappings = new HashMap<Character, Character>();
		mappings.put(')', '(');
		mappings.put('}', '{');
		mappings.put(']', '[');
	}

	public boolean isValid(String s) {

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			// If closing bracket.
			if (mappings.containsKey(c)) {

				char topElement = stack.empty() ? '*' : stack.pop();

				if (topElement != mappings.get(c)) {
					return false;
				}
			} else {
				// If opening bracket, push to the stack.
				stack.push(c);
			}
		}

		// invalid expression, if not empty.
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		ParenthesisValidation ps = new ParenthesisValidation();
		System.out.println(ps.isValid("()[]{}"));
	}
}

