package com.Sorting.Selectionsort;

public class SelectionSort {
public static int[]descselectionSorting(int arr[]){

	for(int i=0;i<=arr.length-2;i++) {
		//Assuming arr[i] is minimum element ,so assigning it to min
		int min=arr[i];
		//Assigning index to pos
		int pos=i;
		//Comparing every element after ith index,so j starts from i+1
		for(int j=i+1;j<=arr.length-1;j++) {
			//comparing and  checking whether the min<arr[j]then assign min=arr[j] 
					if(arr[j]>min){
						min=arr[j];
						pos=j;
					}	
		}
		//swaping the min and arr[i]
		int temp=arr[i];
		arr[i]=arr[pos];
		arr[pos]=temp;
		
	}
	return arr;
}
}
