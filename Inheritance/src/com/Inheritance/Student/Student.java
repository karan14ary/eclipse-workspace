package com.Inheritance.Student;

public class Student {
private String name;
private int age;
private String gender;
private int marks;
public Student(String name,int age,String gender,int marks) {
	this.name=name;
	this.age=age;
	this.gender=gender;
	this.marks=marks;
}
String getName() {
	return name;
}
int getAge() {
	return age;
}
String getGender() {
	return gender;
}
int getMarks() {
	return marks;
}
void StudentInfo() {
	System.out.println("Name: "+name);
	System.out.println("Age: "+age);
	System.out.println("Gender: "+gender);
	System.out.println("Marks: "+marks);
}
}
