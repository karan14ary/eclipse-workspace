package Factorial;

public class Factorial {
static int factorial(int n){
	int f=1;
	for(int i=n;i>=1;i--) {//loop for number n to 1
		f*=i;//factorial of a number
	}
	return f;
}
}
