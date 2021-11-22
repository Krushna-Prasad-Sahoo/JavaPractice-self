package com.java.practice.ControlFlow;

public class SwitchCase {

	public static void main(String[] args) {
		int x = 4;

		switch (x) {

		case 1:
			System.out.println("You are in case 1");
			break;
		case 2:
			System.out.println("You are in case 2");
			break;
		case 3:
			System.out.println("You are in case 3");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("Common Logic ... for 4, 5 & 6...");
			break;
		default:
			System.out.println("Default block..");

		}
	}

}
