package Fibbonacci;

public class Fibbonacci {
static void fibbo(int n) {
int a=0;//initializing first number
int b=1;//initializing second number
for(int i=1;i<=n;i++) {
	if(i==1) {
		System.out.print(a+" " );
		}
		else if(i==2) {
		System.out.print(b+" ");
		}	
		else {
	int c=a+b;
	a=b;
	b=c;
System.out.print(c+" ");
}
}
}

}
