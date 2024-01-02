package com.MultiThrwadingex2;

public class PrintNum extends Thread {
public  void run() {
	try {
		System.out.println("Number Printing started");
		for(int i=1;i<=5;i++) {
			System.out.println("Number " +i);
			Thread.sleep(2000);
		}
	}	
	catch(InterruptedException ie) {
		ie.printStackTrace();
}
	System.out.println("Number printing ended");
}
}