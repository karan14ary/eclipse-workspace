package com.containsDuplicate;

import java.util.Scanner;

public class CheckDuplicateApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int []arr=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println(CheckDuplicate.checkDuplicate(arr));
		System.out.println(CheckDuplicate.duplicateElementArray(arr));
	}

}
