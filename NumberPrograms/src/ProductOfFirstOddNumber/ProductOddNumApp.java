package ProductOfFirstOddNumber;

import java.util.Scanner;

public class ProductOddNumApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//create an object for Scanner class
		System.out.println("Enter a number");//Ask for user input
		long n=scan.nextLong();//store the user input in a  variable
		long mo=ProductNum.productOddNum(n);//invoking method
		System.out.println("The product of "+n+" odd numbers are "+mo);
	}

}
