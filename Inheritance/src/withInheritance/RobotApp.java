package withInheritance;
public class RobotApp {
	public static void main(String[] args) {
		TeacherRobot tr=new TeacherRobot();
		tr.name="TeacherRobot";
		tr.talk();
		tr.walk();
		tr.charge();
		tr.teach();
		ChefRobot cr=new ChefRobot();
		cr.name="ChefRobot";
		cr.talk();
		cr.walk();
		cr.charge();
		cr.cook();
		
		DoctorRobot dr=new DoctorRobot();
		dr.name="DoctorRobot";
		dr.talk();
		dr.walk();
		dr.charge();
		dr.surgery();


	}

}
