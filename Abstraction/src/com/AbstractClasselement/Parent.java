package com.AbstractClasselement;

public abstract class Parent {
static int x,y;
int p,q;
static {
	System.out.println("Static Block");
}
{
System.out.println("Non Static Block");	
}
static void disp1() {
	System.out.println("Static Method");
}
void disp2() {
	System.out.println("Non static Method");
}
public Parent() {
	System.out.println("Parent constructor");
}
//public static void main(String[] args) {
//System.out.println("Inside main");	
//}

abstract void disp3();
}
