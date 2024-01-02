package com.Assignmnet3.SwapElement;

public class Swap {
static int[] swap(int []arr,int i1,int i2) {
	int temp=arr[i2];//store second index element to temp
	arr[i2]=arr[i1];//store first index value to second indxex variable
	arr[i1]=temp;//store the temp value in first index 
	return arr;
}
}
