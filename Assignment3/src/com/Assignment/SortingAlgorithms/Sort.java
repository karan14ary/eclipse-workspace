package com.Assignment.SortingAlgorithms;

public class Sort {
static int[]bubbleSortAsc(int []arr){
	for(int i=0;i<=arr.length-2;i++) {//take the number of iterations form index 0 to n-2
		for(int j=0;j<=arr.length-i-2;j++) {//taking each element as a bubble  from index 0 till n-i-2
			if(arr[j]>arr[j+1]) {//check if the first element is greater than second or not
				//swap elment of first with second
				int temp=arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=temp;
			}
		}
	}
	return arr;
}
static int[]selectionSortAsc(int []arr){
	for(int i=0;i<=arr.length-2;i++) {
		//Assuming arr[i] is minimum element ,so assigning it to min
				int min=arr[i];
				//Assigning index to pos
				int pos=i;
				//Comparing every element after ith index,so j starts from i+1
				for(int j=i+1;j<=arr.length-1;j++) {
					//comparing and  checking whether the min<arr[j]then assign min=arr[j] 
							if(arr[j]<min){
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
static int[]insertionSortAsc(int []arr){
	for(int i=1;i<=arr.length-1;i++) {
		int item=arr[i];//assigning item as arr[i]
		int j=i-1;//assign j is equal to than i-1
		while(j>=0&&arr[j]>item) {//check until j is greater than equal to 0 and arr[j]is greater than item
			arr[j+1]=arr[j];//insert arr[j]in  arr[j+1] move one level low
			j--;//decrement j
		}
		arr[j+1]=item;//assign item value to arr[j+1]
	}
	return arr;
}

static int[]bubbleSortDesc(int []arr){
	for(int i=0;i<=arr.length-2;i++) {//take the number of iterations form index 0 to n-2
		for(int j=0;j<=arr.length-i-2;j++) {//taking each element as a bubble  from index 0 till n-i-2
			if(arr[j]<arr[j+1]) {//check if the first element is greater than second or not
				//swap elment of first with second
				int temp=arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=temp;
			}
		}
		}
	return arr;
}
static int[]selectionSortDesc(int []arr){
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
static int[]insertionSortDesc(int []arr){
	for(int i=1;i<=arr.length-1;i++) {
		int item=arr[i];//assigning item as arr[i]
		int j=i-1;//assign j is equal to than i-1
		while(j>=0&&arr[j]<item) {//check until j is greater than equal to 0 and arr[j]is greater than item
			arr[j+1]=arr[j];//insert arr[j]in  arr[j+1] move one level low
			j--;//decrement j
		}
		arr[j+1]=item;//assign item value to arr[j+1]
	}
	return arr;	
}
}
