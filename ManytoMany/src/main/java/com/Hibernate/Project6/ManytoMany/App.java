package com.Hibernate.Project6.ManytoMany;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	List <Author>l1=new ArrayList<>();
    	List <Author>l2=new ArrayList<>();
    	List <Book>l3=new ArrayList<>();
    	List <Book>l4=new ArrayList<>();
    	List <Book>l5=new ArrayList<>();
    	List <Book>l6=new ArrayList<>();
    	Book b1=new Book(1,"Java",1500,l1);
    	Book b2=new Book(2,"SQL",1000,l1);
    	Book b3=new Book(3,"Web",700,l2);
    	Book b4=new Book(4,"React",600,l1);
    	Book b5=new Book(5,"SE",900,l2);
    	Book b6=new Book(6,"DSA",3000,l1);
    	Book b7=new Book(7,"Python",1200,l1);
    	Book b8=new Book(8,"C#",300,l2);
    	Author a1=new Author(1,"Aditiya","Banglore",l3);
    	Author a2=new Author(2,"Mohan","Delhi",l4);
    	Author a3=new Author(3,"Rajan","Pune",l5);
    	Author a4=new Author(4,"Rohan","Mumbai",l6);
    	l1.add(a1);
    	l1.add(a3);
    	l1.add(a2);
    	l2.add(a2);
    	l2.add(a3);
    	l2.add(a4);
    	l3.add(b1);
    	l3.add(b2);
    	l6.add(b3);
    	l3.add(b4);
    	l4.add(b4);
    	l5.add(b4);
    	l4.add(b5);
    	l5.add(b5);
    	l6.add(b6);
    	l4.add(b6);
    	l4.add(b7);
    	l6.add(b7);
    	l5.add(b8);
    	l4.add(b8);
    	l6.add(b7);
    	l5.add(b8);
      Configuration cfg = new Configuration();
      cfg.configure();
      SessionFactory factory = cfg.buildSessionFactory();
      Session session = factory.openSession();
      Transaction transaction = session.beginTransaction();
      session.save(a1);
      session.save(a2);
      session.save(a3);
      session.save(a4);
      session.save(b1);
      session.save(b2);
      session.save(b3);
      session.save(b4);
      session.save(b5);
      session.save(b6);
      session.save(b7);
      session.save(b8);
      
      transaction.commit();
      System.out.println("Object saved");
    }
}
