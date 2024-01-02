package Looping;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		double n=scan.nextDouble();
		int f=1;
		do {
			f*=n;
			n--;
		}while(n>=1);
		System.out.println(f);
		
		
	}

}
