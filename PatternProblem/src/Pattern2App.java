
public class Pattern2App {
static void pattern2(int n,char ch) {
	/*for(int i=1;i<=n;i++)//using for loop
	{
		System.out.println(ch);
	}
	*/
	/*int i=1;using while loop
	while(i<=n) {
		System.out.println(ch);
		i++;
	}*///using do while loop
	int i=1;
	do {
		System.out.println(ch);
		i++;
	}
	while(i<=n);
}
}
