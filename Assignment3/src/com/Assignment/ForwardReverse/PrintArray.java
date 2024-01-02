package com.Assignment.ForwardReverse;

public class PrintArray {
static void printArray(int arr[]) {
System.out.println("Array in forward direction");
	for(int x:arr) {//taking each element from an array 
	System.out.print(x+" ");
	//printing array element in forward direction
}
	System.out.println();//for extra line
	System.out.println("Array in reverse dirction");
for(int i=arr.length-1;i>=0;i--) {//taking last index element and decrease -1 each time till the index=0 
	System.out.print(arr[i]+" ");//print element in an index
}
}
}
