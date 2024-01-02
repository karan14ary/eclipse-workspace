package EvenNumber;

public class EvenNumber {
static int evenNumber(int n) {
	int even=0;//initialize even
	for(int i=1;i<=n;i++) {//loop for 1 to n
		if(i%2==0) {// check even or odd
			System.out.println(i);
		}
	}
	return even;
}
}
