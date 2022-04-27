package resCalc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class InitialScreenController{

	@FXML
	private Button resByColorsBtn;

	@FXML
	private Button resByValuesBtn;

	public void goToResByColorsScreen(ActionEvent event) {
		SingleStage initialStage = SingleStage.getSingleStage(new Stage());
		initialStage.stage.close();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("ResByColorsScreen.fxml"));
			Scene scene = new Scene(root);
			initialStage.stage.setScene(scene);
			initialStage.stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
