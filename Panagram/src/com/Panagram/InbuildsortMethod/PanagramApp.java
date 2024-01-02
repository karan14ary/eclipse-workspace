package com.Panagram.InbuildsortMethod;

import java.util.Scanner;

public class PanagramApp {

	public static void main(String[] args) {
		//Creating object of Scanner class
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		//asking user for first string
		String str1=scan.nextLine();
		//storing first string in str1 variable
		//invoking panagram() and printing
		System.out.println(Panagram.panagram(str1));
	}

}
