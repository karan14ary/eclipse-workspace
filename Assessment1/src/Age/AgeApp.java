package Age;

import java.util.Scanner;

public class AgeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//create an object for Scanner class
		System.out.println("Enter a age");//Ask for user input
		int age=scan.nextInt();//store the user input in a  variable 
	Age.age(age);//invoking method
	}

}
