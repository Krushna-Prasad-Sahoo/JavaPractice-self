package com.java.practice.oop1;

//we are never going to create the instance of Animal class, we'll inherit Bird & Fish from it. So we can
//make it as abstract class

public abstract class Animal {
	
	String name;
	
	public Animal(String name) {
		this.name = name;
	}

	public void eat() {
		System.out.println(name + "is eating ...");
	}
	
	public void sleep() {
		System.out.println(name + "is sleeping");
		System.out.println();
	}
	
	public abstract void movement();

}
