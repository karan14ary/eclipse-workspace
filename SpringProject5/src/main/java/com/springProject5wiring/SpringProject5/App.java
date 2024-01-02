package com.springProject5wiring.SpringProject5;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Trainer tr1=(Trainer)ctx.getBean("train");
        System.out.println(tr1);
        KodnestClasses kc=(KodnestClasses)ctx.getBean("kodclass");
        System.out.println(kc);
    }
}
