package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class WebViewController implements Initializable{
	@FXML
	private WebView mywebview;

	@FXML
	private WebEngine webengine;

	@FXML
	private Button btn1, btn2, btn3, btn4;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		webengine = mywebview.getEngine();

	}

	public void btnOne(ActionEvent event) {
		webengine.load("https://www.google.com");
	}

	public void btnTwo(ActionEvent event) {
		webengine.executeScript("window.location = \"https://www.gstevewall.com//\";");
	}

	public void btnThree(ActionEvent event) {
		webengine.loadContent("<html><head>WebView</head><body><h3>Welcome to webview class</h3></body></html>");
	}

	public void btnFour(ActionEvent event) {
		webengine.reload();
	}
}
