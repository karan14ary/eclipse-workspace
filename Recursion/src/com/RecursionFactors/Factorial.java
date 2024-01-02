package com.RecursionFactors;

public class Factorial {

	public static void findFactorial(int n,int fact) {
        
        if (n==0) {//check value of n if 0 then
        	System.out.println(fact);//print factorial
        	return;  
        }
        else {
        	fact*=n;//fact=fact*n
        	findFactorial(n-1,fact);//call method by decreasing it by 1
        	
        }
      

	}
     
}
