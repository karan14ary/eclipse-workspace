package SwapIndexValueOfArray;

import java.util.Scanner;

public class SwapIndexValue {

	public static void main(String[] args) {
		// Creating object of Scanner class
Scanner scan=new Scanner(System.in);
//Asking user for the size of an array
System.out.println("Enter the size of an array");
//storing size in a variable
int n=scan.nextInt();
//creating array of size n
int arr[]=new int[n];
System.out.println("Enter "+n+" element in an array");
//enter the element in an array
for(int i=0;i<=arr.length-1;i++) {
	arr[i]=scan.nextInt();
}
System.out.println("The element of array before swap is:");
//printing array elemet
for(int i=0;i<=arr.length-1;i++) {
System.out.print(arr[i]+" ");
}
System.out.println();
//Asking user for two index
System.out.println("Enter the two index i1 and i2");
//storing index to varables i1 and i2
int i1=scan.nextInt();
int i2=scan.nextInt();
//check for the value of indexes must not be greater than n-1/arr.length-1
if(i1>=0&&i1<=arr.length-1&&i2>=0&&i2<=arr.length-1) {
	arr[i2]=arr[i1]+arr[i2];
	arr[i1]=arr[i2]-arr[i1];
	arr[i2]=arr[i2]-arr[i1];

//print swaped array
System.out.println("The element of array after swap is: ");
	for(int i=0;i<=arr.length-1;i++) {
		System.out.print(arr[i]+" ");
	}
}
	else {//if index is more than arr.length-1 print invalid index
		System.out.println("Enter the indexes in the range from 0 to "+(arr.length-1));
	}
	}
}
