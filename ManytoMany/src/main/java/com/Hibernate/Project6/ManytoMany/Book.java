package com.Hibernate.Project6.ManytoMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.*;
@Entity
public class Book {
@Id
int b_id;
String b_name;
int b_cost;
@ManyToMany
List<Author>author;
public Book() {
	
}
public Book(int b_id, String b_name, int b_cost, List<Author> author) {
	super();
	this.b_id = b_id;
	this.b_name = b_name;
	this.b_cost = b_cost;
	this.author = author;
}
public int getB_id() {
	return b_id;
}
public void setB_id(int b_id) {
	this.b_id = b_id;
}
public String getB_name() {
	return b_name;
}
public void setB_name(String b_name) {
	this.b_name = b_name;
}
public int getB_cost() {
	return b_cost;
}
public void setB_cost(int b_cost) {
	this.b_cost = b_cost;
}
public List<Author> getAuthor() {
	return author;
}
public void setAuthor(List<Author> author) {
	this.author = author;
}


}
