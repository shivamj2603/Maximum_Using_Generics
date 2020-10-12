package com.generics.findmax;

public class FindMax {

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
