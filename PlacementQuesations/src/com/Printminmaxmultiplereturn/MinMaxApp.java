package com.Printminmaxmultiplereturn;

import java.util.Scanner;

public class MinMaxApp {

	public static void main(String[] args) {
		Pair minmax=new Pair();
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		minmax=MinMax.findMinMax(arr);
		System.out.println("Minimum number is "+minmax.min);
		System.out.println("Maxmimum number is "+minmax.max);

	}

}
