module MediaPlayer {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.media;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
}
