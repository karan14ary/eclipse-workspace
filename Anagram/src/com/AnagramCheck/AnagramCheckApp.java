package com.AnagramCheck;

import java.util.Scanner;

public class AnagramCheckApp {

	public static void main(String[] args) {
//Creating object of Scanner class
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first String");
		//asking user for first string
		String str1=scan.nextLine();
		//storing first string in str1 variable
		System.out.println("Enter the second String");
		//asking user for second variable
		String str2=scan.nextLine();
		//storing second string in str1 variable
		AnagramCheck.anagramCheck(str1,str2);
	}

}
