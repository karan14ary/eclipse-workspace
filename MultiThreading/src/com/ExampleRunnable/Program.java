package com.ExampleRunnable;

public class Program extends Thread{
	@Override
	public void run() {
		if(currentThread().getName().equals("Number")) {
			NumPrint();
		}
		else {
			CharPrint();
		}
	}
	public void NumPrint() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("Number "+i);
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void CharPrint() {
		try {
			for(char i='a';i<='e';i++) {
				System.out.println("Character "+i);
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
