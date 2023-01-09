package application;


import javafx.fxml.FXML;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import java.sql.*;
import java.util.ArrayList;

public class FindGradeUsingPreparedStatement extends Application {
	private PreparedStatement preparedStatement;
	private TextField tfSSN = new TextField();
	private TextField tfCourseId = new TextField();
	private Label lblStatus = new Label();
	private Connection conn = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		// Initialize database connection and create a Statement object
		conn = connection.initializeDB();

		String queryString = "select firstName, mi, " + "lastName, title, grade from Student, Enrollment, Course "
				+ "where Student.ssn = ? and Enrollment.courseId = ? "
				+ "and Enrollment.courseId = Course.courseId";

		
		// Create a statement
		preparedStatement = conn.prepareStatement(queryString);
		student student = new student();
		student.showStudent(conn);
		
		// tampilan
		 Button btShowGrade = new Button("Show Grade");
		 Button btShowStudent = new Button("Show Student");
		 HBox hBox = new HBox(5);
		 hBox.setAlignment(Pos.CENTER);
		 hBox.getChildren().addAll(new Label("SSN"), tfSSN,
		 new Label("Course ID"), tfCourseId, (btShowGrade), (btShowStudent));
		
		 VBox vBox = new VBox(10);
	
		 vBox.getChildren().addAll(hBox, lblStatus);
		 tfSSN.setPrefColumnCount(6);
		 tfCourseId.setPrefColumnCount(6);
		 btShowGrade.setOnAction(e -> showGrade());
		 btShowStudent.setOnAction(e -> student.showStudent(conn));
		
//		 vBox.getChildren().addAll(hBox, lblStatus);
		 // Create a scene and place it in the stage
		 Scene scene = new Scene(vBox, 500, 80);
		 primaryStage.setTitle("FindGrade"); // Set the stage title
		 primaryStage.setScene(scene); // Place the scene in the stage
		 primaryStage.show(); // Display the stage
		
	}
	
	
	private void showGrade() {
		// TODO Auto-generated method stub
		String ssn = tfSSN.getText();
		String courseId = tfCourseId.getText();
		try {
			preparedStatement.setString(1, ssn);
			preparedStatement.setString(2, courseId);
			ResultSet rset = preparedStatement.executeQuery();

			if (rset.next()) {
				String lastName = rset.getString(1);
				String mi = rset.getString(2);
				String firstName = rset.getString(3);
				String title = rset.getString(4);
				String grade = rset.getString(5);

				// Display result in a label
				lblStatus.setText(
						firstName + " " + mi + " " + lastName + "'s grade on course " + title + " is " + grade);
			} else {
				lblStatus.setText("Not found");
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

}
