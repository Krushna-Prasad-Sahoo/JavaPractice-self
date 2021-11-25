package com.java.assignment.udemy;

public class SomeMoreOperartors {
	public static void main(String[] args) {
		
		int a= 10, b = 20, c = 30;
		String s1 = "xyz";
		
		System.out.println(a+b+c+s1);
		System.out.println(a+c+s1+b);
		System.out.println();
		
		System.out.println('a' > 'A');
		System.out.println(((int)'a'));	// value in charset
		System.out.println(((int)'A')); // value in charset
		System.out.println();
		
		
		int x=20, y=50;
		String res = (x > y)?"x is greater than y":"y is greater than x";
		System.out.println(res);
	}

}
