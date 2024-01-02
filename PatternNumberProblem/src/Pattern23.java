/*
11111
22222
33333
44444
55555
 */

import java.util.Scanner;

public class Pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
//creating object for scanner class
System.out.println("Enter the number of rows");//asking user for input
int n=scan.nextInt();//storing user input

		for(int i=1;i<=n;i++) {//loop for row
			for(int j=1;j<=n;j++) {//loop for column
				System.out.print(i);
			}
			System.out.println();
}
	}

}
