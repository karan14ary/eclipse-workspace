package com.ReplaceString;

public class Replace {
static void replaceKeyAscii(String str,char key) {
	char []arr=str.toCharArray();
	String s="";
	for(int i=0;i<=arr.length-1;i++) {
		if(arr[i]==key){
			 s+=(int)key;	
		}
		else {
			s+=arr[i];
		}
	}
	System.out.println(s);
	
	
}
}
