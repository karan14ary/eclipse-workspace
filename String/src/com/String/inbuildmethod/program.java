package com.String.inbuildmethod;

public class program {

	public static void main(String[] args) {
		String s1="Java SQL Python";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.startsWith("P"));
		System.out.println(s1.startsWith("J"));
		System.out.println(s1.endsWith("n"));
		System.out.println(s1.endsWith("p"));
		System.out.println(s1.contains("SQL"));
		System.out.println(s1.contains("c"));
		System.out.println(s1.indexOf('S'));
		System.out.println(s1.charAt(5));
		System.out.println(s1.substring(4));
		System.out.println(s1.subSequence(4, 9));
	}

}
