package application;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class StudentData {
	private final StringProperty id;
	private final StringProperty firstname;
	private final StringProperty lastname;
	private final StringProperty username;
	private final StringProperty password;
	private final StringProperty age;
	private final StringProperty subject;
	
	public StudentData(String id, String firstname, String lastname, String username,
			String password, String age, String subject) {
		this.id = new SimpleStringProperty(id);
		this.firstname = new SimpleStringProperty(firstname);
		this.lastname = new SimpleStringProperty(lastname);
		this.username = new SimpleStringProperty(username);
		this.password = new SimpleStringProperty(password);
		this.age = new SimpleStringProperty(age);
		this.subject = new SimpleStringProperty(subject);
	}

	public final StringProperty idProperty() {
		return this.id;
	}
	

	public final String getId() {
		return this.idProperty().get();
	}
	

	public final void setId(final String id) {
		this.idProperty().set(id);
	}
	

	public final StringProperty firstnameProperty() {
		return this.firstname;
	}
	

	public final String getFirstname() {
		return this.firstnameProperty().get();
	}
	

	public final void setFirstname(final String firstname) {
		this.firstnameProperty().set(firstname);
	}
	

	public final StringProperty lastnameProperty() {
		return this.lastname;
	}
	

	public final String getLastname() {
		return this.lastnameProperty().get();
	}
	

	public final void setLastname(final String lastname) {
		this.lastnameProperty().set(lastname);
	}
	

	public final StringProperty usernameProperty() {
		return this.username;
	}
	

	public final String getUsername() {
		return this.usernameProperty().get();
	}
	

	public final void setUsername(final String username) {
		this.usernameProperty().set(username);
	}
	

	public final StringProperty passwordProperty() {
		return this.password;
	}
	

	public final String getPassword() {
		return this.passwordProperty().get();
	}
	

	public final void setPassword(final String password) {
		this.passwordProperty().set(password);
	}
	

	public final StringProperty ageProperty() {
		return this.age;
	}
	

	public final String getAge() {
		return this.ageProperty().get();
	}
	

	public final void setAge(final String age) {
		this.ageProperty().set(age);
	}
	

	public final StringProperty subjectProperty() {
		return this.subject;
	}
	

	public final String getSubject() {
		return this.subjectProperty().get();
	}
	

	public final void setSubject(final String subject) {
		this.subjectProperty().set(subject);
	}
}
