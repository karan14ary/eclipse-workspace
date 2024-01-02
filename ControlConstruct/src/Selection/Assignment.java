package Selection;

public class Assignment {
static void calculate(double num1,double num2,char ch) {
	if(ch=='+') {
		System.out.println("Addition is "+(num1+num2) );
	}
	else if(ch=='-') {
		if(num2>num1) {
			System.out.println("Subtraction is "+(num2-num1));
		}
		else {
			System.out.println("Subtraction is "+(num1-num2));
		}
	}
	else if(ch=='*') {
		System.out.println("Multiplication is "+(num1*num2));
	}
	else if(ch=='/') {
		System.out.println("Division is "+(num1/num2));
	}
	else {
		System.out.println("Invalid input");
	}
}
}
