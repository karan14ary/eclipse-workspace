package Type2;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in); 
		System.out.println("Enter the name");
	    String name =scan.next();
	    learnJava(name);

	}
	public static void learnJava(String name) {
		System.out.println(name+" is learning java");
	}

}
