package com.Encapsulation.withoutEncapsulation;

import java.util.Scanner;

public class Hero {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("What is your name?");
		String name= scan.next();
		Bank b=new Bank();
		if(name.equals("HERO")) {
			System.out.println("Your balance is: "+b.balance);
			System.out.println("Enter the amount to be withdraw");
			int amt=scan.nextInt();
			b.balance=b.balance-amt;
			System.out.println("The new balance is:"+b.balance);
			
		}
	}

}
