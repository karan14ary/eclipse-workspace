package PlanerExplorer;

import java.util.Scanner;

public class PlanetExplorerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the radius of planet");
		double radius=scan.nextDouble();
		PlanetExplorer explorer = new PlanetExplorer();

		System.out.println(explorer.calculateSurfaceArea(radius));
	}

}
