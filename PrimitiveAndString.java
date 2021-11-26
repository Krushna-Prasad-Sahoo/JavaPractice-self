package com.java.assignment.udemy;

public class PrimitiveAndString {
	public static void main(String[] args) {
		
		byte b = 100;
		
		String st = Byte.toString(b);	// byte i.e primitive to String class
		
		byte y = Byte.parseByte(st);	// reverse
		
		System.out.println("The final value is : " + y);
	}

}
