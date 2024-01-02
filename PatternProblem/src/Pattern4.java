import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of rows it should be printed");
		int n=scan.nextInt();
		System.out.println("Enter the number of characters in arows it should be printed");
		int m=scan.nextInt();
		System.out.println("Enter the character that should be printed");
		char ch=scan.next().charAt(0);
	Pattern4App.pattern4(n, m, ch);
	}

}
