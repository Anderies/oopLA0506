module LearningS11 {
	requires javafx.controls;
	requires javafx.base;
	requires javafx.graphics;
	requires javafx.fxml;
//	requires jdbc
	requires java.sql;
	
	opens applicationtwo to javafx.graphicsm, javafx.fxml;
	opens application to javafx.graphics, javafx.fxml;
}
