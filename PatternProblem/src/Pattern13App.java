
public class Pattern13App {
static void pattern13(int n,char ch) {
/*	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print(ch);
		}
		System.out.println();
	}*/
/*	int i=1;
	while(i<=n) {
		int j=1;
		while(j<=n) {
			System.out.print(" ");
		j++;
		}
		int k=1;
		while(k<=i) {
			System.out.print(ch);
			k++;
		}
		System.out.println();
		i++;
	}*/
	int i=1;
	do  {
		int j=1;
	do	{
			System.out.print(" ");
		j++;
		}while(j<=n) ;
		int k=1;
		do {
			System.out.print(ch);
			k++;
		}while(k<=i);
		System.out.println();
		i++;
	}while(i<=n);
}
}
