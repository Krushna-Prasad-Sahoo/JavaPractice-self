package com.java.assignment.udemy;

public class AllinOne {
	public static void main(String[] args) {

		int x = 100;
		String y = Integer.toString(x); // int to Str = boxing

		Integer b = new Integer(y); // use of wrapper class constructor

		int z = b.intValue(); // unboxing

		Integer c = new Integer(z); // use of wrapper class constructor

		String d = c.toString(); // obj to str

		int e = Integer.parseInt(d); // string to prim

		System.out.println(e);

	}

}
