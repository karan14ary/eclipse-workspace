package ScannerClass;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	System.out.println("Enter the value in byte");
	byte a=scan.nextByte();
	System.out.println("Enter the value in short");
	short b=scan.nextShort();
	System.out.println("Enter the value in int");
	int c=scan.nextInt();
	System.out.println("Enter the value in long");
	long d=scan.nextLong();
	System.out.println("Enter the value in float");
	float e=scan.nextFloat();
	System.out.println("Enter the value in double");
	double f=scan.nextDouble();
	System.out.println("Enter the value in boolean");
	boolean g=scan.nextBoolean();
	System.out.println("Enter the value in char");
	char h=scan.next().charAt(0);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	System.out.println(f);
	System.out.println(g);
	System.out.println(h);
	
	
	

	}

}
