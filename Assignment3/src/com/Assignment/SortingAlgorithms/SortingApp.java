package com.Assignment.SortingAlgorithms;

import java.util.Scanner;

public class SortingApp {

	public static void main(String[] args) {
		//Creating object of Scanner class
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int arr[]=new int[scan.nextInt()];
		//storing element in an array
		System.out.println("Enter "+arr.length+" elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		//showing the user  different list of choices they can use
		System.out.println("Press 1 to perform bubble sort in ascending order");
		System.out.println("Press 2 to perform selection sort in ascending order");
		System.out.println("Press 3 to perform insertion sort in ascending order");
		System.out.println("Press 4 to perform bubble sort in descending order");
		System.out.println("Press 5 to perform selection sort in descending order");
		System.out.println("Press 6 to perform insertion sort in descending order");
		System.out.println("Enter your choice");//asking user for chioce
		int choice= scan.nextInt();//storing user choice to choice variable
		switch(choice) {//to take use rchoices
		case 1:{//invoking bubbleSortAsc()
			int[]bubble=Sort.bubbleSortAsc(arr);
			for(int x:bubble) {//taking each element of an array
				System.out.print(x+" ");
			}
			break;
			//stop the switch
		}
		case 2:{//invoking selectionSortAsc()
			int[]selection=Sort.selectionSortAsc(arr);
			for(int x:selection) {//taking each element of an array
			System.out.print(x+" ");
			}
			break;	//stop the switch
			}
		case 3:{//invoking insertionSortAsc()
			int[]insertion=Sort.insertionSortAsc(arr);
		for(int x:insertion) {//taking each element of an array
	
			System.out.print(x+" ");
		}
			break;	//stop the switch
		}
		
		case 4:{//invoking bubbleSortDesc()
			int[]bubbleDesc=Sort.bubbleSortDesc(arr);
		for(int x:bubbleDesc) {//taking each element of an array
	
			System.out.print(x+" ");
		}
			break;	//stop the switch
		}
		case 5:{//invoking selectionSortDesc()
			int[]selectionDesc=Sort.selectionSortDesc(arr);
			for(int x:selectionDesc) {//taking each element of an array
			
				System.out.print(x+" ");
			}
			break;	//stop the switch
		}
		case 6:{//invoking insertionSortDesc()
			int[]insertionDesc=Sort.insertionSortDesc(arr);
			for(int x:insertionDesc) {//taking each element of an array
				System.out.print(x+" ");
			}
			break;	//stop the switch
			}
		//if none of the choices are done then this message will be shown
		default:System.out.println("Invalid Input");
		}
 
	}

}
