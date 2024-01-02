package com.objectDataInsertion;
import java.sql.*;
public class DBHandler {
public static void insert(Connection con,int rollNo,String name,int age) 
{
	String query="Insert into student1 values(?,?,?)";
	PreparedStatement ps;
	try {
		ps = con.prepareStatement(query);
		ps.setInt(1, rollNo);
		ps.setString(2, name);
		ps.setInt(3, age);
		ps.executeUpdate();
		System.out.println("Data Inserted");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
