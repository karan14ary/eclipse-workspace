package Array;

import java.util.Scanner;

public class SumEachRow {

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
		for(int i=0;i<=matrix.length-1;i++) 
		{
			for(int j =0;j<=matrix[i].length-1;j++) {
				System.out.println("Enter the element in row "+(i+1)+" and column "+(j+1));
				matrix[i][j]=scan.nextInt();
			}
		}
		//displaying data in array
		
				for(int i=0;i<=matrix.length-1;i++) 
				{
					int sum=0;
					for(int j =0;j<=matrix[i].length-1;j++) {
						
						
						sum+=matrix[i][j];	
					}
					System.out.println("The sum of element in row "+(i+1)+" of matrix is : "+sum);
				}
				

	}

}
