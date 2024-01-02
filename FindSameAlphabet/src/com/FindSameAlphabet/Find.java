package com.FindSameAlphabet;

public class Find {
static void findSameAlpha(String name1,String name2) {
	String newstr="";//initializing newstr empty string
	for(int i=0;i<=name1.length()-1;i++) 
{//traverse all element of name1
		for(int j=0;j<=name2.length()-1;j++) 
		{//traverse all element of name2
			if(name1.charAt(i)==' ') {//if space if found
				continue;//skip
			}
		else if(name1.charAt(i)==name2.charAt(j)) 
		{//both charcter are same then
				newstr=newstr+name1.charAt(i);
				//concat with empty newstr string
			}
			
			else {
				continue;
			}
		}	
	}
	//remove duplicates
	String newstr1="";//take empty string newstr1
	for(int i=0;i<=newstr.length()-1;i++) 
	{//traverse all element of newstr
	if(!newstr1.contains(newstr.charAt(i)+"")) {//compare character 
		newstr1=newstr1+newstr.charAt(i);//concate
	}	
	}
	System.out.println(newstr1);
	
}
}
