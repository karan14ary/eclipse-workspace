package com.Assignment.ForwardReverse;

import java.util.Scanner;

public class ForwardReverseApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an array");
	int []arr=new int[scan.nextInt()];
	//Storing element in an array
	System.out.println("Enter "+arr.length+" element");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
	}
	//invoking printArray() form PrintArray class
    PrintArray.printArray(arr);	
	}

}
