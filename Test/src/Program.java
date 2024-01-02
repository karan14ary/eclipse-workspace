import java.util.Scanner;

public class Program {
static void printFibonacciSeries(int num) {
	int a=0;
	System.out.print(a+" ");
	int b=1;
	System.out.print(b+" ");
	int c=0;
	do {
		c=a+b;
		a=b;
		b=c;
		if(c>num) {
			break;
		}
		System.out.print(c+" ");
	}while(c<=num);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner (System.in);
int num=scan.nextInt();
printFibonacciSeries(num);
	}

}
