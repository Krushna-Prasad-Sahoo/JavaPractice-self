package com.java.practice.ControlFlow;

import java.util.Scanner;

public class Arrays1 {
	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the number for " + i + " position .");
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println("Your numbers are : " + a[i]);
		}
		System.out.println(a);

	}

}
