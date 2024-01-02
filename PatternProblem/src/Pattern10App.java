
public class Pattern10App {
	static void pattern10(int n,char ch) {
		//using for loop
		/*for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print(ch);
			}
			System.out.println();
		}*/
		/*int i=1;
		while(i<=n) {
			int j=i;
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
			int j=i;
			do {
				System.out.print(" ");
				j++;
			}while(j<=n);
			int k=i;
			do {
				System.out.print(ch);
				k++;
			}while(k<=n);
			System.out.println();
			i++;
		}while(i<=n);
		
	}

}
