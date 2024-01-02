package com.String.ComparisionOfString;

public class Program5 {

	public static void main(String[] args) {
		String s1="java";
		String s2="Sql";
		String s3=s1+s2;
		String s4=s1+s2;
		if(s3==s4) {
			System.out.println("References are equal ");
		}
		else {
			System.out.println("References are not equal");
		}
		if(s3.equals(s4)) {
			System.out.println("String value are equal");
		}
		else {
			System.out.println("String value are not equal");
		}




	}

}
