package com.generics.findmax;

import java.util.Collections;
import java.util.Optional;
import java.util.stream.Stream;

public class FindMax<E extends Comparable <E>>{
	E parameters[];
	/**
	 * UseCase 3
	 * Refactored2: Generic class with parametrized Constructor
	 * @param first
	 * @param second
	 * @param third
	 */
	public FindMax(E ... parameters) {
		this.parameters = parameters;
	}
	/**
	 * Usecase 3
	 * Function invokes the generic method findMax
	 * @return
	 */
	public E testMaximum() {
		return findMax(parameters);
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
	public static <E extends Comparable<E>> E findMax(E ... parameters) {
		Stream<E> stream = Stream.of(parameters);
		E max = stream.sorted().reduce((first,second) -> second).orElse(null);
		return max;
		
	}
}

