package com.String.checkFrequency;

public class CheckFrequency {
static void checkFrequency(String str) 
{
char[]arr=str.toCharArray();//convert string to character array
//taking unique element array
String newstr="";//taking empty string
for(int i=0;i<=str.length()-1;i++) {//taking strting from charAt(0 to str.length()-1 )
	if(!newstr.contains(str.charAt(i)+""))//check for duplication if not found then
	{//concat with the empty string newstr
		newstr=newstr+str.charAt(i);
	}
}
char[] unique=newstr.toCharArray();//convert newstr to CharArray unique
System.out.println();
for(int i=0;i<=unique.length-1;i++ ) {//taking for loop for first array
	int f=0;//initialize frequency count as 0
	for(int j=0;j<=arr.length-1;j++) {	//taking each element of str2[]
	if(unique[i]==arr[j]) {//comparing element of arr[] and str2[]
		f++;	
	}
	}
	System.out.println("The frequency of "+unique[i]+" is "+f );
}
}
}
