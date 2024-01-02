import java.util.Scanner;

public class ReverseWordAt {

	public static void main(String[] args) {
		// creating object of Scanner class
		Scanner scan=new Scanner(System.in);
		//asking for user input
		System.out.println("Enter a sentence");
		//storing a sentence in a s variable 
		String s=scan.nextLine();
		//invoking reverse()
        reverse(s);
	}
static void reverse(String s) {
	String []str1=s.split(" ");
	String s1=""; 
	//convert string into string array
			for(int i=0;i<=str1.length-1;i++)
			{//take from index 0 to str1.length-1
				char[]arr=str1[i].toCharArray();
				//convert each string element to character []
				char []arr1=new char[arr.length];
				
				for(int j=arr.length-1;j>=0;j--) 
				{// take from last character and reverse each word
					//System.out.print(arr[j]);
					arr1[j]=arr[j];//reverse word
					s1=s1+arr1[j];//concatenate the character to empty string 
				//conver char[]arr1[j] to string
				}
				//System.out.print(" ");//after each word print space	
			s1=s1+" ";//concatenate each word with the space
			
			}	
			System.out.println(s1);
	
}
}
