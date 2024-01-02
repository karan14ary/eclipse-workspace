package Polygon;

import java.util.Scanner;

import Age.Age;

public class PolygonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//create an object for Scanner class
		System.out.println("Enter a number of sides in a polygon");//Ask for user input
		int side=scan.nextInt();//store the user input in a  variable 
	Polygon.polygon(side);//invoking method
	}

}
