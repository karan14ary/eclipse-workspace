package PrimeNumber;

public class Prime {
static void prime(int n) {
	int temp=0;int i=0;
	while(temp<n) {//loop for number 1 to n
		int c=0;//initialize count
		for(int j=2;j<=i;j++)//loop for the divisor
		{
			if(i%j==0)//check nuumber divisible by itself only
			{
				c++;//increment c
			}
		}
		if(c==1) {//chek prime
			System.out.println(i);
			temp++;
		}
		i++;
	}

}
}
