package WithoutInheritance;

public class DoctorRobot {
	String name;
	void talk() {
		System.out.println(name+" is talking");
	}
	void walk() {
		System.out.println(name+ " is walking");
	}
	void charge() {
		System.out.println(name +" is able to charge");
	}
	void surgery() {
		System.out.println(name +" is doing surgery");
	}
}
