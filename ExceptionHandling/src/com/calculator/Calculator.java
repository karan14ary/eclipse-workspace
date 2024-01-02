	package com.calculator;
	
	public class Calculator 
	{
	static void add(int a,int b) 
	{
		System.out.println("Addition started");
	int c=a+b;
	System.out.println("The addition result is "+c);
	System.out.println("Addition ended");
	}
	static void sub(int a,int b) 
	{
		try 
		{
			System.out.println("Subtratction started");
		int s=a-b;
		System.out.println("The subtraction result is "+s);
		}
		catch(Exception e) {
			System.out.println("Exception is handled in sub method");
		}
		finally {
			System.out.println("Subtraction ended");
		}
	}
	static void mul(int a,int b) throws Exception 
	{
		System.out.println("Multiplication started");
		int m=a*b;
		System.out.println("The multiplication result is "+m);
		System.out.println("Multiplication ended");
	}
	static void div(int a,int b)  throws Exception 
	{
	try 
	{
		System.out.println("Division started");
		int q=a/b;
		System.out.println("The division result is "+q);
	}	
	catch(Exception e) 
	{
		System.out.println("Exception is handled in div");
		throw e;
	}
		finally {
			System.out.println("Division ended");
		}
	}
	
	}
