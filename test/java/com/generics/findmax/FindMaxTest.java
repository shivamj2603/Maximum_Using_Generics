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
	public void givenFirstMaxInt_shouldReturn_first() {
		Integer first = 3;
		Integer second = 2;
		Integer third = 1;
		assertEquals(first, findMax.findMaxInt(first, second, third));
	}

	@Test
	public void givenSecondMaxInt_shouldReturn_Second() {
		Integer first = 2;
		Integer second = 3;
		Integer third = 1;
		assertEquals(second, findMax.findMaxInt(first, second, third));
	}

	@Test
	public void givenThirdMaxInt_shouldReturn_third() {
		Integer first = 2;
		Integer second = 1;
		Integer third = 3;
		assertEquals(third, findMax.findMaxInt(first, second, third));
	}
	
	@Test
	public void givenFirstMax_shouldReturn_first() {
		Float first = 3.1f;
		Float second = 2.1f;
		Float third = 1.1f;
		assertEquals(first, findMax.findMaxFloat(first, second, third));
	}
	
	@Test
	public void givenSecondMax_shouldReturn_Second() {
		Float first = 2.1f;
		Float second = 3.1f;
		Float third = 1.1f;
		assertEquals(first, findMax.findMaxFloat(first, second, third));
	}

}
