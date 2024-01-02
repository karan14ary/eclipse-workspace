import java.util.Arrays;
import java.util.Scanner;

public class BorderCount {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int t=scan.nextInt();
		int arr3[]=new int[t];
		char[][][]arr=new char[t][][];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter row for block "+i);
			int m=scan.nextInt();
			System.out.println("Enter col for block "+i);
			int n=scan.nextInt();
			arr[i]=new char[m][n];
			System.out.println("Enter element for block "+i);
			for(int j=0;j<=arr[i].length-1;j++) {
				for(int k=0;k<=arr[i][j].length-1;k++) {
					arr[i][j][k]=scan.next().charAt(0);
				}
			}
		}
		for(int i=0;i<=arr.length-1;i++) {
			int arr1[]=new int[arr[i].length];
			for(int j=0;j<=arr[i].length-1;j++) {
				int c=0;
				for(int k=0;k<=arr[i][j].length-1;k++) {
				    if(arr[i][j][k]=='*') {
				    	c++;
				    }
				}
				
				System.out.print(c+" ");
				arr1[j]=c;
			}
			arr3[i]=borderMax(arr1);
		  }
		System.out.println();
		for(int x:arr3) {
			System.out.println(x+" ");
		}
		}



	public static int borderMax(int arr[]) {
		Arrays.sort(arr);
		int	greater=arr[arr.length-1];
		return greater;
	}
}
