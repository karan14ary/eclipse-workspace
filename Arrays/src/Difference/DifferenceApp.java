package Difference;

import java.util.Scanner;

public class DifferenceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number of  rows for matrix 1 and matrix 2");
		int row=scan.nextInt();
		int col=scan.nextInt();
		//creating an Array as Matrix 1 2 and 3
		int [][]matrix1=new int[row][col];
		int [][]matrix2=new int[row][col];
		int [][]matrix3=new int [row][col];
		int [][]matrixA=storingdatainmatrix1(matrix1);
		int [][]matrixB=storingdatainmatrix2(matrix2);
		int[][]matrixC=diffmatrix(matrixA,matrixB,matrix3);
		diff(matrixC);
	}
	
	static int[][] storingdatainmatrix1(int[][] matrix1) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the element of matrix 1");
		for(int i=0;i<=matrix1.length-1;i++) 
		{
			for(int j =0;j<=matrix1[i].length-1;j++) {
				matrix1[i][j]=scan.nextInt();
			}
		}
		return matrix1;
	}
		static int[][] storingdatainmatrix2(int[][] matrix2) {
			Scanner scan =new Scanner(System.in);
		//storing data in Matrix 2
				System.out.println("Enter the element of matrix 2");
				for(int i=0;i<=matrix2.length-1;i++) 
				{
					for(int j =0;j<=matrix2[i].length-1;j++) {
						matrix2[i][j]=scan.nextInt();
					}
				}
				
				return matrix2;
	}
	static int[][] diffmatrix(int matrixA[][],int matrixB[][],int matrix3[][]) {
		//displaying sum of matrix 1 and 2
		
		for(int i=0;i<=matrix3.length-1;i++) 
		{
			for(int j =0;j<=matrix3[i].length-1;j++) {
			matrix3[i][j]=matrixA[i][j]-matrixB[i][j];
			}
			System.out.println();
		}
		return matrix3;
	}
	static void diff(int matrixC[][]) {
	for(int i=0;i<=matrixC.length-1;i++) 
	{
	for(int j =0;j<=matrixC[i].length-1;j++) {
		
	System.out.print(matrixC[i][j]+" ");

		}
	System.out.println();
	}
}
	}


