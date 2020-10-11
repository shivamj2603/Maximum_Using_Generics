package com.generics.findmax;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.Test;

class FindMaxTest {
	public static FindMax findMax;

	@BeforeAll
	public static void setUp() {
		findMax = new FindMax();
	}

	@Test
	public void givenFirstMax_shouldReturn_first() {
		Integer first = 3;
		Integer second = 2;
		Integer third = 1;
		assertEquals(first, findMax.findMaxInt(first, second, third));
	}

}
