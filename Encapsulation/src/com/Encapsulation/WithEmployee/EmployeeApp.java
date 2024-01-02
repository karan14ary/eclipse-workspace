package com.Encapsulation.WithEmployee;

public class EmployeeApp {

	public static void main(String[] args) {
	Employee e1=new Employee();
	e1.setEmpInfo(11, "Karan", 45000);
	System.out.println(e1.getId());
	System.out.println(e1.getName());
	System.out.println(e1.getSalary());
	}

}
