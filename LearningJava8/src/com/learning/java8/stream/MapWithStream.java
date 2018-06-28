package com.learning.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapWithStream {

	public static void main(String [] args) {
		/***
		 * The ‘map’ method is used to map each element to its corresponding result. 
		 * The following code segment prints unique numbers is 2 using map.
		 */
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		
		List<Integer> list = numbers.stream().map( i -> 1+1).distinct().collect(Collectors.toList());
		list.forEach(System.out::println);
	}
	
}
