package Assessment;

import java.util.Scanner;

public class DoubleInvestmentTime {

//	public static void main(String[] args) {
//
//	Scanner scanner = new Scanner(System.in);
//
//	// Read the annual interest rate
//
//	double annualInterestRate = scanner.nextDouble();
//
//	// Read the initial investment amount
//
//	double initialInvestment = scanner.nextDouble();
//
//	// Calculate the target amount (double the initial investment)
//
//	double targetAmount = initialInvestment * 2.0;
//
//	// Initialize years
//
//	int years = 0;
//
//	// Calculate the doubling time using a while loop
//
//	while (initialInvestment < targetAmount) {
//
//	initialInvestment *= (1 + annualInterestRate); // Calculate interest
//
//	years++;
//
//	}
//
//	// Display the number of years it takes to double the investment
//
//	System.out.println("It takes " + years + " years for the investment to double.");
//
//	scanner.close();
//
//	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	  int p=scan.nextInt();
	  int t;
	  int i=p;
	  double r=scan.nextDouble();
	  t=i/(int)(p*r);
	  System.out.println("It takes " + t + " years for the investment to double.");
//	System.out.println("It takes " + t + " years for the investment to double.");
//	float rate=scan.nextFloat();
//	int t=0;
//	int p=scan.nextInt();
//	int i=0;
//	while(i!=p) {
//	i+=(int)(p*t*rate);
//	t++;
//	}
//	System.out.println("It takes " + t + " years for the investment to double.");
	}
	}