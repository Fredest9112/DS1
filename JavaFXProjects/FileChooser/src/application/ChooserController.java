package application;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class ChooserController{

	@FXML
	private Button btn1;

	@FXML
	private ListView listview;

	public void buttonAction(ActionEvent event) {
		FileChooser fc = new FileChooser();
		fc.setInitialDirectory(new File("/home/fredest/Downloads"));
		fc.getExtensionFilters().addAll(new ExtensionFilter("PDF Files only", "*.pdf"));
		List<File> selectedFiles = fc.showOpenMultipleDialog(null);

		if(selectedFiles != null) {
			for(int i = 0; i < selectedFiles.size(); i++) {
				listview.getItems().add(selectedFiles.get(i).getAbsolutePath());
			}

		} else {
			System.out.println("File does not exist");
		}
	}

}
