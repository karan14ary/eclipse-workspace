package com.compression;

public class BookApp {
public static void main(String[] args) {
	Book br=new Book();
	br.read();
	System.out.println("Destroying book object");
	br=null;
	//bk.read();//error
}
}
