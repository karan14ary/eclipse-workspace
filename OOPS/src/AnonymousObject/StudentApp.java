package AnonymousObject;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student s1=new Student();
	s1.name="Karan";
	s1.age=22;
	s1.gender="Male";
	s1.rollNo=1;
	s1.percentage=87.6f;
	s1.study();
	new Student().study();
	}

}
