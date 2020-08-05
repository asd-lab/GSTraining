package misc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestLongestSubstring {

	@Test
	void test() {
		assertEquals(5, LongestSubstring.lengthOfLongestSubstring("adarsh"));
	}
	
	@Test
	void testEmpty() {
		assertEquals(0, LongestSubstring.lengthOfLongestSubstring(""));
	}
	
	@Test
	void test1() {
		assertEquals(1, LongestSubstring.lengthOfLongestSubstring("bbbb"));
	}

}
