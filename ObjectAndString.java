package com.java.assignment.udemy;

public class ObjectAndString {
	public static void main(String[] args) {

		long a = 10000;

		Long l = Long.valueOf(a); // primitive to wrapper class obj == boxing

		String st = l.toString(); // wrapper class obj to String

		Long z = Long.valueOf(st); // string to obj (reverse)

		System.out.println(z);

	}

}
