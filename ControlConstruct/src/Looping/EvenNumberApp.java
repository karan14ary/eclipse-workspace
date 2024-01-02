package Looping;

import java.util.Scanner;

public class EvenNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number greater than 100");
		int n=scan.nextInt();
		if(n<=100) {
			System.out.println("Please enter a number greater than 100");
		}
		else {
			EvenNumber.evenNumber(n);
		}
	}

}
