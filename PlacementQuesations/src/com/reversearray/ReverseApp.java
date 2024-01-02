package com.reversearray;

import java.util.Scanner;

public class ReverseApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int []arr=new int [n];
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		int rev[]=Reverse.ReverseArray(arr);
		System.out.println("Reversed Array");
		for(int x:rev) {
			System.out.println(x+" ");
		}
	}

}
