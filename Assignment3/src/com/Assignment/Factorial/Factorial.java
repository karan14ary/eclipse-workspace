package com.Assignment.Factorial;

public class Factorial {
static void factorial(int number) {
	//initializing variable fact =1
			int fact=1;
			//taking for loop  from 1 to n
			for(int i=1;i<=number;i++) {
				//calculate factorial of number
				fact*=i;	
			}
			System.out.print("The factorial of "+number+" is "+fact);
}
}
