package SwapTwoNumber;

import java.util.Scanner;

public class SwapTwoNum {

	public static void main(String[] args) {
		//Creating object of Scanner class
		Scanner scan=new Scanner(System.in);
		//Asking user for num1 and num2
		System.out.println("Enter the first number");
		int num1=scan.nextInt();
		System.out.println("Enter the second number");
		int num2=scan.nextInt();
		System.out.println("The numbers before swapping is: "+num1+" , "+num2);
		//swap without using third variable 
		num2=num1+num2;
		num1=num2-num1;
		num2=num2-num1;
		//using third variable
		//int temp=num2;
		//num2=num1;
		//num1=temp;
		
		System.out.println("The numbers after swapping is: "+num1+" , "+num2);
	}

}
