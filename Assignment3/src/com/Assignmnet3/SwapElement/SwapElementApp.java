package com.Assignmnet3.SwapElement;

import java.util.Scanner;

public class SwapElementApp {

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
				//displaying array before swapping
				System.out.println("Array Before swapping is");
				for(int x:arr) {//taking each element of an array
					System.out.print(x+" ");//print element
				}
				System.out.println();
				System.out.println("Enter the two indexes of an array to be swapped");
				int i1=scan.nextInt();
				int i2=scan.nextInt();
int []swappedArr=Swap.swap(arr,i1,i2);
//invoking swap() and storing it to swapped array
System.out.println("The Array after swap is :");
for(int x:swappedArr) {//taking each element of an array
	System.out.print(x+" ");//printing the element
}
	}

}
