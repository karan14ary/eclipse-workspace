package com.Crudhib.Crud;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Laptop lap1=new Laptop(1,"Dell",65000);
    	Laptop lap2=new Laptop(2,"Apple",165000);
    	while(true) {
    	//creating object of configuration and invoking configure()
        Configuration cfg = new Configuration().configure();
        //building session factory
        SessionFactory factory = cfg.buildSessionFactory();
        //Opening the session
        Session session = factory.openSession();
        //beginning the transcation
        Transaction transaction = session.beginTransaction();
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter 1 to create,2 to retrieve,3 to update ,4 to delete and any other number to exit ");
        int n=scan.nextInt();
        switch(n) {
        case 1:{
        	create(transaction,session,lap1,lap2);
        	break;
        }
        case 2:{
        	read(transaction,session);
        	break;
        }
        case 3:{
        	update(transaction,session);
        	break;
        }
        case 4:{
        	delete(transaction,session);
        	break;
        }
         default:{
        	System.exit(0);
        	break;
        }
         }
        }
    }
    public static void create(Transaction transaction,Session session,Laptop lap1,Laptop lap2) 
    {
    	session.save(lap1);
    	session.save(lap2);
    	transaction.commit();
    	System.out.println("Object created");
    }
 public static void read(Transaction transaction,Session session) 
 {
	 System.out.println("Retrieved data :");
Laptop lap=session.get(Laptop.class, 1);
System.out.println(lap);
Laptop lap2=session.get(Laptop.class, 2);
System.out.println(lap2);
    }
 public static void update(Transaction transaction,Session session) {
 	Laptop lap=session.get(Laptop.class, 2);
	 lap.setL_cost(85000);
 	session.save(lap);
 	transaction.commit();
 	System.out.println("Table updated");
 }
 public static void delete(Transaction transaction,Session session)
 {
	 Laptop lap=session.get(Laptop.class, 2);
 	session.delete(lap);
 	transaction.commit();
 	System.out.println("Table Updated");
 }
}

