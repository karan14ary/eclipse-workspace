package MethodOverloading;

public class WithImplicitTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,c=30;
		float p=10.5f,q=20.5f,r=30.5f;
		System.out.println(add(p,q));
	}
public static int add(int x,int y) {
	return x+y;
}
public static double add(double x,double y) {
	return x+y;
}
// it will give error because it cannot accept more than one nearest available
//public static double add(double x,float y) {
//	return x+y;
//}
//public static double add(float x,double y) {
//	return x+y;
//}
}
