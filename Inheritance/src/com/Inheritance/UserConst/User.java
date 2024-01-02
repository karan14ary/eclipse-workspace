package com.Inheritance.UserConst;

public class User {
String name;
int age;
	public User(String name,int age) {
		this.name=name;
		this.age=age;
	}
	void displayInfo() {
		System.out.println("User "+name+ ", Age "+age);
	}
}
