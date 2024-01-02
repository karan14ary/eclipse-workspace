package Array3D;

import java.util.Scanner;

public class EmployeeSalary {

	public static void main(String[] args) {
		// Creating object of Scanner class
	Scanner scan=new Scanner(System.in)	;
	System.out.println("Enter the number of city");
	int city=scan.nextInt();
	//creating 3d jagged array
	float [][][]arr=new float [city][][];
	for(int i=0;i<=arr.length-1;i++) {
		System.out.println("Enter the number of company in city "+(i+1));
		int comp=scan.nextInt();
		arr[i]=new float[comp][];
	}
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=0;j<=arr[i].length-1;j++) {
			System.out.println("Enter the numebr of employee in company "+(j+1)+" of city"+(i+1));
			int emp=scan.nextInt();
			arr[i][j]=new float[emp];
		}
	}
	//storing the the salary of each employee
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=0;j<=arr[i].length-1;j++) {
			for(int k=0;k<=arr[i][j].length-1;k++) {
				System.out.println("Enter the salary of employee "+(k+1)+" of company "+(j+1)+" of  city"+(i+1));
			arr[i][j][k]=scan.nextFloat();
			}
		}
	}
//displaying salary of each employee in different company of different city 
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=0;j<=arr[i].length-1;j++) {
			for(int k=0;k<=arr[i][j].length-1;k++) {
				System.out.println("The salary of employee "+(k+1)+" of company "
			+(j+1)+" of  city"+(i+1)+" is "+arr[i][j][k]);
			
			}
		}
	}

	}

}
