package application;

import java.sql.Connection;
import java.sql.DriverManager;

public class SqliteConnection {
	public static Connection connector() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection connection = DriverManager.getConnection(
					"jdbc:sqlite:StudentDB/Student.sqlite"
					);
			return connection;
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
