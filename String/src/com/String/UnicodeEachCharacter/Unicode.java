package com.String.UnicodeEachCharacter;

public class Unicode {
	static int[] unicode(String str1) {
		char[]arr=str1.toCharArray();
		//taking the string to character array
		int x[]=new int[str1.length()];//initializing integer array
		for(int i=0;i<=arr.length-1;i++) {
			 x[i]=arr[i];
			 //take the unicode value of each charcater
			
		}
		return x;
	}

}
