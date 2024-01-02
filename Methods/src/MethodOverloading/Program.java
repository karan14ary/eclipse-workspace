package MethodOverloading;

public class Program {
public static void getMaggi() {
	System.out.println("Bill for normal maggi is 30rs");
}
public static void getMaggi(int quantity) {
	System.out.println("Bill for"+quantity+" normal maggi is "+(quantity* 30)+" rs");
}
public static void getMaggi(String type) {
	System.out.println("Bill for "+type+" normal maggi is 50rs");
}
public static void getMaggi(int quantity,String type) {
	System.out.println("Bill for "+quantity+" "+type+" normal maggi is " +(quantity*50)+" rs");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
getMaggi();
getMaggi(2);
getMaggi("cheese");
getMaggi(2,"Cheese");

	}

}
