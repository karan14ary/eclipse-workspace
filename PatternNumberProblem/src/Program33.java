import java.util.Scanner;

public class Program33 {
/*
 1 2 3 4
 5 6 7 8
 9 10 11 12
 output
 1 5 9 10 11 12 8 4 3 2  
  
 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int [][]arr=new int[scan.nextInt()][scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				if(i==0||j==0||i==arr.length-1||j==arr[i].length-1) {
					System.out.print(arr[i][j]+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("Anticlockwise matrix border");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i][0]+" ");
		}
		for(int j=1;j<=arr[0].length-1;j++) {
			System.out.print(arr[arr.length-1][j]+" ");
		}
		for(int i=arr.length-2;i>=0;i--) {
			System.out.print(arr[i][arr[0].length-1]+" ");
		}
		for(int j=arr[0].length-2;j>=1;j--) {
			System.out.print(arr[0][j]+" ");
		}
	}

}
