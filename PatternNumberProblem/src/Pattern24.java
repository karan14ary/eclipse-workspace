import java.util.Scanner;
/*
1
12
123
1234
12345*/
public class Pattern24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		//creating object for scanner class
		System.out.println("Enter the number of rows");//asking user for input
		int n=scan.nextInt();//storing user input
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
