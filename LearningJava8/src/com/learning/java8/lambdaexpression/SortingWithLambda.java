package com.learning.java8.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingWithLambda {

	public static void main(String [] args) {
		
		List<String> values = new ArrayList<String>();
		values.add("F");
		values.add("A");
		values.add("D");
		values.add("B");
		values.add("E");
		values.add("C");
		
		/*** Equivalent Java 7
		 * 	Collections.sort(names, new Comparator<String>() {
         		@Override
         		public int compare(String s1, String s2) {
            		return s1.compareTo(s2);
         		}
      		});
		 */
		Collections.sort(values, (s1, s2) -> s1.compareTo(s2));
		
		values.forEach(System.out::println);
	}
	
}
