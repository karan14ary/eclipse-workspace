import java.util.Scanner;
/*
 *********
  *     *
   *   *
    * *
     *

 */
public class Program21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating object of Scanner Class
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a row");//Asking user for input
		int n=scan.nextInt();//storing user input  to a variable
		System.out.println("Enter a character");//asking  user for character
		char ch=scan.next().charAt(0);//storing character to a variable
		for(int i=1;i<=n;i++) {//loop for rows
			for(int j=1;j<=i;j++) {//loop for spaces
				System.out.print(" ");
			}
			for(int j=i;j<=(2*n-i);j++) {//loop for pattern
			if((i==1||i==n)||j==i||j==(2*n-i)) {//condition for hollow and pattern
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
