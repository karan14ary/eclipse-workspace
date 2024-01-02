package CreatingObject;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s=new Student();
Student s1=new Student();
s.name="Rohit";
s.age=22;
s.rollNo=10;
s.introduce();
s.study();
s1.name="Karan";
s1.age=21;
s1.rollNo=1;
s1.introduce();
s1.study();
	}

}
