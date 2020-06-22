package misc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestSubarray {

	@Test
	void testmaxSubArraySum() {
		System.out.println("test case ");
		Assertions.assertEquals(10, SubArrayWithLargestSum.maxSubArraySum(new int[]{1,3,4,2}, 4));
	}

}
