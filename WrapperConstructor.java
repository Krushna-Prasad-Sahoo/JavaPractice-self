package com.java.assignment.udemy;

public class WrapperConstructor {
	public static void main(String[] args) {
		
		long l = 100000;
		
		Long aa = new Long(l);
		
		String s = "20000000000";
		Long bb = new Long(s);
		
		System.out.println(aa);
		System.out.println(bb);
		
		
	}

}
