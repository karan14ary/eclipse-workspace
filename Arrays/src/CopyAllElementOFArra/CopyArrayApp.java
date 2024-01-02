package CopyAllElementOFArra;

import java.util.Scanner;

public class CopyArrayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating object of Scanner class
				Scanner scan=new Scanner(System.in);
				System.out.println("Enter the size of array");
				int n=scan.nextInt();
				//careating array
				int[]arr1=new int[n];
				System.out.println("Enter the element of an array1");
				for(int i=0;i<=arr1.length-1;i++) {
					arr1[i]=scan.nextInt();
				}
				CopyArray.copyArray( arr1);
	}

}
