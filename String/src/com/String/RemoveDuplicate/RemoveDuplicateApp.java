package com.String.RemoveDuplicate;

import java.util.Scanner;

public class RemoveDuplicateApp {

	public static void main(String[] args) {
		//creting object of Scanner class
		Scanner scan=new Scanner (System.in);
		//Asking user for first string
		System.out.println("Enter the string");
		//storing string in str1
		String str=scan.nextLine();
		//invoking method and printing
System.out.println(RemoveDuplicate.removeDuplicate(str));
	}

}
