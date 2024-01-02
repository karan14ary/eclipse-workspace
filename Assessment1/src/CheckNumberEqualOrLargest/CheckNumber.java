package CheckNumberEqualOrLargest;

public class CheckNumber {
static void checkNumber(int num1,int num2,int num3) {
	if(num1==num2&&num2==num3) {//check for all number are equal or not
		System.out.println("All three numbers are equal");
	}
	else if (num1>num2&&num1>num3) {//check the num1 as largest
		System.out.println(num1+" is largest Number");
		
	}
	else if (num2>num1&&num2>num3) {//check the num2 as largest
		System.out.println(num2+" is largest Number");
		
	}
	else {
		System.out.println(num3+" is largest Number");
	}
}
}
