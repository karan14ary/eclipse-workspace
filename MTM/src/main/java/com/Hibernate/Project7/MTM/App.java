package com.Hibernate.Project7.MTM;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	//Creating lists for storing the groups of employee 
    	List <Employee> l1=new ArrayList<>();
    	List <Employee> l2=new ArrayList<>();
    	List <Employee> l3=new ArrayList<>();
    	List <Employee> l4=new ArrayList<>();
    	//Creating lists for storing the groups of technologies 
    	List <Technology> t1=new ArrayList<>();
    	List <Technology> t2=new ArrayList<>();
    	List <Technology> t3=new ArrayList<>();
    	List <Technology> t4=new ArrayList<>();
  //Creating objects of Employees
    	Employee e1=new Employee(11,"Prakash","Team-A",t1);
    	Employee e2=new Employee(12,"Praven","Team-B",t2);
    	Employee e3=new Employee(13,"Pooja","Team-C",t3);
    	
    	Employee e4=new Employee(14,"Priya","Team-A",t2);
    	Employee e5=new Employee(15,"Pratek","Team-B",t4);
    	//creating objects of Technology
    	Technology te1=new Technology(123,"Java",l1);
    	Technology te2=new Technology(124,"MySql",l2);
    	Technology te3=new Technology(125,"Python",l3);
    	Technology te4=new Technology(126,"React",l4);
    	//adding the employee group in list of employee
    	//and adding technology group in the list of technology
    	l1.add(e1);
    	l1.add(e3);
    	l1.add(e5);
    	l2.add(e1);
    	l2.add(e2);
    	l2.add(e4);
    	l2.add(e5);
    	l3.add(e2);
    	l3.add(e4);
    	l3.add(e5);
    	l4.add(e1);
    	l4.add(e2);
    	l4.add(e3);
    	l4.add(e4);
    	l4.add(e5);
    	t1.add(te1);
    	t1.add(te2);
    	t1.add(te4);
    	t2.add(te2);
    	t2.add(te3);
    	t2.add(te4);
    	t3.add(te1);
    	t3.add(te4);
    	t4.add(te1);
    	t4.add(te2);
    	t4.add(te3);
    	t4.add(te4);
    //creating object of configuration and invoking configure()
        Configuration cfg = new Configuration().configure();
        //building session factory
        SessionFactory factory = cfg.buildSessionFactory();
        //Opening the session
        Session session = factory.openSession();
        //beginning the transcation
        Transaction transaction = session.beginTransaction();
        //Saving the sessions
        session.save(e1);
        session.save(e2);
        session.save(e3);
        session.save(e4);
        session.save(e5);
        session.save(te1);
        session.save(te2);
        session.save(te3);
        session.save(te4);
        //commiting the transcations
        transaction.commit();
        System.out.println("Objects are saved");
    }
}