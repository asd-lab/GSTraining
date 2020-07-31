import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestShiftZeros {

	@Test
	void test() {
		int[] arr = {1,0,2,0,3,0};
		int[] actual = ShiftZeros.shiftZeros(arr);
		int expected[] = {1,2,3,0,0,0};
		
		assertArrayEquals(expected, actual);
		
	}
	@Test
	void test1() {
		int[] arr = {1,0,2,0,3,0};
		int expected[] = {1,2,0,0,0,3};
		
		assertFalse(ShiftZeros.shiftZeros(arr).equals(expected));
		
	}
	
	@Test
	void testEmpty() {
		int[] arr = {};
		int expected[] = {};
		
		assertArrayEquals(expected, ShiftZeros.shiftZeros(arr));
		
	}
	

	
	

}
