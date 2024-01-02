
public class Pattern8App {
	void pattern8(int n,char ch) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if((i==1||i==n)||(j==1||j==n)) 
			{
				System.out.print(ch);
		}
		else {
			System.out.print(" ");
		}
		}
		System.out.println();
	}
	}
}
