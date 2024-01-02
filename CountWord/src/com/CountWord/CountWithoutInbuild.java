package com.CountWord;
//counting the words and printing the words without using inbuild method
public class CountWithoutInbuild {
 static void countWord(String str) {
	int c=0;//initalize counter for counting the no of words in  a sentence
	 for(int i=0;i<=str.length()-1;i++) {//traverse each character of string 
		 if(str.charAt(i)==' ') {//if character is  space then 
			 //increase the counter
			 ++c;
		 }
	 }
	 System.out.println("Total no. of words : "+(c+1));//print no of words with increase in 1
	 //because there will be one space less than words each word is separated by space  
	char[]arr=str.toCharArray();//convert string to char array
	int pos=0;//initialize a variable for position
	for(int i=0;i<=c;i++) {//traverse the words in string
		String s1="";//initialize empty string s1
		for(int j=pos;j<=arr.length-1;j++) {//traverse from pos to arr.length-1
			if(arr[j]==' ') {//found any space charater one word is completed
				pos++;//increse the pos/take the next character
				break;//come out from the loop 
							}
			else {
				s1+=arr[j];//cocat charater with the empty  string to make a word
			}
			pos++;//incease pos
		}
		
		System.out.println( "word-"+(i+1)+" :"+s1);
	}
	 
 }

}
