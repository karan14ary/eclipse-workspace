
public class Pattern4App {
static void pattern4(int n,int m,char ch) {
	//using for loop
	/*	for(int i=1;i<=n;i++) {// for printing rows
			for(int j=1;j<=m;j++) {//for printing the character in each row
				System.out.print(ch);
			}
			System.out.println();//sending cursor to next line
		}*/
		/*int i=1;//using while loop
		while(i<=n) {// for printing rows
			int j=1;
			while(j<=m) {//for printing the charactre in each row
				System.out.print(ch);
				j++;
			}
			System.out.println();//sending cursor to next line
			i++;
		}*/
		//using do while loop
		int i=1;
		do {// for printing rows
			int j=1;
			do {//for printing the charactre in each row
				System.out.print(ch);
				j++;
			}
			while(j<=m);
			System.out.println();//sending cursor to next line
			i++;
		}while(i<=n);

}
}
