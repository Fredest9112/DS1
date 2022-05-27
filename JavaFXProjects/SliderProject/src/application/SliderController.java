package application;

import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class SliderController implements Initializable{

	@FXML
	private TextField textfield;
	
	@FXML
	private Slider slider;
	
	private static final double INT_VALUE = 50;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		slider.setValue(INT_VALUE);
		textfield.setText(new Double(INT_VALUE).toString());
		textfield.textProperty().bindBidirectional(slider.valueProperty(), NumberFormat.getNumberInstance());
	}
}
