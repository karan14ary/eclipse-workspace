package constructorOverloading;

public class StudentApp {

	public static void main(String[] args) {
		//calling zero-parameterized constructor
		Student s1=new Student ();
		//calling one-parameterized constructor
		Student s2=new Student ("karan");
		//calling two-parameterized constructor
		Student s3=new Student ("Ajay",10);
		//calling two-parameterized constructor
		Student s4=new Student (10,"Rohit");
		//calling three-parameterized constructor
		Student s5=new Student ("Aman",10,84);
		
	}

}
