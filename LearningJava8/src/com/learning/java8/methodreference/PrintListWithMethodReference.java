package com.learning.java8.methodreference;

import java.util.ArrayList;
import java.util.List;

public class PrintListWithMethodReference {

	public static void main(String [] args) {
		List<String> values = new ArrayList<String>();
		values.add("1");
		values.add("2");
		values.add("3");
		
		/***
		 * Method references help to point to methods by their names. 
		 * A method reference is described using "::" symbol
		 */
		values.forEach(System.out::println);
	}
	
}
