package com.multilevel;

public class Triangle extends Circle {
	double length;
	 double width;
	 void calculateTriangleArea(){
	     double area=(length*width)/2;
	     System.out.println("Area: "+area);
	 }
}
