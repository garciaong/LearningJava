package com.learning.java8.defaultmethod;

public class Car implements Engine, Transmission{
	public void type() {
		Engine.super.type();
		Engine.isTurboCharged();
		Transmission.super.type();
		System.out.println("Car");
	}
}
