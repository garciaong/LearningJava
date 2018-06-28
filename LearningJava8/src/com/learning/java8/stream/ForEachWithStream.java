package com.learning.java8.stream;

import java.util.Random;

public class ForEachWithStream {

	public static void main(String [] args) {
		/***
		 * Stream has provided a new method ‘forEach’ to iterate each element of the 
		 * stream. The following code segment shows how to print 10 random numbers using 
		 * forEach.
		 */
		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);
	}
	
}
