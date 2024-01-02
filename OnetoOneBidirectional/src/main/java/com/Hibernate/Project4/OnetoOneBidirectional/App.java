package com.Hibernate.Project4.OnetoOneBidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args )
	{
		Bike2 bk1=new Bike2();
		Bike2 bk2=new Bike2();
		Bike2 bk3=new Bike2();
		Student2 s1=new Student2(11,"Ajay",24,bk1);
		Student2 s2=new Student2(12,"Amit",25,bk2);
		Student2 s3=new Student2(13,"Anuj",23,bk3);
		bk1.setBikeId(001);
		bk1.setBrand("Hero");
		bk1.setColor("Black");
		bk1.setStudent(s1);
		bk2.setBikeId(002);
		bk2.setBrand("Ktm");
		bk2.setColor("Red");
		bk2.setStudent(s2);
		bk3.setBikeId(003);
		bk3.setBrand("Honda");
		bk3.setColor("Blue");
		bk3.setStudent(s3);
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
