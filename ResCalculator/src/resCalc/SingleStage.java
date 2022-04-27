package resCalc;

import javafx.stage.Stage;

public class SingleStage {
	
	private static SingleStage instanceStage;
	public Stage stage;

	private SingleStage(Stage stage) {
		this.stage = stage;
	}

	public static SingleStage getSingleStage(Stage stage) {
		if(instanceStage==null) {
			instanceStage = new SingleStage(stage);
		}
		return instanceStage;
	}
}
