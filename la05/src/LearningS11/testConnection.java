package LearningS11;

import java.sql.*;

public class testConnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		// 1. Load Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded");
		// 2. Establish Connection to Database
		String jdbcUrl = "jdbc:mysql://localhost/javabook";
		String username = "scott";
		String password = "tiger";
		Connection connection = 
				DriverManager.getConnection(jdbcUrl, username, password);
		System.out.println("Database Connected");
		// 3. Create a Statement
		Statement stmt = connection.createStatement();
		
		// 4. Execute a Statement with ResultSet
		String sql = "select * from student";
		ResultSet resultSet = stmt.executeQuery(sql);
		int index = 0;
		while(resultSet.next()) {
//			Tampilin Datanya
			System.out.println("ID : " + index + resultSet.getDate("birthDate") + resultSet.getString("firstName"));
			System.out.println("================");
			index++;
		}
	}

}
