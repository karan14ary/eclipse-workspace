package SumOfDigit;

public class SumDigit {
	static void sumDigit(int n) {
	int s=0;int r=0;//initialize the sum and remainder
	while(n!=0) {//check until n is greater than 1
		r=n%10;;//get reach digit
		s+=r;//get sum
		n/=10;//get quotient
	}
	System.out.println("Sum of digits is "+s);
	}
}
