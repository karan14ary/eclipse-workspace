package com.MultiThreadingexample1;

public class Program extends Thread {
	public void run() {
		Thread t=Thread.currentThread();
		System.out.println(t);
	}

}
