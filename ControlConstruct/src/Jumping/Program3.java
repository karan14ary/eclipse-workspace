package Jumping;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	for(int i=-99;i<=99;i++) {
			if(i<0&&i%2!=0) {
				System.out.println(i);
			}
			else if(i==0){
				continue;
			}
			else {
				if(i>0&&i%2==0) {
					System.out.println(i);
				}
			}
		}*/
		/*int i=-99;
		while(i<=99){
			if(i<0&&i%2!=0) {
				System.out.println(i);
			}
			else if(i==0){
				i++;
				continue;
			}
			else {
				if(i>0&&i%2==0) {
					System.out.println(i);
				}
		}
			i++;
	}
*/
		int i=-99;
		do{
			if(i<0&&i%2!=0) {
				System.out.println(i);
			}
			else if(i==0){
				i++;
				continue;
			}
			else {
				if(i>0&&i%2==0) {
					System.out.println(i);
				}
		}
			i++;
	}while(i<=99);
	}
	}
