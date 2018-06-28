package com.learning.java8.defaultmethod;

public interface Engine{
	public default void type() {
		System.out.println("Engine");
	}
	public static void isTurboCharged() {
		System.out.println("Turbo-Charged");
	}
}
