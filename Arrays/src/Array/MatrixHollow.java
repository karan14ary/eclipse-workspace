package Array;

import java.util.Scanner;

public class MatrixHollow {

	public static void main(String[] args) {
		// Creating object of Scanner class
				Scanner scan =new Scanner(System.in);
				System.out.println("Enter the number of  rows");
				int row=scan.nextInt();
				System.out.println("Enter the number of columns");
				int col=scan.nextInt();
				//creating an array
				int [][]matrix=new int[row][col];
		//storing data in array
				System.out.println("Enter the element of matrix");
				for(int i=0;i<=matrix.length-1;i++) 
				{
					for(int j =0;j<=matrix[i].length-1;j++) {
						matrix[i][j]=scan.nextInt();
					}
				}
				//displaying data in array
						for(int i=0;i<=matrix.length-1;i++) 
						{
							for(int j =0;j<=matrix[i].length-1;j++) {
								if((i==0||i==matrix.length-1)||(j==0||j==matrix[i].length-1)) {
									System.out.print(matrix[i][j]+" ");
								}
								else {
									System.out.print("   ");
								}	
							}
						System.out.println();	
						}
	}

}
