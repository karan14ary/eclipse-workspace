package com.String.Palindrone;

import java.util.Scanner;


public class PalindroneStringApp {

	public static void main(String[] args) {
		//creting object of Scanner class
				Scanner scan=new Scanner (System.in);
				//Asking user for first string
				System.out.println("Enter the string");
				//storing string in str1
				String str=scan.nextLine();
		       char rev[]=ReverseString.reverseString(str);
		        String reverse=new String(rev);
		        System.out.println(reverse);
		        //invoking and printing palindrone() 
		        System.out.println(PalindroneString.palindrone(reverse, str));

	}

}
