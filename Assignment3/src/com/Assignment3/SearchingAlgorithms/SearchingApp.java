package com.Assignment3.SearchingAlgorithms;

import java.util.Scanner;

public class SearchingApp {
	public static void main(String[] args) {
		//Creating object of Scanner class
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the size of an array");
		int []arr=new int[scan.nextInt()];
		//storing   element in an array
		System.out.println("Enter "+arr.length+" elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		///giving the options to the user
		System.out.println("Press 1 to perform linear search");
		System.out.println("Press 2 to perform binary search");
        System.out.println("Enter the key to be searched");
       int key=scan.nextInt();//storing key value in variable 
       System.out.println("Enter your choice");//asking for choice
		int choice=scan.nextInt();//storing  choice to a variable
		switch(choice) {//select the  choice 
       case 1:{
    	   //invoking linerSearch()
    	   Searching.linerSearch(arr, key);
    	   break;
    	   }
    	   case 2:{
    		   //invoking checkSort()
    		   int n=Searching.checkSort(arr);
    		   if(n==-1) {//if sorted then 
    		   Searching.binarySearch(arr,key);
    		   //invoke binarySearch()
    		   }
    		   else {//if not sorted then
    			   System.out.println("please Sort the array first ");
    		   }
    		   break;
    	   }
    	   default:{//if none of the choice are made then
    		   System.out.println("Invalid input");
    	   }
       }
       }
	}


