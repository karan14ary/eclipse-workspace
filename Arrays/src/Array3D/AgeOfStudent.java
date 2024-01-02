package Array3D;

import java.util.Iterator;
import java.util.Scanner;

public class AgeOfStudent {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		// creating 3darray
		int [][][]arr=new int[2][3][5];
		//storing value in a array
		for (int i = 0; i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				for(int k=0;k<=arr[i][j].length-1;k++) {
					System.out.println("Enter the age of student "+(k+1)+" of class "+(j+1)+" of school "+(i+1));
				arr[i][j][k]=scan.nextInt();
				}
			}
		}
		//displaying the age
		for (int i = 0; i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				for(int k=0;k<=arr[i][j].length-1;k++) {
					System.out.println("The age of student "+(k+1)+" of class "+(j+1)+" of school "+(i+1)+" is "+arr[i][j][k]);
				
				}
			}
		}
	}

}
