import java.util.Scanner;
/*
02 04 06 08 
10 12 14 16 
01 03 05 07 
09 11 13 15 
*/
public class Pattern29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);//creating object for scanner class
System.out.println("Enter the number of rows in even");//asking user for input
int n=scan.nextInt();//storing user input
int a=2;//initialization for even number
int b=1;//intialixation for odd
if(n%2==0) {
for(int i=1;i<=n;i++) {//loop for row
	for(int j=1;j<=n;j++) {//loop for column
		if(i>=1&&i<=n/2) {//half for even
			if (a<10) {//add 0 for single digit
				System.out.print("0"+a+" ");
			}
			else {
				System.out.print(a+" ");
			}
		a+=2;}//increment a by 2
		else {//odd
			if (b<10) {//add 0 for single digit
				System.out.print("0"+b+" ");
			}
			else {
				System.out.print(b+" ");
			}
			b+=2;//incerment b by 2
		}
		
	}
	System.out.println();
}}
else {
	System.out.println("Please enter even input");
}
	}

}
