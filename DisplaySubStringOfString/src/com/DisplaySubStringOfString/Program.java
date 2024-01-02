package com.DisplaySubStringOfString;

public class Program {
static void displaySubString(String str) {
	char[]arr=str.toCharArray();
	//convert string to char arr[]
//	for(int k=0;k<=arr.length-1;k++) 
//	{//traverse each element in an array
//	for(int i=k;i<=arr.length-1;i++)
//	{//traverse element for index k to arr.length-1
//		for(int j=k;j<=i;j++) {
//			System.out.print(arr[j]);
//		
//		}
//		System.out.println();
//	}
//	}
	//traverse all element in an array
	for(int i=0;i<=arr.length-1;i++) {
		//create an empty String
		String s="";
		//traverse element from i to arr.length-1
		for(int j=i;j<=arr.length-1;j++) {
			s=s+arr[j];//concater the string sith a=char arr[]
			System.out.println(s);
			
		}
		
	}
}
}
