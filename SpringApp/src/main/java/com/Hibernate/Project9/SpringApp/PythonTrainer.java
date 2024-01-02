package com.Hibernate.Project9.SpringApp;

public class PythonTrainer  implements Trainer{
	private String subject="Python";
	@Override
	public void teach() {
		System.out.println("Python trainer is teaching "+subject);
	}
	@Override
	public void takeAttendance() {
		System.out.println("Python Trainer is taking attendance of "+subject);
	}
}
