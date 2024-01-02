package Looping;

import java.util.Scanner;

public class Number1TonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the nth number");
		int n=scan.nextInt();
		//for loop
		for(int i=1;i<=n;i++) {
			System.out.println(i);
	}
		
//while loop
	int i=1;
	while(i<=n) {
		System.out.println(i);
		i++;
	}
	//do while loop
	int j=1;
	do {
		System.out.println(j);
		j++;
	}while(j<=5);
}
}
