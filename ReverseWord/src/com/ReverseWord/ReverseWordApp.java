package com.ReverseWord;

import java.util.Scanner;

public class ReverseWordApp {

	public static void main(String[] args) {
		//creating object of Scanner class
				Scanner scan=new Scanner(System.in);
				//asking user to enter the string
				System.out.println("Enter the string");
				//storing string in str variable
				String str=scan.nextLine();
				//invoking reverseWord()
				//ReverseWord.reverseWord(str);
				System.out.println(ReverseWord.reverseWord(str));
	}

}
