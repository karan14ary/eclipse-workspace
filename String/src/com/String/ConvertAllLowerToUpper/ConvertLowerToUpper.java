package com.String.ConvertAllLowerToUpper;

public class ConvertLowerToUpper {
static String covertLowerToUpper(String str) {
	char[] str2=str.toCharArray();//convert string to char array
for(int i=0;i<=str2.length-1;i++) {//take each element in an string
	if(str2[i]>='a'&&str2[i]<='z') {//check the element is either lower or not
		int x=(int)str2[i]-32;//if lower than take the ascii value and subtract 32
		str2[i]=(char)x;//convert the ascii to character
	}
	
}
String s=new String(str2);//convert character array to string
return s;
	}

}

