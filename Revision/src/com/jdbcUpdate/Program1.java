package com.jdbcUpdate;
import java.util.*;
import java.sql.*;
public class Program1 {

	public static void main(String[] args) {
		Connection con=null;
		Scanner scan=null;
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/revision";
		String uname="root";
		String pass="root";
		String query="update employee set salary=(salary+salary * 0.1) where id =?";
		scan=new Scanner(System.in);
		System.out.println("Enter the id of employee whose salary is to be updated");
		int id=scan.nextInt();
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url, uname, pass);
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, id);
			ps.executeUpdate();
			System.out.println("Data updated");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
				scan.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}

}
