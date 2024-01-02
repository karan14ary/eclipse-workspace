import java.util.Scanner;
/*
01 02 03 04 05 
06 07 08 09 10 
11 12 13 14 15 
16 17 18 19 20 
21 22 23 24 25 
*/
public class Pattern26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//creating object for scanner class
		System.out.println("Enter the number of rows");//asking user for input
		int n=scan.nextInt();//storing user input
	//initialization initial value
		int a=1;
		for(int i=1;i<=n;i++) {//loop for row
			for(int j=1;j<=n;j++) {//loop for column
			if(a<10) {//check for single digit number
				System.out.print("0"+a+" ");
					}
				else {//double digit
					System.out.print(a+" ");
					}
			a++;//increase a
				}
		
			System.out.println();
				}
		
	}

}
