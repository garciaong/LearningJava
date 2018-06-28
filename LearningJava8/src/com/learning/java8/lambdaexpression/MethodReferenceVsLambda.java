package com.learning.java8.lambdaexpression;

public class MethodReferenceVsLambda {

	public static void main(String [] args) {
		TriFunction result = (Sum s, int arg1, int arg2) -> s.add(arg1, arg1);
		System.out.println("Lambda : "+result.doSum(new Sum(), 1, 1));
		TriFunction result2 = Sum::add;
		System.out.println("Method Reference : "+result2.doSum(new Sum(), 2, 2));
	}
	
	interface TriFunction {
		int doSum(Sum obj, int num1, int num2);
	}
}
