import java.util.Scanner;
/*
1 2 3 4 5 
6 7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 
21 22 23 24 25 
*/
public class Pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//creating object for scanner class
		System.out.println("Enter the number of rows");//asking user for input
		int n=scan.nextInt();//storing user input
		//initialization for initial number
		int a=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
			System.out.print(a+" ");
			a++;//increment a
				
				}
			System.out.println();
		}
			
			
	

}}
