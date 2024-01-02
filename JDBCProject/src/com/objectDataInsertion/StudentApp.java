package com.objectDataInsertion;
import java.sql.*;

public class StudentApp {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/jdbc_database";
		String uname="root";
		String pass="root";
		Connection con=null;
		Student s1=new Student(11,"Ajay",22);
		Student s2=new Student(12,"Amit",23);
		Student s3=new Student(13,"Ankit",24);
		//String query="Insert into student1 values(?,?,?),(?,?,?),(?,?,?)";
		
		//Establishing connection
		try {
			 con=DriverManager.getConnection(url, uname, pass);
			System.out.println("Connection Established");
//			//Preparing statement
//			 PreparedStatement st=con.prepareStatement(query);
//			//completing the query
//			st.setInt(1,s1.rollNo );
//			st.setString(2, s1.name);
//			st.setInt(3, s1.age);
//			st.setInt(4,s2.rollNo );
//			st.setString(5, s2.name);
//			st.setInt(6, s2.age);
//			st.setInt(7,s3.rollNo );
//			st.setString(8, s3.name);
//			st.setInt(9, s3.age);
//			st.executeUpdate();
//			System.out.println("Data Inserted");
			DBHandler.insert(con, s1.rollNo, s1.name, s1.age);
			DBHandler.insert(con, s2.rollNo, s2.name, s2.age);
			DBHandler.insert(con, s3.rollNo, s3.name, s3.age);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
				//st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
