package SumArray;

import java.util.Scanner;

import MergeArray.MergeArray;

public class SumArrayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of arrays");
		int n=scan.nextInt();
		int []arr1=new int [n];
		int []arr2=new int [n];
		System.out.println("Enter element of array1"); 
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=scan.nextInt();
		}
		System.out.println("Enter element of array2");
		for(int i=0;i<=arr2.length-1;i++) {
			arr2[i]=scan.nextInt();
		}
	
		SumArray.sumApp(n, arr1, arr2);
	}

}
