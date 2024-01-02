package com.ReverseWordOrder;

public class ReverseWordOrder {
	static String reverseWordOrder(String str) {
		String[]arr=str.split(" ");
		//split the string by the space present in  string array  to identify words 
		String str2="";
		for(int i=arr.length-1;i>=0;i--) 
		{//take the last word from string array to index 0
			//System.out.print(arr[i]+" ");
			str2=str2+arr[i]+" ";
			//print the reverse word with space
		}
//		String s1 = arr.toString();
//		System.out.println(s1);
		return str2;
	}

//	@Override
//	public String toString() {
//		return "ReverseWordOrder []";
//	}
	
}
