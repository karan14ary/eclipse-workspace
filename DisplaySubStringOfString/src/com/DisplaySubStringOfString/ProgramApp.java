package com.DisplaySubStringOfString;

import java.util.Scanner;

public class ProgramApp {

	public static void main(String[] args) {
		// creating object of Scanner class
		Scanner scan=new Scanner(System.in);
		//Asking user for input
		System.out.println("Enter the string from substring should be found");
		//storing the input to str 
		String str=scan.nextLine();
		//invoking displaySubString()
		Program.displaySubString(str);
		ProgramRev.displayRevSubString(str);
	}

}
