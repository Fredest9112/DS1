package application;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class JuegoController implements Initializable {

	@FXML
	private TextField num1, num2, intents, inputNum;

	@FXML
	private Button startButton, playButton, replayButton;

	@FXML
	private Label inputNumLabel, currentIntentsLabel, currentIntents, numbsIntentedLabel, numbsIntented, gameStatus; 

	private InputValidator checkInput;
	private Jugador jugador;
	private Historial historial;
	private Aleatorio aleatorio;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		setInitialGame(false);
		
	}

	public void playing(ActionEvent event) {
		if(gameIsPlayable()) {
			gameStatus.setText("Juego continua!");
			inputNum.setText("");
			currentIntents.setText(String.valueOf(jugador.mostrarIntentos())+" intentos");
			numbsIntented.setText(revealIntents(historial.mostrarIntentos()));
		} else {
			gameStatus.setText("Juego terminado...");
			currentIntents.setText(String.valueOf(jugador.mostrarIntentos())+" intentos");
			numbsIntented.setText(revealIntents(historial.mostrarIntentos()));
			playButton.setDisable(true);
			inputNum.setDisable(true);
		}
	}

	private String revealIntents(int[] mostrarIntentos) {
		String intents = "";
		for(int i = 0; i < mostrarIntentos.length; i++) {
			intents = intents+mostrarIntentos[i]+" ";
		}
		
		return intents;
	}

	public void checkGameScreen(ActionEvent event) {
		checkInitialGame();
	}

	private boolean checkInitialGame() {
		checkInput = new InputValidator();
		if(checkInput.areNumbers(num1.getText(), num2.getText(), intents.getText())) {
			hideInitialSetup(true);
			aleatorio = 
					new Aleatorio(checkInput.getNumber1(), checkInput.getNumber2());
			jugador = new Jugador(checkInput.getIntents());
			historial = new Historial(checkInput.getIntents());
			setInitialGame(true);
			System.out.println(aleatorio.oculto);
			currentIntents.setText(String.valueOf(jugador.mostrarIntentos())+" intentos");
			return true;
		} else {
			sendAlert("Error en los numero ingresados!");
			return false;
		}
	}

	private boolean gameIsPlayable() {
		if(checkInput.isValidInput(inputNum.getText())) {
			if(aleatorio.consultar(checkInput.getInput())) {
				return false;
			} else {
				return historial.guardarIntento(checkInput.getInput()) && jugador.jugar();
			}
		} else {
			sendAlert("Error en el numero ingresado!");
			return false;
		}
	}

	private void setInitialGame(boolean status) {
		playButton.setVisible(status);
		replayButton.setVisible(status);
		inputNumLabel.setVisible(status);
		inputNum.setVisible(status);
		currentIntentsLabel.setVisible(status);
		currentIntents.setVisible(status);
		numbsIntentedLabel.setVisible(status);
		numbsIntented.setVisible(status);
		gameStatus.setVisible(status);
	}
	
	private void hideInitialSetup(boolean status) {
		num1.setText("");
		num1.setDisable(status);
		num2.setText("");
		num2.setDisable(status);
		intents.setText("");
		intents.setDisable(status);
		startButton.setDisable(status);
	}
	
	public void setNewGame(ActionEvent event) {
		setInitialGame(false);
		hideInitialSetup(false);
	}
	
	
	private void sendAlert(String alert) {
		Alert a = new Alert(AlertType.NONE);
		a.setAlertType(AlertType.ERROR);
		a.setContentText(alert);
		a.show();
	}
}