package ProductOfFirstOddNumber;

public class ProductNum {
static long productOddNum(long n) {
	int m=1;// initializing multiply
	for(int i=1;i<=n;i++) {
		if(i%2!=0) {
			m*=i;
		}
	}
	return m;
}
}
