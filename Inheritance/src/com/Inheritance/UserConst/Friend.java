package com.Inheritance.UserConst;

public class Friend extends User{
public Friend(String name,int age) {
	super(name,age);
this.name=name;
this.age=age;
}
	void manageFrend() {
		System.out.println(name+" is a Friend.");
	}

}
