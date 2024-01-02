package com.Assignment3.Array;

import java.util.Scanner;

public class ArrayApp {

	public static void main(String[] args) {
		// Creating object of Scanner class
				Scanner scan =new Scanner(System.in);
				System.out.println("Enter the size of an array");
				//creating an integer array and asking for size and store
				int []arr=new int[scan.nextInt()];
				//storing data in an array
				System.out.println("Enter "+arr.length+" the element to be stored in arra");
				for(int i=0;i<=arr.length-1;i++) {
					arr[i]=scan.nextInt();
				}
				//invoking increase5InEachElement
				Array.increase5InEachElement(arr);
	}

}
