package RectangleSquareCheck;

import java.util.Scanner;

public class RectangleSquareCheckApp {

	public static void main(String[] args) {
		// Creating object of Scanner class
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length");//Asking user for length
		int l= scan.nextInt();//storing length in a variable l
		System.out.println("Enter the breadth");//asking user for breadth
		int b=scan.nextInt();//storing breadth in a variable b
	RectangleSquare.rectangleSquareCheck(l,b);//invoking method
	}

}
