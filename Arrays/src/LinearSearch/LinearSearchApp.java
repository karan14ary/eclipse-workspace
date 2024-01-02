package LinearSearch;

import java.util.Scanner;

public class LinearSearchApp {

	public static void main(String[] args) {
		// Creating object of Scanner class
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=scan.nextInt();
		//careating array
		int[]arr=new int[n];
		System.out.println("Enter the element of an array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter a element to be searched");
		int element=scan.nextInt();
	int index=LinearSearch.linearSearch(element, arr);
	if(index==-1) {
		System.out.println("Element not found");
	}
	else {
		System.out.println("Element found "+index);
	}
		

	}

}
