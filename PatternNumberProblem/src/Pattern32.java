import java.util.Scanner;
/*
     1
    1 1 
   1 2 1 
  1 3 3 1 
 1 4 6 4 1 
*/
public class Pattern32 {
	static void rev(int n)
	{
			while(n>=1) {//check condition
				int d=n%10;//take remainder
				n=n/10;//taking quotient
				System.out.print(d+" ");
			}
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);//creating object of Scanner class
System.out.println("Enter no of rows less than 6 ");//Asking user input
int n=scan.nextInt();//storing user input
if(n<=5) {//input should  be less than5
int a=11;//initialization of a number
for(int i=1;i<=n;i++) {//loop for row
	for(int j=i;j<=n;j++) {//loop for column of space
		System.out.print(" "); 
	}
	for(int j=i;j<=i;j++) {//loop for column of number 
	if(i==1){//for 1st row
			System.out.print(1);
	}
	else if(i>=2&&i<=n)  {//for 2nd or greater row
		rev(a);//incoking method
		a*=11;
	}
		}
	System.out.println();
	}
}
else {
	System.out.println("Please enter the no of rows less than 5");
}
}
	}


