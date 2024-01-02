package ScannerClass;

import java.util.Scanner;

public class ReadFullName {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the full name");
		String fullname=scan.nextLine();
		System.out.println("The Fullname is "+fullname);
	}

}
