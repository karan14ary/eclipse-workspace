package com.ReplaceSpaceBy99;

public class ReplaceString {
static String replaceString(String str) {
	String []arr=str.split("");//split the string str and store in string array arr
	for(int i=0;i<=arr.length-1;i++) {//take each element of string array
		if(arr[i].equals(" ")){//check for blank spaces in an string array
		  arr[i]="99";//replace it by 99 string	
		}
	}
	String s=String.join("", arr);
	return s;
}
}
