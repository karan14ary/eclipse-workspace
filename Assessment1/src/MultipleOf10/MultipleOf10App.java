package MultipleOf10;

import java.util.Scanner;

import Age.Age;

public class MultipleOf10App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//create an object for Scanner class
		System.out.println("Enter a number");//Ask for user input
		int n=scan.nextInt();//store the user input in a  variable 
	Multiple.mul(n);//invoking method
	}

}
