package SolutionForShoadowingProblem;
//using this keyword
public class Student {
	String name;
	int age;
	float percentage;
	String gender;
	int rollNo;
	public Student(String name,int age,float percentage,String gender,int rollNo) {
		this.name=name;
		this.age=age;
		this.percentage=percentage;
		this.gender=gender;
		this.rollNo=rollNo;
	}
	 void study() {
		System.out.println(name+" is studying java");
	}
}
