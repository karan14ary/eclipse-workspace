package com.calculator;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		try {
			System.out.println("Calculation started");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first Number");
		int a=scan.nextInt();
		System.out.println("Enter the second Number");
		int b=scan.nextInt();
		Calculator.add(a,b);
		Calculator.sub(a,b);
		Calculator.mul(a,b);
		Calculator.div(a,b);
		}
		catch(Exception e ) {
			System.out.println("Exception is handled in main method	");
		}
		finally {
			System.out.println("Calculation ended");
		}

	}

}
