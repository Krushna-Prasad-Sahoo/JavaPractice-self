package com.java.assignment.udemy;

public class DataTypes_EmployeeExample {

	public static void main(String[] args) {

		DataTypes_EmployeeExample dd = new DataTypes_EmployeeExample();
		dd.employee();
	}

	public void employee() {
		int empId = 59285;
		String empName = "Krushna Prasad Sahoo";
		String company = "Hexaware Technologies";
		float empSalary = 38200f;
		double kuchV = 123456789.543245;

		System.out.println("The employee id is : " + empId);
		System.out.println("The company name is : " + company);
		System.out.println("The employee name is : " + empName);
		System.out.println("The employee salary is : " + empSalary);
		System.out.println("Kuch v is : " + kuchV);
	}
}
