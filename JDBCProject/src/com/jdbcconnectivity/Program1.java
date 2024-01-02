package com.jdbcconnectivity;
//1.importing java.sql package
import java.sql.*;
public class Program1 {

	public static void main(String[] args) 
	{
		
		try 
		{
			String url="jdbc:mysql://localhost:3306/jdbc_database";
			String uname="root";
			String pass="root";
			//2.Loading the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			//3. Establishing the  connect ion
			Connection con=DriverManager.getConnection(url,uname,pass);
			System.out.println("Connection Established at " +con);
		} 
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}
		

	}

}
