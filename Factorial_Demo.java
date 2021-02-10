package com.avi.learning;

public class Factorial_Demo {

	static int input = 4;
	public static void main(String[] args) {
		int n = input;
		int result = 1;
		while(n>=1){
			result = result * n;
			n=n-1;
		}
		System.out.println("Factorial of n is: "+result);
		// TODO Auto-generated method stub

	}

}
