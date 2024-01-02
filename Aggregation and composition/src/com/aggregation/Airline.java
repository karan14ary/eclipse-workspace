package com.aggregation;

public class Airline {
String brand;
Pilot p;
Airline(String brand,Pilot p){
	this.brand=brand;
	this.p=p;
}
void operations() {
	System.out.println(brand+" is doing operation");
}
}
