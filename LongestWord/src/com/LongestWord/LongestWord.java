package com.LongestWord;

public class LongestWord {
static String longestWord(String str) {
	String []str1=str.split(" ");//split the each word of string  and stor in an array
	String longest="";//take empty string as longest
	for(int i=0;i<=str1.length-1;i++) 
		{
		//take each element of an array
		String temp=str1[i];//take temporary string as the str1[i]
		if(temp.length()>longest.length()) 
		{//compare the length of temp longest string variable 
			longest=temp;
			//if temp length is larger then replace it with the longest 
		}
	}
	return longest;
}
}
