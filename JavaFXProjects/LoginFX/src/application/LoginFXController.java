package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginFXController {
	@FXML
	private Label mylabel;
	
	@FXML
	private TextField username, password;
	
	@FXML
	private Button btn;
	
	public void loginCode(ActionEvent event) {
		if(username.getText().equals("myuser") && password.getText().equals("mypass")) {
			mylabel.setText("Login successful");
			try {
				Stage primaryStage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("NewPage.fxml"));
				Scene scene = new Scene(root);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
			} catch(Exception e) {
				e.printStackTrace();
			}
		} else {
			mylabel.setText("Incorrect username or password");
		}
	}
}
