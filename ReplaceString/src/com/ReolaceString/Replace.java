package com.ReolaceString;

public class Replace {
static void replaceKey(String str,char key) {
	String s="";//initializing empty string
	for(int i=0;i<=str.length()-1;i++) 
	{//traverse all the character of string 
			if(s.charAt(i) == key)
			{//compare the key value with charcter present in string
				s += "77";//replace key with 77
			}
			else {
				s += str.charAt(i);//other wise  concat the charcters
				}
	}
	System.out.println(s);
	}
}
