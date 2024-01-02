package CityPlanningSimulator;

import java.util.Scanner;

public class CityPlanningSimulatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scan=new Scanner(System.in);
 System.out.println("Enter the side length");
 int sideLength=scan.nextInt();
 System.out.println("Enter the side length");
 double sideLengths=scan.nextDouble();
 System.out.println(CityPlanningSimulator.calculatePlotArea(sideLength));
 System.out.println(CityPlanningSimulator.calculatePlotArea(sideLengths));
	}

}
