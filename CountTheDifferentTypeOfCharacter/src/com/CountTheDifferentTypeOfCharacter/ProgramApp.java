package com.CountTheDifferentTypeOfCharacter;

import java.util.Scanner;

public class ProgramApp {

	public static void main(String[] args) {
		// creating object of Scanner class
   Scanner scan=new Scanner(System.in);
   //asking user to input string
   System.out.println("Enter the string");
   //stroing to a string s variable
   String s=scan.nextLine();
   //invoking countLetterAndShowLetter()
	//Program.countLetterAndShowLetter(s);
	CommaInstead.countLetterAndShowLetterSeparatedByComma(s);
	}

}
