package SpaceThrustControl;

import java.util.Scanner;

public class SpaceThrustCalculateApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		 System.out.println("Enter throtle setting");
		 int throtlesetting=scan.nextInt();
 System.out.println(SpaceThrustCalculate.calculateThrust(throtlesetting));
	}

}
