package Result;

import java.util.Scanner;

import Vote.Vote;

public class ResultApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//create an object for Scanner class
		System.out.println("Enter a Marks of student obtained");//Ask for user input
		int marks=scan.nextInt();//store the user input in a  variable 
	Result.result(marks);//invoking method
	}

}
