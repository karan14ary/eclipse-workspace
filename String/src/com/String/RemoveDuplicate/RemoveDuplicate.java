package com.String.RemoveDuplicate;

public class RemoveDuplicate {
static String removeDuplicate(String str) {
	char[]str2=str.toCharArray();//creating array of string str in char[]str2 
	String ans="";//initialize ans =""
int i,j;//initialize i,j
	for(i=0;i<=str2.length-1;i++) {//trvaersing all element  of the char[]str2
		for( j=0;j<i;j++) {//take element from 0 to less than i
			if(str2[i]==str2[j]) {//if character of str2[i] is equal to str2[j]
				break;//break from loop
			}
			}
				if(i==j) {//if i equal to j
					ans+=str2[i];
					//concat the remaining element after remob=ving duplication in a string
				}
	}
	return ans;
}
}
