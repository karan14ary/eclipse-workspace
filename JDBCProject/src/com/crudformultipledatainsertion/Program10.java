package com.crudformultipledatainsertion;
import java.sql.*;
import java.util.Scanner;

public class Program10 {
	static Scanner scan=new Scanner(System.in);
	public static void insert(Connection con) throws Exception {
		System.out.println("Enter the number of data you want to insert");
		int num=scan.nextInt();
		for(int i=1;i<=num;i++) {
		System.out.println("Enter the id to be inserted for data "+i);
		int id=scan.nextInt();
		System.out.println("Enter the name to be inserted for data "+i);
		String name=scan.next();
		System.out.println("Enter the salary to be inserted for data "+i);
		int salary=scan.nextInt();
		String query="insert into employee values(?,?,?)";
		PreparedStatement ps1=con.prepareStatement(query);
		ps1.setInt(1, id);
		ps1.setString(2, name);
		ps1.setInt(3, salary);
		ps1.executeUpdate();
		System.out.println("Row is inserted");
		}
	}
	public static void update(Connection con) throws Exception {
		System.out.println("Enter the id where the data need to update");
		int idupdate=scan.nextInt();
		System.out.println("Enter the updated sakary");
		int newsalary=scan.nextInt();
		String query="update employee set salary=? where id =?";
		PreparedStatement ps2=con.prepareStatement(query);
		ps2.setInt(2, idupdate);
		ps2.setInt(1, newsalary);
		ps2.executeUpdate();
		System.out.println("Row is updated");
				
		
	}
	public static void delete(Connection con) throws Exception {
		System.out.println("Enter the id where the data need to deleted");
		int iddelete=scan.nextInt();
		String query="delete from employee where id=?";
		PreparedStatement ps3=con.prepareStatement(query);
		ps3.setInt(1, iddelete);
		ps3.executeUpdate();
		System.out.println("Row is deleted");
		
		
	}
	public static void deleteall(Connection con) throws Exception {
		String query="delete from employee";
		Statement ps3=con.createStatement();
		ps3.executeUpdate(query);
		System.out.println("All Row is deleted");
		
		
	}
	public static void selectall(Connection con) throws SQLException {
		String query="select * from employee";
		Statement s1=con.createStatement();
		ResultSet rs=s1.executeQuery(query);
		System.out.println("Data is retrived");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		}
		public static void select(Connection con) throws Exception {
			System.out.println("Enter the id to retrieve the data");
			int idretrieve =scan.nextInt();
			String query="select * from employee where id=?";
			PreparedStatement s1=con.prepareStatement(query);
			s1.setInt(1, idretrieve);
			ResultSet rs=s1.executeQuery();
			System.out.println("Data is retrived");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}

	}
	public static void main(String[] args) throws Exception {
		//values of url,uname,pass for establishing data
		String url="jdbc:mysql://localhost:3306/jdbc_database";
		String uname="root";
		String pass="root";
		//Establishing the connection
		Connection con=DriverManager.getConnection(url, uname, pass);
		System.out.println("Connection established");
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("Enter the 1 for inserting the data");
			System.out.println("Enter the 2 for updateing the data");
			System.out.println("Enter the 3 for deleteing the data");
			System.out.println("Enter the 4 for retrieving all the data");
			System.out.println("Enter the 5 for retrieveing the data accoring to the id");
			System.out.println("Enter the 6 for deleting all data in table");
			System.out.println("Enter any other number for termination");
			int choice=scan.nextInt();
			if(choice==1) {
				insert(con);
			}
			else if(choice==2) {
				update(con);
			}
			else if(choice==3) {
				delete(con);
			}
			else if(choice==4) {
				selectall(con);
			}
			else if(choice==5) {
				select(con);
				
			}
			else if(choice==6) {
				deleteall(con);	
			}
			else {
				System.out.println("Invalid Choice");
				System.exit(0);
			}
		}
	}

}

