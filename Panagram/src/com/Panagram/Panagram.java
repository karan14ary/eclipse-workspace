package com.Panagram;

public class Panagram {
static boolean panagram(String str) {
	String str2="abcdefghijklmnopqrstuvwxyz";
	//take all 26 alphabetical letter as a string
	String str1= str.toLowerCase();
	char[]arr=str2.toCharArray();//convert to character[]
	char[]arr1=str1.toCharArray();
	//convert the user input string to the character[]
	boolean[]mark=new boolean[26];//create aboolean [26];
	//traverse all charcter from the charcater[] of all alphabeticalletter
	for(int i=0;i<=arr.length-1;i++) {
	for(int j=0;j<=arr1.length-1;j++ )
		//travers all the characters of the user input string 
	{//chcek each element of the arr[i] with arr1[j]
	//if found then true and store it to the mark[] 
		if(arr[i]==arr1[j]) {
			mark[i]=true;		
		}
	}
	}
	//take the index form 0 to 25  in mark array
	for(int i=0;i<=mark.length-1;i++) 
		if(mark[i]==false) //check if there any false value store
			//if false is stored means all the charcaters
			//of the alphabet is not present
			return (false);//return false
		// if all index value of mark[] is true then all 
		//characters are present in a string at least once   
	return (true);//retrun true
}
}
