package com.springProjectLaptop.SpringProject2;

public class Laptop {
int slno;
String brand;
int cost;
public Laptop() {
	super();
	// TODO Auto-generated constructor stub
}
public Laptop(int slno, String brand, int cost) {
	System.out.println("Constructor executed");
	this.slno = slno;
	this.brand = brand;
	this.cost = cost;
}
public int getSlno() {
	
	return slno;
}
public void setSlno(int slno) {
	System.out.println("Setter Executed");
	this.slno = slno;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
@Override
public String toString() {
	return "Laptop [slno=" + slno + ", brand=" + brand + ", cost=" + cost + "]";
}

}
