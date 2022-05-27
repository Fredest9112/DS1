package application;

import java.time.LocalDate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class DatePickerController {

	@FXML
	private DatePicker dp;
	
	@FXML
	private Label mylabel;
	
	public void displayDate(ActionEvent event) {
		LocalDate date = dp.getValue();
		mylabel.setText(date.toString());
	}
}
