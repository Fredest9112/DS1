package resCalc;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;


public class InitialScreenLauncher extends Application {
	
	@Override
	public void start(Stage stage) {
		SingleStage initialStage = SingleStage.getSingleStage(stage);
		try {
			Parent root = FXMLLoader.load(getClass().getResource("InitialScreen.fxml"));
			Scene scene = new Scene(root);
			initialStage.stage.setScene(scene);
			initialStage.stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
