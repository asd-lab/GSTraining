package misc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinDistanceTest {

	@Test
	void testdistance() {
		System.out.println("test case ");
		Assertions.assertEquals(1, MinDistance.distance("geeks for geeks contribute practice", "geeks", "practice"));
	}

}
