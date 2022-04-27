module ResCalculator {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	
	opens resCalc to javafx.graphics, javafx.fxml;
}
