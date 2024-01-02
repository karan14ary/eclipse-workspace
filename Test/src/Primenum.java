import java.util.Scanner;

public class Primenum {
static boolean isPrime(int num) {
	int c=0;
	if(num==0||num==1) {
		return false;
	}
	else {
		for(int i=2;i<=num;i++) {
			if(num%i==0) {
				c++;
			}
		}
	}
	if (c==1) {
	return true;
			}
	return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int[]arr1=new int [scan.nextInt()];
int[]arr2=new int [scan.nextInt()];
for(int i=0;i<=arr1.length-1;i++) {
	arr1[i]=scan.nextInt();
}
for(int i=0;i<=arr2.length-1;i++) {
	arr2[i]=scan.nextInt();
}
int s1=0;
for(int i=0;i<=arr1.length-1;i++) {
	if(isPrime(arr1[i])==true) {
		s1+=arr1[i];
	}
}
int s2=0;
for(int i=0;i<=arr2.length-1;i++) {
	if(isPrime(arr2[i])==true) {
		s1+=arr2[i];
	}

}
System.out.println(s1-s2);
	}
	

}
