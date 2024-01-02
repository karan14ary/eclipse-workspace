import java.util.Scanner;
/*
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
*/
public class Pattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//creating object for scanner class
		System.out.println("Enter the number of rows");//asking user for input
		int n=scan.nextInt();//storing user input
		for(int i=1;i<=n;i++) {//loop for row
			for(int j=1;j<=n;j++) {//Loop for column
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
