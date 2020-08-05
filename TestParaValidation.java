package misc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestParaValidation {
	
	
	@Test
	void test() {
		ParenthesisValidation ps = new ParenthesisValidation();
				
		assertEquals(true,ps.isValid("()[]{}"));
	}
	@Test
	void testNotEquals() {
		ParenthesisValidation ps = new ParenthesisValidation();
				
		assertNotEquals(false,ps.isValid("()[]{}"));
	}
	@Test
	void testEmpty() {
		ParenthesisValidation ps = new ParenthesisValidation();
				
		assertEquals(true,ps.isValid(""));
	}

}
