package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class connection {
	private static Connection conn;
	public static Connection initializeDB() {
		try {
			// Load the JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded");

			// Establish a connection
			conn = DriverManager.getConnection("jdbc:mysql://localhost/javabook", "root", "");
			System.out.println("Database connected");
		
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return conn;
	}

}
