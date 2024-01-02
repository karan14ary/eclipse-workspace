import java.util.Scanner;

public class P2 {
static String isPrime(int num) {
	if(num==0&&num==1) {
		System.out.println("invalid input");
	}
	else {
	int c=0;
	for(int i=2;i<=num;i++) {
		if(num%i==0) {
			c++;
		}
	}
	if(c==1) {
		return"PRIME";
	}
	
	}
	return "NOT PRIME";
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);
		int num=scan.nextInt();
		System.out.println(isPrime(num));

	}

}
