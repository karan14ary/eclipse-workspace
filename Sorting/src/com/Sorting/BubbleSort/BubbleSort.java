package com.Sorting.BubbleSort;

public class BubbleSort {
	public static int [] descbubblesorting(int []arr){
//		picking each element of an array
		for(int i=0;i<=arr.length-2;i++) {
			//comparing each element of an array with the next element
			for(int j=0;j<=arr.length-i-2;j++) {
				//checking if the element of the array is lesser than next element then swap
				if(arr[j]<arr[j+1]) {
					int temp =arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}

}
