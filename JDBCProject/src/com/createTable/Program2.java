package com.createTable;
import java.sql.*;
public class Program2 {

	public static void main(String[] args) {
		try 
		{
			String url="jdbc:mysql://localhost:3306/jdbc_database";
			String uname="root";
			String pass="root";
			String query="CREATE TABLE STUDENT(ROLL INT PRIMARY KEY,NAME VARCHAR(10))";
		//loading the driver is optional for mysql database	
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
		//establishing the connection
			Connection con=DriverManager.getConnection(url, uname, pass);
			System.out.println("Connection established");
			//creating statement
			Statement s1=con.createStatement();
			s1.execute(query);
			System.out.println("Table Created successfully");
		} 
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}

	}

}
