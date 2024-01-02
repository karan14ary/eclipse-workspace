package com.crudOperationwithbatch;

import java.util.Scanner;
import java.sql.*;
public class Program12 {

	public static void main(String[] args) 
	{
	String url="jdbc:mysql://localhost:3306/jdbc_database";
	String uname="root";
	String pass="root";
	String query;
	int row;
	Scanner scan=null;
	Connection con=null;
	PreparedStatement ps=null;
	int id;
	String name;
	int salary;
	try {
		//Establishing the connection
		con=DriverManager.getConnection(url, uname, pass);
		System.out.println("Connection Established");
		query="Insert into employee values(?,?,?)";//creating query
		ps=con.prepareStatement(query);//preparing statement
		scan=new Scanner(System.in);
		System.out.println("Enter the number of rows to be inserted");
		row=scan.nextInt();
		for(int i=1;i<=row;i++) 
		{//asking user input and adding to batch
			System.out.println("Enter id");
			id=scan.nextInt();
			System.out.println("Enter name");
			name=scan.next();
			System.out.println("Enter salary");
			salary=scan.nextInt();
			ps.setInt(1, id);//completing the query
			ps.setString(2, name);
			ps.setInt(3,salary);
			ps.addBatch();//adding to batch
		}
		//Executing batch
		ps.executeBatch();
		System.out.println("Rows Inserted");
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		try {
			scan.close();
			con.close();
			ps.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	}

}
