package com.String.Palindrone;

public class ReverseString {
	static char[] reverseString(String str) {
		char[]str2=str.toCharArray();//converting string to character array
		char[]rev=new char[str.length()];//creating array of rev
		for(int j=0, i=str2.length-1;j<=str2.length-1 &&i>=0;i--) 
		{//taking the two array length from last to 0 and 0 to str.lenhth-1 and 
			//initializing j=0 and i=str.length-1 decresing i and increasing i
			rev[j]=str2[i];//storing the reverse
			j++;
		}
		return rev;
}
}
