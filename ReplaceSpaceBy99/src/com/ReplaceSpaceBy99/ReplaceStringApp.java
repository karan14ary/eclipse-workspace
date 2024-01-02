package com.ReplaceSpaceBy99;

import java.util.Scanner;

public class ReplaceStringApp {

	public static void main(String[] args) {
		//creating object of Scanner class
				Scanner scan=new Scanner(System.in);
				//asking user to enter the string
				System.out.println("Enter the string");
				//storing string in str variable
				String str=scan.nextLine();
				//invoking replaceSpace()and storing in str1
//				String[]str1=ReplaceString.replaceString(str);
//               for(String x:str1) {//taking each element of str1 array 
//            	   System.out.print(x);//print each element}
				System.out.println(ReplaceString.replaceString(str));
               }
	}


