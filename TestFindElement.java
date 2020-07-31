package misc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFindElement {

	@Test
	void test() {
		int arr[] = {5, 6, 7, 8, 9, 10, 1,2, 3};
		
		
		assertEquals(8, FindElement.search(arr, 0, 8, 3));
	}
	@Test
	void test1() {
		int arr[] = {5, 6, 7, 8, 9, 10, 1,2, 4};
		
		
		assertEquals(-1, FindElement.search(arr, 0, 8, 3));
	}
	@Test
	void test2() {
		int arr[] = {5, 6, 7, 8, 9, 10, 1,2, 4};
		
		
		assertEquals(-1, FindElement.search(arr, 0, 8, -1));
	}

}
