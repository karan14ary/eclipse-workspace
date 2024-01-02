package RectangleAreaCalculator;

import java.util.Scanner;

import RectangleSquareCheck.RectangleSquare;

public class RectangleAreaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating object of Scanner class
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length");//Asking user for length
		double l= scan.nextDouble();//storing length in a variable l
		System.out.println("Enter the width");//asking user for width
		double w=scan.nextDouble();//storing width in a variable w
	double area=RectangleArea.calculateRectangleArea(l, w);//invoking method
	System.out.println("The Area of rectangle having "+l+ " , "+w+" is "+area   );
	}

}
