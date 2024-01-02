package com.jdbc.crudmultiple.insertdeleteupdate;
import java.sql.*;
import java.util.*;
public class Program11 
{
	//Creating object of Scanner class
	static Scanner scan=new Scanner(System.in);
	//Method to insert the multiple data in a table
	public static void insert(Connection con) throws Exception {
		System.out.println("Enter the rows to be inserted");
		int rowinsert=scan.nextInt();
		for(int i=1;i<=rowinsert;i++) {
			System.out.println("Enter id to be inserted in row "+i);
			int id=scan.nextInt();
			System.out.println("Enter the name to be inserted in row "+i);
			String name=scan.next();
			System.out.println("Enter the salary to be inserted in row "+i);
			int salary=scan.nextInt();
			String query="insert into employee value(?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, salary);
			ps.executeUpdate();
			System.out.println("Row inserted");

		}
	}
	//Method for updating the data having different id
	public static void update(Connection con) throws Exception {
		System.out.println("Enter the rows to be updated");
		int rowinsert=scan.nextInt();
		for(int i=1;i<=rowinsert;i++) {
			System.out.println("Enter id to be updated in row ");
			int id=scan.nextInt();
			System.out.println("Enter the salary to be updated in row ");
			int salary=scan.nextInt();
			String query="update employee set salary=? where id=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, salary);
			ps.setInt(2, id);
			ps.executeUpdate();
			System.out.println("Row updated");
		}
	}
	//method for deleting the rows id wise from the table
	public static void delete(Connection con) throws Exception {
		System.out.println("Enter the rows to be deleted");
		int rowinsert=scan.nextInt();
		for(int i=1;i<=rowinsert;i++) {
			System.out.println("Enter id to delete row ");
			int id=scan.nextInt();
			String query="delete from employee where id=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, id);
			ps.executeUpdate();
			System.out.println("Row deleted");
		}
	}
	//Delete all the rows from the table
	public static void deleteall(Connection con) throws Exception {
		String query="delete from employee";
		Statement st=con.createStatement();
		st.executeUpdate(query);
		System.out.println("All Rows deleted");

	}
	//Retrieve all the data from the table
	public static void select(Connection con) throws Exception {
		String query="select * from employee";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		System.out.println("All data retrieved");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
	}
	//Retrieve limited data data from the table
		public static void selectlimited(Connection con) throws Exception {
			System.out.println("Enter the row you want to retrieve");
			int rows=scan.nextInt();
			String query="select * from employee limit ?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, rows);
			ResultSet rs=ps.executeQuery();
			System.out.println("Only "+rows+" rows retrieved");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
		}
	
	public static void main(String[] args) throws Exception {
		//url,uname,pass for establishing connection
		String url="jdbc:mysql://localhost:3306/jdbc_database";
		String uname="root";
		String pass="root";
		//Establishing connection
		Connection con=DriverManager.getConnection(url, uname, pass);
		System.out.println("Connection Established");
		while(true) {
			//Providing the menu of operations to the user
			System.out.println("Enter the number below for their respective operations");
			System.out.println("1 to insert data");
			System.out.println("2 to update data");
			System.out.println("3 to delete data");
			System.out.println("4 to deleteall data");
			System.out.println("5 to retrieve data");
			System.out.println("6 to retrievelimited data");
			System.out.println("Any number to terminate the operation");
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
				deleteall(con);
			}
			else if(choice==5) {
				select(con);
			}
			else if(choice==6) {
				selectlimited(con);
			}
			else {
				System.out.println("Invalid choice");
				System.exit(0);
			}

		}


	}

}
