package com.Sorting.Selectionsort;

import java.util.Scanner;

public class SelectionSortApp {

	public static void main(String[] args) {
		// creating object of Scanner class
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the size of an array ");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the element in an array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		//Display element before sorting
		System.out.println("Array before sorting :");
		   for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//display element after  sort in descending order
		System.out.println("Array after sorting  in descending order :");
		//calling selectionSorting() and storing in sortedArr[]
		int descsortedArr[]=SelectionSort.descselectionSorting(arr);
				for(int i=0;i<=descsortedArr.length-1;i++) {
			System.out.print(descsortedArr[i]+" ");
		}
		
	}

}
