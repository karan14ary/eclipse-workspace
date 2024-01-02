package com.statickeyword;

public class Program {
static int x;
static int y;
static {
	System.out.println("Static Block");
	x=10;
	y=20;	
}
static void disp1() {
	System.out.println("Static Method");
System.out.println("X:"+x);
System.out.println("y:"+y);
}
int p,q;
{
System.out.println("Non static Variable");
p=55;
q=66;
x=77;
y=88;
}
void disp2() {
	System.out.println("Non static method");
System.out.println("P:"+p);
System.out.println("Q:"+q);
System.out.println("X:"+x);
System.out.println("Y:"+y);
}
public Program() {
	System.out.println("Constructor");
}
}
