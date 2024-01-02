package com.Test.stairscase;

import java.util.Scanner;

public class Matricstarircase {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		int[][]matrix=new int[m][n];
		for(int i=0;i<=matrix.length-1;i++) {
			for(int j=0;j<=matrix[i].length-1;j++) {
				matrix[i][j]=scan.nextInt();
			}
		}
//printStaircase(matrix);
		

		        // Print the elements in the desired pattern
		        System.out.println("Matrix elements in the desired pattern:");

		        for (int i = 0; i < m; i++) {
		            for (int j = 0; j <= i; j++) {
		                System.out.print(matrix[j][i - j] + " ");
		            }
		            System.out.println();
		        }

		        for (int i = 1; i < n; i++) {
		            for (int j = 0; j < m - i; j++) {
		                System.out.print(matrix[i + j][m - 1 - j] + " ");
		            }
		            System.out.println();
		        }

		       
		    }
		
	}
//	static void printStarircase(int[][]matrix) {
//		int rows = matrix.length;
//
//		int cols = matrix[0].length;
//
//		for (int diag = 0; diag < rows + cols - 1; diag++) {
//
//		int rowStart = Math.max(0, diag - cols + 1);
//
//		int rowEnd = Math.min(rows - 1, diag);
//
//		for (int i = rowStart; i <= rowEnd; i++) {
//
//		System.out.print(matrix[i][diag - i] + " ");
//
//		}
//
//		System.out.println();
//
//		}
//
//		}
//	  static void printStaircase(int[][] matrix) {
//	        int rows = matrix.length;
//	        int cols = matrix[0].length;
//	        
//	        for (int k = 0; k < rows + cols - 1; k++) {
//	            for (int i = 0; i < rows; i++) {
//	                int j = k - i;
//	                if (j >= 0 && j < cols) {
//	                    System.out.print(matrix[i][j] + " ");
//	                }
//	            }
//	            System.out.println();
//	        }
//	    }

	//	}

