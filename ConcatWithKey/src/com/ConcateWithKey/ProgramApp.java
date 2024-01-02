package com.ConcateWithKey;

import java.util.Scanner;

public class ProgramApp {

	public static void main(String[] args) {
		// creating object of Scanner class
				Scanner scan=new Scanner(System.in);
				//Asking user for input
				System.out.println("Enter the string ");
				//storing the input to str 
				String str=scan.nextLine();
				System.out.println("Enter the key");
				//asking user for key value
				int key=scan.nextInt();
				//storing key in key variable
				Program.concateKey(str,key);
				//invoking concateKey()

	}

}
