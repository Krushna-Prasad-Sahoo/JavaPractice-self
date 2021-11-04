package com.java.practice.oop1;

public class Human {
	
	String name;
	int age;
	double weight;
	double height;
	
	public Human(String nm, int ag, double wt, double ht) {
		this.name = nm;
		this.age = ag;
		this.weight = wt;
		this.height = ht;
	}

	public void speak() {
		System.out.println("My name is " + name);
		System.out.println("I am " + age + "years old");
		System.out.println("I am heighing " + height + " and weighing " + weight);
		System.out.println();
	}
	
	public void work() {
		System.out.println("..working");
	}
	
	public void read() {
		System.out.println("...reading & writing ...");
	}

}
