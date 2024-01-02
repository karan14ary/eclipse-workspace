package com.RecursionMultipleOfNumber;

import java.util.Scanner;

public class MultipleApp {

	public static void main(String[] args) {
		// Creating object of Scanner class
				Scanner scan=new Scanner(System.in);
				//asking user for input
				System.out.println("Enter a number whose table to be printed");
				//storing it to a variable n
				int n=scan.nextInt();
				int m=1;//initializing m to multiply
				//invoking findTableOfN ()
			Multiple.findTableOfN(n,m);
	}

}
