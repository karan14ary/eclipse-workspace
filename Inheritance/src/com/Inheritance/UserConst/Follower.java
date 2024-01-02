package com.Inheritance.UserConst;

public class Follower extends User {
	public Follower(String name,int age) {
		super(name,age);
		this.name=name;
		this.age=age;
	}
	void manageFollower() {
		System.out.println(name+" is a follower.");
	}

}
