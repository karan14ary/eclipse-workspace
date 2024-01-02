package MergeArray;

import java.util.Scanner;

public class MergeArrayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
	System.out.println("Enter the size of array1");
	int n=scan.nextInt();
	System.out.println("Enter the size of array2");
	int m=scan.nextInt();
	int []arr1=new int [n];
	int []arr2=new int [m];
	System.out.println("Enter element of array1"); 
	for(int i=0;i<=arr1.length-1;i++) {
		arr1[i]=scan.nextInt();
	}
	System.out.println("Enter element of array2");
	for(int i=0;i<=arr2.length-1;i++) {
		arr2[i]=scan.nextInt();
	}
	int o=m+n;
	MergeArray.mergeApp(o, arr1, arr2);
	}

}
