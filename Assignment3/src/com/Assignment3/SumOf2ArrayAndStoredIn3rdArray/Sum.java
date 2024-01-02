package com.Assignment3.SumOf2ArrayAndStoredIn3rdArray;

public class Sum {
static int[] sum(int[]arr1,int []arr2,int n) {
	int[]sum=new int [n];
	//initialize 3rd array to store sum of 2 arrays of size n
	for(int i=0;i<=sum.length-1;i++)
		//taking index form 0 to n-1 
	{
		//add the elements of two array corresponding element of index i and store them to 3rd array sum of index i
		sum[i]=arr1[i]+arr2[i];
	}
	return sum;
	
}
}
