module JavaFXProperties {
	requires javafx.controls;
	requires javafx.base;
	requires javafx.fxml;
	requires java.desktop;
	
	opens application to javafx.graphics, javafx.fxml;
}
