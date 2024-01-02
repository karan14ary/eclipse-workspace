package com.Hibernate.Project1.HibernateProject1WithMaven;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student2 
{
	@Id
	int rollno;
	String name;
	int age;
	public Student2()
	{

	}
	public Student2(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}



}
