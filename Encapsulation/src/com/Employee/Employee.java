package com.Employee;

public class Employee {
private int id;
private String name;
private double salary;
private String teamName;
public Employee(int id,String name,double salary) {
	this.id=id;
	this.name=name;
	this.salary=salary;
}
int getId() {
	return id;
}
String getName() {
	return name;
}
double getSalary() {
	return salary;
}
void employeeInfo() {
	System.out.println("Id:"+id);
	System.out.println("Name: "+name);
	System.out.println("Salary: "+salary);
	if(id>=1&&id<=50) {
		teamName="Team-A";
		System.out.println("TeamName: "+teamName);
	}
	else {
		teamName="Team-B";
		System.out.println("TeamName: "+teamName);
	}
}
}
