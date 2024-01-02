package com.String.checkFrequency;

import java.util.Scanner;

public class CheckFrequencyApp {

	public static void main(String[] args) {
		//creating object of Scanner class
		Scanner scan=new Scanner(System.in);
		//asking user to enter the string
		System.out.println("Enter the string");
		//storing string in str variable
		String str=scan.nextLine();
		//invoking  the checkFrequency()
	    CheckFrequency.checkFrequency(str);

	}

}
