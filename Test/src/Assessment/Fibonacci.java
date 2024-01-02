package Assessment;

import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int n =scan.nextInt();
int a=0;
int b=1;

for(int i=1;i<=n;i++ ) {
	if(i==1) {
		System.out.print("0, 1");
	}
	else if(i>=2&&i<=n){
		int c=a+b;
		a=b;
		b=c;
		System.out.print(" ,"+c);
		
	}
	
}
}

}
