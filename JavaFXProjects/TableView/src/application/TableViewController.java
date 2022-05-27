package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class TableViewController implements Initializable{

	@FXML
	private TableView<Employee> tableview;
	@FXML
	private TableColumn<Employee, Integer> id;
	@FXML
	private TableColumn<Employee, String> firstname;
	@FXML
	private TableColumn<Employee, String> lastname;
	@FXML
	private TableColumn<Employee, Integer> age;
	
	public ObservableList<Employee> list = FXCollections.observableArrayList(
			new Employee(1, "Hello", "There", 30),
			new Employee(2, "John", "world", 22),
			new Employee(3, "Jude", "There", 45),
			new Employee(4, "King", "world", 19),
			new Employee(5, "Queen", "There", 28)
			);
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		id.setCellValueFactory(new PropertyValueFactory<Employee, Integer>("id"));
		firstname.setCellValueFactory(new PropertyValueFactory<Employee, String>("firstname"));
		lastname.setCellValueFactory(new PropertyValueFactory<Employee, String>("lastname"));
		age.setCellValueFactory(new PropertyValueFactory<Employee, Integer>("age"));
		tableview.setItems(list);
	}
}
