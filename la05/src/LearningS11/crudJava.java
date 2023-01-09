package LearningS11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class crudJava {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/myrepo";
		String username = "root";
		String password = "";
		Connection connection = DriverManager.getConnection(jdbcUrl,username,password);
		System.out.println("Database Connected");
		while(true) {
			System.out.println("Enter 1: to create a record");
			System.out.println("Enter 2: to read a record");
			System.out.println("Enter 3: to update a record");
			System.out.println("Enter 4: to delete a record");
			System.out.println("Enter 5: to read all the record");
			System.out.println("Enter 0: to exit the program");
			System.out.print("Enter the number: ");
			int choice = scanner.nextInt();
			
			if(choice == 0) {
				System.exit(0);
			}else if(choice == 1){
				System.out.println("Enter a name: ");
				String name = scanner.next();
				System.out.println("Enter an age");
				int age = scanner.nextInt();
				
				String sql = "INSERT into people (name,age) VALUES(?, ?)";
				PreparedStatement pstmt = connection.prepareCall(sql);
				
				pstmt.setString(1, name);
				pstmt.setInt(2, age);
				pstmt.executeUpdate();
				
				System.out.println("Data Berhasil di insert");
			}else if(choice == 2) {
				System.out.println("Enter ID: ");
				int id = scanner.nextInt();
				
				String sql = "SELECT * FROM people WHERE id = ?";
				PreparedStatement pstmt = connection.prepareCall(sql);
				pstmt.setInt(1, id);
				
				ResultSet rs = pstmt.executeQuery();
				if(rs.next()) {
					String name = rs.getString("name");
					String age = rs.getString("age");
//					System.out.println(rs.getString("name"));
					System.out.println("Name: " + name + " Age: " + age);
				}else {
					System.out.println("No Data Found");
				}
			}else if(choice == 3) {
				
			}else if(choice == 4) {
				
			}else if(choice == 5) {
				String sql = "SELECT * FROM people";
				PreparedStatement pstmt = connection.prepareCall(sql);
				ResultSet rs = pstmt.executeQuery();
				
				int index = 0;
				while(rs.next()) {
					System.out.println("ID: " + index + " name " + 
							rs.getString("name") + " age " + rs.getString("age"));
					index++;
					System.out.println("=======");
				}
			}else {
				System.out.println("Invalid Number");
			}
		}

	}

}
