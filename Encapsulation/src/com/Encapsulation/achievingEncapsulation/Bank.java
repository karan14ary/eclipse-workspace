package com.Encapsulation.achievingEncapsulation;

public class Bank {
private int balance=100000;
private int pin=1234;
void setData(int amount,int key) {
	if(key==pin) {
		balance=balance-amount;
	}
	else {
		System.out.println("Invalid customer");
		System.exit(0);
	}
}
void getData(int amount,int key) {
	if(key==pin){
		System.out.println("The given amount is:"+amount);
		System.out.println("The new Balance is:"+balance);
	}
	else {
		System.out.println("Invalid customer");
		System.exit(0);
	}
}
}
