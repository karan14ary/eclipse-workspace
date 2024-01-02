package com.Hibernate.Project4.OnetoOneBidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student2 {
	@Id
	int rollno;
	String name;
	int age;
	@OneToOne
	Bike2 bike;
	public Student2() {
	}
	public Student2(int rollno, String name, int age, Bike2 bike) {
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
	public Bike2 getBike() {
		return bike;
	}
	public void setBike(Bike2 bike) {
		this.bike = bike;
	}



}
