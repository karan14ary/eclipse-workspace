package com.Sorting.BubbleSort;

import java.util.Scanner;

public class BubbleSortApp {

	public static void main(String[] args) {
		// Creating object of Scanner class
		Scanner scan=new Scanner (System.in);
		System.out.println("Enetr the size of an array");
		int n =scan.nextInt();
		//creating an array
		int arr[]=new int[n];
		System.out.println("Enter "+n+" element to be stored in an array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		//Displaying element before sorting
		System.out.println("The element of an array before sort is:");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
	}
		System.out.println();
		//calling the descbubblesorting() and storing it to descsortedArray
		int []descsortedArray=BubbleSort.descbubblesorting(arr);
		//displaying element after sorting in decending order
		System.out.println("The element of an array after sorting in descending order is :");
		for(int i=0;i<=descsortedArray.length-1;i++) {
			System.out.print(descsortedArray[i]+" ");
			}	
	}
}
