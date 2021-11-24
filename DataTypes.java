package com.java.assignment.udemy;

public class DataTypes {

	public static void main(String[] args) {
		byte i = 120; // byte data type
		int j = i; // implicit type casting

		char a = 89;
		System.out.println(a);	// prints the character a number 89 i.e Y
		
		char z = (char) j;  // explicit type casting from integer to char (higher to lower)
		
		String s = "Krushna Prasad Sahoo";
		System.out.println(s);
		
		boolean bl = true;
	}
}
