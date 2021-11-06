package com.java.practice.ControlFlow;

import java.util.Scanner;

public class InputTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your name : ");
		String b = sc.nextLine();
		
		System.out.println("Please enter your age : ");
		int a = sc.nextInt();
		
		System.out.println("Okay " + b + "!!, next year you will be " + (a+1));
		
				
	}

}
