package com.String.ComparisionOfString;

public class Program4 {

	public static void main(String[] args) {
		String s1="java";
		String s2="Sql";
		String s3="java"+"Sql";
		String s4="java"+"Sql";
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
