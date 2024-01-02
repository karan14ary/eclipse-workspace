package EmployeeName;

import java.util.Scanner;

public class EmployeeName {

	public static void main(String[] args) {
		//creating object of Scanner Class
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of company");
		int n=scan.nextInt();
		System.out.println("Enter the number of employee");
		int m=scan.nextInt();
		//Creating 2d array
		String [][]arr=new String [n][m];
		//entering the name of employee
		System.out.println("Enter the name of Employee");
		for(int i=0;i<=arr.length-1;i++) {
			for (int j=0;j<=arr[i].length-1;j++) {
				System.out.println("Enter the name of company "+(i+1)+" employee "+(j+1));
				arr[i][j]=scan.next();			
				}
		
		}
		//display the employee of company
		System.out.println("The name of Employee are :");
		for(int i=0;i<=arr.length-1;i++) {
			for (int j=0;j<=arr[i].length-1;j++) {
				System.out.print("The name of company "+(i+1)+" employee "+(j+1)+" is "+arr[i][j]+".");	
				}
		System.out.println();
		}
	}

}
