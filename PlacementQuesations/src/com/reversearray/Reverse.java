package com.reversearray;

public class Reverse {

	public static int[] ReverseArray(int[] arr) {
		int rev[]=new int[arr.length];
		for(int i=0;i<=arr.length-1;i++) {
			rev[i]=arr[arr.length-1-i];
		}
		return rev;
	}

}
