import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberOfSet {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the total no");
		int t=scan.nextInt();
		ArrayList al=new ArrayList();
		for(int i=1;i<=t;i++) {
			System.out.println("Enter row");
			int m=scan.nextInt();
			System.out.println("Enter col");
			int n=scan.nextInt();
		System.out.println("Enter element in an array"+i);
			char[][]arr=new char[m][n];
			for(int j=0;j<=arr.length-1;j++) {
				for(int k=0;k<=arr[j].length-1;k++) {
					arr[j][k]=scan.next().charAt(0);
				
				}
			}
			al.add(arr);
		}
	for(int i=0;i<=al.size()-1;i++) {
		System.out.println(al.get(i));
//		int c=0;
//		for(int j=0;j<=li[i].size()-1;j++) {
//			for(int k=0;k<=li[i]arr[j].length-1;k++) {
//				if(arr[i][j]=='#') {
//					c++;
//				}
//			
//			}
//		}
//		System.out.println(c);

	}
			
			}
			
}
