package Constructor;

public class Employee {
	//instance variable
String name;
int id;
float salary;
public Employee(String a,int b,float c) {
	//local variable
	name =a;
	id=b;
	salary=c;
}
void introduce() {
	System.out.println("Name :"+name);
	System.out.println("Id :"+id);
	System.out.println("Salary :"+salary);
}
}
