
public class Pattern5App {
static void pattern5(int n,char ch) {
	/*	for(int i=1;i<=n;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print(ch);
	}
	System.out.println();
}
*/
/*int i=1;//using while loop
while(i<=n) {// for printing rows
	int j=1;
	while(j<=i) {//for printing the charactre in each row
		System.out.print(ch);
		j++;
	}
	System.out.println();//sending cursor to next line
	i++;
}
*/
//using do while loop
int i=1;
do {// for printing rows
	int j=1;
	do {//for printing the charactre in each row
		System.out.print(ch);
		j++;
	}
	while(j<=i);
	System.out.println();//sending cursor to next line
	i++;
}while(i<=n);
}
}
