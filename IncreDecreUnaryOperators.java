package com.java.assignment.udemy;

public class IncreDecreUnaryOperators {
	public static void main(String[] args) {
		int x = 25;
		
		int y = ++x;
		System.out.println("The value of x (pre-increment): " + x);
		System.out.println("The value of y (pre-increment): "+ y);
		System.out.println();
//------------------------------------------------------------------------
		int a = 25;
		
		int b = a++;
		System.out.println("The value of a (post-increment): " + a);
		System.out.println("The value of b (post-increment): "+ b);
		System.out.println();
//------------------------------------------------------------------------
		int p = 25;
		
		int q = --p;
		System.out.println("The value of p (pre-decrement): " + p);
		System.out.println("The value of q (pre-decrement): "+ q);
		System.out.println();
//------------------------------------------------------------------------
		int m = 25;
		
		int n = m--;
		System.out.println("The value of m (post-decrement): " + m);
		System.out.println("The value of n (post-decrement): "+ n);
		
	}

}
