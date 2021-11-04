package com.java.practice.oop1;

public class Bird extends Animal{
	
	String name;

	public Bird(String name) {
		super(name);
		this.name = name;
	}

	public void movement() {
		// abstract method from abs. class is implemented here. 
	}
	
//	public void fly() {
//		System.out.println(".i'm " + name + "..flying...");
//		System.out.println();
//	}

	
}
