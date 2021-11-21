package com.project.CarDealership;

public class Customer {
	
	String customName;
	String customAddress;
	int customContactNumber;
	String customMail;
	int customRatingOutOf10;
	
	public Customer(String customName, String customAddress, int customContactNumber, String customMail,
			int customRatingOutOf10) {
		this.customName = customName;
		this.customAddress = customAddress;
		this.customContactNumber = customContactNumber;
		this.customMail = customMail;
		this.customRatingOutOf10 = customRatingOutOf10;
	}
	
	Vehicle vh = new Vehicle("Aston Martin", "Sedan", 50000, 6, 210);
	Employee emp = new Employee("prasun", 001 , 12345, 7);

	public void customIntro() {
		System.out.println("Hello !!, My name is " + customName + ". I am from " + customAddress + 
				". You can contact me in " + customContactNumber + " or " + customMail + ". ThankUh .");
		System.out.println();
	}
	public void purchaseCar(Vehicle vh, Employee emp ,boolean finance) {
		emp.sellVar(customName, vh, finance);
	}
}
