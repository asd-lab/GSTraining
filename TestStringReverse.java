package misc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestStringReverse {

	@Test
	void test() {
		String str = "a!!!b.c.d,e'f,ghi";
		char[] charArray = str.toCharArray();
		String str1 = "i!!!h.g.f,e'd,cba";
		
		assertEquals(str1,StringReverse.reverse(charArray));
	}
	
	@Test
	void testFalse() {
		String str = "a!!!b.c.d,e'f,ghi";
		char[] charArray = str.toCharArray();
		String str1 = "i!!h.g.f,e'd,cb!a";
		
		assertFalse(StringReverse.reverse(charArray).equals(str1));
	}
	@Test
	void testEmpty() {
		String str = "";
		char[] charArray = str.toCharArray();
		String str1 = "";
		
		assertTrue(StringReverse.reverse(charArray).equals(str1));
	}

}
