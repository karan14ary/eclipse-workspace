package Selection;

import java.util.Scanner;

public class CheckNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter the number to be checked");
int num=scan.nextInt();
CheckNumber.check(num);
	}

}
