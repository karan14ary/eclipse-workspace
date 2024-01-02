package SumOfElementOfArray;

import java.util.Scanner;

public class SumArrayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating object of Scanner class
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=scan.nextInt();
		//careating array
		int[]arr=new int[n];
		System.out.println("Enter the element of an array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		//invoking method and storing values
		int sum=SumArray.sumArrayElement(arr);
		System.out.println("The ssum of all element of array is : "+sum);
		
	}

}
