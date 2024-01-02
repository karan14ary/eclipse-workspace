package FinanceCalculator;

import java.util.Scanner;

public class FinanceCalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the principle");
		double p=scan.nextDouble();
		System.out.println("Enter the rate");
		double r=scan.nextDouble();
		System.out.println("Enter the time");
		double t=scan.nextDouble();
		FinanceCalculator calculator = new FinanceCalculator();

		System.out.println(calculator.calculateSimpleInterest(p,t,r));
		}

}
