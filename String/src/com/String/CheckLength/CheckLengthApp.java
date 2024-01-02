package com.String.CheckLength;

import java.util.Scanner;

public class CheckLengthApp {

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
//strong length of str1 in len1
	int len1=str1.length();
	//stroing length of str2 in len2
	int len2=str2.length();
	//invoking checkLength() and printing
	System.out.println(CheckLength.checkLength(len1, len2));
	}

}
