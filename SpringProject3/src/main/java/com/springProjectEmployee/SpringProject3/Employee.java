package com.springProjectEmployee.SpringProject3;

public class Employee {
int e_id;
String e_name;
int salary;
public Employee() {
	
}
public Employee(int e_id, String e_name, int salary) {
	this.e_id = e_id;
	this.e_name = e_name;
	this.salary = salary;
}
public int getE_id() {
	return e_id;
}
public void setE_id(int e_id) {
	this.e_id = e_id;
}
public String getE_name() {
	return e_name;
}
public void setE_name(String e_name) {
	this.e_name = e_name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [e_id=" + e_id + ", e_name=" + e_name + ", salary=" + salary + "]";
}

}
