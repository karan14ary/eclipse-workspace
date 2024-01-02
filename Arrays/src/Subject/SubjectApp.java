package Subject;

import java.util.Scanner;

public class SubjectApp {

	public static void main(String[] args) {
		//Creating object of Scanner class 
Scanner scan=new Scanner(System.in);
//Asking the user input for size of array 
System.out.println("Enter the number of subjects");
int n=scan.nextInt();
//Creating string array
String [] arr=new String[n];
//storing value in array
for(int i=0;i<=arr.length-1;i++)
{
	System.out.print("Enter the name of subject -"+(i+1)+" :");
	arr[i]=scan.next();
	}
//displaying value of array
for(int i=0;i<=arr.length-1;i++)
{
	System.out.println("The name of subject -"+(i+1)+" is "+arr[i]+".");
	}
	}

}
