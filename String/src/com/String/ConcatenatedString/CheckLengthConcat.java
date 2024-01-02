package com.String.ConcatenatedString;

public class CheckLengthConcat {
static String checkConcatenate(String str1,String str2) {
	if(str1.length()==str2.length()) {//check length of string
		return str1.concat(str2);//equal then concatenate two strings
	}
	else {
		return"Both strings length are different";
	}
}
}
