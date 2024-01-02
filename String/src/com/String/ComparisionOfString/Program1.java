package com.String.ComparisionOfString;

public class Program1 {

	public static void main(String[] args) {
		String s1=new String("java");
		String s2=new String("java");
		if(s1==s2) {
			System.out.println("References are equal ");
		}
		else {
			System.out.println("References are not equal");
		}
		if(s1.equals(s2)) {
			System.out.println("String value are equal");
		}
		else {
			System.out.println("String value are not equal");
		}

	}

}
