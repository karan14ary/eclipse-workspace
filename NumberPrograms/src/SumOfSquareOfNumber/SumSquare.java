package SumOfSquareOfNumber;

public class SumSquare {
static int squareOfNumber(int n)
{
int squaresum=0;
for(int i=1;i<=n;i++) {//taking the number from 1 nto n
	int s=i*i;//taking sqaure of number
	squaresum+=s;//storing sum of square number
}
return squaresum;	
} 
}
