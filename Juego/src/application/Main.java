package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		SingleStage initialStage = SingleStage.getSingleStage(primaryStage);
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Juego.fxml"));
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
