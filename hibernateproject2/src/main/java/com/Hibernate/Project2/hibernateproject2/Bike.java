package com.Hibernate.Project2.hibernateproject2;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bike {
	@Id
	int bikeId;
	String brand;
	String color;
	public Bike() {

	}
	public Bike(int bikeId, String brand, String color) {
		super();
		this.bikeId = bikeId;
		this.brand = brand;
		this.color = color;
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

}
