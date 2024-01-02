package com.springProject1Employee.SpringProject4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
         Employee e=(Employee)ctx.getBean("emp");
         System.out.println(e);
    }
}
