import java.util.Scanner;
/*
25 24 23 22 21 
20 19 18 17 16 
15 14 13 12 11 
10 9 8 7 6 
5 4 3 2 1 

  */
public class Pattern28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//creating object for scanner class
		System.out.println("Enter the number of rows");//asking user for input
		int n=scan.nextInt();//storing user input
		//initialization for last number
		int a=n*n;
		for(int i=1;i<=n;i++) {//loop for row
			for(int j=1;j<=n;j++) {//loop for column
				System.out.print(a+" ");
				a--;//decrease a
			}
			System.out.println();
		}

	}

}
