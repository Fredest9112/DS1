package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class CheckBoxController {
	@FXML
	private CheckBox checkbox1, checkbox2, checkbox3;
	
	@FXML
	private Label mylabel1, mylabel2;
	
	public void checkAction(ActionEvent event) {
		String display = "";
		int count = 0;
		
		if(checkbox1.isSelected()) {
			display += " "+checkbox1.getText();
			count++;
		}
		
		if(checkbox2.isSelected()) {
			display += " "+checkbox2.getText();
			count++;
		}
		
		if(checkbox3.isSelected()) {
			display += " "+checkbox3.getText();
			count++;
		}
		
		mylabel1.setText("You select item(s) "+count);
		mylabel2.setText(display);
		
	}
	
}
