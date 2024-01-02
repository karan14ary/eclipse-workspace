package com.constructorchainingusingthismethod;

public class Laptop {
String processor="i3";
int cost=48000;
String brand="Dell";
void display() {
	System.out.println("Processor: "+processor);
	System.out.println("Brand: "+brand);
	System.out.println("Cost: "+cost);
}
public Laptop() {
	this("i5");
	System.out.println("Zero-parameterized constructor");
}
public Laptop(String processor) {
	this("i5","Lenovo");
	this.processor = processor;
	System.out.println("One-parameterized Constructor");
}

public Laptop(String processor, String brand) {
	this("i9","Alienware",500000);
	this.processor = processor;
	this.brand = brand;
	System.out.println("Two-parameterized Constructor");
}
public Laptop(String processor, String brand,int cost) {
	super();
	this.processor = processor;
	this.cost = cost;
	this.brand = brand;
	System.out.println("Three-parameterized Constructor");
}


}
