import java.util.Scanner;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner (System.in);
int n=scan.nextInt();
int a=1;
for(int i=1;i<=n;i++) {
	for(int j=1;j<=i;j++) {
		if (a>=1&&a<=9) {
			System.out.print("0"+a+" ");
		}
		else {
			System.out.print(a+" " );
		}
		a++;
	}
	System.out.println();
}
for(int i=1;i<=n;i++) {
	for(int j=i;j<=n;j++) {
		if (a>=1&&a<=9) {
			System.out.print("0"+a+" ");
		}
		else {
			System.out.print(a+" " );
		}
		a++;
	}
	System.out.println();
}

	}

}
