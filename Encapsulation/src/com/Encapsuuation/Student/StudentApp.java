package com.Encapsuuation.Student;

public class StudentApp {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setStudent(1, "Ram", 87.54f, 24);
		Student s2=new Student();
        s2.setStudent(2, "Shyam", 84.6f, 20);
        System.out.println(s1.getRollNo());
        System.out.println(s1.getName());
        System.out.println(s1.getPercentage());
        System.out.println(s1.getAge());
        System.out.println(s2.getRollNo());
        System.out.println(s2.getName());
        System.out.println(s2.getPercentage());
        System.out.println(s2.getAge());
	}

}
