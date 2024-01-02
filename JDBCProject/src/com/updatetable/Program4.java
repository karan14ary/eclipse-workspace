package com.updatetable;
import java.sql.*;
public class Program4 {
	public static void main(String[] args) {
		
		try {
			String url="jdbc:mysql://localhost:3306/jdbc_database";
			String uname="root";
			String pass="root";
			String query="Update student set name='ANKIT' Where name='AJAY'";
			//Establishing connection
			Connection con =DriverManager.getConnection(url, uname, pass);
			System.out.println("Connection established");
			//Creating statement
			Statement s1=con.createStatement();
			//executing statement
			s1.executeUpdate(query);
			System.out.println("Data updated");
		} 
		catch (Exception e)
		{
			
			e.printStackTrace();
		}
		
		
		
	}

}
