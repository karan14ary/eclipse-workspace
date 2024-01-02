package com.String.ConvertUpperToLower;

import java.util.Scanner;

public class ConvertUpperToLowerApp {

	public static void main(String[] args) {
		//creting object of Scanner class
				Scanner scan=new Scanner (System.in);
				//Asking user for first string
				System.out.println("Enter the string");
				//storing string in str1
				String str=scan.nextLine();
				//invoking method and printing
System.out.println(ConvertUpperToLower.convertUpperToLower(str));
	}

}
