
public class Pattern7App {
static void pattern7(int n,char ch) {
	/*for(int i=1;i<=n;i++) {
	for (int k=1;k<=n;k++) {
		System.out.print(" ");
		}
	for(int j=1;j<=n;j++) {
	System.out.print(ch);
}
System.out.println();	
}*/
/*int i=1;
while(i<=n) {
	int j=1,k=1;
	while(j<=n) {
		System.out.print(" ");
		j++;
	}
	while(k<=n) {
		System.out.print(ch);
		k++;
	}
	System.out.println();
	i++;
}
*/
int i=1;
do {
	int j=1,k=1;
			do{
				System.out.print(" ");
				j++;
			}
			while(j<=n);
	do {
		System.out.print(ch);
		k++;
	}
	while(k<=n);
System.out.println();
i++;
}while(i<=n);
}
}
