package simple;
import java.sql.*;


public class simplejdbc {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		// Load JDBC Driver
//		Class.forName("com.mysql.jdbc.Driver");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");

//		Connect to a database
		String jdbcUrl = "jdbc:mysql://localhost/javabook";
		String username = "scott";
		String password = "tiger";

		Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
		System.out.println("Database connected");

		// Create a statement
		Statement statement = connection.createStatement();

		// Execute a statement
		ResultSet resultSet = statement
				.executeQuery("select * from Student where lastName = 'Smith'");

//		Iterate Through the result and print the students names
//		System.out.println(resultSet.next());
		
		while (resultSet.next()) {
			System.out.println(resultSet.getDate("birthDate")+ "\t" + resultSet.getString(2) + "\t" 
		+ resultSet.getString(3));
		}
		
//		Close the connection
		connection.close();

	}

}
