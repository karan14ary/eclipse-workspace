package ArmstrongNumberRange;

import java.util.Scanner;

import ArmstrongNumber.ArmstrongNumber;
import ArmstrongNumber.Count;

public class ArmstrongNumberRangeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//create an object for Scanner class
		//Ask for user input
	
		System.out.println("Enter a number to print the range from 1 to n");
		//store the user input in a  variable
		long n=scan.nextLong();
		for(long i=1;i<=n;i++) {//for loop for range
		long count=CountRange.count(i);//invoking count method
		long arm=ArmstrongNumberRange.armstrongNumberRange(i, count);
		//invoking armstrongNumberRange
		if(arm==i) {//check armStrong number
			System.out.println(arm);
		}
		
		}
	}

}
