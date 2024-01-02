package com.Printminmaxmultiplereturn;

import java.util.Arrays;

public class MinMax {
static Pair findMinMax(int[]arr) {
	Pair minmax=new Pair();
	Arrays.sort(arr);
	minmax.min=arr[0];
	minmax.max=arr[arr.length-1];
	return minmax;
}
}
