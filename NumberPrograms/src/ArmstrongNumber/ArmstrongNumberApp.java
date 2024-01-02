package ArmstrongNumber;
import java.util.Scanner;

public class ArmstrongNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);//create an object for Scanner class
System.out.println("Enter a number");//Ask for user input
int n=scan.nextInt();//store the user input in a  variable 
int count=Count.count(n);//invoking count method 
int arm=ArmstrongNumber.armstrongNumber(n,count);//invoking ArmstrongNumber method

if(arm==n) {//check if its Armstrong or not
	System.out.println("Armstrong Number");
}
else {
	System.out.println("Not Armstrong Number");
}



	}

}
