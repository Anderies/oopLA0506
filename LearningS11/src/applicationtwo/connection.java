package applicationtwo;
import java.sql.*;
public class connection {
	
	public static void initializeDB() {
		try {
			// Load the JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded");

			// Establish a connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/javabook", "scott", "tiger");
			// ("jdbc:oracle:thin:@liang.armstrong.edu:1521:orcl)",
			// "scott", "tiger");
			System.out.println("Database connected");

			String queryString = "select firstName, mi, " + "lastName, title, grade from Student, Enrollment, Course "
					+ "where Student.ssn = ? and Enrollment.courseId = ? "
					+ "and Enrollment.courseId = Course.courseId";

			// Create a statement
			PreparedStatement preparedStatement = connection.prepareStatement(queryString);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
