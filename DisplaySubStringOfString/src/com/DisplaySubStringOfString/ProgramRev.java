package com.DisplaySubStringOfString;

public class ProgramRev {
	static void displayRevSubString(String str) {
		char[]arr=str.toCharArray();
		//traverse all element in an array form arr.length-1 to 0
		for(int i=arr.length-1;i>=0;i--) {
			//create an empty String
			String s="";
			//traverse element from i to arr.length-1
			for(int j=i;j<=arr.length-1;j++) {
				s=s+arr[j];//concate the string sith a=char arr[]
				System.out.println(s);
				
			}
			
		}
	}
}
