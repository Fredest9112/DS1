package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController {
	
	@FXML
	private TextField nameInput;
	
	@FXML
	private TextField passInput;
	
	@FXML
	private Label statusLabel;
	
	public void doLogin(ActionEvent event) {
		Almacen almacen = new Almacen();
		Login login = new Login(almacen);
		try {
			if(login.validar(nameInput.getText(), passInput.getText())) {
				statusLabel.setText("Usuario Ingresado");
			} else {
				statusLabel.setText("Usuario no registrado");
			}
			
		} catch (Exception e) {
			statusLabel.setText("Error en los datos ingresados!");
		}
	}
	
}
