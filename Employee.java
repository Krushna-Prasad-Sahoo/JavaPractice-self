package com.project.CarDealership;

public class Employee {
	
	String empName;
	int empId;
	long empContactNumber;
	int empRatingOutOf10;
		
	public Employee(String empName, int empId, long empContactNumber, int empRatingOutOf10) {
		this.empName = empName;
		this.empId = empId;
		this.empContactNumber = empContactNumber;
		this.empRatingOutOf10 = empRatingOutOf10;
	}

	public void sellVar(String customName, Vehicle vh, boolean finance) {
		System.out.printf(customName, vh, finance);
	}
}
