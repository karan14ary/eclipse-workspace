import java.util.Scanner;
/*
       1 
     1 1 
    1 2 1 
   1 3 3 1 
  1 4 6 4 1 
 1 5 10 10 5 1
  */
public class Pattern31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//creating object of Scanner class
		System.out.println("Enter no of rows ");//Asking user input
		int n=scan.nextInt();//storing user input
		int a=1;//initialization of a number
		for(int i=0;i<=n;i++) {//loop for row
			for(int j=i;j<=n;j++) {//loop for column of space
				System.out.print(" "); 
			}
			for(int j=0;j<=i;j++) {//loop for column of number 
			if(i==0||j==0){//for 1st row
				a=1;	
			}
			else  {//for 2nd or greater row
			a=a*(i-j+1)/j;
			}
			if(a<10) {
			System.out.print(a+" ");
				}
			else {
				System.out.print(a+" ");
				}
			}
			System.out.println();
			}
		}
	}


