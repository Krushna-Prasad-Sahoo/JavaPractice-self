package com.java.assignment.udemy;

public class Wrapper_CommLineArg_ProductOf2Numbers {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		int product = num1*num2;
		
		System.out.println("The product is : " + product);
	}

}
