package com.Hibernate.Project5.ManytoOneorOnetoMany;

import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	//Creating object of configuration class
    	Configuration cfg= new Configuration();
        //invoking configure()
    	cfg.configure();
        //Building SessionFactory
        SessionFactory factory = cfg.buildSessionFactory();
        //opening the session
        Session session = factory.openSession();
        //Beginning the transcation
        Transaction transaction = session.beginTransaction();
        //Creating  2 Arraylists to store products
    	ArrayList <Product>al1=new ArrayList<>();
    	ArrayList <Product>al2=new ArrayList<>();
    	//Creating objects of Customer class and calling parameterized constructor
    	Customer c1=new Customer(11,"Ankit",23,al1);
    	Customer c2=new Customer(12,"Ajay",25,al2);
    	//Creating object of products
    	Product p1=new Product();
    	Product p2=new Product();
    	Product p3=new Product();
    	Product p4=new Product();
    	//adding product to al1 and al2 
    	al1.add(p1);
    	al1.add(p2);
    	al2.add(p3);
    	al2.add(p4);
    	//Setting the value of the Products dataMember  of different product objects 
    	p1.setP_Id(1111);
    	p1.setP_Name("watch");
    	p1.setP_Cost(4500);
    	p1.setCst(c1);
    	p2.setP_Id(2222);
    	p2.setP_Name("mobile");
    	p2.setP_Cost(25000);
    	p2.setCst(c1);
    	p3.setP_Id(3333);
    	p3.setP_Name("laptop");
    	p3.setP_Cost(85000);
    	p3.setCst(c2);
    	p4.setP_Id(4444);
    	p4.setP_Name("bike");
    	p4.setP_Cost(120000);
    	p4.setCst(c2);
        //Saving the session
        session.save(c1);
        session.save(c2);
        session.save(p1);
        session.save(p2);
        session.save(p3);
        session.save(p4);
        //comit the transaction
        transaction.commit();
        System.out.println("Object saved");
    }
}
