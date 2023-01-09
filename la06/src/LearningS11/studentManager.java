package LearningS11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class studentManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		try {
			String jdbcURL = "jdbc:mysql://localhost:3306/mydatabase";
			String username = "root";
			String password = "";

			Connection conn = DriverManager.getConnection(jdbcURL, username, password);
			if (conn != null) {
				System.out.println("Connected to the database");
			}

			while (true) {
				System.out.println("Enter 1: to create a record");
				System.out.println("Enter 2: to read a record");
				System.out.println("Enter 3: to update a record");
				System.out.println("Enter 4: to delete a record");
				System.out.println("Enter 5: to read all record");
				System.out.println("Enter 0: to exit the program");
				System.out.println("======================================");
				System.out.print("Enter the number : ");
				int choice = scanner.nextInt();

				if (choice == 0) {
					break;
				} else if (choice == 1) {
					System.out.println("Enter a name: ");
					String name = scanner.next();
					System.out.println("Enter an age: ");
					int age = scanner.nextInt();

					String sql = "INSERT into people (name,age) VALUES (?, ?)";

					PreparedStatement pstmt = conn.prepareCall(sql);
					pstmt.setString(1, name);
					pstmt.setInt(2, age);
					pstmt.executeUpdate();
					System.out.println("Record created successfully");
				} else if (choice == 2) {
					System.out.println("Enter ID: ");

					int id = scanner.nextInt();
					String sql = "SELECT * FROM people WHERE id = ?";
					PreparedStatement pstmt = conn.prepareCall(sql);
					pstmt.setInt(1, id);
					ResultSet rs = pstmt.executeQuery();

					if (rs.next()) {
						String name = rs.getString("name");
						int age = rs.getInt("age");
						System.out.println("Name: " + name + ", Age: " + age);
					} else {
						System.out.println("Record not found!");
					}
				} else if (choice == 3) {
					System.out.println("Enter the ID of the record you want to update:");
					int id = scanner.nextInt();
					System.out.println("Enter a new name:");
					String name = scanner.next();
					System.out.println("Enter a new age:");
					int age = scanner.nextInt();

					String sql = "UPDATE people SET name = ?, age = ? WHERE id = ?";
					PreparedStatement pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, name);
					pstmt.setInt(2, age);
					pstmt.setInt(3, id);
					pstmt.executeUpdate();
					System.out.println("Record updated successfully!");
				} else if (choice == 4) {
					System.out.println("Enter the ID of the record you want to delete:");

					int id = scanner.nextInt();
					String sql = "DELETE FROM people WHERE id = ?";
					PreparedStatement pstmt = conn.prepareStatement(sql);
					pstmt.setInt(1, id);
					pstmt.executeUpdate();
					System.out.println("Record deleted successfully!");
				} else if (choice == 5) {

					String sql = "SELECT * FROM people";
					PreparedStatement pstmt = conn.prepareCall(sql);
					ResultSet rs = pstmt.executeQuery();

					int index = 0;
					while (rs.next()) {
						String name = rs.getString("name");
						int age = rs.getInt("age");
						System.out.println("ID " + index + "Name: " + name + ", Age: " + age);
						index++;
						System.out.println("================");
					}

				} else {
					System.out.println("Invalid choice!");
				}
			}
			conn.close();
		} catch (SQLException err) {
			err.printStackTrace();
		}
	}

}
