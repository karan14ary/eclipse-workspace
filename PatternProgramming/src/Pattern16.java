import java.util.Scanner;
/*
     *
    ***
   *****
  *******
 *********
 */
public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating object of Scanner Class
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a row");
		int n=scan.nextInt();
		System.out.println("Enter a character");
		char ch=scan.next().charAt(0);
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j++) {
			 
				System.out.print(ch);
			}
		System.out.println();
		}
	}

}
