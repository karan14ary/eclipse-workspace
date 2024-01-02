package com.subArraylargestsum;

import java.util.Scanner;

public class LargestSumSubarray {
public static int largestSum(int[]arr) {
	int maxSum=arr[0];
	int sum=arr[0];
	for(int i=1;i<=arr.length-1;i++) {
		if(sum>0) {
			sum+=arr[i];
		}
		else {
			sum=arr[i];
		}
		if(sum>maxSum) {
			maxSum=sum;
		}
	}
	return maxSum;
}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=scan.nextInt();
		int []arr=new int[n];
		System.out.println("Enter element  in an array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println(largestSum(arr));
		

	}

}
