package com.dynamicuserinputquery;
import java.util.*;
import java.sql.*;

public class Program8 {

	public static void main(String[] args) throws Exception {
		//values of url,uname,pass for establishing connection
		String url="jdbc:mysql://localhost:3306/jdbc_database";
		String uname="root";
		String pass="root";
		//Taking user input for the id,name,salary to be inserted
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter id");
		int id=scan.nextInt();
		System.out.println("Enter name");
		String name=scan.next();
		System.out.println("Enter salary");
		int salary=scan.nextInt();
		//Creating query for dynamic values
		String query="insert into employee values(?,?,?)";
		//Establishing connection
		Connection con=DriverManager.getConnection(url, uname, pass);
		System.out.println("Connection established");
		//preparing the statement
		PreparedStatement ps1= con.prepareStatement(query);
		ps1.setInt(1,id);
		ps1.setString(2, name);
		ps1.setInt(3, salary);
		//executing query
		ps1.executeUpdate();
		System.out.println("Row inserted");
	}

}
