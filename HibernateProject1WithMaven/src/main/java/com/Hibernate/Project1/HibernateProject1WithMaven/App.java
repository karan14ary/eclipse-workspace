package com.Hibernate.Project1.HibernateProject1WithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory factory= cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        Student2 s1 = new Student2(1,"Amit",23);
        session.save(s1);
        transaction.commit();
        System.out.println("Student object is saved");
    }
}
