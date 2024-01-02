package Array;

import java.util.Scanner;

public class DifferenceMatrix {

	public static void main(String[] args) {
		// Creating object of Scanner class
				Scanner scan =new Scanner(System.in);
				System.out.println("Enter the number of  rows and columns of matrix 1 and matrix 2");
				int row=scan.nextInt();
				int col=scan.nextInt();
				//creating an three matrix 
				int [][]matrix1=new int[row][col];
				int [][]matrix2=new int[row][col];
				int [][]matrix3=new int [row][col];
		//storing data in matrix 1
				System.out.println("Enter the element of matrix 1");
				for(int i=0;i<=matrix1.length-1;i++) 
				{
					for(int j =0;j<=matrix1[i].length-1;j++) {
						matrix1[i][j]=scan.nextInt();
					}
				}
				//storing data in matrix 2
						System.out.println("Enter the element of matrix 2");
						for(int i=0;i<=matrix2.length-1;i++) 
						{
							for(int j =0;j<=matrix2[i].length-1;j++) {
								matrix2[i][j]=scan.nextInt();
							}
						}
				//displaying difference of matrix 1 and 2 stored in matrix 3
						System.out.println("Difference of matrix 1 and 2 is");
						for(int i=0;i<=matrix3.length-1;i++) 
						{
							for(int j =0;j<=matrix3[i].length-1;j++) {
							matrix3[i][j]=matrix1[i][j]-matrix2[i][j];
							System.out.print(matrix3[i][j]+" ");
							}
						System.out.println();	
						}


	}

}
