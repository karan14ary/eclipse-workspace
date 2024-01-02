package com.String.UnicodeEachCharacter;

import java.util.Scanner;

public class UnicodeApp {

	public static void main(String[] args) {
		//creting object of Scanner class
				Scanner scan=new Scanner (System.in);
				//Asking user for first string
				System.out.println("Enter the string");
				//storing string in str1
				String str1=scan.nextLine();
				//invoking method and printing
			int uni[]=Unicode.unicode(str1);
             //printing unicode
			System.out.println("The unicode of each character of string is :");
	       for(int x:uni) {
	    	   System.out.print(x+" ");
	       }
	}

}
