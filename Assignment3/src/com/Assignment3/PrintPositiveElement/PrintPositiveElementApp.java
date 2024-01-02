package com.Assignment3.PrintPositiveElement;

public class PrintPositiveElementApp {
static void printPositiveElement(int arr[]) {
	//displaying elements in an array
			System.out.println("The elements in an array is : ");
			for(int x:arr) {//taking each element in an array
				if(x>0) {//check the number is either positive or negative
				System.out.print(x+" ");//if positive then print element
			}
				}
}
}
