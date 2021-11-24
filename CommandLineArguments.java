package com.java.assignment.udemy;

public class CommandLineArguments {
	public static void main(String[] args) {

		int len = args.length;

		if (len == 0) {
			System.out.println("No Inputs Provided");
		} else {

			System.out.println("List of Arguments -- ");
			for (int i = 0; i < len; i++) {
				System.out.println(args[i]);
			}
		}
	}
}
