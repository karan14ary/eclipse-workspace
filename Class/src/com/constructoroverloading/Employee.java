package com.constructoroverloading;

public class Employee {
String name;
int age;
int id;
float salary;
String city;
public Employee(String name, int age, int id, float salary) {
	this.name = name;
	this.age = age;
	this.id = id;
	this.salary = salary;
}
public Employee(String name, int age, int id, float salary,String city) {
	this.name = name;
	this.age = age;
	this.id = id;
	this.salary = salary;
	this.city=city;
}
void detail() {
	System.out.println("name :"+name);
	System.out.println("age :"+age);
	System.out.println("salary :"+salary);
	System.out.println("id :"+id);
	System.out.println("city :"+city);
}

}
