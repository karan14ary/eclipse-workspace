package JaggedArray;

import java.util.Scanner;

public class EmployeeApp {

	public static void main(String[] args) {
		// Creating object of Scanner class
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of companies");
		int com=scan.nextInt();
		//Creating 2d jagged array
		String [][]arr =new String[com][];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter the number of Employee in company"+(i+1));
			int emp=scan.nextInt();
			arr[i]=new String[emp];
		}
		//storing gemployee names working in each company
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
			System.out.println("Enter the name of Employee "+(j+1)+" Working in company "+(i+1));
			arr[i][j]=scan.next();
			}
			}
		//displaying the name of employee working in each company
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
			System.out.println("The name of Employee "+(j+1)+" Working in company "+(i+1)+" is "+arr[i][j]);
			
			}
			System.out.println();
			}
			
		
      
	}

}
