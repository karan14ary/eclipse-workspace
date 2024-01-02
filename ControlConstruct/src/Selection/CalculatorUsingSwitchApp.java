package Selection;

import java.util.Scanner;

public class CalculatorUsingSwitchApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number");
		double num1=scan.nextDouble();
		System.out.println("Enter the second number");
		double num2 =scan.nextDouble();
		System.out.println("Enter the operators");
		char ch=scan.next().charAt(0);
		CalculatorUsingSwitch.calculate(num1, num2, ch);
	}

}
