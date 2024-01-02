package com.Recursion.gcd;

import java.util.Scanner;

public class GcdApp {

	public static void main(String[] args) {
		// creating object of Scanner class
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the two numbers n1 and n2");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		//invoking findGcd() and printing
		System.out.println(Gcd.findGcd(n1,n2));

	}

}
