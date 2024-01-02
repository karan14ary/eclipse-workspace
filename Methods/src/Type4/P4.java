package Type4;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=scan.nextInt();
		System.out.println("Enter the second number");
		int b=scan.nextInt();
		int mul=getMul(a,b);
		int add=getAdd(a,b);
		System.out.println("The multiple of "+a +" and "+b+" is "+mul );
		System.out.println("The sum of "+a+" and "+b +" is "+add);
	}
	public static int getMul(int a,int b) {
		return a*b;
	}
	public static int getAdd(int a,int b) {
		return a+b;
	}
}
