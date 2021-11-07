package com.java.practice.ControlFlow;

public class GradeCalculator {
	public static void main(String[] args) {

		double math = 39.5;
		double physics = 49;
		double chemistry = 69;
		double result;
		double avg = 0;
		
		if (math < 35 | physics < 35 | chemistry < 35) {
			System.out.println("Sorry, You failed in one subject ..");
		}else {
			result = math + physics + chemistry;
			System.out.println("Your total score is : " + result );
			avg = result / 3;
			System.out.println();
			if (avg <= 59) {
				System.out.println("You have secured C grade.");
			} else if(avg <= 69) {
				System.out.println("You have secured B grade .");
			}else {
				System.out.println("You have secured A grade");
			}
		}			
	}

}
