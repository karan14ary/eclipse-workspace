package com.Inheritance.Student;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
     Student s1=new Student(scan.next(),scan.nextInt(),scan.next(),scan.nextInt());
     Student s2=new Student(scan.next(),scan.nextInt(),scan.next(),scan.nextInt());
     System.out.println("Student s1: ");
     s1.StudentInfo();
//     System.out.println("Name: "+   s1.getName());
//		System.out.println("Age: "+s1.getAge());
//		System.out.println("Gender: "+s1.getGender());
//		System.out.println("Marks: "+s1.getMarks());
    
     System.out.println("Student s2: ");
     s2.StudentInfo();
//     System.out.println("Name: "+   s2.getName());
//		System.out.println("Age: "+s2.getAge());
//		System.out.println("Gender: "+s2.getGender());
//		System.out.println("Marks: "+s2.getMarks());

	}
	

}
