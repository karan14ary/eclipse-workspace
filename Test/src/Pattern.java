import java.util.Scanner;
/*
 *		*
 **    **
 ***  ***
 ********
 ***  ***
 **    **
 *		*
 */
public class Pattern {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	//upper
	for(int i=1;i<=n/2+1;i++ ) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		for(int j=i;j<=n/2;j++) {
			System.out.print(" ");
		}
		for(int j=i;j<=n/2;j++) {
			System.out.print(" ");
		}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
	}
	//lower
	for(int  i=1;i<=n/2;i++) {
		for(int j=i;j<=n/2;j++) {
			System.out.print("*");
		}
		for(int j=1;j<=i;j++) {
			System.out.print( " ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print(" ");
		}
		for(int j=i;j<=n/2;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
