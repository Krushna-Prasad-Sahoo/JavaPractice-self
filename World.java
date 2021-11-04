package com.java.practice.oop1;

public class World {
	public static void main(String[] args) {

		Human human1 = new Human("billi", 23, 75, 65);
		Human human2 = new Human("sher", 22, 65, 75);

		human1.speak();
		human2.speak();
		
//		Animal an1 = new Animal("Jaguar");
//		an1.eat();
//		an1.sleep();
		
		Bird b1 = new Bird("sparrow");
		b1.eat();
//		b1.fly();
		
		
		Fish f = new Fish("Roohi");
		f.Swim();
		f.eat();
		
		Sparrow sp = new Sparrow("Red");
		sp.movement();
				
	}
}
