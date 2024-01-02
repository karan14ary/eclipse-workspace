package com.AnagramCheck;

import java.util.Arrays;

public class AnagramCheck {
static void anagramCheck(String str1,String str2) {
	char[]arr1=str1.toCharArray();//converting string to char array
	Arrays.sort(arr1);//sort the arr1
	String s1=new String(arr1);
	//convert char array to string
	char[]arr2=str2.toCharArray();//convert string to char array
	Arrays.sort(arr2);//sort arr2
	String s2=new String(arr2);//convert character to string
	if(s1.equals(s2)) {//compare element of two string if equals then
		System.out.println("Anagram");
	}
	else {//otherwise
		System.out.println("Not Anagram");		
	}

}
}
