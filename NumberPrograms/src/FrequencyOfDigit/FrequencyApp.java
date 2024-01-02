package FrequencyOfDigit;

import java.util.Scanner;

public class FrequencyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);//create an object for Scanner class
		System.out.println("Enter a number");//Ask for user input
		int n=scan.nextInt();//store the user input in a  variable
		int arr[]=new int[10];//initialize the empty arry 
		Frequency.frequency(n,arr);//invoking method
		
	}

}
