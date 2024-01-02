package LargestDigitInNumber;

public class LargestDigit {
static int largest(int n) {
	int l=0;int temp=0;//initializing the largest and temp
	while(n!=0) {//check until the value of n  is greater than 1
		temp=n%10;//get reamainder
		if(temp>l) {//check temp is greater or not
			l=temp;//store temp is largest 
		}
		n=n/10;//get quotient
	}
	return l;
}
}
