package Marks;

import java.util.Scanner;

public class MarksApp {

	public static void main(String[] args) {
		//Creating array
		int[] arr=new int[7];
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Marks of Student in Percentage");
        //for loop for adding marks in an array
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		//Displaying marks of 7 student
		System.out.println("The marks of all 7 students are: ");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
