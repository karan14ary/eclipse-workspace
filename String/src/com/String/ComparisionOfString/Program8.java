package com.String.ComparisionOfString;

public class Program8 {

	public static void main(String[] args) {
		String s1= "rambabu";
		String s2="shyambabu";
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
