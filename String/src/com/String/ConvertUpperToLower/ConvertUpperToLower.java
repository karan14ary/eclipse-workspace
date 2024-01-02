package com.String.ConvertUpperToLower;

public class ConvertUpperToLower {
static String convertUpperToLower(String str) {
	char[] str2=str.toCharArray();//convert string to char array
	for(int i=0;i<=str2.length-1;i++) {//take each element in an string
		if(str2[i]>='A'&&str2[i]<='Z') {//check the element is either upper or not
			int x=(int)str2[i]+32;//if upper than take the ascii value and subtract 32
			str2[i]=(char)x;//convert the ascii to character
		}
	}
	String s=new String(str2);
	return s;	
	}
}

