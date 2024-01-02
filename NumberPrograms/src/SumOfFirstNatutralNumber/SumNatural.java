package SumOfFirstNatutralNumber;

public class SumNatural {
static int sumNaturalNumber(int n) {
	int s=0;
	for(int i=1;i<=n;i++) {//for loop for 1 to n number
		s+=i;//sum of 1 to n
	}
	return s;
}
}
