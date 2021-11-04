package com.java.practice.oop1;

public class Sparrow extends Bird implements CanFly{

	public Sparrow(String name) {
		super(name);
	}

	public void fly() {
		System.out.println("I can fly now.. with the help of interface.");
	}

}
