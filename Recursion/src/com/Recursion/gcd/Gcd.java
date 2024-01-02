package com.Recursion.gcd;

public class Gcd {

	public static int findGcd(int m, int n) 
	{
		if(n==0) {
		return m;
	}
		else {
			return findGcd(n,m%n);
		}
		}

}
