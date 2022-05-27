package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import model.Model;

public class FXCalculatorController {
	@FXML
	private Label output;
	
	private long num1 = 0, num2 = 0;
	private String operator = "";
	private boolean isStarted = true;
	private Model model = new Model();
	
	@FXML
	public void numbers(ActionEvent event) {
		if(isStarted) {
			output.setText("");
			isStarted = false;
		}
		
		String value = ((Button)event.getSource()).getText();
		output.setText(output.getText()+value);
	}
	
	@FXML
	public void operator(ActionEvent event) {
		String value = ((Button)event.getSource()).getText();
		
		if(!value.equals("=")) {
			if(!operator.isEmpty()) {
				return;
			}
			operator = value;
			num1 = Long.parseLong(output.getText());
			output.setText("");
		}
		else {
			if(operator.isEmpty()) {
				return;
			}
			num2 = Long.parseLong(output.getText());
			float result = model.calculator(num1, num2, operator);
			output.setText(String.valueOf(result));
			operator = "";
			isStarted = true;
		}
	}
}
