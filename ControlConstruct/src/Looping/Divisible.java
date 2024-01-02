package Looping;

import java.util.Scanner;

public class Divisible {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter a number ");
		int n =scan.nextInt();
		while(n>1) {
			n=n/2;
			System.out.println(n);
		}
	}

}
