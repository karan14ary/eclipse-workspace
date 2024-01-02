
public class Pattern9App {
static void pattern9(int n,char ch) {
	/*for(int i=1;i<=n;i++) {
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
}*/
/*int i=1;
while(i<=n) {
	int j=1;
	while(j<=n) {
		if((i==1||i==n)||(j==1||j==n)) {
			System.out.print(ch);
		}
		else {
			System.out.print(" ");
		}
		j++;
	}
	System.out.println();
	i++;
}*/
int i=1;
do {
	int j=1;
 do{
		if((i==1||i==n)||(j==1||j==n)) {
			System.out.print(ch);
		}
		else {
			System.out.print(" ");
		}
		j++;
	}	
 while(j<=n);
	System.out.println();
	i++;
}
while(i<=n);
}
}
