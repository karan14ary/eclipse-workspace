package com.MultiThreadingexample1;

public class ProgramApp {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println(t);
		Program p=new Program();
		p.setName("ProgramThread");
		p.setPriority(7);
		p.start();
	}

}
