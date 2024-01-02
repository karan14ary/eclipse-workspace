package com.Crudhib.Crud;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop {
@Id
int l_id;
String l_brand;
int l_cost;
public Laptop() {
	
}
public Laptop(int l_id, String l_brand, int l_cost) {
	this.l_id = l_id;
	this.l_brand = l_brand;
	this.l_cost = l_cost;
}

@Override
public String toString() {
	return "Laptop [l_id=" + l_id + ", l_brand=" + l_brand + ", l_cost=" + l_cost + "]";
}
public int getL_id() {
	return l_id;
}
public void setL_id(int l_id) {
	this.l_id = l_id;
}
public String getL_brand() {
	return l_brand;
}
public void setL_brand(String l_brand) {
	this.l_brand = l_brand;
}
public int getL_cost() {
	return l_cost;
}
public void setL_cost(int l_cost) {
	this.l_cost = l_cost;
}


}
