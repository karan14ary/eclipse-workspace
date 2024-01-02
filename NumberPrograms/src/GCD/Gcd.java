package GCD;

public class Gcd {
static void gcd(int n1,int n2) {
	int gcd=1;//initializing gcd
	for(int i=1;i<=n1&&i<=n2;i++) {//loop for n1 and n2
		if(n1%i==0&&n2%i==0) {//check gcd
			gcd=i;
		}
	}
	System.out.println(gcd);
}
}
