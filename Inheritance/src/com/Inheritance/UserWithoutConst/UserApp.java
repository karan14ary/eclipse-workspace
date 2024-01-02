package com.Inheritance.UserWithoutConst;

import java.util.Scanner;

public class UserApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
switch(n) {
case 1:{
	Friend f=new Friend();
	f.name=scan.next();
	f.age=scan.nextInt();
	System.out.println("Friend Information:");
	f.displayInfo();
	f.manageFriend();
	break;
}
case 2:{
	Follower fl=new Follower();
	fl.name=scan.next();
	fl.age=scan.nextInt();
	System.out.println("Follower Information:");
	fl.displayInfo();
	fl.manageFollower();
	break;
}
}	
}
}
