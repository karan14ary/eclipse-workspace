package Discount;

import java.util.Scanner;

import Age.Age;

public class DiscountApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);//create an object for Scanner class
	System.out.println("Enter a price");//Ask for user input
	int price=scan.nextInt();//store the user input in a  variable 
Discount.discount(price);//invoking method
}
}
