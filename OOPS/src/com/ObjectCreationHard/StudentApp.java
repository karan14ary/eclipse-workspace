package com.ObjectCreationHard;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        Student s1=new Student(1,"Mohit",22);
        Student s2=new Student(2,"Rohit",24);
        Student s3=new Student(3,"Rohan",20);
        Student []arr=new Student[scan.nextInt()];
        arr[0]=s1;
        arr[1]=s2;
        arr[2]=s3;
        for(Student x:arr) {
        	System.out.println("Id: "+x.id+" Name: "+x.name+" Age: "+x.age);
        }
	}

}
