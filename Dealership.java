package com.project.CarDealership;

public class Dealership {
	public static void main(String[] args) {
		
		Customer c1 = new Customer("KP", "Rourkela", 111, "kp@kps.com", 9);
		Vehicle vh1 = new Vehicle("Audi", "Sedan", 20000, 4, 110);
		Employee emp1 = new Employee("prasun", 001 , 12345, 7);
		
		
		c1.customIntro();
		c1.purchaseCar(vh1, emp1, true);
		
	}

}
