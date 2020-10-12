package com.generics.findmax;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.Test;

class FindMaxTest {
	@Test
	public void givenFirstMaxInt_shouldReturn_first() {
		Integer first = 3;
		Integer second = 2;
		Integer third = 1;
		assertEquals(first, new FindMax<Integer>(first,second,third).testMaximum());
	}

	@Test
	public void givenSecondMaxInt_shouldReturn_Second() {
		Integer first = 2;
		Integer second = 3;
		Integer third = 1;
		assertEquals(second, new FindMax<Integer>(first,second,third).testMaximum());
	}

	@Test
	public void givenThirdMaxInt_shouldReturn_third() {
		Integer first = 2;
		Integer second = 1;
		Integer third = 3;
		assertEquals(third, new FindMax<Integer>(first,second,third).testMaximum());
	}
	
	@Test
	public void givenFirstMaxFloat_shouldReturn_first() {
		Float first = 3.1f;
		Float second = 2.1f;
		Float third = 1.1f;
		assertEquals(first, new FindMax<Float>(first,second,third).testMaximum());
	}
	
	@Test
	public void givenSecondMaxFloat_shouldReturn_Second() {
		Float first = 2.1f;
		Float second = 3.1f;
		Float third = 1.1f;
		assertEquals(second, new FindMax<Float>(first,second,third).testMaximum());
	}
	
	@Test
	public void givenThirdMaxFloat_shouldReturn_Third() {
		Float first = 2.1f;
		Float second = 1.1f;
		Float third = 3.1f;
		assertEquals(third, new FindMax<Float>(first,second,third).testMaximum());
	}
	
	@Test
	public void givenFirstMaxString_shouldReturn_First() {
		String first = "Peach";
		String second = "Banana";
		String third = "Apple";
		assertEquals(first, new FindMax<String>(first,second,third).testMaximum());
	}
	
	@Test
	public void givenSecondMaxString_shouldReturn_Second() {
		String first = "Banana";
		String second = "Peach";
		String third = "Apple";
		assertEquals(second, new FindMax<String>(first,second,third).testMaximum());
	}
	
	@Test
	public void givenThirdMaxString_shouldReturn_Third() {
		String first = "Banana";
		String second = "Apple";
		String third = "Peach";
		assertEquals(third, new FindMax<String>(first,second,third).testMaximum());
	}
	
	@Test
	public void givenMultipeInt_shouldReturn_maxInt() {
		Integer first = 1;
		Integer second = 2;
		Integer third = 3;
		Integer fourth = 4;
		assertEquals(fourth, new FindMax<Integer>(first, second, third, fourth).testMaximum());
	}

	@Test
	public void givenMultipeFloat_shouldReturn_maxFloat() {
		Float first = 1.1f;
		Float second = 3.1f;
		Float third = 4.1f;
		Float fourth = 2.1f;
		assertEquals(third, new FindMax<Float>(first, second, third, fourth).testMaximum());
	}

	@Test
	public void givenMultipeString_shouldReturn_maxString() {
		String first = "peach";
		String second = "banana";
		String third = "apple";
		String fourth = "coconut";
		assertEquals(first, new FindMax<String>(first, second, third, fourth).testMaximum());
	}

}
