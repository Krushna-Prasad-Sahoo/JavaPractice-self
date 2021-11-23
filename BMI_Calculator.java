package com.java.assignment.udemy;

public class BMI_Calculator {
	public static void main(String[] args) {
		// bmi = weight in kg / (height * height)

		double height = 5.7;
		double weight = 75;

		double heightInMeters = height * 0.4536;

		double bmi = weight / (heightInMeters * heightInMeters);
		System.out.println("Your Body Mass Index is : " + bmi);
	}

}
