package com.in28minutes.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class AsserTest {
	List<String> todoStrings=Arrays.asList("AWS","Devops","Cloud");
	@Test
	void test() {
		boolean test=todoStrings.contains("AWS");
//		assertEquals(true, test);
		assertEquals(3, todoStrings.size());
		assertTrue(test);
		assertArrayEquals(new int[] {1,2,4},new int[] {1,2,4});
//		fail("Not yet implemented");
	}

}
