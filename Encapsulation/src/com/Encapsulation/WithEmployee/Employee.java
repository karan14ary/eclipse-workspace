package com.Encapsulation.WithEmployee;

public class Employee {
private int id;
private String name;
private int salary;

public void setEmpInfo(int id,String name,int salary) {
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
int getSalary() {
	return salary;
}

}


