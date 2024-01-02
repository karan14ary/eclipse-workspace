package SumOfSquareOfNumber;

import java.util.Scanner;

public class SumSquareApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//create an object for Scanner class
		System.out.println("Enter a number");//Ask for user input
		int n=scan.nextInt();//store the user input in a  variable
		int sq=SumSquare.squareOfNumber(n);//invoking squareofNumber method
		System.out.println(sq);
	}

}
