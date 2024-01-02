package com.Hibernate.Project3.OnetoOneMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student1 {
	@Id
	int rollno;
	String name;
	int age;
	@OneToOne
	Bike1 bike;
	public Student1() {
	}
	public Student1(int rollno, String name, int age, Bike1 bike) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.bike = bike;
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
	public Bike1 getBike() {
		return bike;
	}
	public void setBike(Bike1 bike) {
		this.bike = bike;
	}
	


}
