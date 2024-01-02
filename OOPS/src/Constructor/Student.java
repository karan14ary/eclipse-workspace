package Constructor;

public class Student {
	//instnce variable
	String name;
	int age;
	float percentage;
	String gender;
	int rollNo;
	public Student(String a,int b,float c,String d,int e) {
		//local variable
		name=a;
		age=b;
		percentage=c;
		gender=d;
		rollNo=e;
	}
	  void study() {
		System.out.println(name+" is studying java");
	}
}
