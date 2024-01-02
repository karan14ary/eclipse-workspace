package com.String.ConcatenatedString;

import java.util.Scanner;

public class CheckLengthConcatApp {

	public static void main(String[] args) {
		//creting object of Scanner class
		Scanner scan=new Scanner (System.in);
		//Asking user for first string
		System.out.println("Enter the first string");
		//storing string in str1
		String str1=scan.nextLine();
		//asking user for second string
		System.out.println("Enter the second string");
		//storing second string in str2
		String str2=scan.nextLine();
			//invoking checkLength() and printing
		System.out.println(CheckLengthConcat.checkConcatenate(str1, str2));

	}

}
