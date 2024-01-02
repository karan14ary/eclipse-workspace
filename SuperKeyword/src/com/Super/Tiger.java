package com.Super;

public class Tiger extends Animal {
	
	String sound="Tiger roar";
	void makeSound() {
		super.makeSound();
	System.out.println("Tiger is making "+sound);
}
}
