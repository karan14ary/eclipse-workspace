package com.Panagram;

import java.util.Scanner;

public class PanagramApp {

	public static void main(String[] args) {
		//Creating object of Scanner class
				Scanner scan=new Scanner(System.in);
				System.out.println("Enter the String");
				//asking user for first string
				String str1=scan.nextLine();
				//storing first string in str1 variable
				//invoking panagram() and storing in boolean a variable
			
				if(Panagram.panagram(str1)==true) 
				{//check if retured value is true then
					System.out.println("Panagram");//print paragram 
				}
				else {//if return false then
					System.out.println("Not Panagram");
					//print not paragram
				}
	}

}
