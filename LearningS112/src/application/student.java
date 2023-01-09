package application;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
public class student {
	private String studentID;
	private Date birthDate;
	private String fullName;
	
	public student() {
		
	}
	
	public student(String studentID, Date birthDate, String fullName) {
	        this.studentID = studentID;
	        this.birthDate = birthDate;
	        this.fullName = fullName;
	}
	     
	public ArrayList<Object> showStudent(Connection conn) {
		ArrayList<Object> arrStudent = new ArrayList<Object>();
		
		try	{
			String sql = "SELECT * FROM student";
			Statement preparedStatement = conn.createStatement();
			ResultSet result = preparedStatement.executeQuery(sql);
			
			int count = 0;
			while(result.next()) {
				String studentID = result.getString(1);
				String studentName = result.getString("firstName");
				Date studentBirth = result.getDate("birthDate");
				String studentLastName = result.getString("lastName");
				String studentfullName = studentName + " "+ studentLastName;
									
//				System.out.println("==========> " + studentBirth);
//				String output = "User #%d: %s - %s - %s";
//			    System.out.println(String.format(output, ++count, studentID, studentName, studentBirth));
//				
				arrStudent.add(new student(studentID, studentBirth, studentfullName));
				
			}
			
		}catch(SQLException ex) {
			System.out.println(ex);
		}
		
		return arrStudent;
	}
}
