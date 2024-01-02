package SumOfFirstNatutralNumber;

import java.util.Scanner;

public class SumNaturalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//create an object for Scanner class
		System.out.println("Enter a number");//Ask for user input
		int n=scan.nextInt();//store the user input in a  variable 
		int sum=SumNatural.sumNaturalNumber(n);//invoking method
		System.out.println("The sum of first "+n+" Natural Number is "+sum);
	}

}
