package com.learning.java8.stream;

public class Player {

	public Player(String name, int number){
		this.name = name;
		this.number = number;
	}
	
	private String name;
	private int number;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}
