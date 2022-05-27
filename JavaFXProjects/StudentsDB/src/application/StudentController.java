package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class StudentController implements Initializable{
	@FXML
	private TextField inputid, inputfirstname, inputlastname, inputusername, inputpassword, inputage, inputsubject;

	@FXML
	private TableView<StudentData> studenttable;

	@FXML
	private TableColumn<StudentData, String> columnid, columnfirstname, columnlastname, columnusername, columnpassword, columnage, columnsubject;

	private ObservableList<StudentData> data;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}

	public void loadStudentData(ActionEvent event) {
		try {
			Connection connection = SqliteConnection.connector();
			data = FXCollections.observableArrayList();
			ResultSet rs = connection.createStatement().executeQuery("SELECT * FROM StudentList");
			while(rs.next()) {
				data.add(new StudentData(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		columnid.setCellValueFactory(new PropertyValueFactory<StudentData, String>("id"));
		columnfirstname.setCellValueFactory(new PropertyValueFactory<StudentData, String>("firstname"));
		columnlastname.setCellValueFactory(new PropertyValueFactory<StudentData, String>("lastname"));
		columnusername.setCellValueFactory(new PropertyValueFactory<StudentData, String>("username"));
		columnpassword.setCellValueFactory(new PropertyValueFactory<StudentData, String>("password"));
		columnage.setCellValueFactory(new PropertyValueFactory<StudentData, String>("age"));
		columnsubject.setCellValueFactory(new PropertyValueFactory<StudentData, String>("subject"));
		
		studenttable.setItems(null);
		studenttable.setItems(data);
	}
}
