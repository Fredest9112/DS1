module FxCalculator {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	
	opens view to javafx.graphics, javafx.fxml;
	opens controller to javafx.graphics, javafx.fxml;
}
