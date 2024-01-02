package GalacticArithmetic;

import java.util.Scanner;

public class GalacticArithmeticApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
	System.out.println("Enter the first number");
	long num1=scan.nextLong();
	System.out.println("Enter the second number");
	long num2=scan.nextLong();
System.out.println(GalacticOperator.galacticAddition(num1, num2)+"L");
	}

}
