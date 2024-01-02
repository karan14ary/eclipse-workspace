package SolutionForShoadowingProblem;

public class Employee {
	//instance variable
String name;
int id;
float salary;
public Employee(String name,int id,float salary) {
	//local variable
	this.name =name;
	this.id=id;
	this.salary=salary;
}
void introduce() {
	System.out.println("Name :"+name);
	System.out.println("Id :"+id);
	System.out.println("Salary :"+salary);
}
}
