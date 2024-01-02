package StringJoiner;

import java.util.Scanner;

public class StringJoinerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	System.out.println("Enter the first string");
	String str1=scan.next();
	System.out.println("Enter the second string");
	String str2=scan.next();
	System.out.println(StringJoiner.joinStrings(str1, str2));
	}

}
