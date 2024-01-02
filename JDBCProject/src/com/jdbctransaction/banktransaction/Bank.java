package com.jdbctransaction.banktransaction;
import java.sql.*;
import java.util.*;
public class Bank {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/jdbc_database";
		String uname="root";
		String pass="root";
		Connection con=null;
		Scanner scan=null;
		int amount=0;
		String query1=null;
		String query2=null;
		try {
			con=DriverManager.getConnection(url, uname, pass);
			System.out.println("Connection Established");
			//Step1 setting the autocomit as false
			con.setAutoCommit(false);
			scan=new Scanner(System.in);
			System.out.println("Enter the amount to be transferred");
			amount=scan.nextInt();
			query1="update bank set balance=balance-? where Accno=11";
			PreparedStatement ps1=con.prepareStatement(query1);
			ps1.setInt(1, amount);
			ps1.executeUpdate();
			System.out.println("Amount debitted");
			query2="update bank set balance=balance+? where Accno=33";
			PreparedStatement ps2=con.prepareStatement(query2);
			ps2.setInt(1, amount);
			ps2.executeUpdate();
			System.out.println("Amount creditted");
			//Step2 Commiting the changes after executing all queries
			con.commit();
		}
		catch(Exception e) {
			try {
				con.rollback();
				//step3 rolling back the changes if any problem happens
				System.out.println("Changes are rolled back");
			} catch (Exception e1) 
			{

			e1.printStackTrace();	
			}
			e.printStackTrace();

		}
		finally {
			try {
				con.close();
				scan.close();
				System.out.println("Disconnected");
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
		}


	}

}
