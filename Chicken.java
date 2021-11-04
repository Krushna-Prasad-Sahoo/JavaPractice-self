package com.java.practice.oop1;

public class Chicken extends Bird{

	public Chicken(String name) {
		super(name);
	}
	
	// method overriding : the fly() is inherited from Bird but changed here. 
	public void fly() {
		System.out.println("... Not able to fly ...");
	}

}
