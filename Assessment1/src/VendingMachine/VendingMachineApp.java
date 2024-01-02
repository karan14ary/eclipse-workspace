package VendingMachine;

import java.util.Scanner;

public class VendingMachineApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//create an object for Scanner class
		System.out.println("Enter a ProductCode");//Ask for user input
		String s=scan.next();//store the user input in a  variable 
		VendingMachine.vendingMachine(s);//invoking method
	}

}
