package com.ReverseWord;

public class ReverseWord {
static String reverseWord(String str) {
	String []str1=str.split(" ");
	String s=""; 
	//convert string into string array
			for(int i=0;i<=str1.length-1;i++)
			{//take from index 0 to str1.length-1
				char[]arr=str1[i].toCharArray();
				//convert each string element to character []
				char []arr1=new char[arr.length];
				
				for(int j=arr.length-1;j>=0;j--) 
				{// take from last character and reverse each word
					//System.out.print(arr[j]);
					arr1[j]=arr[j];//reverse word
					s=s+arr1[j];//concatenate the character to empty string 
				//conver char[]arr1[j] to string
				}
				//System.out.print(" ");//after each word print space	
			s=s+" ";//concatenate each word with the space
			
			}	
			//System.out.println(s);
			return s;
}
}
