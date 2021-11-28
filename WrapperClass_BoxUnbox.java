package com.java.assignment.udemy;

public class WrapperClass_BoxUnbox {
	public static void main(String[] args) {
		
		int x = 100;	// Initialized
		
		// Wrapper class objects are used for Java Collection APIs.
		
		Integer i = Integer.valueOf(x);		// primitive to Wrapper class Object == Boxing
		
		int y = i.intValue();	// Wrapper class Object to primitive == Unboxing
		
		System.out.println("The final value is : " + y);
		
				
	}
	

}
