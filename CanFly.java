package com.java.practice.oop1;

// this is an interface i.e a contract. Which means if one class implements the interface, it should 
//use the abstract methods from that. A class can implement multiple interfaces but can inherit only 
//from one parent. 

public interface CanFly {
	
	//abstract method : no body
	public void fly();

}


//an abstract class is a class which implements abstract methods, it can't be instantiated. It can only
//become the parent class.