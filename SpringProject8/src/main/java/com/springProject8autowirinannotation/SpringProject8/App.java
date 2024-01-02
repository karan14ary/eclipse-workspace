package com.springProject8autowirinannotation.SpringProject8;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        University u1=(University)ctx.getBean("university");
        System.out.println(u1);
        Car c1=(Car)ctx.getBean("car");
       System.out.println(c1);
    
    }
    
}
