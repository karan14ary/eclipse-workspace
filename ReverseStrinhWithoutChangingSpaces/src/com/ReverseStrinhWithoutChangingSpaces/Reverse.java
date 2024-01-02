package com.ReverseStrinhWithoutChangingSpaces;

public class Reverse {
static void reverseStringWithoutChangingSpacePos(String s) {
	char[]arr1=s.toCharArray();
	char[]arr2=new char[s.length()];
	for(int i=0;i<=arr1.length-1;i++) {
		if(arr1[i]==' ') {
			arr2[i]=' ';
		}
	}
	for(int i=0, j=arr1.length-1;i<=arr2.length-1 &&j>=0;i++) {
		//taking the two array length from last to 0 and 0 to str.lenhth-1 and 
		//initializing j=0 and i=str.length-1 decresing i and increasing i
		if(arr1[i]!=' ') {
			if(arr2[j]==' ') {
				j--;
			}
			arr2[j]=arr1[i];
			j--;
		}
	}
	for(char x:arr2) {
		System.out.print(x);
	}
}
}
