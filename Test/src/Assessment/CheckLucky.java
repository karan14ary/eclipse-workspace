package Assessment;

import java.util.Scanner;

public class CheckLucky {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
if(isLucky(n)==true) {
	System.out.println("Lucky Number");
}

else {
	System.out.println("Not Lucky Number");
}
}
static boolean isLucky(int n) {
	if(n<0) {
		return false;
	}
	else {
		int c=2;
		while(c<=n) {
			if(n%c==0) {
				return false;
			}
			
				n-=n/c;
				c++;
				
			
			
		}
		
	}
	return true;
}
}
