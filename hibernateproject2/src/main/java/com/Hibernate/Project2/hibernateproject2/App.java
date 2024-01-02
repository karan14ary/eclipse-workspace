package com.Hibernate.Project2.hibernateproject2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args )
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		Student s1=new Student(11,"Ajay",24);
		Student s2=new Student(12,"Amit",25);
		Student s3=new Student(13,"Anuj",23);
		Bike bk1=new Bike(001,"Hero","Black");
		Bike bk2=new Bike(002,"KTM","Red");
		Bike bk3=new Bike(003,"Honda","Blue");
		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(bk1);
		session.save(bk2);
		session.save(bk3);
		trans.commit();
		System.out.println("Hibernate is working properly");
		System.out.println("Student object saved in database ");
		System.out.println("Bike object saved in database ");
		
		
	}
}
