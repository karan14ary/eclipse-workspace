package com.Hibernate.Project4.OnetoOneBidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Bike2 {
	@Id
	int bikeId;
	String brand;
	String color;
	@OneToOne
	Student2 student;
	public Bike2() {

	}
	public Bike2(int bikeId, String brand, String color, Student2 student) {
		this.bikeId = bikeId;
		this.brand = brand;
		this.color = color;
		this.student = student;
	}
	public int getBikeId() {
		return bikeId;
	}
	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Student2 getStudent() {
		return student;
	}
	public void setStudent(Student2 student) {
		this.student = student;
	}


}
