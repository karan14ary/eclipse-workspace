package GCD;

import java.util.Scanner;

public class GcdApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//create an object for Scanner class
		System.out.println("Enter a first number");//Ask for user input
		int n1=scan.nextInt();//store the user input in a  variable 
		System.out.println("Enter a second number");//Ask for user input
		int n2=scan.nextInt();//store the user input in a  variable 
		Gcd.gcd(n1, n2);
	}

}
