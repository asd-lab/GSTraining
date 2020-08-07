package misc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestReverString {

	@Test
	void test() {
		String str = "much very program this like i ";
		assertEquals(str, ReverseString.reverse("i like this program very much"));
	}
	@Test
	void test1() {
		String str = "java hello ";
		assertTrue(str.equals(ReverseString.reverse("hello java")));
	}

	@Test
	void testEmpty() {
		String str = null;
		assertEquals(str,ReverseString.reverse(""));
	}
}
