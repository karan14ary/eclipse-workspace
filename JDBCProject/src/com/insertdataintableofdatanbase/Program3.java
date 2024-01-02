package com.insertdataintableofdatanbase;
import java.sql.*;
public class Program3 {

	public static void main(String[] args) {
		try {
			String url="jdbc:mysql://localhost:3306/jdbc_database";
			String uname="root";
			String pass="root";
			String query="INSERT INTO STUDENT VALUES(1,'KARAN'),(2,'ROHIT'),(3,'AJAY')";
			//establishing connection
			Connection con=DriverManager.getConnection(url, uname, pass);
		    //creating statement
			Statement s1=con.createStatement();
		    //Executing query
			s1.execute(query);
		    System.out.println("Data inserted");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
