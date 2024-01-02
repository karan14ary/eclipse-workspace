package com.Panagram.InbuildsortMethod;

import java.util.Arrays;

public class Panagram {
static String panagram(String str) {
	//remove duplicates
	String newstr="";//taking empty string
	for(int i=0;i<=str.length()-1;i++) {//taking strting from charAt(0 to str.length()-1 )
		if(!newstr.contains(str.charAt(i)+""))//check for duplication if not found then
		{//concat with the empty string newstr
			newstr=newstr+str.charAt(i);
		}
	}
	char[]unique=newstr.toCharArray();
	//create a unique charcter array
	Arrays.sort(unique);//sort the array
	int c=0;//take count as 0
	for(int i=0;i<=unique.length-1;i++) 
	{//take loop from 0 to unique.length-1 
		if(unique[i]>='a'&&unique[i]<='z') 
		{//check each index in the range of a to z or not
			c++;//incresse counter
		}
		else if(unique[i]>='A'&&unique[i]<='Z') 
		{//check each index in the range of A to Z or not
			c++;//increase the counter
		}
		else 
		{
			// if other character rather than the upper and lower case
			continue;//skip
		}
	}
	if (c>=26)
	{//if count is greater than or equal 26 then 
		//panagram it contain all 26 charcter
		return "Panagram";
	}
	else {
		return "Not Panagram";
	}
	
}
}
