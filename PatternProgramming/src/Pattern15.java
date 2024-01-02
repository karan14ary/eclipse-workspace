import java.util.Scanner;
/*
     *****
     *   *
     *   *
     *   *
     *****
*/
public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating object of Scanner Class
Scanner scan=new Scanner(System.in);
		System.out.println("Enter a row");
		int n=scan.nextInt();
		System.out.println("Enter a character");
		char ch=scan.next().charAt(0);
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++) {
				if((i==1||i==n)||(j==1||j==n)) 
				{
					System.out.print(ch);
			}
			else {
				System.out.print(" ");
			}
			}
			System.out.println();
		}
	}

}
