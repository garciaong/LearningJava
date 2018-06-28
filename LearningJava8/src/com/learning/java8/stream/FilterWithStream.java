package com.learning.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterWithStream {

	public static void main(String [] args) {
		//Filter none empty string from list
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		filtered.forEach(System.out::println);
		
		//Count empty string
		int count = (int)strings.stream().filter(string -> string.isEmpty()).count();
		System.out.println("Total empty string in list "+count);
		
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		List<Integer> list = numbers.stream().filter(i -> i>3).distinct().collect(Collectors.toList());
		list.forEach(System.out::println);
	}
	
}
