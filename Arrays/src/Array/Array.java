package Array;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter the number of Rows");
int n=scan.nextInt();
System.out.println("Enter the number of column");
int m=scan.nextInt();
int [][]arr=new int[n][m];
for(int i=0;i<n;i++) {
	for(int j=0;j<m;j++) {
		arr[i][j]=scan.nextInt();
	}
	}
for (int i=0;i<n;i++) {
for(int j=0;j<m;j++) {
	System.out.println(arr[i][j]);		
}
}
	}
}

	
