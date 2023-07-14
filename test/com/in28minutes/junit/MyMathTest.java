package com.in28minutes.junit;
import com.in28minutes.junit.MyMath;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {
	private MyMath obj=new  MyMath();
	@Test
	void calculate_sumThree() {
		assertEquals(6, obj.calculateSum(new int[] {1,3,2}));
		}
	@Test
	void calculate_Zero() {

		assertEquals(0, obj.calculateSum(new int[] {}));
		}

}
