package com.learning.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortWithStream {
	public static void main(String [] args) {
		/***
		 * The ‘sorted’ method is used to sort the stream. 
		 * The following code segment shows how to print numbers in a sorted order.
		 */
		List<Integer> numbers = Arrays.asList(1, 6, 3, 9, 5, 2, 7, 8, 4, 10);
		System.out.println("Sort ascending");
		numbers.stream().sorted().forEach(System.out::println);
		
		System.out.println("Sort descending");
		numbers.sort((n1,n2) -> n2-n1);
		numbers.forEach(System.out::println);
		
		List<Player> players = new ArrayList<Player>();
		players.add(new Player("Lacazette",9));
		players.add(new Player("Aubameyang",14));
		players.add(new Player("Ozil",10));
		
		System.out.println("Sort ascending");
		players.sort((p1,p2)->p1.getName().compareTo(p2.getName()));
		players.forEach(p->System.out.println(p.getName()));
		
		System.out.println("Sort descending");
		players.sort((p1,p2)->p2.getName().compareTo(p1.getName()));
		players.forEach(p->System.out.println(p.getName()));
		
		System.out.println("Sort ascending");
		players.sort((p1,p2)->p1.getNumber()-p2.getNumber());
		players.forEach(p->System.out.println(p.getName()+","+p.getNumber()));
		
		System.out.println("Sort descending");
		players.sort((p1,p2)->p2.getNumber()-p1.getNumber());
		players.forEach(p->System.out.println(p.getName()+","+p.getNumber()));
	}
}
