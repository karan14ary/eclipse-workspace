package com.jdbc.cruddynamicprogramming;

import java.sql.*;
import java.util.*;

public class ProgramJDBC {
	static Scanner scan=new Scanner(System.in);
	public static void create(Connection con)
	{ 
		System.out.println("Enter the table name");
		String tablename=scan.next();
		String query="Create table "+tablename+" (id int, name varchar(20))";
		try {
			Statement st=con.createStatement();
			st.execute(query);
			System.out.println("Table Created");
		} 
		catch (Exception e) {
		
			e.printStackTrace();
		}
	}
	public static void read(Connection con)
	{
	  showTable(con);
		System.out.println("Enter the table name from which data to be retrieved");
		String tablename=scan.next();
		String query="select * from "+tablename;
		try {
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		System.out.println("Retrived Data in the table name "+tablename);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
	 } 
	 catch (Exception e) {
		
		e.printStackTrace();
	}
	 
	}

	public static void insert(Connection con)
	{
		 showTable(con);
		System.out.println("Enter the tablename where data to be inserted");
		String tablename=scan.next();
		String query="insert into "+tablename+" values(?,?)";
		try {
			PreparedStatement ps=con.prepareStatement(query);
			System.out.println("Enter the number of row to be inserted");
			int row=scan.nextInt();
			for(int i=1;i<=row;i++) {
				System.out.println("Enter id");
				int id=scan.nextInt();
				System.out.println("Enter name");
				String name=scan.next();
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.addBatch();
			}
			ps.executeBatch();
			System.out.println("Data inserted in table name :"+tablename);
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
	}
	public static void update(Connection con)
	{
		 showTable(con);
		System.out.println("Enter the tablename where data to be updated");
		String tablename=scan.next();
		String query="update "+tablename+" set name=? where id=?";
		try {
			PreparedStatement ps=con.prepareStatement(query);
			System.out.println("Enter the number of row to be updated");
			int row=scan.nextInt();
			for(int i=1;i<=row;i++) {
				System.out.println("Enter id");
				int id=scan.nextInt();
				System.out.println("Enter name");
				String name=scan.next();
				
				ps.setString(1, name);
				ps.setInt(2, id);
				ps.addBatch();
			}
			ps.executeBatch();
			System.out.println("Data updated in table name :"+tablename);
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
	}
	public static void delete(Connection con)
	{
		 showTable(con);
		System.out.println("Enter the tablename from where data to be deleted");
		String tablename=scan.next();
		String query="delete from "+tablename+" where id=?";
		try {
			PreparedStatement ps=con.prepareStatement(query);
			System.out.println("Enter the number of row to be deleted");
			int row=scan.nextInt();
			for(int i=1;i<=row;i++) {
				System.out.println("Enter id");
				int id=scan.nextInt();
				ps.setInt(1, id);
				ps.addBatch();
			}
			ps.executeBatch();
			System.out.println("Data deleted in table name :"+tablename);
		} catch (Exception e) {
		
			e.printStackTrace();
		}	
	}
	public static void showTable(Connection con) {
		String query="show tables";
		 try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			System.out.println("Tables in database");
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
	}
		 catch(Exception e) 
		 {
			 e.printStackTrace();
		 }

	}
	}

