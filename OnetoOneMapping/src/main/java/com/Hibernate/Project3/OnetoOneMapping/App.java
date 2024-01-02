package com.Hibernate.Project3.OnetoOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args )
	{
		Bike1 bk1=new Bike1(001,"Hero","Black");
		Bike1 bk2=new Bike1(002,"KTM","Red");
		Bike1 bk3=new Bike1(003,"Honda","Blue");
		Student1 s1=new Student1(11,"Ajay",24,bk1);
		Student1 s2=new Student1(12,"Amit",25,bk2);
		Student1 s3=new Student1(13,"Anuj",23,bk3);
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		
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
