package com.String.CovertLowerToUpperAndViceversa;

public class ConvertLowerToUpperAndViceversa {
	static String convertLowerToUpperAndViceversa(String str) {
		char[] str2=str.toCharArray();//convert string to character array
		for(int i=0;i<=str2.length-1;i++) {//take each element in an array 
			if(str2[i]>='A'&&str2[i]<='Z') {//check element is uppercase
				int x=(int)str2[i]+32;//take ascii and add 32
				str2[i]=(char)x;//convert to character from ascii
			}
			else if(str2[i]>='a'&&str2[i]<='z')
			{//check each element in an array is lower
				int x=(int)str2[i]-32;//take ascii of character and subtract 32
				str2[i]=(char)x;//convert ascii to character
			}
			else {
				System.out.println("Special Character");
			}
		}
		String s=new String(str2);//convert character to string
		return s;	
}
}