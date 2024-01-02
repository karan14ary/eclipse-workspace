package com.Assignment.Factorial;

import java.util.Scanner;

public class FactorialApp {

	public static void main(String[] args) {
		//Creating object of Scanner class
		Scanner scan=new Scanner(System.in);
		//Asking the user for input
		System.out.println("Enter a number ");
		//Storing number in number variable
		int number=scan.nextInt();
		//invoking factorial ()
		Factorial.factorial(number);
	}

}
