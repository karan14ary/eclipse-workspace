package Selection;

public class CalculatorUsingSwitch {
static void calculate(double num1,double num2,char ch) {
	switch(ch) {
	case '+':{
		System.out.println("Addition is "+(num1+num2) );
		break;
	}
	case'-':{
		if(num2>num1) {
			System.out.println("Subtraction is "+(num2-num1));
		}
		else {
			System.out.println("Subtraction is "+(num1-num2));
		}
		break;
	}
	case'*':{
		System.out.println("Multiplication is "+(num1*num2));
		break;
	}
	case'/':{
		System.out.println("Division is "+(num1/num2));
		break;
	}
	default:System.out.println("Invalid Input");
	}
}
}
