package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class TestComboBoxController implements Initializable{
	@FXML
	public ComboBox<String> mycombobox;
	
	@FXML
	public Label mylabel;
	
	@FXML
	public Button btn1;
	
	@FXML
	public ListView<String> mylistview;
	
	ObservableList<String> list = FXCollections.observableArrayList("Mango","Orange","Apple","Cashew","PawPaw");

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//mycombobox.setItems(list);
		//mylistview.setItems(list);
	}
	
	public void comboChanged(ActionEvent event) {
		mylabel.setText(mycombobox.getValue());
	}
	
	public void buttonCombo(ActionEvent event) {
		//mycombobox.getItems().addAll("Car","House","School","Juice");
		//mylistview.getItems().addAll("Car","House","School","Juice");
		ObservableList<String> names;
		names = mylistview.getSelectionModel().getSelectedItems();
		for(String name : names) {
			System.out.println(name);
		}
	}
}




