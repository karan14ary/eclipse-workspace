package CheckNumberEqualOrLargest;

import java.util.Scanner;

public class CheckNumberApp {

	public static void main(String[] args) {
		//creating object of Scanner class
Scanner scan=new Scanner(System.in);
//asking for first numeber from user
System.out.println("Enter the first number");
int num1=scan.nextInt();//storing first number  in a variable num1
System.out.println("Enter the second number");
//asking for the second number
int num2=scan.nextInt();//storing second number in a variable num2
System.out.println("Enter the third number");
//Asking for third number
int num3=scan.nextInt();
//storing third number in a variabe num3
CheckNumber.checkNumber(num1, num2, num3);//invoking method
	}

}
