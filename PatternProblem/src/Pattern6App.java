
public class Pattern6App {
static void pattern6(int n, char ch) {
	/*for(int i=1;i<=n;i++) {
	for(int j=i;j<=n;j++) {//for(int j=1; j=(n-i+1);j++)
		System.out.print(ch);
	}
	System.out.println();
}
*/
/*int i=1;//using while loop
while(i<=n) {// for printing rows
	int j=i;
	while(j<=n) {//for printing the charactre in each row
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
	int j=i;
	do {//for printing the charactre in each row
		System.out.print(ch);
		j++;
	}
	while(j<=n);
	System.out.println();//sending cursor to next line
	i++;
}while(i<=n);
}
}
