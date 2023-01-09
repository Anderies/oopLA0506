package main;

import java.sql.*;

public class simplejdbc {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
//		4 Key Connection to Database with JDBC API
//		Class.forName("com.mysql.cj.jdbc.Driver");

//			Langkah 1 : Load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");

//			Langkah 2 : Connect to Database
		String jdbcUrl = "jdbc:mysql://localhost/javabook";
		String userDB = "scott";
		String password = "tiger";
		Connection conn = DriverManager.getConnection(jdbcUrl, userDB, password);
		System.out.println("Database Connected");
		
//		Langkah 3 Create Statement
		Statement statement = conn.createStatement();
		
//		Langkah 4 Execute the Statement
		ResultSet resultSet = 
				statement.executeQuery("SELECT * FROM student where lastName = 'SMITH'");
		
		int count = 0;
		
		while(resultSet.next()) {
			System.out.println(++count + " " + resultSet.getString("firstName") 
			+ resultSet.getString("lastName") + " " + resultSet.getDate("birthDate"));
			
//			resultSet.getString
			System.out.println(++count + " " + resultSet.getString(2) + " " + resultSet.getString(4));
		}
		
		conn.close();
		

	}

}
