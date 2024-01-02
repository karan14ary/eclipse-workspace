package com.FindSameAlphabet;

import java.util.Scanner;

public class FindApp {

	public static void main(String[] args) {
		// Creating object of Scanner class
		Scanner scan=new Scanner(System.in);
		//Asking user to input user full name of person 1
		System.out.println("Enter the full name of person1 in Uppercase");
		//Storing it in name1 Variable
		String name1=scan.nextLine();
		//Asking user to input user full name of person 2
		System.out.println("Enter the full name of person2 in Uppercase");
		//Storing it in name2 Variable
		String name2=scan.nextLine();
		//invoke findSameAlpha()
		Find.findSameAlpha(name1,name2);
	}

}
