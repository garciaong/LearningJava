package com.learning.java8.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionInterface {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		/***
		 * Predicate<Integer> predicate = num -> true
		 * num is passed as parameter to test method of Predicate interface
		 * test method will always return true no matter what value exp has.
		 */
		System.out.println("List all data from list");
		findByExpression(list, num -> true);
		System.out.println();
		
		/***
		 * Predicate<Integer> predicate = num -> num%2 == 0
		 * num is passed as parameter to test method of Predicate interface
		 * test method will return true if num%2 comes to be zero
		 */
		System.out.println("List even data from list");
		findByExpression(list, num -> num%2 == 0);
		System.out.println();
		
		/***
		 * Predicate<Integer> predicate = num -> num > 3
		 * num is passed as parameter to test method of Predicate interface
		 * test method will return true if num is greater than 3.
		 */
		System.out.println("List data larger than 3 from list");
		findByExpression(list, num -> num > 3);
		System.out.println();
	}

	public static void findByExpression(List<Integer> list, Predicate<Integer> predicate) {
		for (Integer n : list) {
			if (predicate.test(n)) {
				System.out.print(n + " ");
			}
		}
	}
}
