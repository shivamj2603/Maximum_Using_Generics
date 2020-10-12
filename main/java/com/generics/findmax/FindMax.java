package com.generics.findmax;

public class FindMax<E extends Comparable <E>>{
	E first,second,third;
	/**
	 * UseCase 3
	 * Refactored2: Generic class with parametrized Constructor
	 * @param first
	 * @param second
	 * @param third
	 */
	public FindMax(E first, E second, E third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}
	/**
	 * Usecase 3
	 * Function invokes the generic method findMax
	 * @return
	 */
	public E testMaximum() {
		return findMax(first, second, third);
	}

	/**
	 * UseCase3 
	 * Refactored1: Generic function to test for maximum
	 * @param <E>
	 * @param first
	 * @param second
	 * @param third
	 * @return
	 */
	public static <E extends Comparable<E>> E findMax(E first, E second, E third) {
		E max = first;
		if (second.compareTo(max) > 0) {
			max = second;
		}
		if (third.compareTo(max) > 0) {
			max = third;
		}
		return max;
	}

}
