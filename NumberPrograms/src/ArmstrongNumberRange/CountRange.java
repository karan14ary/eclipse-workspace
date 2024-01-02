package ArmstrongNumberRange;

public class CountRange {
static long count(long n){
	long c =0;long r=1;//initializing the count and remainder
	while(n!=0) {//check the total number of digit in a number
		r=n%10;
		c++;//increase the count
		n=n/10;
	}
	
	return c;
}
}
