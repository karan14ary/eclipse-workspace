package com.Hibernate.Project6.ManytoMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.*;
@Entity
public class Author {
@Id
int a_id;
String a_name;
String a_location;
@ManyToMany
List<Book>book;
public Author() {
	
}
public Author(int a_id, String a_name, String a_location, List<Book> book) {
	super();
	this.a_id = a_id;
	this.a_name = a_name;
	this.a_location = a_location;
	this.book = book;
}
public int getA_id() {
	return a_id;
}
public void setA_id(int a_id) {
	this.a_id = a_id;
}
public String getA_name() {
	return a_name;
}
public void setA_name(String a_name) {
	this.a_name = a_name;
}
public String getA_location() {
	return a_location;
}
public void setA_location(String a_location) {
	this.a_location = a_location;
}
public List<Book> getBook() {
	return book;
}
public void setBook(List<Book> book) {
	this.book = book;
}

}
