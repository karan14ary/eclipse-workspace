package com.Hibernate.Project9.SpringApp;

public class JavaTrainer implements Trainer 
{
	private String subject="Java";
	@Override
	public void teach() {
		System.out.println("Java trainer is teaching "+subject);
	}
	@Override
	public void takeAttendance() {
		System.out.println("Java Trainer is taking attendance of "+subject);
	}
}
