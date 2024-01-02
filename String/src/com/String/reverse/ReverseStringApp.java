package com.String.reverse;

import java.util.Scanner;

public class ReverseStringApp {

	public static void main(String[] args) {
		//creting object of Scanner class
		Scanner scan=new Scanner (System.in);
		//Asking user for first string
		System.out.println("Enter the string");
		//storing string in str1
		String str=scan.nextLine();
		//invoking reverseString()and storing in char array
        char rev[]=ReverseString.reverseString(str);
        String reverse=new String(rev);
        
System.out.print(reverse);
	}

}
