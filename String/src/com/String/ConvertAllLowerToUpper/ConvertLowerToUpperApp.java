package com.String.ConvertAllLowerToUpper;

import java.util.Scanner;

public class ConvertLowerToUpperApp {

	public static void main(String[] args) {
		//creting object of Scanner class
				Scanner scan=new Scanner (System.in);
				//Asking user for first string
				System.out.println("Enter the string");
				//storing string in str1
				String str=scan.nextLine();
				//invoking method and printing
			System.out.println(ConvertLowerToUpper.covertLowerToUpper(str));
	}

}
