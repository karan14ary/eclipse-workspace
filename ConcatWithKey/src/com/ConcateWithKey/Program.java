package com.ConcateWithKey;

public class Program {
static void concateKey(String str,int key) {
	char[]arr=str.toCharArray();//convert string to char arr[]
	String s="";//take empty string 
	for(int i=0;i<=arr.length-1;i++) 
	{//traverse charcter for 0 index to arr.length-1
		int x=arr[i];//convert the char array to it's ascii value
		int y=x+key;//add key value to ascii value 
		char s1=(char)y;//convert ascii value to character  
		s=s+s1;//concat with empty string s
	}
	System.out.print(s);//print string s
}
}
