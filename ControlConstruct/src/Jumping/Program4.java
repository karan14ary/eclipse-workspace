package Jumping;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int sum=0;
		for(int i=1;i<=50;i++) {
			if(i%3==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	*/
	/*	int sum=0;
		int i=1;
		while(i<=50) {
			if(i%3==0) {
				sum+=i;
			}
			i++;
		}
		System.out.println(sum);*/
		int sum=0;
		int i=1;
		do {
			if(i%3==0) {
				sum+=i;
			}
			i++;
			}
		while(i<=50);
		System.out.println(sum);
	}
}
