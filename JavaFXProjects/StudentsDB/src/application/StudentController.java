package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

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
	
	public void addStudent(ActionEvent event) {
		try {
			Connection connection = SqliteConnection.connector();
			PreparedStatement ps = connection.prepareStatement(
					"INSERT INTO StudentList(Id, Firstname, Lastname, Username, Password, Age, Subject) VALUES (?,?,?,?,?,?,?)"
					);
			ps.setString(1, inputid.getText());
			ps.setString(2, inputfirstname.getText());
			ps.setString(3, inputlastname.getText());
			ps.setString(4, inputusername.getText());
			ps.setString(5, inputpassword.getText());
			ps.setString(6, inputage.getText());
			ps.setString(7, inputsubject.getText());
			ps.execute();
			connection.close();
			loadStudentData(event);
			clearInputs(event);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateStudent(ActionEvent event) {
		try {
			Connection connection = SqliteConnection.connector();
			StudentData data = studenttable.getSelectionModel().getSelectedItem();
			PreparedStatement ps = connection.prepareStatement(
					"UPDATE StudentList SET Firstname = ?, Lastname = ?, Username = ?, Password = ?, Age = ?, Subject = ? WHERE ID = ?"
					);
			ps.setString(1, inputfirstname.getText());
			ps.setString(2, inputlastname.getText());
			ps.setString(3, inputusername.getText());
			ps.setString(4, inputpassword.getText());
			ps.setString(5, inputage.getText());
			ps.setString(6, inputsubject.getText());
			ps.setString(7, data.getId());
			ps.executeUpdate();
			connection.close();
			clearInputs(event);
			loadStudentData(event);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteStudent(ActionEvent event) {
		try {
			Connection connection = SqliteConnection.connector();
			StudentData data = studenttable.getSelectionModel().getSelectedItem();
			PreparedStatement ps = connection.prepareStatement(
					"DELETE FROM StudentList WHERE ID = ?"
					);
			ps.setString(1, data.getId());
			ps.executeUpdate();
			clearInputs(event);
			loadStudentData(event);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getRowData(MouseEvent event) {
		if(event.getClickCount()==1) {
			StudentData data = studenttable.getSelectionModel().getSelectedItem();
			inputid.setText(data.getId());
			inputfirstname.setText(data.getFirstname());
			inputlastname.setText(data.getLastname());
			inputusername.setText(data.getUsername());
			inputpassword.setText(data.getPassword());
			inputage.setText(data.getAge());
			inputsubject.setText(data.getSubject());
		}
	}
	
	public void clearInputs(ActionEvent event) {
		inputid.setText("");
		inputfirstname.setText("");
		inputlastname.setText("");
		inputusername.setText("");
		inputpassword.setText("");
		inputage.setText("");
		inputsubject.setText("");
	}
}
