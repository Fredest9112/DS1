package application;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController implements Initializable{
	private LoginModel loginModel = new LoginModel();
	
	@FXML
	private Label mylabel;
	
	@FXML
	private TextField username, password;
	
	@FXML
	private Button btn;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		if(loginModel.isDbConnected()) {
			mylabel.setText("Db is connected");
		} else {
			mylabel.setText("Db is not connected");
		}
	}
	
	public void loginCheck(ActionEvent event) {
		try {
			if(loginModel.loginNow(username.getText(), password.getText())) {
				mylabel.setText("Valid Username and Password ");
				Stage stage = (Stage)this.password.getScene().getWindow();
				stage.close();
				openPage(event);
			} else {
				mylabel.setText("Invalid Username and Password ");
			}
		} catch (SQLException | IOException e) {
			e.printStackTrace();
			mylabel.setText("Invalid Username and Password ");
		}
	}
	
	public void openPage(ActionEvent event) throws IOException {
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("Student.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
