package com.MultiThrwadingex2;

public class PrintChar extends Thread {
public void run() {
	try{
		System.out.println("Character printing started");
		for(char i='a';i<='e';i++) {
			System.out.println("Character "+i);
			Thread.sleep(2000);
		}
	}
	catch(InterruptedException ie) {
		ie.printStackTrace();
	}
	System.out.println("Character printing ended");
}
}
