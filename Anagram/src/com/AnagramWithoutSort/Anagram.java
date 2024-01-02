package com.AnagramWithoutSort;

public class Anagram {
static int anagram(String str1,String str2) {
	char[]arr1=str1.toCharArray();//convert str1 to char[]arr1
	char[]arr2=str2.toCharArray();//convert str2 to char[]arr2
	int charcterFoundCount=0;//initialize charcterFoundCount as 0
	for(int i=0;i<=arr1.length-1;i++) 
	{//traverse all the character  in arr1
		for(int j=0;j<=arr2.length-1;j++) 
		{//traverse all the character  in arr2			
			if(arr1[i]==arr2[j]) 
			{//compare each element of arr1[i] with arr2[j] 
				//if found then
				charcterFoundCount++;//increase the counter
		       break;//stop come out of j loop
			}
		}
	}
	if(charcterFoundCount==str1.length())
	{//check the charcterFoundCount with the length of the str1
		return 1;//return 1
		
	}
	else {
		return -1;//if not equal then return -1
	}
}
}
