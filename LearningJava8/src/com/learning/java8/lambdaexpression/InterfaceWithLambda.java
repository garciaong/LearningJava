package com.learning.java8.lambdaexpression;

public class InterfaceWithLambda {

	public static void main(String [] args) {
		//with type declaration
	    Calculator addition = (int a, int b) -> a + b;
			
	    //with out type declaration
	    Calculator subtraction = (a, b) -> a - b;
			
	    //with return statement along with curly braces
	    Calculator multiplication = (int a, int b) -> { return a * b; };
	    
	    Printing printer = message -> System.out.println(message);
	    
	    printer.print("1 + 2 = "+addition.operation(1, 2));
	    printer.print("2 - 1 = "+subtraction.operation(2, 1));
	    int result = multiplication.operation(2, 3);
	    printer.print("2 * 3 = "+result);
	}
	
	interface Calculator {
		int operation(int a, int b);
	}
	
	interface Printing {
		void print(String message);
	}
}
