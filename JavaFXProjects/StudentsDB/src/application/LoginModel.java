package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginModel {
	
	private Connection connection;
	
	public LoginModel() {
		this.connection = SqliteConnection.connector();
		if(connection == null) {
			System.out.println("Error connecting db");
		}
	}
	
	public boolean isDbConnected() {
		try{
			return !connection.isClosed();
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean loginNow(String user, String pass) throws SQLException {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String query = "SELECT * FROM StudentList WHERE username = ? AND password = ?";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, user);
			preparedStatement.setString(2, pass);
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				return true;
			} else {
				return false;
			}
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			preparedStatement.close();
			resultSet.close();
		}
	}
	
}
