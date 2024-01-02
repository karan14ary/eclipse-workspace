package com.Inheritance.Rule1;

public class ParentChildApp {

	public static void main(String[] args) {
		Child c=new Child();
		System.out.println(c.a);
		System.out.println(c.b);
		c.dispA();
		c.dispB();
	}

}
