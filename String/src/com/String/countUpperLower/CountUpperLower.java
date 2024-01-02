package com.String.countUpperLower;

public class CountUpperLower {
static void countUpperLower(String str) {
	char[] str2=str.toCharArray();//convert the string to character array
	int upperCount=0;//initialize the upperCount variable
	int lowerCount=0;//initialize the lowerCount variable
	for(char x:str2) {//take for each loop
		if(x>='A'&&x<='Z') {//check element is in uppercase then
			upperCount++;//increase upperCount
		}
		else if(x>='a'&&x<='z') {//check element is lowercase then
			lowerCount++;//increase lowerCount
			
			
		}
		else {
			System.out.println("Special character");
		}
	}
	System.out.println("Uppercase letter is :"+upperCount);
	System.out.println("Lowercase letter is :"+lowerCount);
}
}
