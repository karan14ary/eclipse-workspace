package MethodOverloading;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the side");
		int side=scan.nextInt();
		System.out.println("Enter the radius");
		float radius=scan.nextFloat();
		System.out.println("Enter the length");
		int length=scan.nextInt();
		System.out.println("Enter the side");
		int breadth=scan.nextInt();
		int square=calculateArea(side);
		float circle=calculateArea(radius);
		int rectangle=calculateArea(length,breadth);
		System.out.println("The area of square is "+square);
		System.out.println("The area of circle "+circle);
		System.out.println("The area of rectangle is"+rectangle);
		
	}
 public static int calculateArea(int s) {
	 return s*s;
 }
 public static float calculateArea(float r) {
	 return 3.14f*r*r;
 }
 public static int calculateArea(int l,int b) {
	 return l*b;
 }
}
