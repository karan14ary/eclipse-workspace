package constructorOverloading;

public class Student {
	//Zero-parameterized constructor
public Student() {
	System.out.println("Zero-parameterized constructor");
}
//one-parameterized constructor
public Student(String name) {
	System.out.println("One-parameterized constructor");
}
//Two-parameterized constructor
public Student(String name,int age) {
	System.out.println("Two-parameterized constructor(String ,int)");
}
//Two-parameterized constructor
public Student(int age,String name) {
	System.out.println("Two-parameterized constructor(int,String)");	
}
//Three-parameterized constructor
public Student(String name,int age,int percentage) {
	System.out.println("Three-parameterized constructor");
}
}
