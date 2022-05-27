package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;

public class MainController implements Initializable {
	
	final OurProperty ourPro = new OurProperty();
	
	@FXML
	private Label mylabel;
	
	@FXML
	private ProgressBar pb;
	
	@FXML
	private ProgressIndicator pi;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ourPro.setProperty(0);
		ourPro.propertyProperty().addListener(new ChangeListener<Object>() {

			@Override
			public void changed(ObservableValue<? extends Object> observable, 
					Object oldValue, Object newValue) {
				mylabel.setText(new Double(ourPro.getProperty()).toString());
				pb.progressProperty().bind(ourPro.propertyProperty());
				pi.progressProperty().bind(ourPro.propertyProperty());
			}
			
		});
		
	}
	
	public void buttonClick(ActionEvent event) {
		ourPro.setProperty(ourPro.getProperty() + 0.1);
	}
	
	public void button1Click(ActionEvent event) {
		ourPro.setProperty(ourPro.getProperty() - 0.1);
	}

}
