package com.learning.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsWithStream {

	public static void main(String [] args) {
		/***
		 * Collectors are used to combine the result of processing on the elements of a stream. 
		 * Collectors can be used to return a list or a string.
		 */
		List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

		System.out.println("Filtered List: " + filtered);
		String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
		System.out.println("Merged String: " + mergedString);
	}
	
}
