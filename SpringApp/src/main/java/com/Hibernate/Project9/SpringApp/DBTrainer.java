package com.Hibernate.Project9.SpringApp;

public class DBTrainer implements Trainer {
	private String subject="DataBase";
	@Override
	public void teach() {
		System.out.println("Database trainer is teaching "+subject);
	}
	@Override
	public void takeAttendance() {
		System.out.println("Database Trainer is taking attendance of "+subject);
	}
}
