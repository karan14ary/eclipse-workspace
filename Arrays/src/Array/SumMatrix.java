package Array;

import java.util.Scanner;

public class SumMatrix {

	public static void main(String[] args) {
		// Creating object of Scanner class
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number of  rows for matrix 1 and matrix 2");
		int row=scan.nextInt();
		int col=scan.nextInt();
		//creating an Array as Matrix 1 2 and 3
		int [][]matrix1=new int[row][col];
		int [][]matrix2=new int[row][col];
		int [][]matrix3=new int [row][col];
//storing data in Matrix 1
		System.out.println("Enter the element of matrix 1");
		for(int i=0;i<=matrix1.length-1;i++) 
		{
			for(int j =0;j<=matrix1[i].length-1;j++) {
				matrix1[i][j]=scan.nextInt();
			}
		}
		//storing data in Matrix 2
				System.out.println("Enter the element of matrix 2");
				for(int i=0;i<=matrix2.length-1;i++) 
				{
					for(int j =0;j<=matrix2[i].length-1;j++) {
						matrix2[i][j]=scan.nextInt();
					}
				}
		//displaying sum of matrix 1 and 2
				System.out.println("Sum of matrix 1 and 2 is");
				for(int i=0;i<=matrix3.length-1;i++) 
				{
					for(int j =0;j<=matrix3[i].length-1;j++) {
					matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
					//if(matrix3[i][j]<=9) {
					System.out.print(" "+matrix3[i][j]+" ");
					//}
//					else {
//						System.out.println(matrix3[i][j]+" ");
//					}
					}
				System.out.println();	
				}

	}

}
