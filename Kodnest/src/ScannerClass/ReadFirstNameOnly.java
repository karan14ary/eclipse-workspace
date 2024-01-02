package ScannerClass;

import java.util.Scanner;

public class ReadFirstNameOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the full name");
		String fname=scan.next();
		System.out.println("The first name is "+fname);
	}

}
