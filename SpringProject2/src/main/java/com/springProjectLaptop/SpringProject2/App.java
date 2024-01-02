package com.springProjectLaptop.SpringProject2;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	 ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
         Laptop lap1=(Laptop)ctx.getBean("lap1");
         System.out.println(lap1);  	
         Laptop lap2=(Laptop)ctx.getBean("lap2");
         System.out.println(lap2);
    
    }
}
