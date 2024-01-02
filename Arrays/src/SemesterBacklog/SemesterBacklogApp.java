package SemesterBacklog;

import java.util.Scanner;

public class SemesterBacklogApp {

	public static void main(String[] args) {
		//Creating object of Scanner class
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of Semesters");
		int n=scan.nextInt();
		//creating boolean array
		String[]arr=new String[n];
		boolean temp;
		//storing boolean values inside the array
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print("Is there any backlog in semester -"+(i+1)+" ? ");
			temp=scan.nextBoolean();
		if (temp==true)
			{
				arr[i]="Yes";
			}
			else {
			arr[i]="No";
			}
		}
		System.out.println();
		//displaying the values of an array
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("There is backlog in semester -"+(i+1)+"  " +arr[i]);	
		}
		

	}

}
