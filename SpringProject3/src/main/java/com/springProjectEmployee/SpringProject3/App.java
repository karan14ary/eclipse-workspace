package com.springProjectEmployee.SpringProject3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
    Employee e1=(Employee)ctx.getBean("emp1");
    System.out.println(e1);
    Employee e2=(Employee)ctx.getBean("emp2");
    System.out.println(e2);
    Employee e3=(Employee)ctx.getBean("emp3");
    System.out.println(e3);
    Employee e4=(Employee)ctx.getBean("emp4");
    System.out.println(e4);
    }
}
