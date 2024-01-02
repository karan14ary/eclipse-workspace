package JourneyCalculator;

import java.util.Scanner;

public class JourneyCalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter the speed ");
		double speed=scan.nextDouble();
		System.out.println("Enter the time");
		double time=scan.nextDouble();
		JourneyCalculator journeyCalculator = new JourneyCalculator();

		System.out.println(journeyCalculator.calculateDistance(speed,time));
	}

}
