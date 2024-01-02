package ArmstrongNumberRange;

public class ArmstrongNumberRange {
static long armstrongNumberRange(long num,long count) {
	long arm=0;long temp=0;//initialinzing variable for temp and armstrong
	while (num!=0) {//checking for each digit
		temp=num%10;//take each digit and store in temp
		long pow=1;//initializing the power
		for(long i=1;i<=count;i++) {//taking the range for total number of digit
		pow=pow*temp;//raising the power of each digit to its total number of digit
		}
		arm=arm+pow;//storing the value in arm
		num=num/10;
	}
	return arm;
}
}
