package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

public class MenuController implements Initializable{
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}
	
	public void exitAll(ActionEvent event) {
		Platform.exit();
		System.exit(0);
	}
	
}
