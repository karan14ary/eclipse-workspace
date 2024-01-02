package Polymorphism;

public class Program {
public static void main(String[] args) {
	int a=10,b=20,c=30;
	float p=10.5f,q=20.5f,r=30.5f;
	System.out.println(add(a,b));
	System.out.println(add(a,b,c));
	System.out.println(add(p,q));
	System.out.println(add(p,q,r));
	System.out.println(add(p,a));
	System.out.println(add(a,q));
}
public static int add(int x,int y) {
	return x+y;
}
public static float add(float x,float y) {
	return x+y;
}
public static int add(int x,int y,int z) {
	return x+y+z;
}
public static float add(float x,float y,float z) {
	return x+y+z;
}
public static float add(int x,float y) {
	return x+y;
}
public static float add(float x,int y) {
	return x+y;
}
}
