package com.Assignment3.SearchingAlgorithms;

public class Searching {
	//Binary Search
	static void binarySearch(int[]arr,int key) {
		int low=0;//initialize low=0
		int high=arr.length-1;//initialize high=arr.length-1
		while(low<=high) {//check until low is less than or equal to high
			int mid=(low+high)/2;//calculate midvalue= (low+high)/2
			if(key==arr[mid]) {
				//check key value is equal to arr[mid]element
				System.out.println(key+" Found");
			return;//stop
			}
			else if(key>arr[mid]) {
				//key value is greater than arr[mid]value
				low=mid+1;//low value will be mid+1
			}
			else {//key value is lesser than arr[mid]value
				high=mid-1;//high value will be mid-1
			}
			
		}
		System.out.println(key+" not found");
	}
	//Linear Search
	static void linerSearch(int[]arr,int key)
	{
	for(int x:arr) {//take each element in an array
		if(key==x) {//if key value is equal to the element then
			System.out.println(key+" is found");
		}
	}
	System.out.println(key+" not found");
	}
	//check array sorted or not
	static int checkSort(int []arr)
	{
	   for(int i=0;i<=arr.length-2;i++)//take index 0 to n-2
		if(arr[i]>arr[i+1]) {//check first element is greater than second 
			return 1;//return 1
		}	
	return -1;//if less return -1
	}
}
