package com.generics.findmax;

public class FindMax {
	/**
	 * Usecase 1 : Function returns the maximum Integer
	 * 
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return
	 */
	public static Integer findMaxInt(Integer num1, Integer num2, Integer num3) {
		Integer max = num1;
		if (num2.compareTo(max) > 0) {
			max = num2;
		}
		if (num3.compareTo(max) > 0) {
			max = num3;
		}
		return max;
	}
	/**
	 * UseCase 2 : Function returns the maximum Float
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return
	 */
	public static Float findMaxFloat(Float num1, Float num2, Float num3) {
		Float max = num1;
		if (num2.compareTo(max) > 0) {
			max = num2;
		}
		if (num3.compareTo(max) > 0) {
			max = num3;
		}
		return max;
	}
	public static String findMaxString(String num1, String num2, String num3) {
		String max = num1;
		if (num2.compareTo(max) > 0) {
			max = num2;
		}
		if (num3.compareTo(max) > 0) {
			max = num3;
		}
		return max;
	}

}
