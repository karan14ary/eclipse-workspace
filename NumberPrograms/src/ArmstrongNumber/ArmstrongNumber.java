package ArmstrongNumber;

public class ArmstrongNumber {
static int armstrongNumber(int num,int count) {
	int arm=0;int temp=0;//initializing temp and arm
	while (num!=0) {//check until n greater than 0
		temp=num%10;//taking the remainder
		int pow=1;//initializing the power
		for(int i=1;i<=count;i++) {//taking the counter as exponent
		pow=pow*temp;//raising the power of base
		}
		arm=arm+pow;//calculating the armstrong
		num=num/10;//geting quotient
	}
	return arm;
}
}
