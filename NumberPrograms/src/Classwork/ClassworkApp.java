package Classwork;

import java.util.Scanner;

public class ClassworkApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//create an object for Scanner class
		System.out.println("Enter a number");//Ask for user input
		int n=scan.nextInt();//store the user input in a  variable 
		if(n>100) {
			Classwork.divBy2(n);//invoking method
			Classwork.divBy3(n);//invoking method
			Classwork.divBy5(n);//invoking method
			Classwork.divBy2And5(n);//invoking method
			Classwork.divBy3AndComesTable5(n);//invoking method
			Classwork.prime(n);//invoking method
			Classwork.evenNumberDiv3(n);//invoking method
			Classwork.oddNumberDiv5(n);//invoking method
			Classwork.oddPrime(n);//invoking method
			Classwork.evenPrime(n);//invoking method
		}
		else {
			System.out.println("Please enter a numebr greater than 100");
		}
	}

}
