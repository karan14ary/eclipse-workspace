package com.String.Palindrone;

public class PalindroneString {
static String palindrone(String reverse,String str) {
	if(reverse.equals(str)) {//check reverse element is equal to str value 
	return("Palindrone");
	}
	else {
		return"Not Palindrone";
	}
}
}
