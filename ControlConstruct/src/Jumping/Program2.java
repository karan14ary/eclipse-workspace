package Jumping;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			if(i==6) {
				continue;
				}
				System.out.println(i);
		}
		int i=1;
		while(i<=10) {
			if(i==6) {
				i++;
				continue;
				}
				System.out.println(i);
				i++;
		}
		int j=1;
		do {
			if(j==6) {
				j++;
				continue;
				}
				System.out.println(j);
				j++;
		}while(j<=10);
	
	}
}
