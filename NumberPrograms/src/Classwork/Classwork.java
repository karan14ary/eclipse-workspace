package Classwork;

public class Classwork {
static void divBy2(int n) {
	for(int i=1;i<=n;i++) {//for loop of number 1 to n
		if(i%2==0) {//check div by 2 or not
			System.out.print(i+" ");
		}
	}
	System.out.println();
} 
static void divBy3(int n) {
	for(int i=1;i<=n;i++) {//for loop of number 1 to n
		if(i%3==0) {//check div by 3 or not
			System.out.print(i+" ");
		}
	}
	System.out.println();
}
static void divBy5(int n) {
	for(int i=1;i<=n;i++) {//for loop of number 1 to n
		if(i%5==0) {//check div by 5 or not
			System.out.print(i+" ");
		}
	}
	System.out.println();
} 
static void divBy2And5(int n) {
	for(int i=1;i<=n;i++) {//for loop of number 1 to n
		if(i%2==0 && i%5==0) {//check div by 2  and 5 or not
			System.out.print(i+" ");
		}
	}
	System.out.println();
} 
static void divBy3AndComesTable5(int n) {
	for(int i=1;i<=n;i++) {//for loop of number 1 to n
		if(i%3==0&&i%5==0) {//check div by 3 and 5 or not
			System.out.print(i+" ");
		}
	}
	System.out.println();
} 
static void prime(int n) {
	for(int i=1;i<=n;i++) {//for loop number from 1 to n
		int c=0;//initilizw count
		for(int j=1;j<=i;j++) {//loop for divisor
			if(i%j==0) {//check divisible by itself and 1 or not
				c++;//increment
			}
		}
		if(c==2) {//check prime
			System.out.print(i+" ");
		}
	}
	System.out.println();
}
static void evenNumberDiv3(int n) {
	 
		for(int i=1;i<=n;i++) {//loop for number 1 to n
			if(i%2==0&&i%3==0) {//check even and divisible by 3
				System.out.print(i+" ");
			}
		}
		System.out.println();
}
static void oddNumberDiv5(int n) {
	 
	for(int i=1;i<=n;i++) {//loop for 1 to n
		if(i%2!=0&&i%5==0) {//check odd and divisible by 5
			System.out.print(i+" ");
		}
	}
	System.out.println();
}
static void evenPrime(int n) {
	for(int i=1;i<=n;i++) {//loop for number 1 to n
		int c=0;// initialize the count
		for(int j=1;j<=i;j++) {//loop for divisor
			if(i%2==0&&i%j==0) {//check for divisible by 1 and itself and even
				c++;//increment
			}
		}
		if(c==2) {//check for prime
			System.out.print(i+" ");
		}
	}
	System.out.println();
}
static void oddPrime(int n) {
	for(int i=1;i<=n;i++) {//loop for number 1 to n
		int c=0;//initialize count
		for(int j=1;j<=i;j++) {//loop for divisor
			if(i%2!=0&&i%j==0) {//check odd and divisible by 1 and itself
				c++;//increment  
			}
		}
		if(c==2) {//check for prime
			System.out.print(i+" ");
		}
	}
	System.out.println();
}
}
