package com.learning.java8.stream;

import java.util.Arrays;
import java.util.List;

public class LimitWithStream {

	public static void main(String [] args) {
		/***
		 * The ‘limit’ method is used to reduce the size of the stream. 
		 * The following code segment shows how to print 5 numbers using limit.
		 */
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		numbers.stream().limit(5).forEach(System.out::println);
	}
	
}
