package com.Assignment3.checkSort;
import java.util.Arrays;
public class SortCheck {
static int checkSort(int []arr)
{
   for(int i=0;i<=arr.length-2;i++) {//taking each element in an array
	if(arr[i]>arr[i+1]) {//check first element is greater than than second  
		return 1;//return1
	}	
	}
return -1;//else return -1
}
}
