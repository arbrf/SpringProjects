package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyBeforeAfter {
	@BeforeAll
	static void beforeAll() {
		System.out.println("Before All");
	}
	@BeforeEach
	void BeforeEach() {
		System.out.println("Before Each");
	}

	@Test
	void test() {
		System.out.println("Test 1");
	}
	@Test
	void test2() {
		System.out.println("Test 2");	}
	@Test
	void test3() {
		System.out.println("Test 3");
	}
	@AfterEach
	void AfterEach() {
		System.out.println("After Each");
	}
	@AfterAll
	static void afterAll() {
		System.out.println("After All");
	}

}
