package com.employeejdbc;
import java.sql.*;
import java.util.Scanner;
public class Employee {
	//insert method to insert data in employee table
	public static void insert(Statement s1) throws Exception {
	String query= "Insert into employee values(1,'Ajay',35000),(2,'Ankit',45000),(3,'Amit',55000)";
	s1.executeUpdate(query);
	System.out.println("Data Inserted");
	}
	//update method to update data in employee table
	public static void update(Statement s1) throws Exception {
		String query= "update employee set salary=65000 where id=3";
		s1.executeUpdate(query);
		System.out.println("Data updated");
	}
	//delete method to delete data in employee table
	public static void delete(Statement s1) throws Exception {
		String query= "delete from employee where id=3";
		s1.executeUpdate(query);
		System.out.println("Data deleted");
	}
	//select method to retrieve data in employee table
	public static void select(Statement s1) throws Exception {
		String query= "select * from employee";
		ResultSet rs=s1.executeQuery(query);
		System.out.println("Data retrieved");
		//Traversing all the data inside the database
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
	}
	public static void main(String[] args) throws Exception
	{
		Scanner scan=new Scanner (System.in);
		String url="jdbc:mysql://localhost:3306/jdbc_database";
		String uname="root";
		String pass="root";
		//Establishing connection
		Connection con =DriverManager.getConnection(url, uname, pass);
		System.out.println("Connection Established");
		//Creating statement
		Statement s1= con.createStatement();
		while(true) {
		System.out.println("Enter the 1 to Insert Data in a table");
		System.out.println("Enter the 2 to Update Data in a table");
		System.out.println("Enter the 3 to Delete Data in a table");
		System.out.println("Enter the 4 to Retrieve Data in a table");
		System.out.println("Enter any other number to Terminate");
		int choice=scan.nextInt();
			//Executing the queries
			if(choice==1) 
			{
				insert(s1);
			}
			else if(choice==2) {
				update(s1);
			}
			else if(choice==3)
			{
				delete(s1);
			}
			else if(choice==4) {
				select(s1);
			}
			else {
				System.out.println("Invalid choice");
				break;
			}
		}
		scan.close();
	}

}
