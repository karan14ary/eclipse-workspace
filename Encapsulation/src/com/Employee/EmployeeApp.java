package com.Employee;

import java.util.Scanner;

public class EmployeeApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Employee e=new Employee(scan.nextInt(),scan.next(),scan.nextDouble());
		System.out.println("Employee Detail");
		e.employeeInfo();

	}

}
