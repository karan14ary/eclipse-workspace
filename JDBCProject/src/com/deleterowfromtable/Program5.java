package com.deleterowfromtable;
import java.sql.*;
public class Program5 {

	public static void main(String[] args) {
		
		try 
		{
			String url="jdbc:mysql://localhost:3306/jdbc_database";
			String uname="root";
			String pass="root";
			String query="delete from student where roll=3";
			//creating connection
			Connection con =DriverManager.getConnection(url, uname, pass);
			//creating statement
			Statement s1=con.createStatement();
			//executing query
			s1.executeUpdate(query);
			System.out.println("Data Deleted");
		} 
		catch (SQLException e)
		{
			
			e.printStackTrace();
		}

	}

}
