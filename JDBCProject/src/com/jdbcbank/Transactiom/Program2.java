package com.jdbcbank.Transactiom;

import java.sql.*;
import java.util.Scanner;

public class Program2 {

	public static void sendMoney(Connection con,String query,PreparedStatement ps,int amount) throws SQLException {



	}
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/jdbc_database";
		String uname="root";
		String pass="root";
		Connection con=null;
		Scanner scan=null;
		Statement st=null;
		ResultSet rs=null;
		PreparedStatement ps1=null;
		PreparedStatement ps2=null;
		int amount=0;
		String query=null;
		String query1=null;
		String query2=null;
		try {
			scan=new Scanner(System.in);
			con=DriverManager.getConnection(url, uname, pass);
			System.out.println("Connection Established");
			System.out.println("Enter the amount of money to be transferred");
			amount=scan.nextInt();
			query1="update bank set balance= balance-? where AccNo=11";
			ps1=con.prepareStatement(query1);
			ps1.setInt(1, amount);
			ps1.executeUpdate();
			System.out.println("Money Debited");
			query2="update bank set balance=balance+? where AccNo=33";
			ps2=con.prepareStatement(query2);
			ps2.setInt(1, amount);
			ps2.executeUpdate();
			System.out.println("Money Credited");

			st=con.createStatement();
			rs=st.executeQuery("select * from bank");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				scan.close();
				con.close();
				rs.close();
				st.close();
				ps1.close();
				ps2.close();
				System.out.println("Disconnected");

			}
			catch(Exception e) 
			{
				e.printStackTrace();
			}
		}


	}


}
