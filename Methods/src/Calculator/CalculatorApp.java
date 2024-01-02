package Calculator;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a= scan.nextInt();
		System.out.println("Enter the second number");
		int b= scan.nextInt();
		int add=add(a,b);
		System.out.println("The sum of "+a+ " and "+b+" is "+add);
		int sub=sub(a,b);
		System.out.println("The difference of "+a+ " and "+b+" is "+sub);
		int mul=mul(a,b);
		System.out.println("The multiple of "+a+ " and "+b+" is "+mul);
		int div=div(a,b);
		System.out.println("The quotitent of "+a+ " and "+b+" is "+div);
		int rem=rem(a,b);
		System.out.println("The remainder of "+a+ " and "+b+" is "+rem);
		

	}
	static int add(int a,int b) {
		return a+b;
	}
	static int sub(int a,int b) {
		return a-b;
	}
	static int mul(int a,int b) {
		return a*b;
	}
	static int div(int a,int b) {
		return a/b;
	}
	static int rem(int a,int b) {
		return a%b;
	}
}
