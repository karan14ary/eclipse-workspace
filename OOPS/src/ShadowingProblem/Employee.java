package ShadowingProblem;

public class Employee {
	//instance variable
String name;
int id;
float salary;
public Employee(String name,int id,float salary) {
	//local variable
	name =name;
	id=id;
	salary=salary;
}
void introduce() {
	System.out.println("Name :"+name);
	System.out.println("Id :"+id);
	System.out.println("Salary :"+salary);
}
}
