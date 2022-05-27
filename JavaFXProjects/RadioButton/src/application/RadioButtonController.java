package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class RadioButtonController {
	@FXML
	private RadioButton rb1, rb2;
	
	@FXML
	private Label mylabel;

	public void radioAction(ActionEvent event) {
		if(rb1.isSelected()) {
			mylabel.setText(rb1.getText());
		}
		
		if(rb2.isSelected()) {
			mylabel.setText(rb2.getText());
		}
	}
}
