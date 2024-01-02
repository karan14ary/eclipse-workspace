
public class Pattern12App {
static void pattern12(int n,char ch) {
	/*for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			System.out.print(" ");
		}
		for(int j=i;j<=n;j++) {
			System.out.print(ch);
		}
		System.out.println();
	}*/
	/*int i=1;
	while(i<=n) {
		int j=1;
		while(j<=n) {
			System.out.print(" ");
		j++;
		}
		int k=i;
		while(k<=n) {
			System.out.print(ch);
			k++;
		}
		System.out.println();
		i++;
	}*/
	int i=1;
	do {
		int j=1;
		do {
			System.out.print(" ");
		j++;
		}while(j<=n);
		int k=i;
	do {
			System.out.print(ch);
			k++;
		}	while(k<=n);
		System.out.println();
		i++;
	}while(i<=n);
}
}
