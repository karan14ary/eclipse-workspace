package com.jdbc.cruddynamicprogramming;
import java.sql.*;
import java.util.*;
public class ProgramJDBCApp {

	public static void main(String[] args) 
	{
	String url="jdbc:mysql://localhost:3306/jdbc_database";
	String uname="root";
	String pass="root";
	Scanner scan=new Scanner (System.in);
	Connection con=null;
	try {
		con =DriverManager.getConnection(url, uname, pass);
		System.out.println("Database Connected");
		while(true) {
			System.out.println("Enter 1 to create table");
			System.out.println("Enter 2 to read table and data inside table");
			System.out.println("Enter 3 to insert data");
			System.out.println("Enter 4 to update table");
			System.out.println("Enter 5 to delete table");
			int choice=scan.nextInt();
			switch(choice) {
			case 1:{
				ProgramJDBC.create(con);
				break;
			}
			case 2:{
				ProgramJDBC.read(con);
				break;
			}
			case 3:{
				ProgramJDBC.insert(con);
				break;
			}
			case 4:{
				ProgramJDBC.update(con);
				break;
			}
			case 5:{
				ProgramJDBC.delete(con);
				break;
			}
			default:{
				System.out.println("Invalid choice");
				System.exit(0);
			}
			
			}
		}
	} 
	catch (Exception e)
	{
		e.printStackTrace();
	}
	finally {
		try {
			con.close();
			scan.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	}

}
