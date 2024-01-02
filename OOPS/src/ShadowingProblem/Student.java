package ShadowingProblem;
/*Accoring to the convention in java if any local variable is created for 
assigning the value to the instance variable the name must be same but if
the name of local variable is same as instance variable then the assignment
will not happen and instance variable will have the values as a default values 
*/
public class Student {
	String name;
	int age;
	float percentage;
	String gender;
	int rollNo;
	public Student(String name,int age,float percentage,String gender,int rollNo) {
		name=name;
		age=age;
		percentage=percentage;
		gender=gender;
		rollNo=rollNo;
	}
	 void study() {
		System.out.println(name+" is studying java");
	}
}
