package ArmstrongNumber;

public class Count {
static int count(int n){
	int c =0;int r=1;//initializing the remainder and count
	while(n!=0) {//check until n is greater than 1
		r=n%10;//get remainder
		c++;//increment
		n=n/10;//get quotient
	}
	
	return c;
}
}
