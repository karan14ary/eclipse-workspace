import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of times it should be printed");
		int n=scan.nextInt();
		System.out.println("Enter the character that should be printed");
		char ch=scan.next().charAt(0);
		Pattern6App.pattern6(n, ch);
	}

}
