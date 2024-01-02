package com.CountTheDifferentTypeOfCharacter;

public class Program {
static void countLetterAndShowLetter(String str)
{//initializing variable to store the count of diiferent letter
	int upper=0;//for uppercase
	int lower=0;//for lowercase
	int num=0;//for numbers
	int special=0;//for special
//creating an empty string to store the differnet letters
	String strUpper="";//for uppercase
	String strLower="";//for lowercase
	String strNum="";//for numbers
	String strSpecial="";//for special characters
	for(int i=0;i<=str.length()-1;i++) {
		//traversing all the letters of string str
		if(str.charAt(i)>='A'&&str.charAt(i)<='Z') {//check uppercase
			upper++;//increase counter
			strUpper+=str.charAt(i)+" ";//concat with empty string and space
		}
		else if(str.charAt(i)>='a'&&str.charAt(i)<='z')
		{//check lowercase
			lower++;//increase counter lower
			strLower+=str.charAt(i)+" ";//concat with empty string and space
			}
		else if(str.charAt(i)>='0' &&str.charAt(i)<='9') 
		{//check for number
			num++;//increase num counter
			strNum+=str.charAt(i)+" ";//concate with empty string and space
		}
		else {
			special++;//increase special counter 
			strSpecial+=str.charAt(i)+" ";//concat with the empty string and space
		}
	}
	System.out.println("Count of Lowercase Letter : "+lower);
	System.out.println("Lowercase Letters : "+strLower);
	System.out.println("Count of Uppercase Letter : "+upper);
	System.out.println("Lowercase Letters : "+strUpper);
	System.out.println("Count of Numbers : "+num);
	System.out.println("Numbers : "+strNum);
	System.out.println("Count of SpecialCharacter : "+special);
	System.out.println("Special Characters : "+strSpecial);
//	String Upper[]=strUpper.split(" ");
//	String Lower[]=strLower.split(" ");
//	String Number[]=strNum.split(" ");
//	String Special[]=strSpecial.split(" ");
//	String strUpper1="";//for uppercase
//	String strLower1="";//for lowercase
//	String strNum1="";//for numbers
//	String strSpecial1="";//for special characters
//	for(int i=0;i<=Upper.length-1;i++)
//	{
//		if(i>=0&&i<=Upper.length-2) {
//			strUpper1+=Upper[i]+",";
//		}
//		else {
//			strUpper1+=Upper[i];
//		}
//	}
//	for(int i=0;i<=Lower.length-1;i++)
//	{
//		if(i>=0&&i<=Lower.length-2) {
//			strLower1+=Lower[i]+",";
//		}
//		else {
//			strLower1+=Lower[i];
//		}
//	}
//	for(int i=0;i<=Number.length-1;i++)
//	{
//		if(i>=0&&i<=Number.length-2) {
//			strNum1+=Number[i]+",";
//		}
//		else {
//			strNum1+=Number[i];
//		}
//	}
//	for(int i=0;i<=Special.length-1;i++)
//	{
//		if(i>=0&&i<=Special.length-2) {
//			strSpecial1+=Special[i]+",";
//		}
//		else {
//			strSpecial1+=Special[i];
//		}
//	}
////	System.out.println("Count of Lowercase Letter : "+lower);
////	System.out.println("Lowercase Letters : "+strLower1);
////	System.out.println("Count of Uppercase Letter : "+upper);
////	System.out.println("Lowercase Letters : "+strUpper1);
////	System.out.println("Count of Numbers : "+num);
////	System.out.println("Numbers : "+strNum1);
////	System.out.println("Count of SpecialCharacter : "+special);
////	System.out.println("Special Characters : "+strSpecial1);
}
}
