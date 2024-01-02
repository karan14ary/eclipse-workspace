package TableOfGivenNumber;

public class Table {
static void table(int n) {
	for(int i=1;i<=10;i++) {//for loop for 1 to 10
		int tab= i*n;//multiplying the number from 1 to 10 with n
		System.out.println(n+" * "+i+" = "+tab);
	}
}
}
