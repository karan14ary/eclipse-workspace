package HeightConverter;

import java.util.Scanner;

public class HeightConverterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the Height in inch");
		double Inch=scan.nextDouble();
		HeightConverter converter = new HeightConverter();
		System.out.println(converter.convertInchesToFeet(Inch));	
		}

}
