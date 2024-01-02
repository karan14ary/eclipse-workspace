package com.Encapsuuation.Student;

public class Student {
private int rollNo;
private String name;
private float percentage;
private int age;
public void setStudent(int rollNo,String name,float percentage,int age) {
	this.rollNo=rollNo;
	this.name=name;
	this.percentage=percentage;
	this.age=age;
} 
int getRollNo() {
	return rollNo;
}
String  getName() {
	return name;
}
float getPercentage(){
	return percentage;
}
int getAge() {
	return age;
}

}
