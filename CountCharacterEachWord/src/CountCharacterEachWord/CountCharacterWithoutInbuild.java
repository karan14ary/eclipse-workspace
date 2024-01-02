package CountCharacterEachWord;
//counting the number of character in each word and printing
public class CountCharacterWithoutInbuild {
	static void countCharacter(String s) 
	{// convert string to char array
		char[]arr=s.toCharArray();
		//initialize pos for starting index
		int pos=0;
		//initialize the c to count the no. of spaces
		// so that we could find no of words
		int c=0;
		for(int i=0;i<=arr.length-1;i++) 
		{//traverse each character in a  string
			if(arr[i]==' ') {//if found space
				c++;//increase counter c
			}
		}
		String []s1=new String[c+1];//take a string array for the length of word
		for(int i=0;i<=c;i++) {//traverse words 
			String s2="";//take empty string
			for(int j=pos;j<=arr.length-1;j++) 
			{//traverse all the character of string
				if(arr[j]==' ') {//if space then
					pos++;//increae pos
					break;//come out of loop
				}
				else {
					s2+=arr[j];//concat s2 with string array the words
				}
				
				pos++;//increase pos
			}
			s1[i]=s2;//store the word in the string array
		}
		//taking each word and printing the length of the word
		for(String x:s1) {
			System.out.println("Characters in \""+x+"\" is : "+x.length());
		}
	}

}
