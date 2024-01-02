package com.Assignment3.checkSort;

import java.util.Scanner;

public class CheckSortApp {
	public static void main(String[] args) {
		//creating object of Scanner class
		Scanner scan=new Scanner(System.in);
System.out.println("Enter the size of an array");
int arr[]=new int[scan.nextInt()];
//storing element in an array
	System.out.println("Enter "+arr.length+"element");
for(int i=0;i<=arr.length-1;i++) {
	arr[i]=scan.nextInt();
}
//invoking method
int n=SortCheck.checkSort(arr);
if(n==-1) {//returned value is -1 then 
	System.out.println("It is sorted");
}
else {//else returned value is 1 then
	System.out.println("It is not sorted");
}
	}

}
