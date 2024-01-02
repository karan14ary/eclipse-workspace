package com.Assignment3.SumOf2ArrayAndStoredIn3rdArray;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		//creating object of Scanner class
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=scan.nextInt();
		//creating the 2 arrays
		int []arr1=new int[n];
		int []arr2=new int[n];
        //entering element  in arr1
		System.out.println("Enter "+arr1.length+" elements of first array");
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=scan.nextInt();
		}
		System.out.println("Enter "+arr2.length+" elements of second array");
		//entering element  in arr2
				for(int i=0;i<=arr2.length-1;i++) {
					arr2[i]=scan.nextInt();
				}
	System.out.println("The sum of the corresponding element of 2array and stored in 3rd array is");
	int[]arr3=Sum.sum(arr1, arr2,n);
	//invoking sum() and storing in the sum array
	//displaying sum of 2 arrays in 3rd array
	for(int x:arr3) {//taking each element of an array
		System.out.print(x+" ");//print element
	}
	
	
	}

}
