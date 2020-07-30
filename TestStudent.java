package misc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestStudent {
	


	@Test
	void test() {
		assertEquals("Lucy", Student.sortByAge().get(0));
	}
	@Test
	void testFalse() {
		assertFalse(Student.sortByAge().get(0).equals("Ron"));
	}

	@Test
	void test1() {
		assertEquals(5, Student.sortByAge().size());
	}

}
