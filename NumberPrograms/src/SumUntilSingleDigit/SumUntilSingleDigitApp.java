package SumUntilSingleDigit;

import java.util.Scanner;

public class SumUntilSingleDigitApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//create an object for Scanner class
		System.out.println("Enter a number");//Ask for user input
		long n=scan.nextLong();//store the user input in a  variable
		long sum=SumUntilSingleDigit.sumUntilSingleDigit(n);//invoking method
		System.out.println(sum);
	}

}
