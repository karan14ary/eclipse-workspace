package com.multilevel;

public class Rectangle extends Shape {
	double base;
	double height;
	void calculateRectangleArea(){
	 double area=base*height;
	 System.out.println("Area: "+area);
	}
}
