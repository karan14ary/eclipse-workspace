package EvenNumber;

import java.util.Scanner;

public class EvenNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//create an object for Scanner class
		System.out.println("Enter a number");//Ask for user input
		int n=scan.nextInt();//store the user input in a  variable 
		System.out.println("Even number from 1 to "+n+" is ");
		EvenNumber.evenNumber(n);//invoking method
		
	}

}
