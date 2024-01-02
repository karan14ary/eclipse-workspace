package com.LongestWord;

import java.util.Scanner;

public class LongestWordApp {

	public static void main(String[] args) {
		//creating object of Scanner class
				Scanner scan=new Scanner(System.in);
				//asking user to enter the string
				System.out.println("Enter the string");
				//storing string in str variable
				String str=scan.nextLine();
				//invoking longestword ()
				System.out.println(LongestWord.longestWord(str)+" is the longest word ");
}
}