package Palindrome;

public class Palindrome {
static void palindrome(int n) {
	int rev=0;int r=0;//initializing sum remainder and number
	int num=n;
	while(n!=0) {//until n is greater than 1
		r=n%10;//get remainder/get each digit
		
		rev=rev*10+r;//get sum of the square of digit
		n/=10;//get quotitent of number
	}
	if(rev==num) {//check is reverse is equal to number or not
		System.out.println("Armstrong Number");
	}
	else {
		System.out.println("Not Armstrong Number");
	}
}
}
