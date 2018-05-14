package com.nick.algorithms;

public class Factorial {

	
	public static void main(String[] args) {
		System.out.println("Final: " + Factorial.recursiveFactorial(10));
	}
	
	public static int recursiveFactorial(int num) {
		System.out.println("In num: " +  num);
		if (num ==0 ) {
			return 1;
		}
		
//		System.out.println(num * (num - 1));
		return num * recursiveFactorial(num - 1);
	}
}
