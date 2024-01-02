package Selection;

import java.util.Scanner;

public class NumtoEnglishApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		NumtoEnglish.numtoWord(n);
	}

}
