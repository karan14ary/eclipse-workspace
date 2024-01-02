package com.Objectdynamic;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of Students");
		int studentNo=scan.nextInt();
		Student []arr=new Student [studentNo];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter the id for Student "+(i+1));
			int id=scan.nextInt();
			System.out.println("Enter the name of Student "+(i+1));
			String name=scan.next();
			System.out.println("Enter the age of Student "+(i+1));
			int age=scan.nextInt();
			arr[i]=new Student(id,name,age);
		}
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Id "+arr[i].id+" || Name "+arr[i].name+" || Age "+arr[i].age);
		}
	}

}
