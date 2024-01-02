package com.exampleRunnablethread;

public class ProgramApp {

	public static void main(String[] args) {
	Program p=new Program();
	Thread t1=new Thread(p);
	Thread t2=new Thread(p);
	t1.setName("Number");
	t2.setName("Character");
	t1.start();
	t2.start();
	}

}
