package com.Encapsulation.achievingEncapsulation;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		System.out.println("Enter the pin");
		int pin =scan.nextInt();
		System.out.println("Enter the amount to be withdrawl");
		int amount=scan.nextInt();
		Bank b=new Bank();
		b.setData(amount, pin);
		b.getData(amount, pin);
	}

}
