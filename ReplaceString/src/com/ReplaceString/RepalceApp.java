package com.ReplaceString;

import java.util.Scanner;

public class RepalceApp {

	public static void main(String[] args) {
		// Creating object of Scanner class
		Scanner scan=new Scanner(System.in);
		//Asking user to input user full name of person 1
		System.out.println("Enter the string");
		//Storing it in name1 Variable
		String str=scan.nextLine();
		//Asking user to input user full name of person 2
		System.out.println("Enter the key character to be replaced");
		//Storing it in name2 Variable
	char key=scan.next().charAt(0);
	//invoking replaceKey()
	Replace.replaceKeyAscii(str, key);;
	}

}
