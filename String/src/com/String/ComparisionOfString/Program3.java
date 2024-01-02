package com.String.ComparisionOfString;

public class Program3 {

	public static void main(String[] args) {
		String s1=new String("java");
		String s2=new String("JAVA");
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
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("String value are equal after ignoring case");
		}
		else {
			System.out.println("String value are not equal after ignoring caswe");
		}


	}

}
