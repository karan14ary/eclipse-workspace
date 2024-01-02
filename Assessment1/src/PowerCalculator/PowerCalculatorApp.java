package PowerCalculator;

import java.util.Scanner;
public class PowerCalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//create an object for Scanner class
		System.out.println("Enter a base");//Ask for user input
		int b=scan.nextInt();//store the user input  base in a  variable b
		System.out.println("Enter a exponent");//Ask for user input
		int e=scan.nextInt();//store the user input  exponent in a  variable e 
	int p=PowerCalculator.powerCalculator(b,e);//invoking method
	System.out.println(p);
	}

}
