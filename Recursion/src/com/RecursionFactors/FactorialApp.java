package com.RecursionFactors;

import java.util.Scanner;

public class FactorialApp {

	public static void main(String[] args) {
		// Creating object of Scanner class
		Scanner scan=new Scanner(System.in);
		//asking user for input
		System.out.println("Enter a number whose factorial to be found");
		//storing it to a variable n
		int n=scan.nextInt();
		int fact=1;//initializing fact=1
		//invoking findFactorial ()
		Factorial.findFactorial(n,fact);
		System.out.println(Fact.findFactorial(n));

	}

}
