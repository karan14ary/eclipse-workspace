package PowerOfSquare;

import java.util.Scanner;

public class SquareNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		System.out.println(SquareNumber.squareNumber(num));
	}

}
