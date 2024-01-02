package Spiral;

import java.util.Scanner;

public class Spiral {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
int arr[][]=new int[scan.nextInt()][scan.nextInt()];	
for(int i=0;i<=arr.length-1;i++) {
	for(int j=0;j<=arr[i].length-1;j++) {
		arr[i][j]=scan.nextInt();
	}
}
printSpiral(arr);

}
static void printSpiral(int[][]arr) {
	int row=arr.length;
	int col=arr[0].length;
for(int i=0;i<=row-1;i++) {
	System.out.print(arr[i][0]);
}

for(int i=1;i<=col-1;i++) {
	System.out.print(arr[row][i]);
}
for(int i=row-1;i>=0;i--) {
	System.out.print(arr[i][col]);
}
for(int i=col-1;i>0;i--) {
	System.out.print(arr[0][i]);
}
}
}
