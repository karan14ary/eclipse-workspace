package com.jdbcbank.Transactiom;
import java.util.*;
import java.sql.*;
public class Program {
   public static void sendMoney(Connection con,String query,PreparedStatement ps,int amount) throws SQLException {

	   query="update bank set balance= balance-? where AccNo=11";
	   ps=con.prepareStatement(query);
	   ps.setInt(1, amount);
	   ps.executeUpdate();
	   System.out.println("Money Debited");
	   
   }
   public static void receiveMoney(Connection con,String query,PreparedStatement ps,int amount) throws SQLException {
	   query="update bank set balance=balance+? where AccNo=33";
	   ps=con.prepareStatement(query);
	   ps.setInt(1, amount);
	   ps.executeUpdate();
	   System.out.println("Money Credited");
   }
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/jdbc_database";
		String uname="root";
		String pass="root";
		Connection con=null;
		Scanner scan=null;
		Statement st=null;
		ResultSet rs=null;
		PreparedStatement ps=null;
		int amount=0;
		String query=null;
		try {
			scan=new Scanner(System.in);
			con=DriverManager.getConnection(url, uname, pass);
			System.out.println("Connection Established");
			System.out.println("Enter the amount of money to be transferred");
			amount=scan.nextInt();
			
			sendMoney(con,query,ps,amount);
			receiveMoney(con,query,ps,amount);
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
				System.out.println("Disconnected");
				
			}
			catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
		

	}

}
