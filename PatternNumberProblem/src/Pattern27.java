import java.util.Scanner;
/*
1
23
456
78910
 */
public class Pattern27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//creating object for scanner class
		System.out.println("Enter the number of rows");//asking user for input
		int n=scan.nextInt();//storing user input
		//initialization initial  number as 1
		int a=1;
		for(int i=1;i<=n;i++) {//loop for row
			for(int j=1;j<=i;j++) {//loop for column
				System.out.print(a);
				a++;//increase a
			}
			System.out.println();
		}

	}

}
