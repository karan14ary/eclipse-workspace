package Selection;

import java.util.Scanner;

public class CheckVoteEligibilityApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter your age");
int age=scan.nextInt();
CheckVoteEligibility.check(age);
	}

}
