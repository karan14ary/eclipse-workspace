package com.String.ComparisionOfString;

public class Program9 {

	public static void main(String[] args) {
		String s1= "ram";
		String s2="rama";
		int res=s1.compareTo(s2);
		if(res>0) {
			System.out.println("String s1 is greater");
		}
		else if(res<0) {
			System.out.println("String s2 is greater");
		}
		else {
		System.out.println("Both strings are equal");
		}

	}


	}


