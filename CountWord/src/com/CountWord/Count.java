package com.CountWord;

public class Count {
static void countWord(String s) {
	String[]arr=s.split(" ");//creating array  of word string 
	int n=arr.length;//count array length
	System.out.println("Total no. of words : "+n);
	for(int i=0;i<=arr.length-1;i++) {//traverse all the string
		System.out.println("Word - "+(i+1)+" : "+arr[i]);
	}
}
}
