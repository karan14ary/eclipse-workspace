package com.ReverseStrinhWithoutChangingSpaces;

import java.util.Scanner;

public class ReverseApp {

	public static void main(String[] args) {
		// creating object of Scanner class
		   Scanner scan=new Scanner(System.in);
		   //asking user to input string
		   System.out.println("Enter the string");
		   //stroing to a string s variable
		   String s=scan.nextLine();
		   //invoking reverseStringWithoutChangingSpacePos()
		   Reverse.reverseStringWithoutChangingSpacePos(s);
	}

}
