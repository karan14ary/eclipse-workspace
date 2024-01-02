package com.Array.StoreobjectinanArray;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		//creating object of scanner class
		Scanner scan=new Scanner(System.in);
		//Asking number of student object to be created
		System.out.println("Enter the total number of student object to be created");
		//storing to studentNo
		int studentNo=scan.nextInt();
		//creating array of Student type for total studentNo
		Student[]arr=new Student[studentNo];
		//Taking values for the student class datamember and
		//creating the object of student
		for(int i=0;i<=arr.length-1;i++) {
	System.out.println("Enter id for student :"+(i+1));
	int id =scan.nextInt();
	
	System.out.println("Enter name for student :"+(i+1));
	String  name =scan.next();
	
	System.out.println("Enter age for student :"+(i+1));
	int age =scan.nextInt();
	
	//creating the student object  and storing in array
	arr[i]=new Student(id,name,age);
}
		//displaying object of student array elemen t 
for(int i=0;i<=arr.length-1;i++) {
	System.out.print(arr[i].id+"||"+arr[i].name+"||"+arr[i].age+"||");
}
	}

}
