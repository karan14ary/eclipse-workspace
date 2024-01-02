package SumUntilSingleDigit;

public class SumUntilSingleDigit {
static long sumUntilSingleDigit(long n) {
	
	while(n>=10) {//check the number is greater than 9
		long r=0;long sum=0;
	while(n!=0) {//check n is greater than 1
		r=n%10;//get remainder
		sum+=r;//get sum
		n=n/10;//get quotient
	}
	n=sum;//n is assigned with sum
}	
return n;
}
}
