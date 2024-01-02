package com.AnagramWithoutSort;

import java.util.Scanner;

public class AnagramApp {

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
		//invoking anagram() and storing to variable a
		int a=Anagram.anagram(str1, str2);
		if(a==1) {//if returned value is 1 then
			System.out.println("Anagram");
		}
		else {//otherwise
			System.out.println("Not Anagram");
		}

	}

}
