package ArithmeticOperation;

import java.util.Scanner;

public class ArithmeticOperatorsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
	System.out.println("Enter the first number");
	int num1=scan.nextInt();
	System.out.println("Enter the second number");
	int num2=scan.nextInt();
	System.out.println(ArithmeticOperators.subtractNumbers(num1, num2));
	System.out.println(ArithmeticOperators.multiplyNumbers(num1, num2));
	System.out.println(ArithmeticOperators.divideNumbers(num1, num2));
	System.out.println(ArithmeticOperators.findRemainder(num1, num2));
	}

}
