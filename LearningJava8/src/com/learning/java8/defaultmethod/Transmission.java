package com.learning.java8.defaultmethod;

public interface Transmission {
	public default void type() {
		System.out.println("Transmission");
	}
}
