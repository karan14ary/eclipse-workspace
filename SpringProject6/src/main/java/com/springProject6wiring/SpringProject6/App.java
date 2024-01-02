package com.springProject6wiring.SpringProject6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
    	Mobile m1=(Mobile)ctx.getBean("mob1");
    	System.out.println(m1);
    	Mobile m2=(Mobile)ctx.getBean("mob");
    	System.out.println(m2);
    	Person p1=(Person)ctx.getBean("person");
    	System.out.println(p1);
  
    }
}
