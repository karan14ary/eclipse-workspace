package com.retrievedatafromtable;
import java.sql.*;
public class Program6 {

	public static void main(String[] args)throws Exception {
		String url="jdbc:mysql://localhost:3306/jdbc_database";
		String uname="root";
		String pass="root";
		String query="select * from student";
		//Establishing connection
		Connection con=DriverManager.getConnection(url, uname, pass);
		//creating statement
		Statement s1=con.createStatement();
		//execute query
		ResultSet rs=s1.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}

	}

}
