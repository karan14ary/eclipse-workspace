package com.multilevel;

import java.util.Scanner;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	     String s=scan.next();
         Triangle t=new Triangle();
	     if(s.equals("Rectangle")){
	      t.base=scan.nextDouble();
	      t.height=scan.nextDouble();
	         t.calculateRectangleArea();
	     }
	     else if(s.equals("Circle")){
	         t.radius=scan.nextDouble();
	         t.calculateCircleArea();
	     }
	     else{
	    	 t.length=scan.nextDouble();
	    	 t.width=scan.nextDouble();
	         t.calculateTriangleArea();
	     }
	}

}
